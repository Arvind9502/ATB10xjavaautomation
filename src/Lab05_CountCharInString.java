public class Lab05_CountCharInString {
    public static void main(String[] args) {
        String inp= "I am Learning Java Coding";
        int count=0;
        for (int i=0;i<inp.length();i++){
            count++;
        }
        System.out.println("The total Count In the string is: " +count);
    }
}
