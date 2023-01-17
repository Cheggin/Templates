import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args){
        int[] arr1 = new int[]{5, 4, 3, 2, 1};
        int[] arr2 = new int[]{1, 4, 6, 1, 3}; 
        // Requirement: The two lists to be merged must be sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //
        int[] sorted = merge(arr1, arr2);
        for(int i: sorted){
            System.out.print(i + " ");
        }
    }
    public static int[] merge(int[] a1, int[] a2){
        int[] sorted = new int[a1.length + a2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while(p1 < a1.length && p2 < a2.length){
            if(a1[p1] < a2[p2]){
                sorted[p3] = a1[p1];
                p1++;
            }
            else{
                sorted[p3] = a2[p2];
                p2++;
            }
            p3++;
        }
        while(p2 < a2.length){
            sorted[p3] = a2[p2];
            p3++;
            p2++;
        }
        while(p1 <a1.length){
            sorted[p3] = a1[p1];
            p3++;
            p1++;
        }
        
    return sorted;
    }
} 
