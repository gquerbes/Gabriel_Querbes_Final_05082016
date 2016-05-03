/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabriel_querbes_final_05082016.it.gmu.edu.model;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author vslabsal
 */
public class MyComboBoxModel extends DefaultComboBoxModel {
    private String[] states = {"", "AK", "AL", "AR", "AZ", "CA", "CO", "CT", 
        "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", 
        "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", 
        "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", 
        "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
    
    public MyComboBoxModel() {
        super();
        for (int i = 0; i < states.length; i++ ) {
            super.addElement(states[i]);
        }
    }
    
}
