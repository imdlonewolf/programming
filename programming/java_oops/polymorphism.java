/*  Polymorphism -> same job done in different ways
 i.function overloading(compile time)   ii.function overriding(run time)
fucntion overloading -> different functions having same name
functions must have any differntiating factors
i. different return type    ii.parameter type/num different 
errors can be easily solved as compilation error can be resolved easily
*/
class Student{
    String name;
    int age;
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name){
        System.out.println(name);
    }
    public void info(String name,int age){
        System.out.println(name + " "+age);
    }
}
public class polymorphism{
    public static void main(String[] args){
        Student s1=new Student();
        s1.info("rahul");
        s1.info(22);
        s1.info("rahul",22);
    }
}
