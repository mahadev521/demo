public class Permutation {
    //TC O(n!)
    public static void Perm(String str, String Perm) {
        if(str.length()==0){
            System.out.println(Perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            String newString = str.substring(0,i)+str.substring(i+1);
            Perm(newString,Perm+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "mahadev";
        Perm(str,"");
    }   
}
