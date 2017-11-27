package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo01 demo = new Demo01();
		StringBuilder sB = new StringBuilder();
		File c = new File("C:\\C\\C.txt");
		File d = new File("D:\\D\\D.txt");
		File e = new File("E:\\E\\E.txt");
		demo.createFile(c);
		demo.createFile(d);
		demo.createFile(e);
		demo.writeSth("Hello", c);
		demo.writeSth("World", d);
		sB.append(demo.readSth(c)+demo.readSth(d));
		demo.writeSth(sB.toString(), e);
	}
	
	public void createFile(File f) {
		File pf = f.getParentFile();
		if (!pf.exists()) {
			pf.mkdirs();
		}
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeSth(String str,File f) {
		OutputStream os = null;
		try {
			try {
				os = new FileOutputStream(f,true);
				os.write(str.getBytes());
			}finally {
				os.close();
				os = null;
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

	public String readSth(File f) {
		InputStream is = null;
		byte[] buffer = new byte[1024];
		StringBuilder sBuilder = new StringBuilder();
		int length = 0;
		try {
			try {
				is = new FileInputStream(f);
				while(-1 != (length = is.read(buffer))) {
					sBuilder.append(new String(buffer,0,length));
				}
			} finally {
				
				is.close();
				is = null;
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		return sBuilder.toString();
		
	}
}
