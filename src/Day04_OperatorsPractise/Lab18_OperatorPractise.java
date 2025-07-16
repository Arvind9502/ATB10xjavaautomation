package Day04_OperatorsPractise;

public class Lab18_OperatorPractise {
    public static void main(String[] args) {
       // Q3. Create a simple interest calculator using the formula: SI = (P * R * T) / 100

        float PrincpleAmount=10000f;
        float RateOfIntrest=8.54f;
        float Tenure=8.1f;
        float Simple_Interest=((PrincpleAmount*RateOfIntrest*Tenure)/100);
        System.out.println("The simple interest for the given data is RS:"+Simple_Interest);
    }
}
