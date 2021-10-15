
package privateInheri;

public class Teacher extends Person {
    private String prfession;

    public String getPrfession() {
        return prfession;
    }

    public void setPrfession(String prfession) {
        this.prfession = prfession;
    }
    
    void display(){
        
        System.out.println("Name: "+getName());       
        System.out.println("Age: "+getAge());
        System.out.println("Prfession: "+getPrfession());

    }
    
    
}
