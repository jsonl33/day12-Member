package member;

import java.util.HashMap;
import java.util.Scanner;

public class MemberService {
	MemberDTO dto = new MemberDTO();
	public HashMap<String, String> memberMap = new HashMap<>();
	
	public HashMap<String, String> register(Scanner input){
		System.out.print("ID 입력 : ");
		String userId = input.next();
		System.out.print("PWD 입력 : ");
		String userPwd = input.next();
		
		dto.setUserId(userId);
		dto.setUserPwd(userPwd);
		
		memberMap.put(userId, userPwd);
		return memberMap;
	}
}
