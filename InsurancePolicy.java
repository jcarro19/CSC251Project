

public class InsurancePolicy {
    //data(fields)
    private int policyNo, providerAge;
    private String policyName, firstName, lastName;
    private double height, weight;
    private char smokingStatus;
 


    //setters
    public void setPolicyNo(int pNo){
        policyNo = pNo;
    }

    public void setPolicyName(String pName){
        policyName = pName; 
    }
    public void setAge(int age){
        providerAge = age;
    }

    public void setFirstName(String fName){
        firstName = fName;
    }
    
    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setHeight(double h){
        height = h;
    }

    public void setWeight(double w){
        weight = w;
    }

    public void setSmokingStatus(char smoker){
        smokingStatus = smoker;
    }



    


    //getters methods

    public double getBMI(){
        double BMI = (weight * 703)/(height*height);
        return BMI;  
    }

    public double getPrice(){
        double price = 600.00;
        if(providerAge>50){
            price = (price+75.00);
        }

        if(smokingStatus=='y'){
            price = (price+50.00);
        }
        
        double BMI = getBMI();
        if(BMI>35){
            price = price+((BMI-35.00)*20.00);
        }
        return price;
    }

    public int getPolicyNumber(){
        return policyNo;
    }

    public String getPolicyName(){
        return policyName;
    }

    public int getAge(){
        return providerAge;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public String getSmokingStatus(){
        if(smokingStatus == 'y') {
            return "Smoker";
        }
        return "non-Smoker";
    }


}
