package lamdaExpression;


//** lamda exp with Single parameter **//

//interface Name1 {
//  String name(String name);
//}
//
//public class LESingleNdMultipleParameter {
//
//
//    public static void main(String[] args) {
//
//        Name1 nameObj = name -> {
//
//          return ""+name;
//
//        };
//        System.out.println("Name is"+nameObj.name("keerthana"));
//
//    }
//
//}


//** lamda exp with multiple params **//

interface Name1 {
    int multiply(int a, int b);
}

public class LESingleNdMultipleParameter {


    public static void main(String[] args) {

        Name1 nameObj = (a, b) -> {

            return (a * b);

        };
        System.out.println("value is " + nameObj.multiply(2, 2));

    }

}