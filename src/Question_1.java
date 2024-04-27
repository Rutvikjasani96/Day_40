import java.util.Arrays;
import java.util.Comparator;

public class Question_1 {
//    Given n Array Elements, sort them in Decreasing Order.
    public static void main(String[] args) {
        Integer[] array = {1, 4, 7, 9, 8, 6, 2, 4, 5};
        sortDec(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    static void sortDec(Integer[] array){
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Arrays.sort(array, comp);
    }
}
