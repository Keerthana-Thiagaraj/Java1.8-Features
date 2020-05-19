package lamdaExpression;

public class LEThread {

//    //** Without lambda**/
//    public static void main(String[] args) {
//
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running thread 1");
//            }
//        };
//        Thread thread= new Thread(r);
//        r.run();
//    }

    //** With lambda**/
    public static void main(String[] args) {

        Runnable r = ()-> {

                System.out.println("running thread using lambda");

        };
        Thread thread= new Thread(r);
        r.run();
    }
}
