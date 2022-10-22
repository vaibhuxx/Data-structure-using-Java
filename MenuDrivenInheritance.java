import java.util.*;

public class MenuDivenInheritance {
    public static void main(String args[]) {

        class A {
            public void objA() {
                System.out.println(
                        "Object Created");
            }
        }
        class B {
            public B() {
                System.out.println(
                        "Constructor Created");
            }
        }
        class C {
            public C() {
                System.out.println("Parent Created using Constructor");
            }
        }
        class D extends C {
            public D() {
                System.out.println(
                        " First Child is created using Single Inheritance");
            }
        }
        class X extends D {
            public X() {
                System.out.println(
                        " Second Child Created using Hierarchical Inheritance");
            }
        }
        class E extends C {
            public E() {
                System.out.println(
                        " Second Child Created using Hierarchical Inheritance");
            }
        }

        class F extends X {
            public F() {
                System.out.println(
                        " Third Child created using Multilevel Inheritance");
            }
        }
        class G extends F {
            public G() {
                System.out.println(" Fourth Child created for Multilevel Inheritance.");
            }
        }

        int ch;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------------");
            System.out.println(
                    "Perform Operations using following Options\n 1: Creating Objects\n 2: Creating Constructor\n 3: Using Constructor in Inheritance\n 4: Single Inheritance\n 5: Hierarchical  Inheritance\n 6: Multilevel Inheritance\n");
            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    A obj1 = new A();
                    obj1.objA();
                    break;
                case 2:
                    B obj2 = new B();
                    break;
                case 3:
                    C obj3 = new C();
                    break;
                case 4:
                    D obj4 = new D();
                    break;
                case 5:
                    E obj5 = new E();
                    D obj7 = new D();
                    System.out.println(
                            "\nWe can see both parent class is same as it is inheriting Single Inheritace and performing Hierarchical Inheritance");
                    break;
                case 6:
                    G obj8 = new G();
                    System.out.println("\n We can see all the childs are inherited in Multilevel Inheritance");
                    break;
            }
        } while (ch != 7);
    }
}
