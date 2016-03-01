package learning.rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import learning.pojo.Employee;

@Path("/employee")
public class EmployeeRest {
	
	
	@GET
	@Path("/get")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("sri");
		emp.setEmpSalary(453534);
		return emp;
	}

}
