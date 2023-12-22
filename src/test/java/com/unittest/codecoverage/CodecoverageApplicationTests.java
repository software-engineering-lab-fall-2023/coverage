package com.unittest.codecoverage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class CodecoverageApplicationTests {

	@Test
	public void applicationContextTest() {
		CodecoverageApplication.main(new String[] {});
	}
}
