package liskovSubstitution.violation;

public class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
}
