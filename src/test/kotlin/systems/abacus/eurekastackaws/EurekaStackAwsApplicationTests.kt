package systems.abacus.eurekastackaws

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import systems.abacus.eurekastackaws.core.annotations.EnableEurekaAws
import systems.abacus.eurekastackaws.core.config.testing.BeanImportConfigTester

@ActiveProfiles("test")
@SpringBootTest
@EnableEurekaAws
class EurekaStackAwsApplicationTests {
	@Autowired
	val config: BeanImportConfigTester? = null

	@Test
	fun contextLoads() {
	}

	@Test
	fun beanLoads() {
		Assertions.assertNotNull(config)
		Assertions.assertEquals("Working", config?.testString)
	}
}
