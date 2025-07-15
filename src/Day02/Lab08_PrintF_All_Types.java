package Day02;

public class Lab08_PrintF_All_Types {
    public static void main(String[] args) {
        // Integer
        int a=99;
        System.out.printf("1. I have got:%d, in the final exam",a);

        //Floating value (this will print max 6 decimal places i.e. 6 digits after . dot
        //%n will be print the statement new line
         float b = 3.143f;
        System.out.printf("%n2. This will print value of Pi:%f",b);

        //Floating point with 2 decimal points i.e. only two digits after dot

        System.out.printf("%n3. This will print only 2 digits after dot:%.2f",b);

        //Print Single char
        // in single quotes means only one character
        char c='A';
        System.out.printf("%n4. This will print a single char:%c",c);

        //Print string
        // Value in double quotes means string.
        String s="My name is Arvind";
        System.out.printf("%n5. I want to print: %s",s);

        //Print Percentage symbol, just need to %% two times
        System.out.printf("%n6. i got:%d%%, but i wanted to score 100%%.",a);

        //Number with zero added in-front
        // example: if user enter login Id 456 but it should print 00456 it will give 5-digit number.
        System.out.printf("%n7. Login ID:%05d, %05d.",a,456);







    }

}
