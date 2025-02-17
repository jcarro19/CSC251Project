import java.util.Scanner;

public class Project_Jarrett_Carroll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InsurancePolicy p = new InsurancePolicy();

        //variables
        int pNo, age;
        String fName, lName, pName;
        char smoker;
        double w, h;
        


        //Policy Number, Policy Name, Age; 
        System.out.println("Enter Policy Number");
        pNo = scanner.nextInt();
        p.setPolicyNo(pNo);
        scanner.nextLine(); //clearing scanner buffer
       
        System.out.println("Enter Policy Name");
        pName = scanner.nextLine();
        p.setPolicyName(pName);


        //First Name, Last name, Age
        System.out.println("Enter First Name");
        fName = scanner.nextLine();
        p.setFirstName(fName);

        System.out.println("Enter Last Name");
        lName = scanner.nextLine();
        p.setLastName(lName);

        System.out.println("Enter Age");
        age = scanner.nextInt();
        p.setAge(age);
        scanner.nextLine(); //clearing scanner buffer

        //smoking status, height, weight.
        System.out.println("Enter Smoking Status (y/n)");
        smoker = scanner.next().charAt(0);
        p.setSmokingStatus(smoker);

        System.out.println("Enter Height:");
        h = scanner.nextDouble();
        p.setHeight(h);

        System.out.println("Enter Weight:");
        w = scanner.nextDouble();
        p.setWeight(w);

        printReciept(p);

    }//methods
    public static void printReciept(InsurancePolicy p){
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Your Policy Number: " + p.getPolicyNumber());
        System.out.println("Your Policy Name: " + p.getPolicyName());
        System.out.println("Your Full Name: " + p.getFirstName() + " " + p.getLastName());
        System.out.println("Your Age: " + p.getAge());
        System.out.println("Smoking Status: " + p.getSmokingStatus());
        System.out.println("Your BMI: " + p.getBMI());
        System.out.println("----------------------------------------");
        System.out.println("Your Total Price: $" + p.getPrice() );
    }
}