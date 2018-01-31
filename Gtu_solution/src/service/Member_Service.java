package service;

import java.util.List;

import domain.Member;

public interface Member_Service {
	boolean register(Member member);
	void modify(Member member);
	List<Member> searchall (String role);
	List<Member> searchallbycheck(String check);
	Member searchbymail(String mail);
	Void remove(String id);
	Member login(Member member);
}
