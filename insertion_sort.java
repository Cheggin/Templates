public class insertion_sort {
    public static void main(String[] Args){
        int[] arr = new int[]{1,24, 5,1, 2,1, 4};
        int[] sorted = sort(arr);
        for(int i: sorted){
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr){
        for(int i = 1; i< arr.length; i++){ // O(n)
            for(int j = i; j >= 1; j--){ // O(logn)
                if(arr[j] < arr[j-1]){ //push jth element to the right place in the leftmost list of j elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        return arr;
    }
}
