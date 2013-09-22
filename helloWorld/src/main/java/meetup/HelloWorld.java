package meetup;

public class HelloWorld {

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.print(new HelloWorld("MEETUP!").hello());
    }

    public String hello() {
        return "Hello "+name+"!";
    }
}
