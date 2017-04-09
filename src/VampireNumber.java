/**
 * Created by sirdir on 09.04.17.
 */
public class VampireNumber {
    public static void main(String... args){
        for (int i = 1000; i++ < 10000; ){
            int fourth = i % 10;
            int third = (i % 100 - fourth)/10;
            int second = (i % 1000 - third - fourth)/100;
            int first = (i - second - third - fourth)/1000;
            int num12 = first*10 + second;
            int num13 = first*10 + third;
            int num14 = first*10 + fourth;
            int num21 = second*10 + first;
            int num23 = second*10 + third;
            int num24 = second*10 + fourth;
            int num31 = third*10 + first;
            int num32 = third*10 + second;
            int num34 = third*10 + fourth;
            int num41 = fourth*10 + first;
            int num42 = fourth*10 + second;
            int num43 = fourth*10 + third;
            if (num12*num34 == i){
                System.out.println(i + " = " + num12 + " * " + num34);
                continue;
            }
            else if (num12*num43 == i){
                System.out.println(i + " = " + num12 + " * " + num43);
                continue;
            }
            else if (num13*num24 == i){
                System.out.println(i + " = " + num13 + " * " + num24);
                continue;
            }
            else if (num13*num42 == i){
                System.out.println(i + " = " + num13 + " * " + num42);
                continue;
            }
            else if (num14*num23 == i){
                System.out.println(i + " = " + num14 + " * " + num23);
                continue;
            }
            else if (num14*num32 == i){
                System.out.println(i + " = " + num14 + " * " + num32);
                continue;
            }
            else if (num21*num34 == i){
                System.out.println(i + " = " + num21 + " * " + num34);
                continue;
            }
            else if (num21*num43 == i){
                System.out.println(i + " = " + num21 + " * " + num43);
                continue;
            }
            else if (num31*num24 == i){
                System.out.println(i + " = " + num31 + " * " + num24);
                continue;
            }
            else if (num31*num42 == i){
                System.out.println(i + " = " + num31 + " * " + num42);
                continue;
            }
            else if (num41*num23 == i){
                System.out.println(i + " = " + num41 + " * " + num23);
                continue;
            }
            else if (num41*num32 == i){
                System.out.println(i + " = " + num41 + " * " + num32);
                continue;
            }
        }
    }
}
