package notes;

public class NotesController {
    public NotesView execute (String[] parameters) {
        NotesView nextView = null;
        if(parameters[0].equals("0")) {
            System.out.println("Exiting!");
        }
        else if (parameters[0].equals("1")){
            NotesRepo.getInstance().create(parameters[1]);
            nextView = new NotesView();
        }
        else {
            System.out.println("The selected option doesn't exist");
            nextView = new NotesView();
        }
        return nextView;
    }
}
