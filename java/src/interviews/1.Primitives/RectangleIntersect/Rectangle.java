package RectangleIntersect;

public class Rectangle {
	int x, y, height, width;
	
	public Rectangle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public static Rectangle intersectRantangle(Rectangle a , Rectangle b)
	{
		Rectangle intersectRectangle = null;
		int x, xx, y, yy;
		if(isIntersect(a,b))
		{
			x = Math.max(a.x, b.x);
			xx= Math.min(a.x+a.width, b.x + b.width);
			y = Math.max(a.y, b.y);
			yy= Math.min(a.y+a.height, b.y + b.height);
			intersectRectangle = new Rectangle( x, y, xx-x,yy-y);
		}
		return intersectRectangle ;
	}
	public String toString()
	{
		StringBuffer comm = new StringBuffer();
		comm.append(String.format("X: %d XX: %d \nY: %d YY:%d\n", x, x+width, y,y+height));
		return comm.toString();
	}
	public static boolean isIntersect(Rectangle a , Rectangle b)
	{
		boolean checkX = (a.x < b.x + b.width) && ( b.x < a.x+a.width); 
		boolean checkY = (a.y < b.y + b.height) && ( b.y < a.y+a.height); 
		return checkX && checkY;
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle ( 2, 4, 10, 4);
		Rectangle b = new Rectangle ( 2, 2, 10, 5);
		Rectangle intersectRectangle = intersectRantangle(a,b);
		if(intersectRectangle == null)
		{
			System.out.printf("No Intersection");
		}
		else
		System.out.printf(intersectRectangle.toString());
	}

}
