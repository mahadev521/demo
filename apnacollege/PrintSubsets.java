public class PrintSubsets {
    public static void allSubsets(String str, String subset){
        if(str.length()==0){
            System.out.println(subset);
            return;
        }
        allSubsets(str.substring(1),subset+str.charAt(0));
        allSubsets(str.substring(1),subset);
    }
    public static void main(String[] args) {
        String str="abc";
        allSubsets(str,"");
    }
}
