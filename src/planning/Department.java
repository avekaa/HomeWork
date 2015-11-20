package planning;

import java.util.ArrayList;
import java.util.List;

import planning.DepartmentType;
import planning.Position;

public class Department {

	private DepartmentType departmentType;
	private Position position;

	public Department(DepartmentType departmentType, Position position) {
		// TODO Auto-generated constructor stub
		super();
		this.position = position;
		this.departmentType = departmentType;

	}

	public DepartmentType getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(DepartmentType departmentType) {
		this.departmentType = departmentType;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}