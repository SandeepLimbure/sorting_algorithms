import java.util.Arrays;

public class InsertionSort {
    public void sort(int []array){
        for( int i = 1;i<array.length;i++){
            var current = array[i];
            int j = i-1;
            while(j >=0 && array[j]>current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1]=current;
        }
    }

    public static void main(String[] args) {
        int [] numbers = {7,8,4,2,1,9};
        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
