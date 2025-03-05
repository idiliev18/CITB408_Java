package week2.exercise.repo;

public class Novel extends Book{

    private String novelAbstract;

    public Novel(String novelAbstract, String title, String format, double size, String isbn, Author author) {
        super(title, format, size, isbn, author);
        this.novelAbstract = novelAbstract;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                '}' + super.toString();
    }
}
