package notes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List ;

public class NotesRepo {

    public static NotesRepo instance = new NotesRepo()  ;
    private NotesRepo() {}

    private static final String path = "C:\\Users\\doosh\\Desktop\\Nesto.txt";
    private List<String> entities = new ArrayList<String>();
    private void load() {
        File file = new File(path);


        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNextLine()){
            entities.add(scan.nextLine());


        }
    }
    public List<String> getEntities() {
        if (entities.isEmpty()) {
            load();
        }
        return entities;

    }



}