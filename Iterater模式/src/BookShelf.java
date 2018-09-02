/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/9/2, MarkHuang,new
 * </ul>
 * @since 2018/9/2
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last =0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return this.books[index];
    }

    public void appendBook(Book book){
        if(this.last < this.books.length){
            this.books[last++] = book;
        }else{
            throw new ArrayIndexOutOfBoundsException("太多本書拉!!");
        }
    }

    public int getLength(){
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
