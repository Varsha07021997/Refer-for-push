package Varsha;
import java.sql.SQLOutput;
import java.util.*;
public class Sum_2dArray {
    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of rows :");
            int r= sc.nextInt();;
            System.out.println("Enter number of columns:");
            int c= sc.nextInt();
            int arr[][]=new int[r][c];
            for(int i=0;i<r;i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j]=sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("Matrix is :");
            for(int i=0;i<r;i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            int sum1=0,sum2=0;
            for(int i=0;i<r;i++)
            {
                sum1=0;
                for (int j = 0; j < c; j++)
                {
                    sum1 += arr[i][j];
                }
                System.out.println((i + 1) + "st Row wise sum :" + sum1);
            }
            for(int i=0;i<c;i++)
            {
                sum2=0;
                for(int j=0;j<r;j++)
                {
                    sum2+=arr[j][i];
                }
                System.out.println((i+1)+"st Column wise sum :"+sum2);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
