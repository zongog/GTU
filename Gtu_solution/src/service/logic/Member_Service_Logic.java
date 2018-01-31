package service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Member;
import service.Member_Service;
import store.Member_Store;

@Service
public class Member_Service_Logic implements Member_Service {

	@Autowired
	private Member_Store store;
	
	@Override
	public boolean register(Member member) {
		//
		if (!validate(member)) {
			return false;
		} else if (store.read(member.getId()) != null) {
			return false;
		}
		return store.create(member);
	}

	@Override
	public void modify(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Member> searchall(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> searchallbycheck(String check) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member searchbymail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void remove(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean validate(Member member) {
		//
		if (member == null) {
			throw new RuntimeException("사용자 정보가 없습니다.");
		} else if (member.getId() == null || member.getId().isEmpty()) {
			throw new RuntimeException("ID가 없습니다.");
		} else if (member.getPw() == null || member.getPw().isEmpty()) {
			throw new RuntimeException("비밀번호가 없습니다.");
		}
		return true;
	}

}
