public class ColorImage
{
    private Color[][] screen;
    private int width;
    private int height;
    public ColorImage(int newWidth, int newHeight)
    {
        screen = new Color[newWidth][newHeight];
        width = newWidth;
        height = newHeight;
        for(int i = 0; i < screen.length; i++)
        {
            for(int j = 0; j < screen[0].length; j++)
            {
                screen[i][j] = new Color(255,255,255);
            }
        }
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public Color getColor(int x, int y)
    {
        return screen[x][y];
    }
    public void setColor(int x, int y, Color c)
    {
        screen[x][y] = c; 
    } 
}
