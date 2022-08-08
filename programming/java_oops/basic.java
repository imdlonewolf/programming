public class basic{
    public static void main(String []args){
        Pen p1=new Pen("Red","ball");
        p1.info();
        Pen p2=new Pen(p1);
        p2.info();
    }
}
class Pen{
    String color;
    String type;
    public void info(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
    Pen(){
        System.out.println("on pen");
    }
    Pen(String color,String type){
        this.color=color;
        this.type=type;
    }
    Pen(Pen s1){
        this.color=s1.color;
        this.type=s1.type;
    }
}
/* destructor not required as java is having garbage collector
 */