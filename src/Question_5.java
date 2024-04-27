public class Question_5 {
//    Given a[n], Find no. of Pairs i, j such that i<j && a[i]>a[j].
    public static void main(String[] args) {
        int[] array = {10, 3, 8, 15, 6, 12, 2, 18, 7, 1};
        System.out.println("no. of Pairs : "+mergeSort(array,0,array.length-1));
    }
    static int mergeSort(int[] array,int s,int e){
        if(s==e){
            return 0;
        }
        int mid=(e+s)/2;
        int l = mergeSort(array,s,mid);
        int r = mergeSort(array,mid+1,e);
        int k = merge(array, s, mid, e);
        return l+r+k;
    }
    static int merge(int[] array,int s,int m,int e){
        int count = 0;
        int p1=s,p2=m+1,p3=0;
        int[] temp = new int[e-s+1];
        while(p1<=m && p2<=e){
            if(array[p1]<=array[p2]){
                temp[p3] = array[p1];
                p1++;
                p3++;
            }else{
                temp[p3] = array[p2];
                p2++;
                p3++;
                count += (m-p1+1);
            }
        }
        while(p1<=m){
            temp[p3] = array[p1];
            p1++;
            p3++;
        }
        while(p2<=e){
            temp[p3] = array[p2];
            p2++;
            p3++;
        }
        for(int i=0;i< temp.length;i++){
            array[i+s] = temp[i];
        }
        return count;
    }
}
