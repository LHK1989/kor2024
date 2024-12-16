package TodoList.Model;


public class Dto {

    private String content;
    private String day;
    private boolean status = false;

    public Dto(){}

    public Dto(String content, String day) {
        this.content = content;
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "content='" + content + '\'' +
                ", day='" + day + '\'' +
                ", status=" + status +
                '}';
    }
}
