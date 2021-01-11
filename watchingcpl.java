
import java.util.*;
import java.lang.*;
import java.io.*;

public class watchingcpl {
    public static void main(String[ ] args){
        int tc;
        Scanner scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            int N,K,sum=0;
            N=scanner.nextInt();
            K=scanner.nextInt();
            int H[]=new int[N];
            for(int i=0;i<N;i++){
                H[i]=scanner.nextInt();

            }
            LinkedHashSet<Integer> H1=new LinkedHashSet<Integer>();
            Arrays.sort(H);
            H1.add(H[N-1]);
            sum=H[N-1];
            int res=-1;

            for(int i=N-2;i>=0;i--){
                LinkedHashSet<Integer> H2=new LinkedHashSet<Integer>();
                sum=sum+H[i];
                Iterator iterator=H1.iterator();
                while(iterator.hasNext()){
                    int p=(int)(iterator.next());
                    H2.add(p);
                    H2.add(H[i]);
                    H2.add(p+H[i]);
                    if(((p+H[i])>=K)&&((sum-p-H[i])>=K)){
                        res=N-i;
                        break;
                    }
                    if(((H[i])>=K)&&((sum-H[i])>=K)){
                        res=N-i;
                        break;
                    }
                      
                }

                if(res!=-1)
                  break;
              H1=H2;

            }
             tc--;
               System.out.println(res);
        }
    }
}
