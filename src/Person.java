public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printPerson() {
        System.out.println("My name is: " + name);
        System.out.println("I'm " + age + " years old.");
    }
}
