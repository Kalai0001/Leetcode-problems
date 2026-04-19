import java.util.Scanner;

public class maximumdistancevaluepair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums1[]=new int[size];
        int nums2[]=new int[size];
        int max=0;
        int flag=0;
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        for(int i=0;i<nums1.length;i++){
            int res=0;
            for(int j=0;j<nums2.length;j++){
                if(i<=j && nums1[i]<=nums2[j]){
                    res=j-i;
                    if(res>max){
                        max=res;
                        flag=1;
                    }
                }
            }
        }
        if(flag==1){
            System.out.printf("%d",max);;
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }
}