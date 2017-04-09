/**
 * Created by sirdir on 09.04.17.
 */
public class Fibo {

    void doFibo(int limit){
        int first = 1;
        int second = 1;
        int current;
        System.out.println(first);
        System.out.println(second);
        do {
            current = first + second;
            first = second;
            second = current;
            System.out.println(current);
        }while (current < limit);
    }

    public static void main(String... args){
        new Fibo().doFibo(34);
    }
}
