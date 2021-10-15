
package inheritance;


public class Teacher extends Student{
    String qualificatioin;
    
    void displayInfo2(){
        displayInfo1();
   
        System.out.println("Profession: "+qualificatioin);
    }
    
}
