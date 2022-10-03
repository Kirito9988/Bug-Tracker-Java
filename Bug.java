
public class Bug {

	int direction = 1;
	int currentLoc = 0;
	
	public Bug(int initialPosition) {
		
		this.currentLoc=initialPosition;
	}

	public void turn()
	{
		 if (this.direction == 1) {

	           this.direction = -1;

	       } else {

	           this.direction = 1;

	       } 
	}
	
	public void move()
	{
		   if (this.direction == 1) {

	           this.currentLoc += 1;

	       } else {

	    	   this.currentLoc -= 1;

	       }
	}
	
	public int getPosition()
	{
		return this.currentLoc;
	}
}


