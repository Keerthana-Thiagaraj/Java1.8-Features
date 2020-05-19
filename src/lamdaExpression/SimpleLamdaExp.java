package lamdaExpression;


//It helps to iterate, filter and extract data from collection.
// It saves a lot of code. In case of lambda expression,
// we don't need to define the method again for providing the implementation. Here, we just write the implementation code.
//Java lambda expression is treated as a function, so compiler does not create .class file.

//used for implementing functional interface
// contains 3 parts- argument list,arrow-token and body


//**Example to show example of anonymous class**//

// 1. Normal creation of a class that implement interfaces

//interface Name {
//    void name();
//}
//
//public class SimpleLamdaExp {
//
//    public static void main(String[] args) {
//        NameClass nameClass = new NameClass();
//        nameClass.name();
//    }
//
//}
//
//class NameClass implements Name {
//
//    @Override
//    public void name() {
//
//        System.out.println("Name is keerthana");
//
//    }
//}


//**Usage of Anonymous class**//


//interface Name {
//    void name();
//}
//
//public class SimpleLamdaExp {
//
//    public static void main(String[] args) {
//
//        Name nameObj= new Name() {
//            @Override
//            public void name() {
//
//                System.out.println("Name is keerthana");
//            }
//        };
//        nameObj.name();
//
//    }
//
//}


//** Usage of Lamda Expression **/


interface Name {
    void name();
}

public class SimpleLamdaExp {

    public static void main(String[] args) {

        Name nameObj= ()->{

                System.out.println("Name is keerthana");

        };
        nameObj.name();

    }

}
