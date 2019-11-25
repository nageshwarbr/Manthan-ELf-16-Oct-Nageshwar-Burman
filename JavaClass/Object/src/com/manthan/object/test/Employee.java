package com.manthan.object.test;

public class Employee {
String name;
int empId;
int age;
public Employee(String name, int empId, int age) {
	this.name = name;
	this.empId = empId;
	this.age = age;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + empId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (empId != other.empId)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + "]";
}

}
