/*2021.12.9(목)14:40,

[연습문제]
1) PhoneDB.txt 파일에 있는보를 읽어 변수에 담아 출력하세요.
2) PhoneDB.txt 에 자신의 정보를 추가해 보세요.

*/

package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		// ArrayList 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();

		// phoneDB.txt 읽어 오기(=접촉)
		Reader fr = new FileReader("/Users/hs/JavaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {// 한줄 씩 읽기
			String line = br.readLine();
			if (line == null) {
				break;
			}

			// 마지막이 아니면 ,(split)으로 구분함
			String[] dArray = line.split(",");
			String name = dArray[0];
			String hp = dArray[1];
			String company = dArray[2];

			// Person객체를 생성하고 값을 넣어줌
			Person p01 = new Person(name, hp, company);

			// ********리스트에 추가해줌(잊지 말 것)********
			pList.add(p01);
		}
		
		//테스트용 출력 toString();사용
		System.out.println(pList.toString());
		
		// 화면 출력
		for(int i = 0; i<pList.size(); i++); {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		//영림 씨의 방법: 출력하는 메소드를 하나 만들어 출력하는 중복을 피해보자
		
		
		/*
		System.out.println("================================");
		System.out.println("이름: " + pList.get(1).getName());
		System.out.println("핸드폰: " + pList.get(1).getHp());
		System.out.println("회사: " + pList.get(1).getCompany());
		System.out.println("");
		*/
		
		
		/*
		for (Person p01 : pList) {
			p01.showInfo();	
		*/	
		br.close();
	}

}
