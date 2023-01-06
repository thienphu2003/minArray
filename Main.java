import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số lượng phần tử trong mảng");
        int size = sc.nextInt();
        int[] arr= new int [size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Hãy nhập phần tử thứ "+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int j=0;j< arr.length;j++)
        {
            System.out.println(arr[j]);
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là :" +min);
    }
}
