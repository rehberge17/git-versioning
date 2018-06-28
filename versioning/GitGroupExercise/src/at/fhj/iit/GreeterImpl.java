public class GreeterImpl extends Greeter {
    private String nameToGreet;

    public GreeterImpl(string name) {
        this.nameToGreet = name;
    }

    public void sayGoodBye() {
        System.out.println("Good Bye, " + this.nameToGreet);
    }
}