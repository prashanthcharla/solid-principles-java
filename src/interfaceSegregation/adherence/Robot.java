package interfaceSegregation.adherence;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Working");
    }
}
