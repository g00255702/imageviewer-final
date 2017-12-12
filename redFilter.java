import java.awt.Color;

/**
 * An image filter to show only red and black colors.
 * @author Emeka Okonkwo
 * @version 12.11.2017
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class redFilter extends Filter
{
    /**
     * Constructor for objects of class redFilter.
     * @param name The name of the filter.
     */
    public redFilter(String name)
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
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(255 - pix.getRed(),0, 0));
            }
        }
    }
}
