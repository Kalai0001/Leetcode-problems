import java.util.Scanner;

public class medianofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int z=n1+n2;
        int resarr[]=new int[z];
        for(int i=0;i<n1;i++){
            resarr[i]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            resarr[n1+i]=arr2[i];
        }
        // for(int i=0;i<z;i++){
        //     System.out.print(resarr[i]+" ");
        // }
        if(z%2==1){
            System.out.println(resarr[z/2]);
        }
        else{
            int mid1=z/2;
            int mid2=mid1-1;
            System.out.println((resarr[mid1]+resarr[mid2])/2);
        }
        sc.close();
    }
}
