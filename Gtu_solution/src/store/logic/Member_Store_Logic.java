package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import domain.MemberDTO;
import store.Member_Store;
import store.mapper.MemberMapper;

@Repository
public class Member_Store_Logic implements Member_Store{
	

	@Override
	public boolean create(MemberDTO member) {
		
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
	public void update(MemberDTO member) {
		
	}

	@Override
	public List<MemberDTO> findall(String role) {
		return null;
	}

	@Override
	public List<MemberDTO> findallbycheck(String check) {
		return null;
	}

	@Override
	public MemberDTO findbymail(String mail) {
		return null;
	}

	@Override
	public Void delete(String id) {
		return null;
	}
	
	@Override
	public MemberDTO read(String id) {
		
		SqlSession session = Gtu_session_factory.getinstance().getSession();
		MemberDTO user = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			user = mapper.read(id);
		}finally {
			session.close();
		}return user;
	}

}
