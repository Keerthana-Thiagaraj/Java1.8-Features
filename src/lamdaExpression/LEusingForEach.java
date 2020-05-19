package lamdaExpression;

import java.util.ArrayList;

public class LEusingForEach {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(3);
        list.add(22);
        list.add(2);

        list.forEach(

                (listValue)-> System.out.println(listValue)
        );

    }

}
