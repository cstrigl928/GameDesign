import processing.core.PApplet;

public abstract class Objects {

	protected final float StartingY, StartingX;
	protected float Speed, x,y;
	PApplet window;
	public Objects(PApplet window, float StartingX, float StartingY, float Speed) {
		this.window = window;
		this.StartingX = StartingX;
		this.StartingY = StartingY;
		this.Speed = Speed;
		
	}
	public abstract void draw();
	public abstract void move();
	public abstract void changeDirection();
	public abstract float getX();
	public abstract float getY();
	
	
}
