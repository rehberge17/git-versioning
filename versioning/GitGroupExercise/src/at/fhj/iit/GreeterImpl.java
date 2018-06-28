public class GreeterImpl extends Greeter {
    private String nameToGreet;

    public GreeterImpl(string name) {
        this.nameToGreet = name;
    }

    public sayHello() {
        System.out.println("Hello, " + this.nameToGreet);
    }
}