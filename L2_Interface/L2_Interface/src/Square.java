public class Square extends Shape implements Area,Perimeter {

    

    public Square(int side){
        this.side=side;
        System.out.println(Area.pi);
        System.out.println(Perimeter.pi);
    }
    
    @Override
    public void area() {
        
       int a = side/0;
       System.out.println("Area of square is :"+a);
    }
    

   

    @Override
    public void peri() {
        // TODO Auto-generated method stub
        int p = 4*side;
        System.out.println("The perimieter of square is:"+p);
    }

    @Override
    public void area(int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
    
}
