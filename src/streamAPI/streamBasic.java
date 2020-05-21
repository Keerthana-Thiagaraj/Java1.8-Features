package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//**
//Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods
// which can be pipelined to produce the desired result.
//The features of Java stream are –
//
// A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
// Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
// Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations
// can be pipelined. Terminal operations mark the end of the stream and return the result.

//Intermediate o/p-map,filter,sorted,distinct,
//Terminal o/p-collect,forEach,reduce

class toyInfo {

    int id;

    Double rate;

    String name;

    public toyInfo(int id, Double rate, String name) {
        this.id = id;
        this.rate = rate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "toyInfo{" +
                "id=" + id +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                '}';
    }
}

public class streamBasic {

    public static void main(String[] args) {


//        List<Integer> number = Arrays.asList(3, 1, 8, 2, 2);

//        System.out.println("usage of map" + number.stream().map(x -> x * x).collect(Collectors.toList()));
//
//        System.out.println("usage of filter "+number.stream().filter(p->p>2).collect(Collectors.toList()));
//
//        System.out.println("usage of sorted"+ number.stream().sorted().collect(Collectors.toList()));
//
//        System.out.println("usage of collect"+ number.stream().distinct().collect(Collectors.toList()));

        List<toyInfo> toy = new ArrayList<toyInfo>();
        toy.add(new toyInfo(1, 88.2, "barbieeee"));
        toy.add(new toyInfo(2, 200.11, "jerrrrrrrrrrrrrrrrrry"));
        toy.add(new toyInfo(3, 23.81, "jery"));
        toy.add(new toyInfo(4, 160.7, "marie"));
        toy.add(new toyInfo(5, 100.78, "pikacho"));

        //"usage of map,sorted& collect"//
        toy.stream().filter(p -> p.rate > 100).map(p -> p.rate).sorted().collect(Collectors.toList()).forEach(System.out::println);


        //** usage of filter map & foreach**//
        toy.stream().filter(p -> p.rate > 100).map(p -> p.rate).forEach(System.out::println);

        //** usage of map and foreach**//
        toy.stream().map(p -> p.id).forEach(System.out::println);

        System.out.println("sort");
        toy.stream().map(p -> p.name).sorted().collect(Collectors.toList()).forEach(System.out::println);

        //** sorting the rate or names using comparator.comparing**//
        toy.stream().sorted(Comparator.comparing(t -> t.rate)).collect(Collectors.toList()).forEach(System.out::println);


        //** usage of distinct with map**//

        toy.stream().map(p -> p.name).distinct().forEach(System.out::println);

        //** maptoint method for finding count**//

        System.out.println("" + toy.stream().mapToInt(p -> p.id).count());

        //** returns boolean value if any value is found in stream**//

        System.out.println("" + toy.stream().findAny().isPresent());

        //** setting the o/p of records by limit**//

        toy.stream().limit(3).forEach(System.out::println);

        //** find the first element in the stream**//

        System.out.println("first element" + toy.stream().findFirst());

        //**find any element from the stream**//

        System.out.println("any element" + toy.stream().findAny());

        //** map() works pretty well in a simple case, but what if we have something more complex such as a list of lists as an input.
        // hence we go for flatmap**//

        // flatMap() V/s map() :
        //  1) map() takes a Stream and transform it to another Stream.
        // It applies a function on each element of Stream and store return value into new Stream.
        // It does not flatten the stream. But flatMap() is the combination of a map and a flat operation i.e,
        // it applies a function to elements as well as flatten them.
        // 2) map() is used for transformation only, but flatMap() is used for both transformation and flattening.

        System.out.println("using flatmap");
        toy.stream().flatMap(s -> Stream.of(s.name.charAt(0))).forEach(System.out::println);

        //** we need to perform operations where a stream reduces to single resultant value, for example, maximum,
        // minimum, sum, product, etc. Reducing is the repeated process of combining all elements.**//

        /** usage of reduce **/

//        Here a stream reduces to single resultant value,
//        for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.
//        egs:sum(), min(), max(), count() etc. are some examples of reduce operations


        /**example to display longest length of the name**/
        System.out.println("nameee" + toy.stream().reduce((p1, p2) -> p1.name.length() > p2.name.length() ? p1 : p2));


        //** find the max of id using reduce **/

        Integer val = toy.stream().map(p -> p.id).reduce(Integer.MAX_VALUE, (p1, p2) -> p1 < p2 ? p1 : p2);

        System.out.println("COUNTING"+toy.stream().map(p -> p.name).collect(Collectors.counting()));
        System.out.println("valuee" + val);
    }
}
