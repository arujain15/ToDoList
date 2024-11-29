package project;

public class Main {
	
	public static void main(String[] args) {
		
		ToDoList app = new ToDoList(5);
		app.addTask("check papers");
		app.addTask("Conduct Classes");
		app.addTask("Cooporate sessions");
		app.displayTask();
		app.removeTask(3);
	}

}
