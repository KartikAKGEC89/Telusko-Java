package com.junit01.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.junit01.demo.CalcTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		CalcTest.show();
	}

}
