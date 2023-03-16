package com.ness;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class main {

	public static void main(String[] args) {
		
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("string"));
		
		ImagePlus image = IJ.openImage("image.jpeg");
		
		Font font = new Font("Arial", Font.BOLD, 108);

		ImageProcessor ip = image.getProcessor();
		ip.setColor(Color.GREEN);
		ip.setFont(font);
		ip.drawString("text", 0, 200);
		
		File outputfile = new File("saved.png");
	    try {
			ImageIO.write(image.getBufferedImage(), "png", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
