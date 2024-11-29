package project;

public class Task {
	
	private String description;
	private boolean isCompleted;
	

	public Task(String description) {
		this.description = description;
		isCompleted = false;
	}
	

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
