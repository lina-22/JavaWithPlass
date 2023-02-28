package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test1");
	}
	
	
	@Test
	void pasUnTest() {
		System.out.println("test1");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("after each\n");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all\n");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}

}