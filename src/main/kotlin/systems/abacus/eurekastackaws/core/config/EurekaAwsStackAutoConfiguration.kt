package systems.abacus.eurekastackaws.core.config

import com.netflix.appinfo.AmazonInfo
import org.springframework.cloud.commons.util.InetUtils
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import systems.abacus.eurekastackaws.core.config.testing.BeanImportConfigTester

class EurekaAwsStackAutoConfiguration {
    @Bean
    @Profile("aws")
    fun eurekaInstanceConfig(inetUtils: InetUtils): EurekaInstanceConfigBean {
        val b = EurekaInstanceConfigBean(inetUtils)
        val info = AmazonInfo.Builder.newBuilder().autoBuild("eureka")
        b.dataCenterInfo = info
        return b
    }

    @Bean
    @Profile("test")
    fun instanceConfig(inetUtils: InetUtils): EurekaInstanceConfigBean {
        return EurekaInstanceConfigBean(inetUtils)
    }

    @Bean
    @Profile("test")
    fun testBean(): BeanImportConfigTester {
        return BeanImportConfigTester()
    }
}