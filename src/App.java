import Models.Book;
import Controllers.BookController;
import Views.ViewConsole;
public class App {
    public static void main(String[] args) throws Exception {

        Book[] books = {
                new Book("Clean Code", 2008),
                new Book("The Pragmatic Programmer", 1999),
                new Book("Design Patterns: Elements of Reusable Object-Oriented Software", 1994),
                new Book("Refactoring: Improving the Design of Existing Code", 1999),
                new Book("Effective Java", 2001),
                new Book("You Don't Know JS: Scope & Closures", 2014),
                new Book("Introduction to the Theory of Computation", 1997),
                new Book("Code: The Hidden Language of Computer Hardware and Software", 2000),
                new Book("Structure and Interpretation of Computer Programs", 1985),
                new Book("The Mythical Man-Month", 1975),
                new Book("Head First Design Patterns", 2004),
                new Book("Programming Pearls", 1986),
                new Book("Algorithms", 1983),
                new Book("Java Concurrency in Practice", 2006),
                new Book("The Art of Computer Programming", 1968),
                new Book("Computer Networking: A Top-Down Approach", 2000),
                new Book("Artificial Intelligence: A Modern Approach", 1995),
                new Book("Compilers: Principles, Techniques, and Tools", 1986),
                new Book("Operating System Concepts", 1983),
                new Book("Database System Concepts", 1986),
                new Book("The C Programming Language", 1978),
                new Book("Introduction to Algorithms", 1990),
                new Book("The Linux Programming Interface", 2010),
                new Book("Python Crash Course", 2015),
                new Book("Cracking the Coding Interview", 2008),
                new Book("The Go Programming Language", 2015),
                new Book("Modern Operating Systems", 1992),
                new Book("Computer Organization and Design", 1994),
                new Book("Deep Learning", 2016),
                new Book("The Elements of Statistical Learning", 2001)
        };

        ViewConsole vC = new ViewConsole();
        vC.printMessage("Arreglo sin ordenar");
        System.out.println();
        vC.printArray(books);
        System.out.println();
        vC.printMessage("Arreglo ordenado");

        BookController bC = new BookController();
        bC.sortByName(books);
        vC.printArray(books);
        vC.printMessage("Resultado de la búsqueda del libro Python the best book");

        Book result = bC.searchByName(books, "Python the best book");
        if (result == null) {
            vC.printMessage("El libro no ha sido encontrado");
        } else {
            System.out.println(result);
        }


    }
}
