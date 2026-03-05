import java.util.*;

public class ToDoListManager {

    static class Task {
        String name;
        boolean completed;

        Task(String name) {
            this.name = name;
            this.completed = false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        // default tasks
        tasks.add(new Task("Finish homework"));
        tasks.add(new Task("Study Java"));

        int choice;

        while (true) {

            System.out.println("\n===== TO-DO LIST MANAGER =====\n");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark Task Complete");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter task name: ");
                String taskName = sc.nextLine();

                tasks.add(new Task(taskName));
                System.out.println("Task added successfully!");

            }

            else if (choice == 2) {

                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {

                    System.out.println("\nTask List:");

                    for (int i = 0; i < tasks.size(); i++) {

                        Task t = tasks.get(i);

                        if (t.completed)
                            System.out.println((i + 1) + ". " + t.name + " ✔");
                        else
                            System.out.println((i + 1) + ". " + t.name);
                    }
                }
            }

            else if (choice == 3) {

                System.out.print("Enter task number to remove: ");
                int index = sc.nextInt();

                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task removed successfully.");
                } else {
                    System.out.println("Invalid task number.");
                }
            }

            else if (choice == 4) {

                System.out.print("Enter task number to mark complete: ");
                int index = sc.nextInt();

                if (index > 0 && index <= tasks.size()) {
                    tasks.get(index - 1).completed = true;
                    System.out.println("Task marked as completed.");
                } else {
                    System.out.println("Invalid task number.");
                }
            }

            else if (choice == 5) {

                System.out.println("Program exited successfully!");
                break;
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
