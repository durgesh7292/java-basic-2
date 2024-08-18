public class oob {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
