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
import java.util.Vector;
import gabriel_querbes_final_05082016.it.gmu.edu.model.Customer;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MyTableModel extends AbstractTableModel
        implements TableModelListener {
private Object[] names = {"First Name", "Last Name", "Billing Address","Item", "Quantity"};
//private static Vector data = new Vector(10);

//customer list
LinkedList<Customer> myCustomersList = new LinkedList<>();

//2 dimensional array for table
String[][] allData = new String[10][5];

//counter
int i = 0;


//private static Object[][] data11 = {
//
//        
//       {"John", "Doe", "1234 ABC Street", "VA", "22111", true},
//        {"Joe", "Doe", "6789 XYZ Street", "VA", "23111", true},
//        {"Joe", "Doe", "2345 XYZ Street", "VA", "24111", false},
//        {"Joe", "Doe", "5678 XYZ Street", "VA", "25111", false},
//        {"Joe", "Doe", "4565 XYZ Street", "VA", "26111", true}
//    };


public MyTableModel() {
        
        
//        //making fake customer 
//        Customer aCustomer = new Customer();
//        Address aAddresss = new Address();
//        Order aOrder = new Order();
//        aCustomer.setBillingAddresss(aAddresss);
//        aCustomer.setOrders(aOrder);
//        
//        
//        aCustomer.getBillingAddresss().setStreetAddress("someshie");
//        aCustomer.getOrders().setProduct("shit");
//        aCustomer.getOrders().setQuantity(2);
//        aCustomer.setFirstName("Gabriel");
//        aCustomer.setLastName("lastname");
//        
//        myCustomersList.add(aCustomer);
//        //END OF FAKE CUSTOmer
//        
//        
//        Iterator<Customer> it = myCustomersList.iterator();
//        int i = 0;
//        
//        while(it.hasNext()){
//            do{
//                Customer current = it.next();
//                allData[i][0] = current.getFirstName();
//                allData[i][1] = current.getLastName();
//                allData[i][2] = current.getBillingAddresss().getStreetAddress();
//                allData[i][3] = current.getOrders().getProduct();
//                allData[i][4] = Integer.toString(current.getOrders().getQuantity());
//                i++;
//            }while(it.hasNext());
//            
//        }
        

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
        if (c == 5) return Boolean.class;
        return String.class;
}

@Override
//public void setValueAt(Object value, int r, int c) {
//        System.out.println(" Value Changed for Row = " + r + " Col = " + c + " :: " + (String) value);
//        Customer add = (Customer) data.get(r);
////        add.setValue(c, value);
//}

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

/**
public void actionPerformed(ActionEvent ae) {
    Address add = (Address) data.get(4);
    add.setValue(0, "John");
    add.setValue(1, "Smith");
    add.setValue(2, "1223 Oak Street");
    add.setValue(3, "VA");
    add.setValue(4, "90876");
    add.setValue(5, true);

    Address add1 = new Address();
    add1.setValue(0, "Roger");
    add1.setValue(1, "Waters");
    add1.setValue(2, "122 Oak Street");
    add1.setValue(3, "VA");
    add1.setValue(4, "90876");
    add1.setValue(5, true);
    data.add(add1);

    super.fireTableDataChanged();
}
**/

public void editData(Customer current,int currentRow) {
    int x = currentRow;
    allData[x][0] = current.getFirstName();
    allData[x][1] = current.getLastName();
    allData[x][2] = current.getBillingAddresss().getStreetAddress();
    allData[x][3] = current.getOrders().getProduct();
    allData[x][4] = Integer.toString(current.getOrders().getQuantity());
    
    super.fireTableRowsUpdated(x-1, x-1);
    
                  
//        long number = Math.round(Math.random()*10);
//        
//        if (number >= myCustomersList.size()) {number = myCustomersList.size() - 1;}
//        System.out.println("Row = " + number);
//        
//        Customer add = (Address) data.get((int)number);
////        add.setValue(0, "John");
////        add.setValue(1, "Smith");
////        add.setValue(2, "1223 Oak Street");
////        add.setValue(3, "VA");
////        add.setValue(4, "90876");
////        add.setValue(5, true);
//
//        super.fireTableRowsUpdated((int)number, (int)number);
        
  }

public void addData(Customer current) {
        
        
    myCustomersList.add(current);
                allData[i][0] = current.getFirstName();
                allData[i][1] = current.getLastName();
                allData[i][2] = current.getBillingAddresss().getStreetAddress();
                allData[i][3] = current.getOrders().getProduct();
                allData[i][4] = Integer.toString(current.getOrders().getQuantity());
        //data.add(current);
        i++;

    super.fireTableRowsInserted(myCustomersList.size()-1, myCustomersList.size()-1);
        
  }


}
