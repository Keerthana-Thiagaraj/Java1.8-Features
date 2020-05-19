package lamdaExpression;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ToyDetails {

    int id;
    String name;
    double price;

    public ToyDetails(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LEwithStreamFilter {

    public static void main(String[] args) {

        List<ToyDetails> toyList = new ArrayList<>();
        toyList.add(new ToyDetails(1, "barbie", 233.9));
        toyList.add(new ToyDetails(2, "jerry", 422.7));
        toyList.add(new ToyDetails(3, "tom", 198.2));
        toyList.add(new ToyDetails(4, "alibaba", 22.1));

        //** using lambda along with stream to filter data **//

        Stream<ToyDetails> filteredToys= toyList.stream().filter(p->p.price>400);

        filteredToys.forEach((details)->
                {
                    System.out.println(details.id+""+details.name+""+details.price);
                }

        );

    }
}

