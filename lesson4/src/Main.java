public class Main {
    public static void main(String[] args) {

        Student studentMax = new Student();
        studentMax.name = "Max";
        studentMax.sayHello();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Student studentAlex = new Student();
        studentAlex.name = "Alex";
        studentAlex.age = 25;
        studentAlex.sayHello();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Class classJava = new Class();
        classJava.name = "Java Class";
        System.out.println(classJava.name);
    }
}