// Skyler Voran
// Project 1
public class RegularPolygon {
    private int numSides;
    private double side;
    private double x;
    private double y;
    
    public RegularPolygon(){
        numSides = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    public RegularPolygon(int num,double s){
        numSides = num;
        side = s;
        x = 0;
        y = 0;
    }
    
    public RegularPolygon(int num,double s, double xx, double yy){
        numSides = num;
        side = s;
        x = xx;
        y = yy;
    }
    
    // getter methods
    public double getNumSides(){
        return numSides;
    }
    
    public double getSide(){
        return side;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    // setter methods
    
    public void setNumSides(int n){
        numSides = n;
    }
    
    public void setSide(int n){
        side = n;
    }
    
    public void setX(int n){
        x = n;
    }
    
    public void setY(int n){
        y = n;
    }
    // perimiter method
    public double Perimeter(){
        return numSides*side;
    }
    // area method
    public double Area(){
        return ((numSides * (side*side))/ (4*Math.tan(Math.PI/numSides)));
    }
    
    // Printing format
     @Override
    public String toString() {
       return numSides + " " + 
               (int)side + " (" + 
               (int)x + "," + 
               (int) y + ") "+
               (int) Perimeter()+" "
               +String.format("%.3f", Area());
    }
}
