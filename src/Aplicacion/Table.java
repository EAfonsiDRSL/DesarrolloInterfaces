package Aplicacion;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractTableModel {

    private ArrayList<User> users;



    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columns.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = users.get(rowIndex);
        switch (columns.values()[columnIndex]){
            case ID:
                return user.getId();
            case NAME:
                return user.getName();
            case SURNAME:
                return user.getSurname();
            case DNI:
                return user.getDNI();
            case EMAIL:
                return user.getEmail();
            default:
                throw new RuntimeException("No se ha podido encontrar la columna "+columnIndex);
        }
    }
    private enum columns {

        ID ("ID"),
        NAME ("Nombre"),
        SURNAME ("Apellidos"),
        DNI ("DNI"),
        EMAIL ("E-mail"),
        PASSWORD ("Contraseña");

        private final String header;
        columns(String header){
            this.header = header;
        }
    }
    public Table(ArrayList<User> users) {
        super();
        this.users = users;
    }

}
