package com.github.theresajayne.newrogue.entities;

/**
 * The Level Object
 *  # = wall
 *  . = floor
 *  D = door
 *  S = Secret door
 *  C = chest
 * Created by Theresa on 19/01/2016.
 */
public class Level
{
	public static final int maxWidth = 100;
	public static final int maxHeight = 100;

	private int depth;
	private String[][] map;


	public int getDepth()
	{
		return depth;
	}

	public void setDepth(int depth)
	{
		this.depth = depth;
	}

	public String[][] getMap()
	{
		return map;
	}

	public void setMap(String[][] map)
	{
		this.map = map;
	}

	public String getMapLocation(int x, int y)
	{
		return this.map[x][y];
	}

	public void setMapLocation(int x,int y, String flag)
	{
		this.map[x][y] = flag;
	}

	public void initMap()
	{
		this.map = new String[maxWidth][maxHeight];
		for(int x = 0;x<maxWidth;x++)
		{
			for(int y= 0;y<maxHeight;y++)
			{
				this.map[x][y] = " ";  // space is the character for solid wall in the map.
			}
		}
	}

	public void printMap()
	{
		for(int x = 0;x<maxWidth;x++)
		{
			for(int y= 0;y<maxHeight;y++)
			{
				System.out.print(this.map[x][y]);  // # is the character for solid wall in the map.
			}
			System.out.println(" ");
		}
	}
}
