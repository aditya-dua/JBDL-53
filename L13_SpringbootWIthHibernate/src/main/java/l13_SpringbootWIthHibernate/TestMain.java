package l13_SpringbootWIthHibernate;

import l13_SpringbootWIthHibernate.model.CreateEmployeeRequestModel;
import l13_SpringbootWIthHibernate.service.EmployeeService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService emp = new EmployeeService();
		
		CreateEmployeeRequestModel model = new CreateEmployeeRequestModel("ADITYA", "DUA", "DELHI");
		
		System.out.println(emp.createEmployee(model));
	}

}
