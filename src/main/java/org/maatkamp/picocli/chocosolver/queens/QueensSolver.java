package org.maatkamp.picocli.chocosolver.queens;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.variables.IntVar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.jansi.graalvm.AnsiConsole;

import java.util.List;
import java.util.concurrent.Callable;

@Command(name = "queensSolver", mixinStandardHelpOptions = true,
        version = "queensSolver 1.0",
        description = "Solves the queens problem in chocosolver via java as a picocli application")
public class QueensSolver implements Callable<Integer> {

    Logger log = LoggerFactory.getLogger(QueensSolver.class);

    @Parameters(description = "number of queens", defaultValue = "4")
    int queens;

    public static void main(String... args) {
        int exitCode;
        try (AnsiConsole ansi = AnsiConsole.windowsInstall()) {
            exitCode = new CommandLine(new QueensSolver()).execute(args);
        }
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        String banner = queens + "-queens problem:";
        log.info("Solutions for the {}", banner);

        Model model = new Model(banner);
        IntVar[] vars = new IntVar[queens];

        // define board
        for(int q = 0; q < queens; q++){
            vars[q] = model.intVar("Q_"+q, 1, queens);
        }

        // constraints
        for(int i  = 0; i < queens-1; i++){
            for(int j = i + 1; j < queens; j++){

                // column constraint
                model.arithm(vars[i], "!=",vars[j]).post();

                // diagonal constraint
                model.arithm(vars[i], "!=", vars[j], "-", j - i).post();
                model.arithm(vars[i], "!=", vars[j], "+", j - i).post();
            }
        }

        // solve
        List<Solution> solutions = model.getSolver().findAllSolutions();

        // print solutions
        if(solutions != null && !solutions.isEmpty()) {
            for(Solution solution : solutions) {
                log.info(solution.toString().replace("Solution", System.lineSeparator()+"Solution"));
            }
            return 0;
        } else {
            log.info("No solution found for {}} queens", queens);
            return 1;
        }
    }
}