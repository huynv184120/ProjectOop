package space3D;
import space3D.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.MemoryImageSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;



public class TestMain {
	
//	public static List<Point> test = new ArrayList<Point>();
	public static List<Point> test1 = new ArrayList<Point>();
	public static List<Point> test = new ArrayList<Point>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test.add(new Point(10,0,0));
//		test.add(new Point(0,10,0));
//		test.add(new Point(10,10,0));
//		test.add(new Point(0,0,0));
//		test.add(new Point(10,0,10));
//		test.add(new Point(0,10,10));
//		test.add(new Point(10,10,10));
//		test.add(new Point(0,0,10));
//		Rectangular hey = new Rectangular(test);
//		Point t = new Point(0, 50, 50); 
//		System.out.println(hey.pointInRec3D(t));
		
//		test1.add(new Point(1,0.5,2));
//		test1.add(new Point(1,3,2));
//		test1.add(new Point(0,0.5,2));
//		test1.add(new Point(0,3,2));
//		test1.add(new Point(1,0.5,1))
//		test1.add(new Point(0,0.5,1));
//		test1.add(new Point(1,3,1));
//		test1.add(new Point(0,3,1));
//		Rectangular hey1 = new Rectangular(test1);
//		
//		Room rm = new Room();
//		System.out.println(rm.checkUpAndDownRec(hey, hey1));
		
	
		String url = "C:\\Users\\nguye\\eclipse-workspace\\Projeectvv.zip_expanded\\Projectvv\\src\\input.txt";
		InputFile test = new InputFile(url);
		test.GetInput();
		
		Room rm = new Room(test.getRoom(), test.getRecInRoom(), test.getCamInRoom());	
		
		
		
		CalculateHiddenArea test1 = new CalculateHiddenArea(rm,32000000);
		
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(test1.calculateHidden());
	    long elapsedTimeMillis = System.currentTimeMillis() - startTime;
		System.out.println("time : "+elapsedTimeMillis);
	    
		
	    startTime = System.currentTimeMillis();
		System.out.println(test1.calculateHiddenVs3());
		elapsedTimeMillis = System.currentTimeMillis() - startTime;
		System.out.println("time : "+elapsedTimeMillis);
		
		GeneratorMatrixPixel m = new GeneratorMatrixPixel(rm.getCamInRoom().get(0), rm);
	
		Color[][] cl = rm.getCamInRoom().get(0).img.matrixImg;
		int width = rm.getCamInRoom().get(0).img.widthImg;
		int height = rm.getCamInRoom().get(0).img.heightImg;
		JFrame frame = new JFrame("Direct draw demo");
		
        drawImage panel = new drawImage(width,height ,cl);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
	
		

	}

}
