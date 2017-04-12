package Inheritance;

/**
 * Created by sirdir on 12.04.17.
 */
public class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;
    Root(){
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("Root");
    }
}
