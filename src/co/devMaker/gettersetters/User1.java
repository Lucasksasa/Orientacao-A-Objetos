package co.devMaker.gettersetters;

public class User1 {

    private String firstName;
    private String lastName;

    //getter
    public String getFirstName(){
       return firstName = firstName;
    }

    //setter
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }



}
