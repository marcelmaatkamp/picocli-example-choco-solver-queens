package org.maatkamp.picocli.chocosolver.queens;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import javafx.scene.text.Text;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.variables.IntVar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.jansi.graalvm.AnsiConsole;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import static com.almasb.fxgl.dsl.FXGLForKtKt.addUINode;
import static com.almasb.fxgl.dsl.FXGLForKtKt.texture;

@Command(name = "queensSolver", mixinStandardHelpOptions = true,
        version = "queensSolver 1.0",
        description = "Solves the queens problem in chocosolver via java as a picocli application")
public class QueensSolver extends GameApplication implements Callable<Integer> {

    Logger log = LoggerFactory.getLogger(QueensSolver.class);

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
        settings.setVersion("0.1");
    }

    @Override
    protected void initUI() {
        Text textPixels = new Text();
        textPixels.setTranslateX(50); // x = 50
        textPixels.setTranslateY(100); // y = 100
        // textPixels.textProperty().bind(getip("pixelsMoved").asString());

        addUINode(textPixels); // add to the scene graph

        var brickTexture = texture("brick.png");
        brickTexture.setTranslateX(50);
        brickTexture.setTranslateY(450);

        addUINode(brickTexture);
    }

    @Parameters(description = "number of queens", defaultValue = "4")
    int queens;

    public static void main(String... args) {
        int exitCode;
        try (AnsiConsole ansi = AnsiConsole.windowsInstall()) {
            exitCode = new CommandLine(new QueensSolver()).execute(args);
        }
        launch(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        String banner = queens + "-queens problem";

        Model model = new Model(banner);
        IntVar[] vars = new IntVar[queens];

        // define the chess-board
        for (int q = 0; q < queens; q++) {
            vars[q] = model.intVar("Q_" + q, 1, queens);
        }

        // define and set constraints
        for (int i = 0; i < queens - 1; i++) {
            for (int j = i + 1; j < queens; j++) {

                // column constraint
                model.arithm(vars[i], "!=", vars[j]).post();

                // diagonal constraint
                model.arithm(vars[i], "!=", vars[j], "-", j - i).post();
                model.arithm(vars[i], "!=", vars[j], "+", j - i).post();
            }
        }

        // solve
        List<Solution> solutions = model.getSolver().findAllSolutions();

        // print solutions
        log.info("Found {} solutions for the {}: ", solutions.size(), banner);

        // iterate and print each solution
        if (solutions != null && !solutions.isEmpty()) {
            for (Solution solution : solutions) {
                if (solution.exists()) {
                    StringBuilder stringBuilder = new StringBuilder();

                    for (Iterator<IntVar> iterator = Arrays.stream(vars).iterator(); iterator.hasNext(); ) {
                        IntVar queen = iterator.next();
                        stringBuilder.append(String.format("%s[%d]", queen.getName(), solution.getIntVal(queen)));
                        if (iterator.hasNext()) {
                            stringBuilder.append(", ");
                        }
                    }

                    log.info(stringBuilder.toString());
                }
            }

            // exit normal
            return 0;

        } else {
            log.info("No solution found for {} queens", queens);

            // exit error
            return 1;
        }
    }
}