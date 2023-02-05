import javax.imageio.plugins.tiff.TIFFDirectory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приложение: Электронная библиотека");
        System.out.println(" ");

        Author Sholokhov = new Author("Михаил", "Шолохов");
        Author Pushkin = new Author("Александр", "Пушкин");

        System.out.println("Метод Equals");
        System.out.println(Sholokhov.equals(Pushkin));
        System.out.println(" ");

        System.out.println("Метод to String для " + Pushkin);
        System.out.println(Pushkin);
        System.out.println(" ");

        System.out.println("Метод Hashcode");
        System.out.println(Sholokhov.hashCode());
        System.out.println(Pushkin.hashCode());
        System.out.println(" ");

        Book tihiyDon = new Book("Тихий Дон", 1930,Sholokhov);
        Book dubrovkiy = new Book("Дубровский", 1841, Pushkin);

        System.out.println(tihiyDon.toString());
        System.out.println(dubrovkiy.toString());

        System.out.println("");
        System.out.println("Меняем год публикации книги");
        tihiyDon.setPublishedYear(1940);
        System.out.println(tihiyDon.toString());
    }
}