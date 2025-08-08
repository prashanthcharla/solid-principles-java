package dependencyInversion.violation;

public class Calculator {
    int calculate(int n1, int n2, String type) {
        return switch (type) {
            case "add" -> {
                AddOperation addOperation = new AddOperation();
                yield addOperation.add(n1, n2);
            }
            case "subtract" -> {
                SubtractOperation subtractOperation = new SubtractOperation();
                yield subtractOperation.subtract(n1, n2);
            }
            default -> -1;
        };
    }
}
