# picocli example: solve queens puzzle with choco-solver

[![Docker Image CI](https://github.com/marcelmaatkamp/picocli-example-choco-solver-queens/actions/workflows/docker.yml/badge.svg)](https://github.com/marcelmaatkamp/picocli-example-choco-solver-queens/actions/workflows/docker.yml)

![img.png](docs/images/solution_5.png)

From [Wikipedia](https://en.wikipedia.org/wiki/Eight_queens_puzzle):

<em>
The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other; thus, a solution requires that no two queens share the same row, column, or diagonal. There are 92 solutions. The problem was first posed in the mid-19th century. In the modern era, it is often used as an example problem for various computer programming techniques. The eight queens puzzle is a special case of the more general n queens problem of placing n non-attacking queens on an n×n chessboard. Solutions exist for all natural numbers n except n = 2 and n = 3. Although the exact number of solutions is only known for n ≤ 27, the asymptotic growth rate of the number of solutions is approximately (0.143 n)n.
</em>

# Install

## Install prerequisites

Install [sdkman](https://sdkman.io/) for your platform.


### maven

```bash
$ sdk install maven 3.8.8
```

### graalvm gluon

https://github.com/gluonhq/graal/releases

```bash
$ export GRAALVM_HOME=...
```

##  build

Build package

```bash
$ \
 mvn clean gluonfx:runagent &&\
 mvn gluonfx:build &&\
 mvn gluonfx:nativerun
```

# Usage

## 1 queen
```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 1
INFO  [main] o.m.p.c.q.QueensSolver: Found 1 solutions for the 1-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1]
```

## 2 queens

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 2
INFO  [main] o.m.p.c.q.QueensSolver: Found 0 solutions for the 2-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: No solution found for 2 queens
```

## 3 queens

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 3
INFO  [main] o.m.p.c.q.QueensSolver: Found 0 solutions for the 3-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: No solution found for 3 queens
```

## 4 queens 

![img.png](docs/images/solution_4.png)

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 4
INFO  [main] o.m.p.c.q.QueensSolver: Found 2 solutions for the 4-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[1], Q_3[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[1], Q_2[4], Q_3[2]
```

## 5 queens

![solution_5.png](docs/images/solution_5.png)

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 5
INFO  [main] o.m.p.c.q.QueensSolver: Found 10 solutions for the 5-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[3], Q_2[5], Q_3[2], Q_4[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[4], Q_2[2], Q_3[5], Q_4[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[5], Q_3[3], Q_4[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[2], Q_3[4], Q_4[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[1], Q_3[4], Q_4[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[3], Q_3[5], Q_4[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[4], Q_3[1], Q_4[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[3], Q_3[1], Q_4[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[1], Q_3[3], Q_4[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[1], Q_2[4], Q_3[2], Q_4[5]
```

## 6 queens

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 6
INFO  [main] o.m.p.c.q.QueensSolver: Found 4 solutions for the 6-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[1], Q_3[6], Q_4[4], Q_5[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[2], Q_3[5], Q_4[1], Q_5[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[5], Q_3[2], Q_4[6], Q_5[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[6], Q_3[1], Q_4[3], Q_5[5]
```

# 7 queens

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 7
INFO  [main] o.m.p.c.q.QueensSolver: Found 40 solutions for the 7-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[2], Q_3[6], Q_4[3], Q_5[1], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[7], Q_3[5], Q_4[3], Q_5[1], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[5], Q_3[2], Q_4[6], Q_5[1], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[3], Q_2[6], Q_3[2], Q_4[5], Q_5[1], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[7], Q_2[2], Q_3[4], Q_4[6], Q_5[1], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[2], Q_3[4], Q_4[6], Q_5[1], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[6], Q_2[3], Q_3[7], Q_4[4], Q_5[1], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[4], Q_2[1], Q_3[5], Q_4[2], Q_5[6], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[6], Q_2[1], Q_3[3], Q_4[5], Q_5[7], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[1], Q_3[4], Q_4[7], Q_5[5], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[1], Q_3[6], Q_4[4], Q_5[2], Q_6[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[1], Q_3[7], Q_4[5], Q_5[3], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[1], Q_3[4], Q_4[7], Q_5[3], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[2], Q_3[7], Q_4[5], Q_5[3], Q_6[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[2], Q_3[5], Q_4[1], Q_5[4], Q_6[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[5], Q_2[2], Q_3[6], Q_4[3], Q_5[7], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[3], Q_3[6], Q_4[2], Q_5[7], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[1], Q_2[3], Q_3[5], Q_4[7], Q_5[2], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[5], Q_2[3], Q_3[1], Q_4[6], Q_5[4], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[3], Q_3[1], Q_4[7], Q_5[4], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[3], Q_3[6], Q_4[2], Q_5[5], Q_6[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[6], Q_2[4], Q_3[2], Q_4[7], Q_5[5], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[7], Q_2[4], Q_3[1], Q_4[5], Q_5[2], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[2], Q_2[4], Q_3[6], Q_4[1], Q_5[3], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[1], Q_2[4], Q_3[7], Q_4[3], Q_5[6], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[3], Q_2[5], Q_3[7], Q_4[2], Q_5[4], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[7], Q_2[5], Q_3[3], Q_4[1], Q_5[6], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[5], Q_3[2], Q_4[6], Q_5[3], Q_6[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[2], Q_2[5], Q_3[1], Q_4[4], Q_5[7], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[5], Q_3[7], Q_4[1], Q_5[4], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[6], Q_3[1], Q_4[3], Q_5[5], Q_6[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[1], Q_2[6], Q_3[2], Q_4[5], Q_5[7], Q_6[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[6], Q_3[3], Q_4[7], Q_5[4], Q_6[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[1], Q_2[6], Q_3[4], Q_4[2], Q_5[7], Q_6[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[1], Q_2[6], Q_3[4], Q_4[2], Q_5[7], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[4], Q_2[7], Q_3[3], Q_4[6], Q_5[2], Q_6[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[7], Q_3[4], Q_4[1], Q_5[3], Q_6[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[7], Q_3[1], Q_4[3], Q_5[5], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[7], Q_3[4], Q_4[1], Q_5[5], Q_6[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[7], Q_3[2], Q_4[4], Q_5[6], Q_6[1]
```

## 8 queens

![solution_8.png](docs/images/solution_8.png)

```bash
➜  picocli-example-choco-solver-queens git:(master) ✗ build/native/nativeCompile/queenSolver 8
INFO  [main] o.m.p.c.q.QueensSolver: Found 92 solutions for the 8-queens problem: 
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[4], Q_2[2], Q_3[5], Q_4[8], Q_5[1], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[4], Q_2[2], Q_3[8], Q_4[6], Q_5[1], Q_6[3], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[2], Q_3[6], Q_4[3], Q_5[1], Q_6[8], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[2], Q_3[6], Q_4[3], Q_5[1], Q_6[4], Q_7[8]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[2], Q_3[7], Q_4[5], Q_5[1], Q_6[8], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[2], Q_3[5], Q_4[8], Q_5[1], Q_6[7], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[7], Q_2[2], Q_3[8], Q_4[5], Q_5[1], Q_6[4], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[2], Q_3[4], Q_4[8], Q_5[1], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[4], Q_2[6], Q_3[8], Q_4[3], Q_5[1], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[3], Q_2[8], Q_3[2], Q_4[5], Q_5[1], Q_6[6], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[6], Q_2[8], Q_3[2], Q_4[7], Q_5[1], Q_6[3], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[5], Q_3[2], Q_4[6], Q_5[1], Q_6[3], Q_7[8]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[8], Q_3[2], Q_4[4], Q_5[1], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[8], Q_3[4], Q_4[7], Q_5[1], Q_6[6], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[8], Q_3[5], Q_4[7], Q_5[1], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[5], Q_3[8], Q_4[6], Q_5[1], Q_6[3], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[2], Q_3[8], Q_4[5], Q_5[7], Q_6[1], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[7], Q_2[3], Q_3[6], Q_4[8], Q_5[5], Q_6[1], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[3], Q_3[8], Q_4[2], Q_5[5], Q_6[1], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[7], Q_2[2], Q_3[8], Q_4[6], Q_5[4], Q_6[1], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[7], Q_3[2], Q_4[4], Q_5[8], Q_6[1], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[7], Q_3[3], Q_4[6], Q_5[8], Q_6[1], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[4], Q_3[6], Q_4[8], Q_5[3], Q_6[1], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[7], Q_3[2], Q_4[8], Q_5[5], Q_6[1], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[1], Q_3[8], Q_4[5], Q_5[2], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[8], Q_2[1], Q_3[3], Q_4[6], Q_5[2], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[8], Q_2[1], Q_3[5], Q_4[7], Q_5[2], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[1], Q_3[6], Q_4[8], Q_5[2], Q_6[4], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[1], Q_3[5], Q_4[8], Q_5[2], Q_6[7], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[1], Q_3[8], Q_4[5], Q_5[2], Q_6[4], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[1], Q_3[8], Q_4[4], Q_5[2], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[8], Q_1[4], Q_2[1], Q_3[3], Q_4[6], Q_5[2], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[7], Q_3[1], Q_4[4], Q_5[2], Q_6[8], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[8], Q_2[4], Q_3[1], Q_4[7], Q_5[2], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[1], Q_2[4], Q_3[6], Q_4[8], Q_5[2], Q_6[7], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[7], Q_2[4], Q_3[6], Q_4[8], Q_5[2], Q_6[5], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[7], Q_3[1], Q_4[8], Q_5[2], Q_6[5], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[1], Q_2[7], Q_3[5], Q_4[8], Q_5[2], Q_6[4], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[8], Q_3[1], Q_4[4], Q_5[7], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[6], Q_3[1], Q_4[7], Q_5[4], Q_6[8], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[2], Q_2[7], Q_3[1], Q_4[3], Q_5[5], Q_6[8], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[2], Q_2[7], Q_3[1], Q_4[4], Q_5[8], Q_6[5], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[2], Q_2[4], Q_3[1], Q_4[8], Q_5[5], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[8], Q_1[2], Q_2[4], Q_3[1], Q_4[7], Q_5[5], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[4], Q_2[7], Q_3[1], Q_4[3], Q_5[5], Q_6[2], Q_7[8]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[8], Q_3[1], Q_4[4], Q_5[7], Q_6[5], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[4], Q_3[1], Q_4[8], Q_5[5], Q_6[7], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[4], Q_3[1], Q_4[3], Q_5[8], Q_6[6], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[5], Q_2[3], Q_3[1], Q_4[6], Q_5[8], Q_6[2], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[7], Q_3[1], Q_4[3], Q_5[8], Q_6[6], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[8], Q_2[6], Q_3[1], Q_4[3], Q_5[5], Q_6[7], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[8], Q_2[4], Q_3[1], Q_4[3], Q_5[6], Q_6[2], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[8], Q_3[1], Q_4[5], Q_5[7], Q_6[2], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[2], Q_3[8], Q_4[6], Q_5[4], Q_6[7], Q_7[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[2], Q_2[4], Q_3[7], Q_4[3], Q_5[8], Q_6[6], Q_7[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[7], Q_3[3], Q_4[6], Q_5[8], Q_6[5], Q_7[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[4], Q_3[2], Q_4[8], Q_5[5], Q_6[7], Q_7[1]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[7], Q_3[5], Q_4[1], Q_5[8], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[2], Q_2[6], Q_3[3], Q_4[1], Q_5[4], Q_6[8], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[8], Q_1[2], Q_2[5], Q_3[3], Q_4[1], Q_5[7], Q_6[4], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[2], Q_2[8], Q_3[6], Q_4[1], Q_5[3], Q_6[5], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[5], Q_2[7], Q_3[4], Q_4[1], Q_5[8], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[6], Q_2[8], Q_3[3], Q_4[1], Q_5[4], Q_6[7], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[7], Q_2[5], Q_3[8], Q_4[1], Q_5[4], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[5], Q_3[8], Q_4[1], Q_5[4], Q_6[2], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[5], Q_3[7], Q_4[1], Q_5[4], Q_6[2], Q_7[8]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[7], Q_3[4], Q_4[1], Q_5[8], Q_6[2], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[8], Q_2[2], Q_3[4], Q_4[1], Q_5[7], Q_6[5], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[2], Q_3[8], Q_4[1], Q_5[7], Q_6[4], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[6], Q_2[2], Q_3[7], Q_4[1], Q_5[4], Q_6[8], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[5], Q_2[8], Q_3[4], Q_4[1], Q_5[7], Q_6[2], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[6], Q_2[8], Q_3[3], Q_4[1], Q_5[7], Q_6[5], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[7], Q_2[5], Q_3[3], Q_4[1], Q_5[6], Q_6[8], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[8], Q_2[5], Q_3[3], Q_4[1], Q_5[7], Q_6[2], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[3], Q_1[8], Q_2[4], Q_3[7], Q_4[1], Q_5[6], Q_6[2], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[1], Q_2[5], Q_3[2], Q_4[8], Q_5[3], Q_6[7], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[5], Q_3[8], Q_4[6], Q_5[3], Q_6[7], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[1], Q_3[4], Q_4[2], Q_5[8], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[1], Q_2[8], Q_3[4], Q_4[2], Q_5[7], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[7], Q_2[5], Q_3[8], Q_4[2], Q_5[4], Q_6[6], Q_7[3]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[6], Q_2[1], Q_3[5], Q_4[2], Q_5[8], Q_6[3], Q_7[7]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[8], Q_1[3], Q_2[1], Q_3[6], Q_4[2], Q_5[5], Q_6[7], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[3], Q_2[1], Q_3[7], Q_4[2], Q_5[8], Q_6[6], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[4], Q_1[1], Q_2[5], Q_3[8], Q_4[2], Q_5[7], Q_6[3], Q_7[6]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[1], Q_2[3], Q_3[8], Q_4[6], Q_5[4], Q_6[2], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[6], Q_2[8], Q_3[3], Q_4[7], Q_5[4], Q_6[2], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[7], Q_1[3], Q_2[1], Q_3[6], Q_4[8], Q_5[5], Q_6[2], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[7], Q_2[1], Q_3[3], Q_4[8], Q_5[6], Q_6[4], Q_7[2]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[6], Q_1[3], Q_2[1], Q_3[7], Q_4[5], Q_5[8], Q_6[2], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[2], Q_1[6], Q_2[1], Q_3[7], Q_4[4], Q_5[8], Q_6[3], Q_7[5]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[1], Q_1[5], Q_2[8], Q_3[6], Q_4[3], Q_5[7], Q_6[2], Q_7[4]
INFO  [main] o.m.p.c.q.QueensSolver: Q_0[5], Q_1[1], Q_2[8], Q_3[6], Q_4[3], Q_5[7], Q_6[2], Q_7[4]
```

# development

## extract resources

```bash
$ ./gradlew -Pagent run
```

Output in `build/native/agent-output/run/reflect-config.json`
