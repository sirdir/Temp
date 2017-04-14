package Inheritance;

/**
 * Created by sirdir on 14.04.17.
 */
public class Print extends BasicPrint {
    int i =5;

    Print(int x) {
        super(x);
        i = x;
    }

    @Override
    void print() {
        System.out.println(i);
    }
}
