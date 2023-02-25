public class MovaeblePoint implements Movable {
    public int x ;
    public int y ;
    public int xSpeed;
    public int ySpeed;

    MovaeblePoint(int x , int y , int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+this.x + "," + this.y + "), speed =("+this.xSpeed + ","+this.ySpeed+")";}

    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;

    }
    @Override
    public void moveLeft(){
        x -= xSpeed;

    }
    @Override
    public void moveRight(){
        x += xSpeed;

    }

}
