package Controller;

import ordenestrabajo.Login;
import satcar6.util.HibernateUtil;
        
/**
 *
 * @author Samuel
 */
public class Main {
    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        
        try{
            Login login = new Login();
            login.setVisible(true);   
        }catch (Exception e){
            System.err.println(""+e);
        }    
    }
}