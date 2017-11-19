package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ragha
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Raghavi");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("Raghavi", "raghavi", employee1, new SystemAdminRole());
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Menita");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("Menita", "menita", employee2, new SystemAdminRole());
        
        Employee employee3 = system.getEmployeeDirectory().createEmployee("Divya");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("Divya", "divya", employee3, new SystemAdminRole());
        
        return system;
    }
    
}
