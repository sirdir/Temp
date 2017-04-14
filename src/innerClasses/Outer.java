package innerClasses;

import java.math.BigInteger;

/**
 * Created by sirdir on 14.04.17.
 */
public class Outer {
    class Inner{}
    Inner getInner(){
        return new Inner();
    }
    public static void main(){
        Outer out = new Outer();
        Outer.Inner in = out.getInner();
    }
}
