package Inheritance;

/**
 * Created by sirdir on 12.04.17.
 */
public class F1 {
    F1(int i){
        System.out.println(i);
    }
    F1(){
        System.out.println("lol");
    }
    final void methodF(){
        System.out.println("final method");
    }

    private void methodP(){
        System.out.println("private method");
    }
}
