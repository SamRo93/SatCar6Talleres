package Controller;

import ordenestrabajo.Login;
import persistencia.hibernate.HibernateUtil;
        
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
        
        HibernateUtil.buildSessionFactory();
        
        try{
            HibernateUtil.openSessionAndBindToThread();
            Login login = new Login();
            login.setVisible(true);   
        }catch (Exception e){
            System.err.println(""+e);
        }finally{
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        HibernateUtil.closeSessionFactory();        
    }    
}
