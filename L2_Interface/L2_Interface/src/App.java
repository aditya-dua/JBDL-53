public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Square sq = new Square(10);
        sq.area();
        sq.peri();
        //sq.display();
        Area.display();

        Circle c = new Circle();
        c.area();

      
       

    }
}
