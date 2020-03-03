public class SelectionSort {
    static double[] list = {1,9,5,4.5,6.6,5.7,-4.5};

    public static void SelectionSort (double[] list){
        for (int i = 0;i<list.length-1;i++){
            double currentMin = list[i];
            int currentMinIndex =i;
            for (int j =i+1;j<list.length;j++){
                if (currentMin>list[i]){
                    currentMin = list[j];
                    currentMinIndex =j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort(list);
        for (int i =0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }
}
