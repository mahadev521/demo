public class RemoveDup {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str2.contains(str.substring(i, i + 1))) {
                str2 += str.substring(i, i + 1);
            }
        }
        System.err.println(str2);
    }
}
