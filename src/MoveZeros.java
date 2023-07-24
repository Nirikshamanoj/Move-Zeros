import java.util.Arrays;
import java.util.Scanner;
public class MoveZeros {
    static void moveZeros(int[] A,int n)
    {
        int index=0;
        for(int i=0;i<n;i++){
            if(A[i]!=0)
            {
                A[index]=A[i];
                index++;
            }
        }
        for (int i=index;i<n;i++)
        {
            A[i]=0;
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        moveZeros(A,n);
    }
}
