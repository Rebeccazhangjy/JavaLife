package com.laboon;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorldTest {

	// This test tests a small size of world gets the correct result when first created
	
	@Test
	public void WorldTestSmallWorld() {
		World world = new World(10,3,20);
		String expected = world.toString();
		String observed =
				"  0123456789\n" +
				"0 ..X..X....\n" +
				"1 ...X.X....\n" +
				"2 X....X....\n" +
				"3 .....X....\n" +
				"4 .........X\n" +
				"5 ......X..X\n" +
				"6 .........X\n" +
				"7 ......X...\n" +
				"8 ..........\n" +
				"9 ..X...X...\n" ;
		assertEquals(expected, observed);
	}
	
	
	// This test tests that a negative size of world will cause an exception
	
	@Test (expected = Exception.class)
	public void WorldTestExceptionNegativeSize(){
		World world = new World(-10,3,20);	
	}
	
	// This test tests that a world of size 0 will only get a string with two spaces and a \n. 
	
	@Test
	public void WorldTestSizeZero(){
		World world = new World(0, 3, 20);
		String expected = world.toString();
		String observed = "  \n";
		assertEquals(expected, observed);
	}
	
	// This test tests that a large size of world gets the correct result when first created
	
	@Test
	public void WorldTestLargeWorld(){
		World world = new World(100, 20, 30);
		String expected = world.toString();
		String observed =
				  "  0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789\n" +
				  "0 ..X.X..................X....XX..X.....X.XX.XX...X.XX..XXX.X.....X.X.X.XX.XXXX......X...X...X..X.....\n" +
				  "1 .......X.X...........X..X.X......X.XX....X......XX...X.............X....X..X....XXX..XX..X..X..XXX..\n" +
				  "2 .XX.X....X.........XXX.......XXXX.XX......X.........X....X....X..X....XX...X....X...X.XX..X.XXX.XX.X\n" +
				  "3 ..X.X.....X....XX.....X.X..X.........X...X.X..X........XX...X.X.XX.........X.X....XX.X....X.XX..XX..\n" +
				  "4 .........X.XX....XXX.X.X.....X..X.....X....X.....XX..XX.......X...XXX.......XX..X....X...X...X..XXX.\n" +
				  "5 ...XX.XX..XXXX.....X.XX..XXX.XX.......X..X.XXX...X.XXXX.X.....XX..X......XX......X...X....X....X.X.X\n" +
				  "6 ..XX.X.XX..X..X.X...X..X.....X.....X..X...X..XXXXXX.....X.XX.....X.X....XX...XXX....XXX.......XX.X..\n" +
				  "7 X.X....X..XX..X.......X...X..X.X.......X.X.XXX.XX......XXX..XX............X...X...X........X........\n" +
				  "8 X....X..X..X.X.XXX..X..X.X..X......XX.X..X........X......X..X..X.X.X.X.X...XXX......X..X.X.X.....X.X\n" +
				  "9 ........XX.........X..XXXXX.....XXXX..X...XX.........X.....XX.X.XXX..XX.XXX...X.......XX.X..X....X..\n" +
				  "0 ..X.X....X............X.............X..X..XXX.X.X.............X.XXXXX.XXX......XX........X.X...X.X..\n" +
				  "1 ....X..XX...X..X.....XX.....X.....XX..X.X....X....XX.X..X.X...X.XX.X.....X..X.....X......XX..X..XXX.\n" +
				  "2 .X..X.XXXXX..X..XX.X.XX....X...X.........XX...X.......XX...XX...X....X...X.....XX.....X.X.X..X....XX\n" +
				  "3 ....X.X....X.....X..XXXX....X...X.......XX....X........X..X.X..X......X.XX..X...X..X.X.X.....XX.....\n" +
				  "4 .....XX.X.X.....X......XXX.X.....X.X.X.XX...X.XX....X.XX..X..............X...X....X....X..X....X....\n" +
				  "5 .....X...X...X..XX.XX....XXXX...XXX.XX..X....XX......X......X.....XX.X..X.X.XX......XXX..X..X...X.XX\n" +
				  "6 .XXX.X.X......X...XX.......XX......X...XXX.....X....X....X..XX..X.X..X.X............X..X..XX.XX.X..X\n" +
				  "7 ..X.XXX..X..XX....X....XX....XX..X....X..X....X..XX..X........XX..............X.X.X.XX.....XX..X...X\n" +
				  "8 ..X....X.............X..X.X.X..XXX..X.....X...XXXXX..X......X.X..XX.......X..............X..X.X..X..\n" +
				  "9 ...XXXXXX.....X.X..X.X......X..X.X........XX...XX.X.X.XX...X.XXXX..X.....X...X.X...X...X..X...X...X.\n" +
				  "0 ...X...XX.......X...X.XXX.X..............XXXX..X....X....X.X.......XX....X.......XX.......X.X.X..X..\n" +
				  "1 .XX..XX...X.......XX...X...X.X.X..X.XXX..X.XXX.......X.........X.X.X..XX........XX......X..X..XX.X.X\n" +
				  "2 .....X..X.X....X.....X.....X.....X....X...X.....X.XX......X.X..XX.X.X.XX..X.....X..X..X..X.X.X......\n" +
				  "3 ..XX.X....X.X.X...........X..XXX..X........X.....XX.....X...X....X.X.........X....X.........X....X..\n" +
				  "4 ...XX.X..XX.....X..X.....X.XX....X.X........X........X.X...X..X....XX...X..XXXXX....X.....X...XX.X..\n" +
				  "5 ...XX..X..X.....XX.X.XX........X.X.X...XX.....X....XX.X.XX.......XXX..XXX..XXX........X..X....X....X\n" +
				  "6 .X...X.......X.XX.X.....XX..X.......X.X.XX..XXX.X..X.X..X..X.XX.X......X..X...X...X..XX...X....X.X..\n" +
				  "7 X.X...X.XX.X..X..XX..X.XXX..X....X.XX....XX.X.....XXXX..XXX..X.......XX...X......X.X..X.X.X..X..X...\n" +
				  "8 X.X.X.XX...XX..X.X.X......X.XX.X.XXX..X....X...X..X...X...XXX.XX..X.X......X.X......XX..X.X.XX......\n" +
				  "9 ..X...XX.X.X.XX.X....X..X.X........X..X.....XX.X....XXX....X...XX.XX..XX...X.......X.X....XX...X....\n" +
				  "0 .........X.X.X.......X......XX.X.X.XX.XX..X.......XXXXX..X........X..X........X.........X.X.XX....X.\n" +
				  "1 .XX...X.XXX....X..X.X............XX.X..XX.X..XX...X...........X...X.X..X.....X.XX.X...X.X.X....X.XX.\n" +
				  "2 .X....X.X...X.................XX....X....XXX...X.X.........XX.X...XXXXX.X...XX.XX.........X.....X...\n" +
				  "3 ........X........X.XXX..X.X.XXXX....XX..X...X...X.X..X..X..X.X.XX....X....X.X......XX..X.X.X.X......\n" +
				  "4 X.XXX...........X...XXX...X..X......X..........XX...X..XX...X.......X..X.X....X.....XX...X.X..X.....\n" +
				  "5 .X.......XX.....X.X...X...X.X.X.X..X.....X..X.......X........X..X.X..X..XX.X...X.....X..X...XX......\n" +
				  "6 ..X...XX....X.X.X.X..XX......XXXXX........X.X..X.....X...X......X...X....X....X.XX.X...X..XX.X......\n" +
				  "7 .XX....X...X...XXX.X....X.XX.....XX.X.X.X.X.XX..X.XX.X.X..XX..X.X....X.X..XX.....XXX.....X.X...XXX..\n" +
				  "8 ...X......XX.XX.X.X....X.XX.....X...X...X....X.....XXX...X..X..X..X.......X......X.X....X.XX......XX\n" +
				  "9 X........X.X..X.......X......XXX...X..X.X..X...XX.X..............X.X.....X.......X.X........XX.XX...\n" +
				  "0 X......X...XXX......X.X..XX..X.........XX...X..XXX...X....X....X..X.X...X...X.........X.XX...X.X....\n" +
				  "1 .X...X...X.X....X.....XXX..XX.X...X..X..XX......X.XXX.......X..X...XX...X....X..X...................\n" +
				  "2 .X...X.X......X..X...XXX...........X...X.X.X..XX.......X......X..XX......X.......X....X....X.X...X..\n" +
				  "3 .X......XX....X.X....XX..X......X...X..X..........XX...X.X....X.X...X..X.X........X.X.X..X.......XX.\n" +
				  "4 ....XX.......X.....X......XX.X...X.X..X..XX.X.XX.X....X...XX.XX.......XXX....XX....X....XX........X.\n" +
				  "5 X.........X....XX.......X...X......X......X..X.X..X.XXX...X.........X.....X.X...X.X.X....X..X.......\n" +
				  "6 XX.......XXX..X.XX...X.XX..X.X..X.......XXX....X.XX.........X.X..X.X.X....X..X.XXX.....X....XXXX..XX\n" +
				  "7 XX.X.....X...XX...X..X.X..X...X....X..X........XXX......X.X.....XX.XX.XXX.....X.....X.X.X..X..XX.X.X\n" +
				  "8 .XX...X....XX..XX.XX...XX.X.XX..X..XXX..X...X....XXX..........X.XXX........X.X.X....X...X..X..X....X\n" +
				  "9 XX...X.....XX..X.XX.X.X.......X......X......XX.....X..X......X......X...X..XX.X......X.X...X.X...X..\n" +
				  "0 XX....X..X.X....XX......X.XX.....XX.....X.X..X..............X.X.XX.X....X.X.......X...X.........X...\n" +
				  "1 ......X.X....X.......X....X.X..XXX..X....X..XX....XXX....X..X.....XX......XX.X.X........X.XXXXX...X.\n" +
				  "2 ..X....XX..........X.X...X..X.....XX..X.XX.XXXXXX....X..X.....XX......X.X.......X................XXX\n" +
				  "3 ..X.X.X..X...X.X.X.....XXX...X...XX.XXX.X....X.....X..X.....XX..XX....X..X..XX.X..XX......X.X.XX.XX.\n" +
				  "4 X.X..X..X......XX...X.X........X.....XX....X.............X.X.......X..............X.X...X.X....X..X.\n" +
				  "5 ...X.X.X.X...X......XX.......X..........X....XXX....XXX..........X.......X.X....X...XXX.X....X......\n" +
				  "6 ..X.X..XX.......XX..X..X.X.....XXX...X........X...XX..XX.......X...XX.XX............XX....XX..X...X.\n" +
				  "7 ...X......XX..XX......XX.......X......X..XX..XXX...X.X...X....X....X.......X.X..X......X........X.X.\n" +
				  "8 ...XX.....X..X....X..X..........X...X.....XXX......X.XXXX...........X.XXX.X.X...........X.........XX\n" +
				  "9 X...X.....X.....XX..X.XX..X......X....X..X.X..............XX...X........XXX...X...X..X.X.XX...X.XX..\n" +
				  "0 ...X....X..X.X..XX...X.X.X..XX......X...........XXX.X.X......XX........X.X....X..X.XXX..............\n" +
				  "1 ..X...XX...X.X..XX..........XX.......X..X..X..X.X.XX..........XXXX...X.XXXX....XX....X...X...X..XXX.\n" +
				  "2 .X.XX...XX....X.X....XX..XXX..X.X.X.X.XX..XX..XXX.......X....X......X.X.X.X..X......X....XX....XX.XX\n" +
				  "3 .XXX..XX....X..X....XX....X...X......................X.......X...X.X...XXXX..XX........X..XXX...X.X.\n" +
				  "4 .X..XX.....X....XXX.X....X.X.XXXXXXX....XX.X..............X.......X.X.X..X.X.X..X...XXX..X.XX...X...\n" +
				  "5 XX.X...XX.XX.X...X.X..XX...X............X...X...X.XX..XX.X.X....X.XX....X....XX....XXXXXX..X.....X..\n" +
				  "6 .....XX.X..X.X.X.XXX........X..XX.X....X..XX...X.XX..X.........X.........................X......X...\n" +
				  "7 ..X.........X.X..XX.X.X....X.X...X..X..X........X.....X.X....X.XX...XX.X.X.X.....X...X..XX...X..X...\n" +
				  "8 X..XX...X....X.X.....XX...X......X.XX.X..XX.X...X.X.X.X.X..X....X.XX..X...XXX.X..X.X...X..X....X....\n" +
				  "9 ...X.........XX...X..X..X....X.......XXXX..X....X.XX.......X..X..X..X.XX.XX.X.X..X...X..XX....X.XX..\n" +
				  "0 XX.......X...X..........XX.......X.X.X.......X...X....XX...XX.X.X...X.XXX.X.XXX......X.XX..XX.X.X...\n" +
				  "1 .......X...X.X....XX.......X..XX..X....X.....X.X.....XX..XX......X..X.X..XX.XX..X.X...XXX....X.X...X\n" +
				  "2 XX.....XX.XX.....X..X..XX.X.............X....X..XXX...X.....XXX......X.......X.....X..X..XX..X......\n" +
				  "3 X..............X.X.....X.X..X.X.X.X..X.............X.X....X......XXX....X...........X..XX..X....X...\n" +
				  "4 XX.X..XXX.X..XX....X............XXX.....XX....X.......X......X.XXX....X...X.X.....XX.......XXX.X....\n" +
				  "5 XX.X..X.X....X.X.XX..X...X.X.......X.......X....X.X.X.X.X.....X.....XX....X...XXX.XX...X.XXX...X.XX.\n" +
				  "6 ......X.....XX.XXX.X.....X....X....X...........X........XX...X..X.........X.X..X......X.X.X.X.XXX...\n" +
				  "7 .XXXX...X.X.XXX....X..XXX.X......X.XX.X....X.......X..XX.......X.X....XX.X..XX....X.XX.X...XX....X.X\n" +
				  "8 ......X.XX.............X...XX..XXXXX......X.X..XXX.X....X..X.XX.............X.XX..X...XX.......XX.X.\n" +
				  "9 X.X.X...X..XX........X.XXX...X...X...XX.X...X.XX....XX.X..X.XX..XX.X...X.X.X....X.......X..X.....XX.\n" +
				  "0 ....X...XX....X...X...XX.X........X.....X..X.XXX...X.X..........X......X.......XX.X....X......XXX...\n" +
				  "1 ........XX......XX.X.XXXXX.X.X..X..XX...X.XXXXX...X......X......X.......X.........X.....X.......X...\n" +
				  "2 .....XX.X...X....XXX...XXXX.XX......XX.XX.....X...X..X........X.......X....X..XXX.XX..X...X.XXX.....\n" +
				  "3 ....XX..X.XXX...X...X..XXXX....XXX..XX......X....X.....X..XX.......X..X..XX..X...X.X..XX.X.XX.X..X..\n" +
				  "4 ...X.....XXX....X.X.......XX....XX.X.XX.....X....X.XX.....X....X...X...XX....XXX....X...X......XXX..\n" +
				  "5 .....X....XX...X...X.XXX....X...X.X......X...X.........X.X....X.XX...XX......X.X....X......X..X..X..\n" +
				  "6 XXX..........X......X..XX....X....X...X.X..X..X.X.XXX.....XXX......X.X.XXXX..X..X..X..X...X.X......X\n" +
				  "7 ......XX...X.X...X..X.....X..XX.....X.......XXX....X....X......X..X.X...XXXX...XXX.XX...XX..X...X..X\n" +
				  "8 .......X...X....X...X.X..XX..X......X......XX..X......XX...............X....XX..XX...X.X....X.X..X..\n" +
				  "9 ....X..X..X.....X.X.....X.....XX.........X....XXXXX...X.XX.X..X.............XX.X..X...X....X.....XX.\n" +
				  "0 X...XX..........X..............XXX....X....X.............X..X....X.X.....X.XX....X...X..X.....XX...X\n" +
				  "1 .X.X.XXX.....XX.........X..X.......X...X.....X......X......X.X....X.X.X.X...X..X...XXX.........XXX.X\n" +
				  "2 .....XX..XX.X..X..XX.X.......XX..........XX.X.........XX.XX..X..X...X...X....X........X..X.........X\n" +
				  "3 X.X.....X..XX.XX..X..XX.X.X......X.XX.XX.X.X..X.......X.X...XXX.XXXXX..X.X...X....XXXX.XX.X.....XX.X\n" +
				  "4 .X...X.XX........X....X.X..X......X....X..X..XX...X.......X.X..X.XX.....X....XX......X...X.........X\n" +
				  "5 .......XXX.XX......X.XX.XX......X..X....X...X............X.X......XXX..X...X...XX..X.....X.X.......X\n" +
				  "6 .X..X...X....X..X.XX.X......XX.XXX.....X.X.X...XXXX....X...X..XX.X.X....X......X.....XX.X......X..X.\n" +
				  "7 X..XX.X...XX.X...XX...XX.....X..XX.X.XX..X.......X..XX...X......XX..X.X...XXX..XX....X.X..XX.X...XXX\n" +
				  "8 ...XX........X.X........X.X..XX..X...X.X.X.X........X......X...X.X..X.X........X..X.X..X...X.XXXX...\n" +
				  "9 ....X.XXXX.....X..XX..........XXX.X..XX..XXX...X...XX.....X..X.X.X..XX.X.....X.X.X....X......X...XX.\n" ;
		assertEquals(expected, observed);
	}
	
	// This test tests a world without any live cells
	
	@Test
	public void WorldTestNoneLive(){
		World world = new World(10,3,0);
		String expected = world.toString();
		String observed = 
				"  0123456789\n" +
				"0 ..........\n" +
				"1 ..........\n" +
				"2 ..........\n" +
				"3 ..........\n" +
				"4 ..........\n" +
				"5 ..........\n" +
				"6 ..........\n" +
				"7 ..........\n" +
				"8 ..........\n" +
				"9 ..........\n" ;
		assertEquals(expected, observed);
	}
	
	// This test tests a world with all cells live
	
	@Test
	public void WorldTestAllLive(){
		World world = new World(10,3,100);
		String expected = world.toString();
		String observed = 
				"  0123456789\n" +
				"0 XXXXXXXXXX\n" +
				"1 XXXXXXXXXX\n" +
				"2 XXXXXXXXXX\n" +
				"3 XXXXXXXXXX\n" +
				"4 XXXXXXXXXX\n" +
				"5 XXXXXXXXXX\n" +
				"6 XXXXXXXXXX\n" +
				"7 XXXXXXXXXX\n" +
				"8 XXXXXXXXXX\n" +
				"9 XXXXXXXXXX\n" ;
		assertEquals(expected, observed);
	}

}
