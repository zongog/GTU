package store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.Member;

public interface MemberMapper {
	
	boolean create(Member member);
	void update(Member member);
	List<Member> findall (String role);
	List<Member> findallbycheck(String check);
	Member findbymail(String mail);
	Void delete(String id);
	Member cparead(String id);
	Member earead(String id);
	Member veteranread(String id);
	Member login(@Param("id")String id,@Param("role") String role, @Param("pw")String pw);
}
