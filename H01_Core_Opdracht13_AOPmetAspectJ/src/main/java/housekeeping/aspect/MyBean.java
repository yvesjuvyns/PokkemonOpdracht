package housekeeping.aspect;

public class MyBean implements MyInterface {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }
}
