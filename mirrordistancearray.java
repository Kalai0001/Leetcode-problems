import java.util.Scanner;

class mirrordistancearray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=Integer.MAX_VALUE;
        int flag=0;
        for(int i=0;i<size;i++){
            int original=arr[i];
            int num=0;
            int rev=0;
            while(original>0){
                num=original%10;
                rev=rev*10+num;
                original=original/10;
            }
            
            for(int j=i+1;j<size;j++){
                if(rev==arr[j]){
                    res=Math.min(res,Math.abs(i-j));
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.printf("%d\n",res);
        }
        else{
            System.out.printf("%d",-1);
        }

        sc.close();
    }
}
