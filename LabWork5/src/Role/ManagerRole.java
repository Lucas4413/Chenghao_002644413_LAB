package Role;


import Business.Business;
import Business.Account;
import UI.managerWorkArea.ManagerFrame;

import javax.swing.JFrame;
import Business.Business;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class ManagerRole extends Role {

    public ManagerRole() {
    }

    
    @Override
    public JFrame getWorkArea(Business business, Account useraccount) {
        return new ManagerFrame(business, useraccount);
    }
    
}
