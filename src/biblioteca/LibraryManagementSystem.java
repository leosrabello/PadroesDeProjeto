package biblioteca;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", "George Orwell", 1949, "Distopia");
        LibraryItem magazine = new Magazine("National Geographic", "Vários", 2023, 10);
        LibraryItem digitalMedia = new DigitalMedia("Curso Java", "Udemy", 2021, "MP4");

        LibraryItem[] items = { book, magazine, digitalMedia };

        for (LibraryItem item : items) {
            item.displayInfo();
            item.borrow();
            item.returnItem();
            System.out.println();

            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages();
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }
            System.out.println("-----------------------------------");
        }
    }
}
