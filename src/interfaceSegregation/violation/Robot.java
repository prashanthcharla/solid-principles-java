package interfaceSegregation.violation;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot's can't eat");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot's can't sleep");
    }
}
