//2021.12.9(목)12:05

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("/Users/hs/JavaStudy/file/MS949.txt");//MS949를 2진수로 받아오는 클래스
		InputStreamReader isr = new InputStreamReader(is, "MS949");//2진수로 온 MS949의 코드를 문자열로 번역해주는 클래스, 인코딩을 변환
		BufferedReader br = new BufferedReader(isr);//배열에 담아 출력속도를 빠르게 함
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}

}

/*
기본적으로 UTF-8로 문자열을 보내고 불러오며 이외의 형식 읽어올 때엔 InputStream을 통해 binarycode로 읽어옴


*/