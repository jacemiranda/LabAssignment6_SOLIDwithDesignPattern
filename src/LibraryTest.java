public class LibraryTest {
    public static void main(String[] args) {
        Student student = new Student("Juan Dela Cruz");

        LibraryResource physicsBook = new Book("Introduction to Physics");
        LibraryResource techJournal = new Journal("IEEE Software Engineering");

        student.borrowResource(physicsBook);
        student.borrowResource(techJournal);
    }
}