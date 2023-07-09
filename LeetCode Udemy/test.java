import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static int getFact(int n){
        Integer fact = 1;
        while(n!=0){
            fact *=n;
            n--;
        }
        int counter = 0;
        Integer trail = fact%10;
        fact /=10;
        while(trail == 0){
            counter++;
            trail = fact%10;
            fact /=10;
        }
        return counter;
    }
    public static int rev(int n){
        int fact = getFact(n);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(rev(10));
    }
}
