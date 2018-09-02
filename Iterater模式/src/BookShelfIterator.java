/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/9/2, MarkHuang,new
 * </ul>
 * @since 2018/9/2
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext(){
        return this.index < this.bookShelf.getLength();
    }

    public Object next(){
        return this.bookShelf.getBookAt(index++);
    }

}
