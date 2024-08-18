public class multilev {
    public static void main(String[] args) {
        Dog bobby=new Dog();
        bobby.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String bread;
}
