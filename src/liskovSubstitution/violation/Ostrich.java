package liskovSubstitution.violation;

public class Ostrich implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
