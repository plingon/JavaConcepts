package POM;

/**
 * Created by pling on 20/11/2016.
 */
public class Room {

    int space;
    public Room(){}

    public void setSpace(int space)

    {
        if (space < 100)
        {
            this.space= 100;
        }
        else if(space >1000) {
            this.space = 1000;
        }
        else
            this.space=space;
    }
    public int getSpace()
    {
        return space;

    }


}
