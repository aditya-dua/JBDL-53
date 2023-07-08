package l13_SpringbootWIthHibernate.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import l13_SpringbootWIthHibernate.entity.Employee;
import l13_SpringbootWIthHibernate.model.CreateEmployeeRequestModel;
import l13_SpringbootWIthHibernate.model.CreateEmployeeResponseModel;
import l13_SpringbootWIthHibernate.model.GetEmployeeResponseModel;

/**
 * Using Interface
 * @author AdityaDua
 *
 */


public class EmployeeService {

	Configuration config;
	SessionFactory sessionFactory;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		config = new Configuration();
		sessionFactory = config.configure("hbm.cfg.xml").buildSessionFactory();
	}
	
	public List<Employee> getAllEmployees(){
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cqEmp = cb.createQuery(Employee.class);
		Root<Employee> rootEntry = cqEmp.from(Employee.class);
		CriteriaQuery<Employee> all = cqEmp.select(rootEntry);
		all.orderBy(cb.asc(rootEntry.get("firstName")));
		
		TypedQuery<Employee> getAllEmployeeQuery = session.createQuery(all);
		
		return getAllEmployeeQuery.getResultList();
		
	}
	
	
	public CreateEmployeeResponseModel createEmployee(CreateEmployeeRequestModel employee) {
		Session session = sessionFactory.openSession();
		CreateEmployeeResponseModel response = null;
		Transaction tx;
		
		if(employee.getFirstName()==null ||employee.getFirstName().equals("null") ) {
			response = new CreateEmployeeResponseModel(0, employee.getFirstName(), employee.getLastName(), employee.getAddress(), 301,"First Name cannot be Null");
			return response;
		}
		
		try {
			tx=session.beginTransaction();
			Employee e = new Employee();
			e.setLastName(employee.getLastName());
			e.setFirstName(employee.getFirstName());
			e.setAddress(employee.getAddress());
			
			session.save(e);
			session.flush();
			tx.commit();
			
			response = new CreateEmployeeResponseModel(e.getId(), e.getFirstName(), e.getLastName(), e.getAddress(), 200, "Employee Created Successfully");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response = new CreateEmployeeResponseModel(0, employee.getFirstName(), employee.getLastName(), employee.getAddress(), 300, e.getMessage());

		}finally {
			session.close();
		}
		
		
		return response;
		
		
	}
	
	public GetEmployeeResponseModel getEmployeeById(int id){
		
		Session session = sessionFactory.openSession();
		GetEmployeeResponseModel response = null;
		if(id <=0) {
			response = new GetEmployeeResponseModel(id, null, null, null, 300, "Invalid ID");
			return response;
		}
		
		Employee emp = session.get(Employee.class, id);
		response = new GetEmployeeResponseModel(emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getAddress(), 200, "Success");
		
		return response;
	}

	
	
	
	
}
