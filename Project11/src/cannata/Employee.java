package cannata;

/**
 * Created by xiaolinlu on 2/13/16.
 */
public class Employee extends Person {

    private String social;

    public Employee(){
        this.social = "";
    }

    public void setSocial (String social){
        this.social = social;
    }

    public String getSocial (){
        return social;
    }

    public String getDisplayText(){
        return super.toString() + "\n" + "Social security number: " + social;
    }

}
