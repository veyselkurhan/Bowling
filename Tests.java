import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Tests {
	Bowling b;

	ArrayList<Frames> frames=new ArrayList<Frames>();
	public void setUp() 
	{		

	}	
	public void tearDown()
	{
		frames.clear();
		
	}
	@Test
	public void testScoreSpare() {
spareFirst();
assertEquals(16,b.hesapla());
	}
@Test
public void testscoreZero() {
scoreZeros();
assertEquals(0,b.hesapla());
}
@Test
public void testStrikeFirst() {
strikeFirst();
assertEquals(24,b.hesapla());
}

@Test
public void onePin() {
scoreOnePin();
assertEquals(20,b.hesapla());
}
@Test
public void strikeAll() {
strikeAllFrames();
assertEquals(300,b.hesapla());
}
public void spareFirst()
{
	Frames f=new Frames();
	f.setBall1(5);
	f.setBall2(5);
frames.add(f);
f=new Frames();
f.setBall1(3);
frames.add(f);
Dondur(8,0);

b=new Bowling(frames);
}

public void strikeFirst()
{
Frames f=new Frames();
f.setBall1(10);
frames.add(f);
f=new Frames();
f.setBall1(3);
f.setBall2(4);
frames.add(f);
Dondur(8, 0);
b=new Bowling(frames);
}

public void scoreZeros()
{
Dondur(10, 0);
b=new Bowling(frames);
}
public void scoreOnePin(){
Dondur(10, 1);
	
b=new Bowling(frames);
}
public void strikeAllFrames()
{
Dondur(12,10);
	b=new Bowling(frames);
}
public void Dondur(int counter,int value)
{	
	for(int a=0;a<counter;a++)
	{
		Frames f=new Frames();
		f.setBall1(value);
		f.setBall2(value);
		frames.add(f);
}
}
}

