package notes;


import static java.lang.Integer.parseInt;

public class NotesController extends Controller{
    public View execute (String[] parameters) {
        View nextView = null;
        int option = parseInt(parameters[0]);
        if(option == 0) {
            System.out.println("Exiting!");
        }
        else if (option == 1){
            NotesRepo.getInstance().create(new Note(parameters[1]));
            nextView = new NotesView();
        }
        else if (option == 2){
              nextView = new NoteView(parseInt(parameters[1]));
        }
        else {
            System.out.println("The selected option doesn't exist");
            nextView = new NotesView();
        }
        return nextView;
    }
}
