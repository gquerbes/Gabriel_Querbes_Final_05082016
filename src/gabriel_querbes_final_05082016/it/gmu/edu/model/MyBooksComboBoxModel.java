/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabriel_querbes_final_05082016.it.gmu.edu.model;

import javax.swing.DefaultComboBoxModel;


public class MyBooksComboBoxModel extends DefaultComboBoxModel {
    private String[] books = Order.BOOKS_ARRAY;
    
    
    public MyBooksComboBoxModel() {
        super();
        for (int i = 0; i < books.length; i++ ) {
            super.addElement(books[i]);
        }
    }
    
}
