public class oooop {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.setcolor("grown");
        System.out.println(a1.color);

    }
}
class Animal{
    String color;
    int  tip;

    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
