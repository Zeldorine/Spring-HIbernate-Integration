package com.waheed.spring.hibernate;

import java.util.Iterator;

/**
<<<<<<< HEAD
 * Data access object for {@link Employee}s.
=======
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
 * 
 * @author abdul
 *
 */
public interface EmployeeDao {
    
    public long addEmployee(Employee employee);

    public void deleteEmployee(Employee employee);
    
    public Employee getEmployee(long id);
    
    public Iterator<Employee> getEmployees();
    
    public Employee updateEmployee(Employee employee);
}
