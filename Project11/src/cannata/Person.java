package cannata;

/**
 * Created by xiaolinlu on 2/13/16.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.email = "";
    };

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getFirstName (){
        return firstName;
    }

    public void setlastName (String firstName){
        this.lastName = lastName;
    }
    public String getlastName (){
        return lastName;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail (){
        return email;
    }


    public String toString(){
        return "Name: " + this.firstName + this.lastName + "\n" + "Email: " + this.email;
    }

    public abstract String getDisplayText();

}
