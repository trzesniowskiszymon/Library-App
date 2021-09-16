package example.trzesniowskiszymon.library.io;

import example.trzesniowskiszymon.library.model.Book;
import example.trzesniowskiszymon.library.model.LibraryUser;
import example.trzesniowskiszymon.library.model.Magazine;
import example.trzesniowskiszymon.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {

    public void printBooks(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Book)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0) {
            printLine("Brak książek w bibliotece");
        }
    }
    public void printMagazines(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0) {
            printLine("Brak magazynów w bibliotece");
        }
    }

    public void printUsers(Collection<LibraryUser> users){
        users.stream()
                .map(LibraryUser::toString)
                .forEach(System.out::println);
    }

    public void printLine(String text){
        System.out.println(text.toUpperCase());
    }
}
