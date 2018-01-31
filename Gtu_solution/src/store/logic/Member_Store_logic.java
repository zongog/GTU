package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import domain.Member;
import store.Member_Store;
import store.mapper.MemberMapper;

@Repository
public class Member_Store_logic implements Member_Store{
	

	@Override
	public boolean create(Member member) {
		
		SqlSession session = Gtu_session_factory.getinstance().getSession();
		boolean flag = false;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			flag = mapper.create(member);
			
			if(flag == true) {
				session.commit();
			}else {
				session.rollback();
			}
			return flag;
		}finally {
			session.close();
		}
	}
		

	@Override
	public void update(Member member) {
		
	}

	@Override
	public List<Member> findall(String role) {
		return null;
	}

	@Override
	public List<Member> findallbycheck(String check) {
		return null;
	}

	@Override
	public Member findbymail(String mail) {
		return null;
	}

	@Override
	public Void delete(String id) {
		return null;
	}
	
	@Override
	public Member read(String id) {
		
		SqlSession session = Gtu_session_factory.getinstance().getSession();
		Member user = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			user = mapper.read(id);
		}finally {
			session.close();
		}return user;
	}

}
