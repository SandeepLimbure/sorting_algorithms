import java.util.Arrays;

public class BubbleSort {
    public void Sort(int []array){
        for(var i = 0;i<array.length-1;i++){
            for(var j = 0;j<array.length-i-1;j++)
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
        }
    }

    public static void main(String[] args) {
        int []numbers = {7,3,1,4,6,2,3};
        var sorter = new BubbleSort();
        sorter.Sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

