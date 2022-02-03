package notes;

import java.util.List;

public class NotesView extends View {

    public NotesView(){
        controller = new NotesController();
    }
    public void display() {

        System.out.println("Current notes");
        List<Note> entities = NotesRepo.getInstance().getAll();
        for (int i = 0; i < entities.size(); i++){
            System.out.println(Integer.toString(i) + ". " + entities.get(i));
        }
        System.out.println("===============================");
        System.out.println("Options: ");
        System.out.println("1. Create [1/content]");
        System.out.println("2. Open [2/position]");
        System.out.println("0. Exit ");

    }
}
