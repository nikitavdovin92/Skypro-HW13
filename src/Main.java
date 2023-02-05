import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приложение: Электронная библиотека");
        System.out.println(" ");

        Author Sholokhov = new Author("Михаил", "Шолохов");
        Author Pushkin = new Author("Александр", "Пушкин");

        Book TihiyDon = new Book("Тихий Дон", 1930,Sholokhov);
        Book Dubrovkiy = new Book("Дубровский", 1841, Pushkin);

        TihiyDon.PrintInfo();
        Dubrovkiy.PrintInfo();

        System.out.println("");
        System.out.println("Меняем год публикации книги");
        System.out.println("");
        TihiyDon.setPublishedYear(1940);
        TihiyDon.PrintInfo();
    }
}