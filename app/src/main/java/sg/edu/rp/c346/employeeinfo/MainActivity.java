package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<EmployeeList> alEmployee;
    CutomeAdapter caEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.LvEmployee);

        alEmployee = new ArrayList<>();
        EmployeeList item1 = new EmployeeList("John", "Software Technical Leader", "3400.0");
        EmployeeList item2 = new EmployeeList("May", "Programmer", "2200.0");

        alEmployee.add(item1);
        alEmployee.add(item2);

        caEmployee = new CutomeAdapter(this, R.layout.employee, alEmployee);

        lvEmployee.setAdapter(caEmployee);
    }
}
