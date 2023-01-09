import java.util.LinkedList;
import java.util.Scanner;
public class quicksort {

    public static void main(String[] args){
        LinkedList<Integer> hi = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< 5; i++){
            hi.add(scan.nextInt());
        }
        System.out.println("Before: " + hi);
        System.out.println("");
        quickSort(hi);
        System.out.println("After: " + hi);
        scan.close();
    }
    static void quickSort(LinkedList<Integer> link){
        qs(link, 0, link.size()-1);
    }

    static void qs(LinkedList<Integer> link, int l, int r ){
        if(l >= r){
            return;
        }
        int p = partition(link, l, r);
        qs(link, 0, p-1);
        qs(link, p+1, r);
    }

    static int partition(LinkedList<Integer> link, int l, int r){
        // main swap
        Integer pivot = link.get(r);
        int i = l-1;
        for(int j =l; j <r; j++){
            if(link.get(j) < pivot){
                i+=1;
                Integer temp = link.get(j);
                link.set(j, link.get(i));
                link.set(i, temp);
            }
        }
        //swap r and middle
        Integer temp = link.get(r);
        link.set(r, link.get(i+1));
        link.set(i+1, temp);
        return i+1;
    }
}
