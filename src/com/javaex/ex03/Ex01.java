//2021년 12월 9일(목) 10:08수업, 01.I/O Stream중 characters stream

package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		
		BufferedWriter	bw = new BufferedWriter(fw);	
		
		bw.write("학교 종이 땡땡땡");
		bw.newLine();
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
	}

}
