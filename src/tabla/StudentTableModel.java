package tabla;

import javax.swing.table.AbstractTableModel;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class StudentTableModel extends AbstractTableModel {


    private List<Student> students;

    public StudentTableModel(List<Student> students){
        super();
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return StudentTableColumns.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Student student = students.get(rowIndex);
        switch (StudentTableColumns.values()[columnIndex]){
            case Name:
                return student.getName();
            case Surname:
                return student.getSurname();
            case Nif:
                return student.getNif();
            case Age:
                return student.getAge();
            default:
                throw new RuntimeException("No existe la columna "+columnIndex);
        }
    }

    private enum StudentTableColumns {
        Nif("NIF"),
        Name("Nombre"),
        Surname("Apellidos"),
        Age("Edad");
        private final String header;

        StudentTableColumns(String header){
            this.header = header;
        }

    }
}
