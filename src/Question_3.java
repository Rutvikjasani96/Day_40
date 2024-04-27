import java.util.Arrays;
import java.util.Comparator;

public class Question_3 {
//    Given n Strings, We can Concatenate in any order, Get the Maximum number.
//    Note: Numbers are given in String format.
    public static void main(String[] args) {
        String[] str = {"33","90","39"};
        maxConcatenate(str);
        for (String s : str){
            System.out.print(" "+s);
        }
    }
    static void maxConcatenate(String[] str) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                String ab = o1 + o2;
//                String ba = o2 + o1;
                int ab = Integer.parseInt(o1 + o2);
                int ba = Integer.parseInt(o2 + o1);
                if(ab>ba){
                    return -1;
                }else{
                    return 1;
                }
            }
        };
        Arrays.sort(str,comp);
    }
}
