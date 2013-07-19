package com.assignment.polygon;


public class Triangle implements Polygon {

    private int sides;
    private int sideLenght;
    public float area;
    public float perimeter;
    public void setData(int side,int length)
    {
        this.sides=side;
        this.sideLenght=length;
        this.sumOfAngles();
        this.findArea();
        this.calculatePerimeter();
    }
    @Override
    public void sumOfAngles() {
        int sum= (this.sides-2)*180;
        System.out.println("FOR TRIANGLE \nTHE ANGLE SUM IS \t: "+sum);
    
    }

    @Override
    public void  findArea() {
        
       this.area=(float) ((1.732*sideLenght)/4);
        System.out.println("AREA IS \t\t: "+area);
    }
    @Override
    public void calculatePerimeter() {
        this.perimeter=sides*sideLenght;
        System.out.println("PERIMETER IS \t\t: "+perimeter+"\n");
    }
    public static void main (String args[])    
    {
        Polygon triangle= new Triangle();
        triangle.setData(3,10);
        
        Polygon square= new Square();
        square.setData(4,11);
        
        Polygon pentagon= new Pentagon();
        pentagon.setData(5,12);
            
        Polygon hexagon= new Hexagon();
        hexagon.setData(6,13);
        
        Polygon septagon = new Septagon();
        septagon.setData(7, 14);
            
        Polygon octagon= new Octagon();
        octagon.setData(8,15);
        
        Polygon nonagon= new Nonagon();
        nonagon.setData(9,16);
        
        Decagon decagon= new Decagon();
        decagon.setData(10,17);
        
    }

    
    
}