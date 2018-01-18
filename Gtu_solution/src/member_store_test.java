import org.junit.Before;
import org.junit.Test;

import domain.Member;
import store.Member_Store;
import store.logic.Member_Store_logic;

class member_store_test {
	
	private Member_Store store;
	@Before
	public void setup() {
		store = new Member_Store_logic();
	}
	
	@Test
	public void testCreate() {
		Member member = new Member();
		member.setMail("gtu@gtusolution.co.kr");
		member.setName("김구박");
		member.setId("gggg");
		member.setAttachment("붙여넣기");
		member.setPassword("789882");
		member.setPermission("대기");
		member.setRole("ADMIN");
		store.create(member);
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testFindall() {
	}

	@Test
	public void testFindallbycheck() {
	}

	@Test
	public void testFindbymail() {
	}

	@Test
	public void testDelete() {
	}
}
