package Lab4;



public class Rectangle implements Shape {
	
	private String fillColor;
	private int borderWidth;
	private int height , width;
	
	private HexColorValidator valid = new HexColorValidator();
	
	public Rectangle(String fillColor , int borderWidth,int height , int width)
	{
		setBorderWidth(borderWidth);
		setFillColor(fillColor);
		setHeight(height);
		setWidth(width);
	}
	
	
	public void setBorderWidth(int borderWidth)
	{
		if(borderWidth>0)
			this.borderWidth = borderWidth;
			else
				throw new IllegalArgumentException("borderWidth must be a positive number!");
	}
	

	public void setFillColor(String fillColor) {
		if(valid.validate(fillColor))
			this.fillColor = fillColor;
		else
	throw new IllegalArgumentException("Invalid hex code for color");
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height>0)
			this.height = height;
			else
				throw new IllegalArgumentException("Height must be a positive number!");
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		
		if(width>0)
			this.width = width;
			else
				throw new IllegalArgumentException("width must be a positive number!");
		
	}

	
	@Override
	public double getArea() {
		
		return height*width;
	}

	@Override
	public String getName() {
		
		return "Rectangle";
	}

	@Override
	public String getHexFillColor() {
		
		return fillColor;
	}

	@Override
	public int getBorderWidth() {
		
		return borderWidth;
	}
	
	@Override
	public void draw() {
		int i,j;
		//for(k=0;k<borderWidth-1;k++) {
			//for(l=0;l<3*height-2;l++)
			//	System.out.print("# ");
			//System.out.println();
		//}
		
		for(i=0;i<width;i++)
		{
			
			for(j=0;j<height;j++) {
				//for(k=0;k<borderWidth;k++) 
			if(i==0 || i== width-1 || j==0 || j== height-1)
				//if(i<borderWidth || j<borderWidth || j> height-borderWidth-1 || i > width-borderWidth-1)
				
				System.out.print("* ");
			else
				System.out.print("  ");
			
			

			}	
			
			
			System.out.println();
		}
		//for(k=width;k<width+borderWidth-1;k++) {
			//for(l=0;l<3*height-2;l++)
				//System.out.print("# ");
			//System.out.println();
		}
			
		
	}



