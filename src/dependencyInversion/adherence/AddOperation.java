package dependencyInversion.adherence;

public class AddOperation implements Operation {
    @Override
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}
