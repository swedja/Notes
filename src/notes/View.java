package notes;

public abstract class View {
    public abstract void display();
    protected Controller controller;

    public Controller getController() {
        return controller;
    }
}
