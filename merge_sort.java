import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args){
        int[] arr1 = new int[]{5, 4, 3, 2, 1, 12042, 1241};
        int[] arr2 = new int[]{1, 4, 6, 1, 3}; 
        // Requirement: The two lists to be merged must be sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] sorted = merge(arr1, arr2);
        //Print the sorted list
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
            /* 
                while neither of the lists are empty, keep on "removing" elements from the front
                by incrementing the pointers
            */
            if(a1[p1] < a2[p2]){ //add the smallest element to the front of the merged list; you can flip the sign to make it a decreasing list
                sorted[p3] = a1[p1]; 
                /* 
                Technically, you don't need a third pointer; you could just use p1 + p2. 
                I just decided to use a third pointer for simplicity.
                */ 
                p1++; // move ahead the pointer for the respective list that we added from
            }
            else{
                sorted[p3] = a2[p2];
                p2++;
            }
            p3++; // move ahead the pointer for the sorted list(once per every number added)
        }
        /* 
            After the above process, there is still the possibility of one of the lists having elements.
            To remove this, we just comb through the rest of the lists. 
        */
        while(p2 < a2.length){ //This won't run if we already went through the entire list, same with the second while loop
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
