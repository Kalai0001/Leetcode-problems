import java.util.Scanner;
public class minvalue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int num1[]=new int[n1];
        int num2[]=new int[n2];
        for(int i=0;i<n1;i++){
            num1[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++){
            num2[j]=sc.nextInt();
        }
        int k1=0,k2=0;
        while(k1<n1 && k2<n2){
            if(num1[k1]==num2[k2]){
                System.out.println(num1[k1]);
                k1++;
                k2++;
            }
            else if(num1[k1]<num2[k2]){
                k1++;
            }
            else{
                k2++;
            }
        }
        sc.close();  
    }
}