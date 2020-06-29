public class BookApp {
    public static void main(String[] args){
        Book book1=new Book("Java");
        Book book2= new Book();
        Book book3= new  Book("Learning OOP","Mary","OOP book",10.00,true);
        book1.setAuthor("Nora");
        book1.setDescription("Book 1 is a java book");
        book1.setPrice(9.99);
        book1.setInStock(false);
        book2.setInStock(true);
        book2.setTitle("OOP");


        System.out.println("Book1's author is "+ book1.getAuthor());
        System.out.println("Book1's title is "+ book1.getTitle());
        System.out.println("Book1's author is "+ book1.getDescription());

    }
}
