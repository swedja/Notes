package notes;

public class Note {
    private String content;
    public Note(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String toString() {
        return this.content;
    }
}

