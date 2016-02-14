package cannata;

/**
 * Created by xiaolinlu on 2/13/16.
 */
public class Customer extends Person {

    private String number;

    public Customer (){
        this.number = "";
    }

    public void setNumber (String number){
        this.number = number;
    }

    public String getNumber (){
        return number;
    }

    public String getDisplayText (){
        return super.toString() + "\n" + "Customer number: " + number;
    }
}
