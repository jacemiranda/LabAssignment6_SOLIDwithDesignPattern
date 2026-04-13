public class Book implements LibraryResource {
    private String title;
    public Book(String title) { this.title = title; }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }
}

