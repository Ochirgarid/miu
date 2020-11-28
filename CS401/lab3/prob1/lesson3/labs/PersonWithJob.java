package prob1.lesson3.labs;

public class PersonWithJob{
	
	private double salary;
	private Person man;

	public double getSalary() {
		return salary;
	}
	public Person getPerson() {
		return man;
	}
	
	PersonWithJob(String n, double s) {
		man = new Person(n);
		salary = s;
	}
	
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.man.getName().equals(p.man.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// PersonWithJobs is a Person class
		// but Person is not a PersonWithJobs class
		System.out.println("p1.getPerson().equals(p2)? " + p1.getPerson().equals(p2));
		System.out.println("p2.equals(p1.getPerson())? " + p2.equals(p1.getPerson()));
	}


}
