package com.waheed.spring.hibernate;

/**
<<<<<<< HEAD
 * Provide methods to work with Employees.
 * 
 * @author abdul
 * 
 */
public interface EmployeeService {

	public long addEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public Employee getEmployee(long employeeId) throws Exception;

	public void updateEmployee(Employee e);

	public void display();

	public void display(long employeeId);
=======
 * 
 * @author abdul
 *
 */
public interface EmployeeService {
    
    public long addEmployee(Employee employee);

    public void deleteEmployee(Employee employee);
  
    public Employee getEmployee(long employeeId);
    
    public void updateEmployee(Employee e);

    public void display();
    
    public void display(long employeeId);
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
}
