package com.annuaire.dao;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class Utils {

	public static byte [] ImageToByte(File file) throws FileNotFoundException{
		
        FileInputStream fis = new FileInputStream(file);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] buf = new byte[1024];

        try {

            for (int readNum; (readNum = fis.read(buf)) != -1;) {

                bos.write(buf, 0, readNum);     

            }

        } catch (IOException ex) {

        }
        byte[] bytes = bos.toByteArray();

     return bytes;

    }
	
	
	public static void ByteToImage(byte [] bytes,File imageFile) throws IOException
	{
		try {
		ByteArrayInputStream bis =new ByteArrayInputStream(bytes);
		Iterator<?> readers =ImageIO.getImageReadersByFormatName("jpeg");
		ImageReader reader =(ImageReader) readers.next();
		Object source = bis;
		ImageInputStream iis =ImageIO.createImageInputStream(source);
		reader.setInput(iis, true);
		ImageReadParam param =reader.getDefaultReadParam();
		Image image = reader.read(0,param);
		BufferedImage bufferedImage= new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 =bufferedImage.createGraphics();
		g2.drawImage(image, null,null);
		ImageIO.write(bufferedImage,"jpeg", imageFile);
		//System.out.println(imageFile.getPath());

		    }
		catch(Exception e)
		{
			ByteArrayInputStream bis =new ByteArrayInputStream(bytes);
			Iterator<?> readers =ImageIO.getImageReadersByFormatName("png");
			ImageReader reader =(ImageReader) readers.next();
			Object source = bis;
			ImageInputStream iis =ImageIO.createImageInputStream(source);
			reader.setInput(iis, true);
			ImageReadParam param =reader.getDefaultReadParam();
			Image image = reader.read(0,param);
			BufferedImage bufferedImage= new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
			Graphics2D g2 =bufferedImage.createGraphics();
			g2.drawImage(image, null,null);
			ImageIO.write(bufferedImage,"png", imageFile);
			
		}
	}
	

	public static File InputStreamToFile (InputStream fileContent,String acronyme, String path) throws IOException
	{
		try {
        byte[] buffer = new byte[fileContent.available()];
        fileContent.read(buffer);
			 
	    File imageFile = new File(path+"/"+acronyme+".jpeg");
		OutputStream outStream = new FileOutputStream(imageFile);
	    outStream.write(buffer);
		return imageFile;
		}
		catch(Exception e)
		{
			byte[] buffer = new byte[fileContent.available()];
	        fileContent.read(buffer);
				 
		    File imageFile = new File(path+"/"+acronyme+".png");
			OutputStream outStream = new FileOutputStream(imageFile);
		    outStream.write(buffer);
			return imageFile;
		}
	}
	
	
	 public static void resize(File imageFile, int height, int width) throws IOException {
		 
		    BufferedImage img = ImageIO.read(imageFile);
	        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g2d = resized.createGraphics();
	        g2d.drawImage(tmp, 0, 0, null);
	        g2d.dispose();
	        ImageIO.write(resized,"jpeg", imageFile);
	     
	    }

}

