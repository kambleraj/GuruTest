package Inheritance;

 

public class InheritanceTest {

 

       public static void main(String[] args) {

 

              System.out.println("A a= new A()");

              A a= new A();

              System.out.println(a.a);

              System.out.println(a.b);

              a.m1();

              a.m2();

              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

             

             

              System.out.println("B b= new B()");

              B b= new B();

              System.out.println(b.a);

              System.out.println(b.b);

              System.out.println(b.c);

              b.m1();

              b.m2();

              b.m3();

              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

             

              System.out.println("A a1= new B()");

              A a1= new B();

              System.out.println(a1.a);

              System.out.println(a1.b);

              //System.out.println(a1.c);

              a1.m1();

              a1.m2();

              //a1.m3();

              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

             

       //B b1=new A(); -------- Not allowed

      

             

             

       }

 

}

 