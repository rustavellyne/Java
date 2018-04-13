package dobroeIt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UserLinkedListTest {
	private UserLinkedList<User> Spisok;

	private User u1 = new User("Sasha","noob");
	private User u2 = new User("Marina","director");
	private User u3 = new User("Andre","editor");
	private User u4 = new User("Misha","producer");
	private User u5 = new User("Masha","pr");
	
	@Before
	public void SetUp() {
		Spisok = new UserLinkedList<>();
		Spisok.add(u1);
		Spisok.add(u2);
		Spisok.add(null);
		Spisok.add(u3);

	}
	
	
	
	@Test
	public void testAdd() {
		Assert.assertTrue(Spisok.add(u4));
	}

	@Test
	public void testContains() {
		Assert.assertEquals(false, Spisok.contains(u5));
		
	}

	@Test
	public void testSize() {
		Assert.assertEquals(4, Spisok.size);
	}

	@Test
	public void testIsEmpty() {
		Assert.assertFalse(Spisok.isEmpty());
	}

	@Test
	public void testRemove() {
		Assert.assertTrue(false==Spisok.remove(u5));
	}

	

}
