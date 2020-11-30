package edu.mum.cs.cs401.examples.test;

import java.util.List;

public class Manager extends Employee {
	private double bonus;
	private double teamBudget;
	
	List<Employee> employees;
	
	public double getSalary() {
		double teamSalary = super.getSalary() + getBonus();;
		for(Employee e : employees) {
			teamSalary += e.getSalary();
		}
		return teamSalary;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getTeamBudget() {
		return teamBudget;
	}
	public void setTeamBudget(double teamBudget) {
		this.teamBudget = teamBudget;
	}
	
	

}
