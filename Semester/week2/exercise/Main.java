package week2.exercise;

import week2.exercise.repo.*;

public class Main {

    public static void main(String[] args) {
        Document document1 = new Document();
        System.out.println(document1);

        Book book1 = new Book(new Author("Preslava"), "890890");
        System.out.println(book1);

        Book novel = new Novel("Azis", "Na golo", "pdf", 12, "Azis", new Author("Qsha"));
        System.out.println(novel);

        Repository repo = new Repository(1000);
        System.out.println(repo);
    }
}
