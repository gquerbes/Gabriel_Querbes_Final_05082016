package gabriel_querbes_final_05082016.it.gmu.edu.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import java.util.Vector;


public class MyTableModel extends AbstractTableModel
        implements TableModelListener {
private Object[] names = {"First Name", "Last Name", "Product", "Quantity", "Street Address"};
private static Vector data = new Vector(10);

private static Object[][] data11 = {
        {"John", "Doe", "1234 ABC Street", "VA", "22111", true},
        {"Joe", "Doe", "6789 XYZ Street", "VA", "23111", true},
        {"Joe", "Doe", "2345 XYZ Street", "VA", "24111", false},
        {"Joe", "Doe", "5678 XYZ Street", "VA", "25111", false},
        {"Joe", "Doe", "4565 XYZ Street", "VA", "26111", true}
    };



public MyTableModel() {
        for (int i = 0; i<5; i++) {
//            Address add = new Address();
//            add.fname = (String) data11[i][0];
//            add.lname = (String) data11[i][1];
//            add.address = (String) data11[i][2];
//            add.state = (String) data11[i][3];
//            add.zip  = (String) data11[i][4];
//            add.apt = ((Boolean)data11[i][5]).booleanValue();
//            data.add(add);
        }
}

public Address getValueAtRow(int r) {
    if (r <= data.size()) {
        return (Address) data.get(r);
    }
    return null;
}

@Override
public String getColumnName(int i) {
    return (String) names[i];
}

public Object getValueAt(int r, int c) {
        Address add = (Address) data.get(r);
        return add;
}

@Override
public Class getColumnClass(int c) {
        if (c == 4) return Integer.class;
        if (c == 5) return Boolean.class;
        return String.class;
}

@Override
public void setValueAt(Object value, int r, int c) {
        System.out.println(" Value Changed for Row = " + r + " Col = " + c + " :: " + (String) value);
        Address add = (Address) data.get(r);
//        add.setValue(c, value);
}

public int getColumnCount() { return names.length;}

public int getRowCount() {return data.size();}

@Override
public boolean isCellEditable(int r, int c) {

    return false;
}
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

public void editData(ActionEvent ae) {
        long number = Math.round(Math.random()*10);
        
        if (number >= data.size()) {number = data.size() - 1;}
        System.out.println("Row = " + number);
        
        Address add = (Address) data.get((int)number);
//        add.setValue(0, "John");
//        add.setValue(1, "Smith");
//        add.setValue(2, "1223 Oak Street");
//        add.setValue(3, "VA");
//        add.setValue(4, "90876");
//        add.setValue(5, true);

        super.fireTableRowsUpdated((int)number, (int)number);
        
  }

public void addData(ActionEvent ae) {
        
//        Address add1 = new Address();
//        add1.setValue(0, "Walter");
//        add1.setValue(1, "Smith");
//        add1.setValue(2, "122 Elm Street");
//        add1.setValue(3, "VA");
//        add1.setValue(4, "90876");
//        add1.setValue(5, true);
//        data.add(add1);

        super.fireTableRowsInserted(data.size()-1, data.size()-1);
  }

}
