package notes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List ;

public class NotesRepo {

    private static NotesRepo instance = new NotesRepo()  ;
    private NotesRepo() {}
    public static NotesRepo getInstance(){
        return instance;
    }
    public void create(Note note){
        this.entities.add(note);
        this.save();
    }
    public void save(){
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            for (int i = 0; i < this.entities.size(); i++) {
                fw.write(this.entities.get(i).toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void update(int position, Note note){
        this.entities.set(position, note);
        this.save();
    }

    public void delete(int position){
        this.entities.remove(position);
        this.save();

    }

    private static final String path = "C:\\Users\\doosh\\Desktop\\Nesto.txt";
    private List<Note> entities = new ArrayList<Note>();
    private void load() {
        File file = new File(path);


        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNextLine()){
            entities.add(new Note(scan.nextLine()));
        }
    }
    public List<Note> getAll() {
        if (entities.isEmpty()) {
            load();
        }
        return entities;

    }
    public Note get(int position) {
        return entities.get(position);
    }


}