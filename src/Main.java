public class Main {
    public static void main(String[] args) {

        Author authorEmilyBronte = new Author("Эмили", "Бронте");
        Book bookCargoPass = new Book("Эксмо", authorEmilyBronte, 2022);
        System.out.println("Издатель: " + bookCargoPass.getPublisher() + ", автор: " + authorEmilyBronte.getNameAuthor()
                + " " + authorEmilyBronte.getSurnameAuthor() + ", год издания: " + bookCargoPass.getYearOfPublication());

        Author authorFeodorDostoevsky = new Author("Федор", "Достоевский");
        Book bookDemons = new Book("Азбука", authorFeodorDostoevsky, 2020);
        System.out.println("Издатель: " + bookDemons.getPublisher() + ", автор: " + authorFeodorDostoevsky.getNameAuthor()
                + " " + authorFeodorDostoevsky.getSurnameAuthor() + ", год издания: " + bookDemons.getYearOfPublication());
        bookDemons.setYearOfPublication(2022);
        System.out.println("Издатель: " + bookDemons.getPublisher() + ", автор: " + authorFeodorDostoevsky.getNameAuthor()
                + " " + authorFeodorDostoevsky.getSurnameAuthor() + ", год издания: " + bookDemons.getYearOfPublication());


    }
}