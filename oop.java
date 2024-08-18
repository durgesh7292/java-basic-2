public class oop {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
