import java.util.Objects;

public class Book {
    private String title;
    private int publishedYear;
    private Author author;

    public Book(String title, int publishedYear, Author author) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void PrintInfo () {
        System.out.println("Название книги: " + getTitle() + "; Год издания - " + getPublishedYear() + "; Автор: " + getAuthor().getName() + " " + getAuthor().getSurname() );
    }
    @Override
    public String toString() {
        return "Название книги: " + title + "; Год издания - " + publishedYear + "; Автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublishedYear() == book.getPublishedYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPublishedYear(), getAuthor());
    }
}
