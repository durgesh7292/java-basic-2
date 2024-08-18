public class methodoverriding {
    public static void main(String[] args) {
        Dear d=new Dear();
        d.eat();
    }
}
class Animals{
    void eat(){
        System.out.println("eats anything");
    }

}
class Dear extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}