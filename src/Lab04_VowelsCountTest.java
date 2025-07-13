public class Lab04_VowelsCountTest {
    public static void main (String[] args){
        String str1="i love india";
    int vowelcount= CountVowels(str1);
    System.out.println("Number of vowels in \"" + str1 + "\":" +vowelcount);
}

    private static int CountVowels(String str) {
    int count=0;
    String Vowels= "aeiouAEIOU";
    for (int i=0;i<str.length();i++){
        if (Vowels.indexOf(str.charAt(i)) != -1) {
            count++;
        }
        }
    return count;
    }
    }