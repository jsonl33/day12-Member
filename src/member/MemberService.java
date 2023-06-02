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
	
	public HashMap<String, String> remove(Scanner input){
		System.out.print("삭제할 ID 입력 : ");
		String removeId = input.next();
		memberMap.remove(removeId);
		System.out.println("삭제되었습니다");
		
		return memberMap;
	}
	
	
}
