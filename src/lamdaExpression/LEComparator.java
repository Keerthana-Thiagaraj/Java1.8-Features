package lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Toy {

    int id;
    String name;
    double price;

    public Toy(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LEComparator {

    public static void main(String[] args) {

        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy(1, "barbie", 233.9));
        toyList.add(new Toy(2, "jerry", 422.7));
        toyList.add(new Toy(3, "tom", 198.2));
        toyList.add(new Toy(4, "alibaba", 22.1));

        Collections.sort(toyList, (t1, t2) ->
                {
//                    return t1.name.compareTo(t2.name);
                    return (int)t1.price - (int)t2.price;
                }

        );

        toyList.forEach((list) ->
                {
                    System.out.println(list.id + "" + list.name + "" + list.price);
                }
        );


        for (Toy t : toyList) {
//            System.out.println(t.id + "" + t.name + "" + t.price);
        }
    }

}
