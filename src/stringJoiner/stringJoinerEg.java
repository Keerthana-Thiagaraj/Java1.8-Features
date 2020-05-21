package stringJoiner;

import java.util.StringJoiner;

public class stringJoinerEg {

    public static void main(String[] args) {

        //setting delimiter ,suffix and prefix
        StringJoiner join1= new StringJoiner(",","{","}");
        join1.add("apple");
        join1.add("orange");
        join1.add("banana");
        System.out.println(join1);

        StringJoiner join2= new StringJoiner(",");
        join2.add("onion");
        join2.add("carrot");
        System.out.println("length"+join1.length());
        StringJoiner merge =join1.merge(join2);

        System.out.println(""+merge);
    }
}
