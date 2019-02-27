package ie.dit;

import processing.core.*;
import processing.data.*;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(800, 800);
	}

	public void setup()
	{
		Table table = loadTable("HAbHYG15ly.csv", "header");
	}

	public void draw()
	{
	
	}
}
