package SpaceWar;

import java.awt.image.*;
import java.net.URL;
import javax.imageio.*;

public class Generals {
	//		Loading image
	public BufferedImage loadImg (String urlName) {
		try {
			URL url = getClass().getResource(urlName);
			BufferedImage img = ImageIO.read(url);
			System.out.println(getClass().getResource(urlName));
			return img;
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			return null;
		}
	}
}