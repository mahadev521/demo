public class Keymap {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int indx, String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(indx);
        String mapping = keypad[curChar - '0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str,indx+1,newString+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str="2234";
        printComb(str,0,"");   
    }
}
