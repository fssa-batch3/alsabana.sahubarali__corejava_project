package day02.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import day02.practice.*;

class LoggerTest {

	@Test
	void testDebug() {
		Logger log = new Logger();
		assertEquals("Check", log.debug("Check"));
		assertNotEquals(2, log.debug(5));

	}

	@Test
	void testError() {
		Logger log = new Logger();
		assertEquals("Checking", log.error("Checking"));
		assertNotEquals("check", log.error("not match"));

	}

	@Test

	void testInfo() {
		Logger log = new Logger();
		assertEquals("info", log.info("info"));
		assertNotEquals("info", log.info("not match"));

	}

}
