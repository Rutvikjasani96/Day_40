import java.util.Arrays;

public class Question_4 {
//    Given 2 Arrays a[n] & b[m], Calculate no. of pairs i,j such that a[i]>b[i]
    public static void main(String[] args) {
        int[] a = {7, 3, 5};
        int[] b = {2, 0, 6};
        System.out.println("no. of Pairs : "+noOfPairs(a,b));
    }
    static int noOfPairs(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int p1=0,p2=0;
        while(p1<a.length && p2<b.length){
            if(a[p1]<b[p2]){
                p1++;
            }
            if(a[p1]>b[p2]){
                count += (a.length-p1);
                p2++;
            }
        }
        return count;
    }
}
