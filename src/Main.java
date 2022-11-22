public class Main {
    public static void main(String[] args) {

        Author authorEmilyBronte = new Author("Эмили", "Бронте");
        Book bookCargoPass = new Book("Эксмо", authorEmilyBronte, 2022);
        System.out.println(bookCargoPass);

        Author authorFeodorDostoevsky = new Author("Федор", "Достоевский");
        Book bookDemons = new Book("Азбука", authorFeodorDostoevsky, 2020);
        System.out.println(bookDemons);
        bookDemons.setYearOfPublication(2022);
        System.out.println(bookDemons);

    }
}