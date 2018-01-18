package store;

import java.util.List;

import domain.Member;

public interface Member_Store {
	void create(Member member);
	void update(Member member);
	List<Member> findall (String role);
	List<Member> findallbycheck(String check);
	Member findbymail(String mail);
	Void delete(String id);

}
