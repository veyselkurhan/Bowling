import java.util.ArrayList;


public class Bowling {
	int total=0;
ArrayList<Frames> frames=new ArrayList<Frames>();
public Bowling(ArrayList<Frames>frames)
{
this.frames=frames;	
}
public int hesapla()
{
	for(int a=0;a<10;a++)
	{
		Frames f=frames.get(a);
		//strike olunca
		if(f.ball1==10 && a<=9)
		{
			if((a+1)!=frames.size())
			{
				// striketan sonraki ilk deneme tekrar strike deðilse//
				if(frames.get(a+1).ball1!=10)
					frames.get(a).setBall1(f.ball1+frames.get(a+1).ball1+frames.get(a+1).ball2);
				else if((a+2)!=frames.size()) 
				{
					frames.get(a).setBall1(f.ball1+frames.get(a+1).ball1+frames.get(a+2).ball1);
					
				}
				
			}
			
		}
		else if((f.ball1+f.ball2)==10 && a<=9)
		{
			
			frames.get(a).setBall1(f.ball1+frames.get(a+1).ball1);
		}
		//butun framelerdeki puaný topluyoruz
		frames.get(a).topla();
	
	}
	
	
	for(int a=0;a<frames.size();a++)
	{
		total+=frames.get(a).total;
		
	}
return total;
}
public void Show()
{
for(int a=0;a<frames.size();a++)
{
System.out.println(a+".eleman"+frames.get(a).total);	
}
}
}
