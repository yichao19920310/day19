package com.example.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*File file = new File("F:\\HWUA\\TC25");
		file.mkdirs();
		
		File f = new File("F:\\HWUA\\TC25\\学员信息.xlsx");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*File F = new File("F:\\");
		System.out.println(F.length());*/
		FileDemo f = new FileDemo();
	/*	File file = new File("D:\\");
		f.showAllFile(file.listFiles());*/
		f.showAllFile("E:\\");
		
	}
	
	public void showAllFile(File[] f) {
		if(null == f ) {
		
			return;
		}
		
		
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getName());
			if(f[i].isDirectory()) {
				showAllFile(f[i].listFiles());
			}
			
		}
	}
	
	public void showAllFile(String path) {
		if(null == path ) {
			
			return;
		}
		File f = new File(path);
		File[] fs = f.listFiles();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getName());
			if(fs[i].isDirectory() && fs[i].length() != 0) {
				showAllFile(fs[i].getPath());
			}
			
		}
		
	}

}
