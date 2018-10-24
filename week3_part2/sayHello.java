public class sayHello {
    public static void main(String[] args) {
        sayHello("Marty");

        String teacher = "Bictolia";
        sayHello(teacher);
    }

    public static void sayHello(String name) {
        System.out.println("Welcome, " + name);
    }
}
