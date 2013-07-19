package com.assignment.polygon;


public class Pentagon implements Polygon {

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
        System.out.println("FOR POLYGON \nTHE ANGLE SUM IS \t: "+sum);
    
    }

    @Override
    public void  findArea() {
       float apothem=(float) (this.sideLenght/(2*Math.tan(180/this.sides)));
       this.area=(float) (0.5*apothem*this.sides*this.sideLenght);
        System.out.println("AREA IS \t\t: "+area);
    }
    @Override
    public void calculatePerimeter() {
       this.perimeter=sides*sideLenght;
        System.out.println("PERIMETER IS \t\t: "+perimeter+"\n");
    }
}
