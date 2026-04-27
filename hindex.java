import java.util.*;

public class hindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int citations[]=new int[n];
        for(int i=0;i<n;i++){
            citations[i]=sc.nextInt();
        }
        Arrays.sort(citations);
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=citations[n-i-1];
        }
        for(int i=0;i<n;i++){
            citations[i]=res[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(citations[i]>=i+1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
