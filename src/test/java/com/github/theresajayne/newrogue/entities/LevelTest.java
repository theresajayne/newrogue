package com.github.theresajayne.newrogue.entities;

import com.github.theresajayne.newrogue.generation.GenerateMap;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Unit Test for @{link Level}
 * Created by Theresa on 19/01/2016.
 */
public class LevelTest
{

	@Test
	public void testLevelInit()
	{
		Level level = new Level();
		level.initMap();
		assertThat(level.getMapLocation(2,6),is(" "));
		level.printMap();
		GenerateMap generateMap = new GenerateMap();
		generateMap.generateMap(level);
		level.printMap();
	}

}
