public class MovaeblePoint {
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
        return String.format("(%1$s, %2$s), speed=(%3$s, %4$s) " , x,y,xSpeed,ySpeed);
    }
    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;

    }
    public void moveLeft(){
        x -= xSpeed;

    }
    public void moveRight(){
        x += xSpeed;

    }

}
