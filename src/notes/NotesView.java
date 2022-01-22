package notes;

import java.util.List;

public class NotesView {

    public void display() {

        System.out.println("Current notes");
        List<String> entities = NotesRepo.instance.getEntities();
        for (int i = 0; i < entities.size(); i++){
            System.out.println(entities.get(i));
        }
        System.out.println("===============================");
        System.out.println("Options: ");
        System.out.println("0. Exit ");

    }
}
