package javaswing;


import java.awt.Image;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toan
 */
// van chua chay duoc
public class ReSizedImage {
    public static Image getScaled(BufferedImage image, int maxWidth, int maxHeight) {
	int width = image.getWidth();
	int height = image.getHeight();
	if (width <= maxWidth && height <= maxHeight) { return image; }

	if (width > maxWidth) {
		width = maxWidth;
		height = height * maxWidth / image.getWidth();
	}

	int h;
	int w;
	if (height > maxHeight) {
		h = maxHeight;
		w = width * maxHeight / height;
	} else {
		h = height;
		w = width;
	}

	return image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        
        }
}
