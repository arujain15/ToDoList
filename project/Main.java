package project;

public class Main {
	
	public static void main(String[] args) {
		
		ToDoList app = new ToDoList(5);
		app.addTask("Coding");
		app.addTask("Take classes");
		app.addTask("Focus on logic building");
		app.addTask("Follow TimeTable");
		app.addTask("Prepare for the placement");
		app.displayTask();
		app.removeTask(3);
		app.displayTask();
		app.completeTask(2);
	}

}
