package oop_concepts;

public class LocalClassExample {
    static String regularExpression ="[^0-9]";

    public static void validatePhoneNumer(String phoneNumber1,String phoneNumber2 ){
        final int numberLength=10;

        class PhoneNumber{
             String formattedPhoneNumber =null;

            public PhoneNumber(String phoneNumber) {
                String currentPhoneNumber = phoneNumber.replaceAll(regularExpression,"");
                if(currentPhoneNumber.length()==numberLength) formattedPhoneNumber=currentPhoneNumber;
                else
                    formattedPhoneNumber=null;
            }

            public String getNumber(){
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        if (myNumber1.getNumber()==null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is "+myNumber1.getNumber());
        if (myNumber2.getNumber()==null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is "+myNumber2.getNumber());
    }

    public static void main(String[] args) {
        validatePhoneNumer("123-456-7890","256-7890");
    }


}
