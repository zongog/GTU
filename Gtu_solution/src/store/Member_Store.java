package store;

import java.util.List;

import domain.MemberDTO;

public interface Member_Store {
	boolean create(MemberDTO member);
	void update(MemberDTO member);
	List<MemberDTO> findall (String role);
	List<MemberDTO> findallbycheck(String check);
	MemberDTO findbymail(String mail);
	Void delete(String id);
	MemberDTO read(String id);

}
