public class Project {
    private String name;
    private String description;

    public String Project(String name, String description) {
        return (elevatorPitch(name, description));
    }

    public String Project(String name) {
        return (elevatorPitch(name, this.description));
    }

    public String Project() {
        return (elevatorPitch(this.name, this.description));
    }

    public String elevatorPitch(String name, String description) {
        return (name + " : " + description);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
