package builder;

import java.time.Year;

public class MainBuilder {
    public static void main(String args[]) {
//        Book book1= new Book("0-12-345678-9", "Moby-Dick", "Herman Melville");
//        Book book1= new Book("Moby-Dick", "0-12-345678-9", "Herman Melville");
        BookWithBuilder book = new BookWithBuilder.Builder("0-12-345678-9", "Moby-Dick")
                .genre("ADVENTURE_FICTION")

                .published(Year.of(1851))
                .description(
                        "The book is the sailor Ishmael's narrative of the obsessive quest of "
                                + "Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, "
                                + "the giant white sperm whale that on the ship's previous voyage bit "
                                + "off Ahab's leg at the knee."
                )
                .build();

        System.out.println("AUTHOR =>" + book.getAuthor());
    }
}
