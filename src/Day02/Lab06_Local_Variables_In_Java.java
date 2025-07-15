package Day02;

public class Lab06_Local_Variables_In_Java {
    public static void main (String[] args){
        // lcoal vairable works within this bracket only.
        int a=2;
        System.out.println(a);
    }
    // if you try to use here 'a' it will give error
    public static void b (String str){
        //System.out.println(a);
    }
}
