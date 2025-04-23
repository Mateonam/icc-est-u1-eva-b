package Controllers;
import Models.Book;

public class BookController {
    
    public void sortByName(Book[] libros) {
        boolean cambio;
        for (int i = 0; i < libros.length - 1; i++) {
            cambio = false;
            for (int j = 0; j < libros.length - 1 - i; j++) {
                if (libros[j].getName().compareToIgnoreCase(libros[j + 1].getName()) > 0) {
                    Book temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                    cambio = true;
                }
            }
            if (!cambio) break;
        }

    }

    public Book searchByName(Book[] libros, String nombre) {
        int alto = libros.length - 1;
        int bajo = 0;
        while (alto >= bajo) {
            int central = (alto + bajo) / 2;
            int cmp = (libros[central].getName().compareToIgnoreCase(nombre));
            if (cmp == 0) {
                return libros[central];
            }

            if (cmp > 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
            
        }
        return null;
    } 
}
