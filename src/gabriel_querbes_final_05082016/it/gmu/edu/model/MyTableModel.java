package gabriel_querbes_final_05082016.it.gmu.edu.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import gabriel_querbes_final_05082016.Bookstore;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;

import gabriel_querbes_final_05082016.it.gmu.edu.model.Customer;


public class MyTableModel extends AbstractTableModel
        implements TableModelListener {
private Object[] names = {"First Name", "Last Name", "Billing Address","Item", "Quantity"};


//customer list
LinkedList<Customer> myCustomersList = new LinkedList<>();

//2 dimensional array for table
String[][] allData = new String[10][5];

//counter
int i = 0;




public MyTableModel() {
    

}

public Customer getValueAtRow(int r) {
    if (r <= myCustomersList.size()) {
        return (Customer) myCustomersList.get(r);
    }
    return null;
}

@Override
public String getColumnName(int i) {
    return (String) names[i];
}

public Object getValueAt(int r, int c) {
        
        return allData[r][c];
}

@Override
public Class getColumnClass(int c) {
        if (c == 4) return Integer.class;
        return String.class;
}



public int getColumnCount() { return names.length;}

public int getRowCount() {return myCustomersList.size();}

@Override
public boolean isCellEditable(int r, int c) {

    return false;
}


@Override
public void tableChanged(TableModelEvent tme) {
        int row = tme.getFirstRow();
        int col = tme.getColumn();
        int type = tme.getType();
        System.out.println(" Row Changed = " + row);
        System.out.println(" Col Changed = " + col);
        System.out.println(" Operation = " + type);

    }



public void editData(Customer current,int currentRow) {
    int x = currentRow;
    allData[x][0] = current.getFirstName();
    allData[x][1] = current.getLastName();
    allData[x][2] = current.getBillingAddresss().getStreetAddress();
    allData[x][3] = current.getOrders().getProduct();
    allData[x][4] = Integer.toString(current.getOrders().getQuantity());
    System.out.print("Current row: "+currentRow);
    super.fireTableRowsUpdated(x, x);
    
                  
        
  }

public void addData(Customer current) {
        
        
    myCustomersList.add(current);
                allData[i][0] = current.getFirstName();
                allData[i][1] = current.getLastName();
                allData[i][2] = current.getBillingAddresss().getStreetAddress();
                allData[i][3] = current.getOrders().getProduct();
                allData[i][4] = Integer.toString(current.getOrders().getQuantity());
        
        i++;

    super.fireTableRowsInserted(myCustomersList.size()-1, myCustomersList.size()-1);
        
  }


}
