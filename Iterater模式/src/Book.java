/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/9/2, MarkHuang,new
 * </ul>
 * @since 2018/9/2
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
