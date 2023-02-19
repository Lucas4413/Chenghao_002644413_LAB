package Role;

import javax.swing.JFrame;

import Business.Business;
import Business.Account;

public abstract class Role {
	static String[] roles = {"manager", "customer", "agent" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(Business business, Account useraccount);
}
