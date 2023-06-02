package main;

import java.util.HashMap;
import java.util.Scanner;

import member.MemberDTO;
import member.MemberService;

public class MainClass {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	MemberService m = new MemberService();
	HashMap<String, String> map = new HashMap<>();
	
	String name;
	int age,num;
	
	while(true) {
			System.out.println("====================");
			System.out.println("1.회원가입");
			System.out.println("2.회원보기");
			System.out.println("3.회원삭제");
			System.out.println("4.시스템종료");
			System.out.println("====================");
			System.out.print(">>> ");
			age = input.nextInt();
		
		switch(age) {
			case 1: 
				MemberDTO dto = new MemberDTO();
				System.out.print("ID 입력 : ");
				String ID = input.next();
				System.out.print("PWD 입력 : ");
				String PWD = input.next();
				
				dto.setUserId(ID);
				dto.setUserId(PWD);
				map = m.register();	
				
				break;
			case 2: 
				System.out.println("ID : ");
				System.out.println("PWD : ");
				break;
			case 3: 
				
				break;
			case 4: 
				System.out.println("시스템을 종료합니다");			
				return;
		}
	}
	
	}
}
