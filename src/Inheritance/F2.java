package Inheritance;

/**
 * Created by sirdir on 12.04.17.
 */
public class F2 extends F1 {
    F2(){
    }
    F2(int i){
        super(i);
    }

    void methodF(String str){
        System.out.println(str);
    }

    void methodP(){
        System.out.println("new one");
    }

    void methodNew(){
        System.out.println("Hello world!");
    }
}
