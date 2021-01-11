import java.util.Scanner;

public class checfdiv3 {
    public static void main(String[] arg){
        int tc;
        Scanner scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            try {
            int n=scanner.nextInt();
            int K=scanner.nextInt();
            int D=scanner.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                sum+=arr[i];
            }
        
            if((sum/K)<=D)
               System.out.println(sum/K);
            else if((sum/K)>D)
              System.out.println(D);
            else
              System.out.println(0);     
          tc--; 
        }catch(Exception e) {

        }
        
    }
}
}
