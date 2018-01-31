package service;

import java.util.List;

import domain.MemberDTO;

public interface Member_Service {
	boolean register(MemberDTO member);
	void modify(MemberDTO member);
	List<MemberDTO> searchall (String role);
	List<MemberDTO> searchallbycheck(String check);
	MemberDTO searchbymail(String mail);
	Void remove(String id);
}
