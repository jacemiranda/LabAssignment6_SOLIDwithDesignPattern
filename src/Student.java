public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource) {
        resource.borrow();
    }
}