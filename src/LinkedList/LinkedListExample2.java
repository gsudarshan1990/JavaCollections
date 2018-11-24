package LinkedList;

import java.util.LinkedList;

/*
 * Make a List of Circle objects. Use a random radius. Keep adding circles to the list until Math.random()
returns less than 0.01. Then, loop down the list and print out each area. If you do not have a
good Circle class to use, steal mine from the shapes3 package of the oop-advanced project.s
 */

public class LinkedListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Circle> circlelist=new LinkedList<Circle>();
		double radius;
		while(true)
		{	
			radius=Math.random();
			if(radius<0.01)
			{
				break;
			}
			else
			{
				Circle circleobject=new Circle(radius);
				circlelist.add(circleobject);
			}
		}
		
		for(Circle circle:circlelist)
		{
			System.out.println(circle.calArea());
		}
		
	}

}


class Circle
{
	double radius;
	
	public Circle(double r)
	{
		radius=r;
	}
	
	public double calArea()
	{
		double area=Math.PI*radius*radius;
		return area;
	}

	
}
