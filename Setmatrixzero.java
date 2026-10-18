import java.util.*;

public class Setmatrixzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>(); 

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }  
        
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(row.contains(i) || col.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }       

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
