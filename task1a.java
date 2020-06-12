public class MyTest {
	private MyClass obj = new MyClass();
	
	@Test
	public void test1()
	{
		assertTrue(obj.checkValue(10));
		assertFalse(obj.checkValue(15));
		assertTrue(obj.checkValue(20));
	}
}
