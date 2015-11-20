package planning;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import asg.cliche.ShellFactory;
import planning.Department;
import planning.DepartmentType;
import planning.Menu;
import planning.Position;

public class Program {

	public static ArrayList<Department> createDepartmentList() {
	ArrayList<Department> list = new ArrayList<Department>();

	for (DepartmentType departmentType : DepartmentType.values()) {
		for (Position position : Position.values()) {
			list.add(new Department(departmentType, position));
			
		}
	}
	return list;
}

public static void main(String[] args) throws IOException {
	
	System.out.println("1 Start planning");
	System.out.println("2 Working version");
	System.out.println("3 Final version");
	System.out.println("4 Exit");
	System.out.println("5 Save data");

	ShellFactory.createConsoleShell("Please enter your selection from 1 to 5", "", new Menu()).commandLoop(); // and
	// three.

	ShellFactory.createSubshell("", null, null, new Menu()).commandLoop();
	
	ArrayList<Department> list = createDepartmentList();
	for (Department department : list) {
		System.out.println(department.getDepartmentType() + ":" + department.getPosition());
	}
	System.out.println(list);
}
}