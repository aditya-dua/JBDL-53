public class Circle implements Area{
    float rad;
    @Override
    public void area() {
        
        double a = pi*rad*rad;
        System.out.println("Area of Circle is:"+a);
        
    }
}
