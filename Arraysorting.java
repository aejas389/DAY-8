import java.util.*;
public class Arraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;i<c;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
    
}
