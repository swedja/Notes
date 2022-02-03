import notes.NotesView;
import notes.View;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        View currentView = new NotesView();
        while(currentView != null) {
            currentView.display();
            String userInput = scanner.nextLine();
            String[] parameters = userInput.split("/");
            currentView = currentView.getController().execute(parameters);
        }


    }
}