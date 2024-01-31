package ch11;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }
    
    public void go() {
        Book b1 = new Book("book1");
        Book b2 = new Book("book2");
        Book b3 = new Book("book3");
        //        Set<Book> tree = new TreeSet<>((o1, o2) -> o1.title.compareTo(o2.title));
        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
    
    public class Book implements Comparable<Book> {
        private String title;
        
        public Book(String title) {
            this.title = title;
        }
        
        @Override public String toString() {
            return this.title;
        }
        
        @Override public int compareTo(Book other) {
            return this.title.compareTo(other.title);
        }
        
    }
}
