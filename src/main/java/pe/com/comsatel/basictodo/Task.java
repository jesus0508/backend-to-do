package pe.com.comsatel.basictodo;

public class Task {

    private Integer id;
    private String description;
    private Boolean state;

    public Task(Integer id, String description, Boolean state) {
        this.id = id;
        this.description = description;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
