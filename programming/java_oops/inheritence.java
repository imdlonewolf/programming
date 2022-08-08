/*inherite property from a class to another class */
public class inheritence {
    public static void main(String []args){
        Shape s1= new Shape();
        s1.color="blue";
        s1.info();
    }
}
// base/parent class
class Shape{
    String color;
    public void info(){
        System.out.println(this.color);
    }
}
// subclass/child class

class Triangle extends Shape{

}