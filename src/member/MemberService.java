package member;

import java.util.HashMap;

public class MemberService {
	MemberDTO dto = new MemberDTO();
	
	public HashMap<String, String> register(){
		HashMap<String, String> member = new HashMap<>();
		String userId = dto.getUserId();
		String userPwd = dto.getUserPwd();
		
		member.put(userId, userPwd);
		return member;
	}
}
