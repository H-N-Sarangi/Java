// import java.util.Scanner;

public class Encrypt {
    // private static Scanner sc = new Scanner(System.in);
    private static String Str;
    public static void main(String[] args) {
/*         System.out.print("Enter your message : ");
        Str = sc.nextLine(); */
        Str = "LETS GO TO THE SANDWICH SHOP TODAY";
        encrytMsg(Str);
    }
    public static void encrytMsg(String Str){
        char [][] Arr = new char[6][(Str.length()/6)+1];
        printMsg(Arr);
        char[] message = Str.toCharArray();

        int k = message.length;
        while(k%6!=0){
            k++;
            
        }
        char [] newArray = new char[k];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = '.';
        }
        for (int i = 0; i < message.length; i++) {
            if(message[i]==' ')
                message[i] = '*';
            newArray[i] = message[i];
        }
        
        for(int i = (Str.length()/6); i >= 0; i--){
            for (int j = 5; j >=0; j--) {
                Arr[i][j] = newArray[--k];
            } 
        }
        printMsg(Arr);    
    }


    private static void printMsg(char[][] Arr) {
        for (int i = 0; i <(Str.length()/6)+1; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Arr[j][i]);
            }
        }
    }

}