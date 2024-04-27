import java.util.Arrays;
import java.util.Comparator;

public class Question_2 {
//    Given n Array Elements, sort them based on Increasing no. of Factors.
//    If 2 Elements have same factors, one with greatest value should come first.
    public static void main(String[] args) {
        Integer[] array = {3,  9, 4, 6 ,12, 10, 7};
        sortFactors(array);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }
    static void sortFactors(Integer[] array){
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                if(noOfFact(a)<noOfFact(b)){
                    return -1;
                }else if(noOfFact(a)>noOfFact(b)){
                    return 1;
                }else if(a>b){
                    return -1;
                }
                return 0;
            }
        };
        Arrays.sort(array,comp);
    }
    static int noOfFact(int n){
        int fact = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==(n/i)){
                    fact++;
                }else{
                    fact+=2;
                }
            }
        }
        return fact;
    }
}
