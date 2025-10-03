package com.swetha_v.assignment1.Employees;


	/**
	 * Represents a Manager, subclass of Employee.
	 */
	public class Manager extends Employee {
	    private String department;

	    /**
	     * Constructor for Manager class.
	     * 
	     * @param name Employee name
	     * @param employeeId Unique employee ID
	     * @param salary Employee salary
	     * @param department Department handled by manager
	     */
	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Manager [Department=" + department + "]";
	    }
	}


