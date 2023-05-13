package com.vacaytoday.vacaytoday

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class VacaytodayApplicationTests {

	/**
	 * Commented out because function will throw error due to spring datasource
	 * in application.properties is set to docker container name, not localhost.
	 * This is because we need to run this app container and postgres container
	 * on custom docker bridge network, which requires referring to each other
	 * by container name, not localhost.
	 *
	 * Can run test when we change spring datasource to localhost and run a postgres
	 * container on docker desktop, not custom docker bridge network created
	 */
//	@Test
//	fun contextLoads() {
//	}

}
