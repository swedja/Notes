package notes;

import java.util.List;

public class NotesView {

    private NotesController controller = new NotesController();
    public NotesController getController(){
        return this.controller;
    }

    public void display() {

        System.out.println("Current notes");
        List<Notes> entities = NotesRepo.getInstance().getAll();
        for (int i = 0; i < entities.size(); i++){
            System.out.println(entities.get(i));
        }
        System.out.println("===============================");
        System.out.println("Options: ");
        System.out.println("0. Exit ");

    }
}
