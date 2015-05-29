package test.lesson1;

import com.lesson1.FrogJmp;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFrogJmp {
	FrogJmp frogJmp = new FrogJmp();
	
	@Test
	public void test() {
		//simple test
	    assertEquals("10,85,30 => 3", 3, frogJmp.solution(10, 85, 30));
	    //extreme_position - no jump needed
	    assertEquals("10,10,10 => 0", 0, frogJmp.solution(10, 10, 10));
	    //small_extreme_jump - one big jump
	    assertEquals("10,125,115 => 1", 1, frogJmp.solution(10, 125, 115));
	    //many_jump1 - many jumps, D = 2
	    assertEquals("10,125,2",58,frogJmp.solution(10,125,2));
	}

}
