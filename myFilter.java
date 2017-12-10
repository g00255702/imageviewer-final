import java.awt.Color;

/**
 * An image filter to add lots of dots to the image.
 * @author Emeka Okonkwo
 * @version 12.10.2017
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class myFilter extends Filter
{
    
    /**
     * Constructor for objects of class myFilter.
     * @param name The name of the filter.
     */
    public myFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        final int PIXEL_SIZE = 5;
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int y = 0; y < height; y += PIXEL_SIZE) {
            for(int x = 0; x < width; x+= PIXEL_SIZE) {
                Color pix = image.getPixel(x, y);
                int picture = (pix.getRed() + pix.getGreen() + pix.getBlue())/3;

                image.setPixel(x,y, new Color(picture));

            }
        }
    }

}
