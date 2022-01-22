import notes.NotesView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NotesView currentView = new NotesView();
        while(currentView != null) {
            currentView.display();
            int option = scanner.nextInt();
            currentView = currentView.controller.execute(option);
        }


    }
}