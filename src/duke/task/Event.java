package duke.task;

public class Event extends Task{
    public static final String EVENT_ICON = "[E]";
    private String duration;

    public Event(String taskName, String duration) {
        super(taskName);
        this.duration = duration;
    }

    @Override
    public String exportTask() {
        return "E|" + super.getStatus() + "|" + super.toString() + "|" + duration + System.lineSeparator();
    }

    @Override
    public String toString() {
        return EVENT_ICON + super.toString() + " (at: " + duration + ")";
    }
}
