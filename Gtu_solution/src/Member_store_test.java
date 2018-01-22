import org.junit.Before;
import org.junit.jupiter.api.Test;

import domain.Member;
import store.Member_Store;
import store.logic.Member_Store_logic;

class Member_store_test {

	 private Member_Store store;
	 @Before
	 public void setup() {
	 	store = new Member_Store_logic();
	 }

	@Test
	public void testCreate() {
		
		System.out.println("TestCreate시작");
		Member member = new Member();
		
		member.setMail("gtur");
		member.setName("김구박");
		member.setId("gggg");
		member.setAttachment("붙여넣기");
		member.setPassword("7882");
		member.setPermission("대기");
		member.setRole("AaN");
		
		System.out.println("여기가 문제?");
		store.create(member);
		System.out.println("TestCreate종료");
	}

//	@Test
//	void testUpdate() {
//		System.out.println("Update");
//	}
//
//	@Test
//	void testFindall() {
//		System.out.println("Findall");
//	}
//
//	@Test
//	void testFindallbycheck() {
//		System.out.println("check");
//	}
//
//	@Test
//	void testFindbymail() {
//		System.out.println("bymail");
//	}
//
//	@Test
//	void testDelete() {
//		System.out.println("delete");
//	}

}
