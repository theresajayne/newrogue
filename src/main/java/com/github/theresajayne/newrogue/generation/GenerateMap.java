package com.github.theresajayne.newrogue.generation;

import com.github.theresajayne.newrogue.entities.Level;

import java.util.Random;

/**
 * Generate Map
 * Created by Theresa on 19/01/2016.
 */
public class GenerateMap
{

	Random random = new Random(System.currentTimeMillis());


	public void generateMap(Level level)
	{
	//The Map is genreated with randomness, we PLace a random room
		getRandomRoom(level);
	}

	private void getRandomRoom(Level level)
	{
		boolean done = false;
		while(!done)
		{
			int x = random.nextInt(Level.maxWidth);
			int y = random.nextInt(Level.maxHeight);
			int roomX = random.nextInt(8);
			int roomY = random.nextInt(8);
			if ((x - (roomX / 2) > 0) && (x + (roomX / 2) < Level.maxWidth))
			{
				if((y - (roomY / 2) > 0) && (y + (roomY / 2) < Level.maxHeight))
				{
					for(int tempx = (x-(roomX/2));tempx <(x+(roomX/2));x++)
					{
						int ty = (y- (roomY/2));
						int tz = (y+ (roomY/2));
						level.setMapLocation(tempx,ty,"#");
						level.setMapLocation(tempx,tz,"#");
						for(int qy = ty+1;qy<tz-1;qy++)
						{
							level.setMapLocation(tempx,qy,".");
						}
					}
					for(int tempy = (y-(roomY/2));tempy < (y+(roomY/2));tempy++)
					{
						int ty = (x- (roomX/2));
						int tz = (x+ (roomX/2));
						level.setMapLocation(tempy,ty,"#");
						level.setMapLocation(tempy,tz,"#");

					}
					done = true;
				}
			}
		}
	}
}
