package store.mapper;

import java.util.List;

import domain.Member;

public interface MemberMapper {
	
	void create(Member member);
	void update(Member member);
	List<Member> findall (String role);
	List<Member> findallbycheck(String check);
	Member findbymail(String mail);
	Void delete(String id);


}
