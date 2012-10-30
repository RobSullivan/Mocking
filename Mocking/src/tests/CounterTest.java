package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

import code.Counter;

public class CounterTest {

	@Test
	public void test() {
		

		Integer first;
		Integer expectedFirst = 1;
		
		Counter count = new Counter();
		
		
		
		first = count.getValue();
		
		
		assertEquals("Wrong answer", expectedFirst, first);
	}
	
	@Test
	public void test2(){
		

		Integer first, mockedFirst;
		Integer expectedFirst = 1;
		
		Counter count = new Counter();
		
		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(2);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
		
		assertEquals("Wrong answer", first, mockedFirst);
		
		

	}

}
