import java.util.Scanner;

public class pointofImpact {
    public static void main(String[] args){
        int tc;
        Scanner  scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            int N,K,x,y;
            N=scanner.nextInt();
            K=scanner.nextInt();
            x=scanner.nextInt();
            y=scanner.nextInt();
            int size=(K%4);
            if(x==y)
               System.out.println(N+" "+N);
            if(x>y) {
                switch(size){
                    case 1:
                    System.out.println(N+" "+(N-x+y));
                    break;
                    case 2:
                    System.out.println((N-x+y)+" "+N);
                    break;
                    case 3:
                    System.out.println(0+" "+(x-y));
                    break;
                    case 0:
                    System.out.println((x-y)+" "+0);
                    break;
                }
            }
            if(x<y){
                switch(size){
                    case 1:
                    System.out.println((x+N-y)+" "+N);
                    break;
                    case 2:
                    System.out.println(N+" "+(x+N-y));
                    break;
                    case 3:
                    System.out.println((y-x)+" "+0);
                    break;
                    case 0:
                    System.out.println(0+" "+(y-x));
                    break;
                }
            }
            tc--;
        }
    }
}
