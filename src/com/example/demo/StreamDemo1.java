package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("F:\\HWUA\\TC25\\123.txt");
		OutputStream os = null;
		for(int i = 1; i <= 5; i++) {
			String str = "刘浩第"+i+"天交公粮!孙鑫第"+i+"天被交公粮!";
			try {
				os = new FileOutputStream(file,true);
				os.write(str.getBytes(),0,str.getBytes().length);
				os.write("\r\n".getBytes());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				os = null;
			}
		}
		
	
		
		
		
	}

}
