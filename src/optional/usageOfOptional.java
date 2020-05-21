package optional;


import java.util.Optional;

//It is a public final class and used to deal with NullPointerException in Java application
public class usageOfOptional {

    public static void main(String[] args) {


        String[] str1 = new String[20];
        str1[2] = "hello keerthana";
        Optional<String> checkNull =Optional.ofNullable(str1[2]);

        if(checkNull.isPresent()){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
    }
}
