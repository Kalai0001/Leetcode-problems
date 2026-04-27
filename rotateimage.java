import java.util.Scanner;

public class rotateimage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int res[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[j][r-i-1]=arr[i][j];
            }
        }
        System.out.println("Rotated image of 2d array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
