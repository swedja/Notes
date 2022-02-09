package notes;

public class NoteView extends View{
    private int position;
    private Note note;

    public NoteView(int position) {
        this.position = position;
        this.note = NotesRepo.getInstance().get(position);
        this.controller = new NoteController(position);
    }
    public void display(){
        System.out.println("Content: ");
        System.out.println(this.note.getContent());
        System.out.println("====================");
        System.out.println("Options: ");
        System.out.println("1: Edit [1/new content]");
        System.out.println("2: Delete [2]");
        System.out.println("0: Return");
    }


}
