package notes;

public class NotesController {
    public NotesView execute (int option) {
        NotesView nextView = null;
        if(option == 0) {
            System.out.println("Exiting!");
        }
        else {
            System.out.println("The selected option doesn't exist");
            nextView = new NotesView();
        }
        return nextView;
    }
}
