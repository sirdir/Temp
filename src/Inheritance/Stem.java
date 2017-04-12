package Inheritance;

/**
 * Created by sirdir on 12.04.17.
 */
public class Stem extends Root {
    Stem(){
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("Stem");
    }
    public static void main(String[] args){
        new Stem();
    }
}
