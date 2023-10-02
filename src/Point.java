public class Point {
    private int pointX;
    private int pointY;

    public Point(int x, int y)
    {
        pointX = x;
        pointY = y;
    }

    public Point(int x)
    {
        pointX = x;
        pointY = x;
    }

    public Point()
    {
        pointX = 0;
        pointY = 0;
    }

    public int getX()
    {
        return pointX;
    }

    public int getY()
    {
        return pointY;
    }

    public void setX(int newX)
    {
        pointX = newX;
    }

    public void setY(int newY)
    {
        pointY = newY;
    }

    public String coordinate()
    {
        return "(" + pointX + ", " + pointY + ")";
    }

    public String quadrant()
    {
        if (pointX > 0 && pointY > 0){
            return "I";
        }
        else if (pointX < 0 && pointY > 0){
            return "II";
        }
        else if (pointX < 0 && pointY < 0){
            return "III";
        }
        else if (pointX > 0 && pointY < 0){
            return "IV";
        }
        else if (pointX == 0 && pointY == 0){
            return "On origin";
        }
        else{
            return "On axis";
        }
    }
}
