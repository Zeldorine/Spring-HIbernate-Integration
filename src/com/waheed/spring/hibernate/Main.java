package com.waheed.spring.hibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
<<<<<<< HEAD
 * A small tutorial on spring-hibernate-Liquibase integration and uses CURD operation.
=======
 * A small tutorial on spring-hibernate integration and uses CURD operation.
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
 * 
 * @author abdul
 */
public class Main {

    private static final String APP_FILE = "beans.xml";

<<<<<<< HEAD
    public static void main(String[] args) throws Exception {
=======
    public static void main(String[] args) {
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
        
        //loads context information from an XML file which is present in classpath.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(APP_FILE);
        
        //used to retrieve the "operation" bean from the Spring framework
        Operation operation = (Operation)context.getBean("operation");
        
        // Add employee object to the database
        Employee employee = new Employee();
        employee.setCountry("INDIA");
        employee.setGender("M");
        employee.setName("SACHIN");
        employee.setAboutYou("CRICKETER");
        operation.addEmployee(employee);
        
        //Get employee details
<<<<<<< HEAD
        operation.getEmployee((long)1);
        
        //Update the employee details
        Employee employee1 = operation.getEmployee((long)1);
=======
        operation.getEmployee((long)20);
        
        //Update the employee details
        Employee employee1 = operation.getEmployee((long)20);
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
        employee1.setName("Tendulkar");
        operation.updateEmployee(employee1);
        
        //Delete employee having id
<<<<<<< HEAD
        Employee employee2 = operation.getEmployee((long)1);
=======
        Employee employee2 = operation.getEmployee((long)20);
>>>>>>> d37206e1a158fe2c043f9d87a423223c43f14f2b
        operation.deleteEmployee(employee2);
    }
}
