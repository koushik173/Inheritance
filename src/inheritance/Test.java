
package inheritance;

public class Test {
    public static void main(String[] args){
        Teacher ob1 = new Teacher();
        
        ob1.name = "Koushik";
        ob1.age = 21;
        ob1.qualificatioin = "Msc in CSE";
        
        ob1.displayInfo2(); 
        
        Teacher ob2 = new Teacher();
        
        ob2.name = "Santa";
        ob2.age = 21;
        ob2.qualificatioin = "BSc in CSE";
        
        ob2.displayInfo2();
    }
}
