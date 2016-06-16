
public class Frames {
int ball1=0;
int ball2=0;
int total=0;
void setBall1(int x)
{
ball1=x;	
}
void setBall2(int x)
{
	if(ball1!=10)
ball2=x;	
	
}
void topla()
{
	total=ball1+ball2;
}
}
