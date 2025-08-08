package liskovSubstitution.adherence;

public class Crow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
}
