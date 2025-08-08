package dependencyInversion.adherence;

public class Calculator {
    int calculate(int n1, int n2, Operation op) {
        return op.calculate(n1, n2);
    }
}
