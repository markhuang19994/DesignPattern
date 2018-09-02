/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/9/2, MarkHuang,new
 * </ul>
 * @since 2018/9/2
 */
public class IteratorDesignMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
