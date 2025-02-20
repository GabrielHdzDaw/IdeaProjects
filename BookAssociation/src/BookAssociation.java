public class BookAssociation {
    public static void main(String[] args) {

        Author cervantes = new Author("Miguel de Cervantes", 1547, null);
        Book[] books = {
                new Book("Don Quijote de la Mancha", 863, 39.99, cervantes),
                new Book("La Galatea", 464, 29.99, cervantes),
                new Book("Novelas ejemplares", 640, 34.99, cervantes),
                new Book("Los trabajos de Persiles y Sigismunda", 554, 32.99, cervantes)
        };
        cervantes.setBooks(books);

        System.out.println(cervantes);
    }
}
