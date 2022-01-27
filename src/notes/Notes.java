package notes;

public class Notes {
    private String description;
    public Notes(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String toString() {
        return this.description;
    }
}

