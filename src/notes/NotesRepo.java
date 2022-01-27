package notes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List ;

public class NotesRepo {

    private static NotesRepo instance = new NotesRepo()  ;
    private NotesRepo() {}
    public static NotesRepo getInstance(){
        return instance;
    }

    private static final String path = "C:\\Users\\doosh\\Desktop\\Nesto.txt";
    private List<Notes> entities = new ArrayList<Notes>();
    private void load() {
        File file = new File(path);


        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNextLine()){
            entities.add(new Notes(scan.nextLine()));
        }
    }
    public List<Notes> getAll() {
        if (entities.isEmpty()) {
            load();
        }
        return entities;

    }



}