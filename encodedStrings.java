import java.util.Scanner;

public class encodedStrings {
    public static void main(String[] arg){
        int tc;
        Scanner scanner=new Scanner(System.in);
        tc=scanner.nextInt();
        while(tc>0){
            int N=scanner.nextInt();
            String encodedString=scanner.next();
            String res=encode(N,encodedString);
            System.out.println(res);
            tc-=1;
        }
    }

    private static String encode(int n, String encodedString) {
        int part=n/4;
        char[] result = new char[n/4];
        int temp = 0, chars =4; 
        String[] equalStr = new String [part];
        for(int i = 0; i < n; i = i+chars) {    
            String divide = encodedString.substring(i, i+chars);  
            equalStr[temp] = divide;  
            temp++;  
        } 
        for(int i = 0; i < equalStr.length; i++) {  
            String bin= equalStr[i];
            int dec=Integer.parseInt(bin,2);
            result[i]=(char)(dec+97);

            }  
         String finalresult=new String(result);


        return finalresult;
    }
}
