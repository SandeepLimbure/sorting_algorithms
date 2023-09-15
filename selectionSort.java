import java.util.Arrays;

public class selectionSort {
    public void sort(int []array){
        for(var i = 0;i< array.length;i++){
           var minIndex = i;
           for(var j = i;j< array.length;j++)
               if(array[j]<array[minIndex])
                   minIndex = j;
               swap(array,minIndex,i);
        }
    }
    private void swap(int []array,int index1,int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int []numbers = {7,3,1,5,2,4,6,8};
        var sorter = new selectionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

