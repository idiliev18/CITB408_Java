package week2.exercise.repo;

public class Document {

    private String title;
    // pdf, jpg, txt
    private String format;
    private double size;

    public Document() {
    }

    public Document(String title, String format, double size) {
        this.title = title;
        this.format = format;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
