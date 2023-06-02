package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import member.MemberService;

public class MainClass {
	public static void main(String[] args) {
	MemberService memberService = new MemberService();
	HashMap<String, String> memberMap = memberService.memberMap;
	Scanner input = new Scanner(System.in);
	
	while(true) {
			System.out.println("====================");
			System.out.println("1.회원가입");
			System.out.println("2.회원보기");
			System.out.println("3.회원삭제");
			System.out.println("4.시스템종료");
			System.out.println("====================");
			System.out.print(">>> ");
			int sel = input.nextInt();
		
		switch(sel) {
			case 1: 
				memberService.register(input);	
				break;
			case 2: 
				Iterator<String> keyIter = memberMap.keySet().iterator();
				
				while(keyIter.hasNext()) {
					String key = keyIter.next();
					String value = memberMap.get(key);
					
					System.out.println("아이디: "+key+"\t"+"비밀번호: "+value+"\n\n");
				}
				break;
			case 3: 
				
				break;
			case 4: 
				System.out.println("시스템을 종료합니다");	
				input.close();
				return;
		}
	}
	
	}
}
