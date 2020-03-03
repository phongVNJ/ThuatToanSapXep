import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class bubblesort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubblesort(int[]list){
        boolean needNextPass = true;
        for (int k =1;k<list.length&&needNextPass;k++){
            needNextPass =false;
            for (int i =1;i<list.length-k;i++){
                if (list[i]>list[i+1]){
                    int tmp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=tmp;
                    needNextPass =true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = new int[0];
        bubblesort(list);
        for (int i =0;i<list.length;i++)
            System.out.println(list[i]+" ");
    }
       
}
