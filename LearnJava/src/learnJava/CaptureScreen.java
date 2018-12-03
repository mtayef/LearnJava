package learnJava;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreen {
	public static void main(String args[]) throws Exception{
		Robot r = new Robot();
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image = r.createScreenCapture(screenSize);
		ImageIO.write(image, "png", new File(System.getProperty("user.home")+"/Desktop/ScreenCapture.png"));
	}	
}
