import java.util.Scanner;
public class FlyCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bulut Fly");
        System.out.print("How many KM will you go:");
        int km=input.nextInt();
        System.out.println("press 1 for round-trip flight");
        System.out.println("press 2 for one-way flight");
        int flight=input.nextInt();

        switch (flight){
            case 1:
                Scanner inp=new Scanner(System.in);
                System.out.println("press 1 for business flight");
                System.out.println("press 2 for normal flight");
                int business=inp.nextInt();
                if (business==1){
                    System.out.print("how old are you:");
                    int age=inp.nextInt();
                    if(age>0 && age<12){
                        double price=0.20*km*0.5;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);
                    } else if (age>=12 && age<=24) {
                        double price=0.20*km*0.9;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);

                    } else if (age>=65) {
                        double price=0.20*km*0.7;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);

                    } else if (age<=0) {
                        System.out.println("is not correct");

                    }else {
                        double price=0.20*km;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);
                    }
                }else if(business==2){
                    System.out.print("how old are you:");
                    int age=inp.nextInt();
                    if(age>0 && age<12){
                        double price=0.10*km*0.5;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);
                    } else if (age>=12 && age<=24) {
                        double price=0.10*km*0.9;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);

                    } else if (age>=65) {
                        double price=0.10*km*0.7;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);

                    } else if (age<=0) {
                        System.out.println("is not correct");

                    }else {
                        double price=0.10*km;
                        double roundTrip=price*0.80*2;
                        System.out.println("your price amount is "+roundTrip);
                    }
                }else {
                    System.out.println("is not correct");
                }
                break;

            case 2:
                Scanner inp2=new Scanner(System.in);
                System.out.println("press 1 for business flight");
                System.out.println("press 2 for normal flight");
                int business2=inp2.nextInt();
                if (business2==1){
                    System.out.print("how old are you:");
                    int age=inp2.nextInt();
                    if(age>0 && age<12){
                        double price=0.20*km*0.5;
                        System.out.println("your price amount is "+price);
                    } else if (age>=12 && age<=24) {
                        double price=0.20*km*0.9;
                        System.out.println("your price amount is "+price);

                    } else if (age>=65) {
                        double price=0.20*km*0.7;
                        System.out.println("your price amount is "+price);

                    } else if (age<=0) {
                        System.out.println("is not correct");

                    }else {
                        double price=0.20*km;
                        System.out.println("your price amount is "+price);
                    }
                }else if(business2==2){
                    System.out.print("how old are you:");
                    int age=inp2.nextInt();
                    if(age>0 && age<12){
                        double price=0.10*km*0.5;
                        System.out.println("your price amount is "+price);
                    } else if (age>=12 && age<=24) {
                        double price=0.10*km*0.9;
                        System.out.println("your price amount is "+price);

                    } else if (age>=65) {
                        double price=0.10*km*0.7;
                        System.out.println("your price amount is "+price);

                    } else if (age<=0) {
                        System.out.println("is not correct");

                    }else {
                        double price=0.15*km;
                        System.out.println("your price amount is "+price);
                    }
                }else {
                    System.out.println("is not correct");
                }
                break;
            default:
                System.out.println("is not correct");

        }
    }
}
