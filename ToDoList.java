package project;

public class ToDoList {
	
	private Task[] tasks;
	private int taskCount;
	
	public ToDoList(int size) {
		tasks = new Task[size];
		taskCount = 0;
	}
	
	//add task
	public void addTask (String description) {
		if (taskCount < tasks.length) {
			tasks[taskCount++] = new Task(description);
			System.out.println("Task added: " + description);
		} else {
			System.out.println("Task List is full, cannot add More tasks");
		}
	}
	
	public void removeTask(int index) {
		if (index >= 0 && index < taskCount) {
			System.out.println("Task Removed:" + tasks[index]);
			for (int i = index; i < taskCount - 1;i++) {
				tasks[i] = tasks[i+1];
			}
		} else {
			System.out.println("invalid Index");
		}
	}
	
	public void completeTask (int index) {
		
	}
	public void displayTask() {
		if(taskCount == 0) {
			System.out.println("No task available to show");
		} else {
			System.out.println("To Do List");
			for (int i = 0; i < taskCount;i++) {
				System.out.println((i + 1) + "." +i + tasks[i]);
			}
		}
	}

}
