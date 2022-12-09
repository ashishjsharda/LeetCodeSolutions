public class TwoStringsAreEqual {
    public static void main(String[] args) {
        String word1[]= {"ab", "c"};
        String word2[]= {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String i:word1){
            sb.append(i);
        }
        for(String i:word2){
            sb2.append(i);
        }
        return sb.toString().equals(sb2.toString());
    }
}
