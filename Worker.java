
public class Worker {

	
	@WorkerAnnotation("You have a great name")
	private String name; 
	
	@WorkerAnnotation("You are expirienced worker")
	private int expirience; 
	
	@WorkerAnnotation("Your salary need to raise")
	private int salary;

	public Worker(String name, int expirience, int salary) {
		super();
		this.name = name;
		this.expirience = expirience;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpirience() {
		return expirience;
	}

	public void setExpirience(int expirience) {
		this.expirience = expirience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", expirience=" + expirience + ", salary=" + salary + "]";
	} 
	
	
	
	
	
	
	
}
