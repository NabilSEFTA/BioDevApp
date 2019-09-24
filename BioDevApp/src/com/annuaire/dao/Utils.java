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
	
	   // InputStream -> File
    public static void copyInputStreamToFile(InputStream inputStream, File file) 
		throws IOException {

        try (FileOutputStream outputStream = new FileOutputStream(file)) {

            int read;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) 
            {
                outputStream.write(bytes, 0, read);
            }

			// commons-io
            //IOUtils.copy(inputStream, outputStream);

        } catch(Exception e) {}
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
