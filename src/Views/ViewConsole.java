package Views;
import Models.Book;

public class ViewConsole {

    public void printMessage(String message) {
        System.out.println(message);
    }
    
    public void printArray(Book[] libros) {
        for (int i = 0; i < libros.length - 1; i++) {
            System.out.println(libros[i]);
        }
    }
}
