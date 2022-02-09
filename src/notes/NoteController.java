package notes;

import static java.lang.Integer.parseInt;

public class NoteController extends Controller{
    private int position;
    private Note note;
    public NoteController(int position){
        this.position = position;
        this.note = NotesRepo.getInstance().get(position);
    }
    public View execute(String[] parameters){
        View nextView = null;
        int option = parseInt(parameters[0]);
        if(option == 0) {
            nextView = new NotesView();
        }
        else if (option == 1) {
            this.note.setContent(parameters[1]);
            NotesRepo.getInstance().update(this.position, this.note);
            nextView = new NoteView(this.position);
        }
        else if (option == 2) {
            NotesRepo.getInstance().delete(this.position);
            nextView = new NotesView();
        }
        else {
            System.out.println("The selected option doesn't exist");
            nextView = new NoteView(this.position);
        }
        return nextView;
    }
}
