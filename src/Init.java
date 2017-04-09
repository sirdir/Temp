/**
 * Created by sirdir on 09.04.17.
 */
public class Init {
    public static void main(String[] args){
        System.out.println("before");
        SomeClass init = new SomeClass();
        System.out.println("after");
        System.out.println(init.s1);
        System.out.println(init.s2);
    }

}
