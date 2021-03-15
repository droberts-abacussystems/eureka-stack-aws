package systems.abacus.eurekastackaws.core.config

import com.netflix.appinfo.AmazonInfo
import org.springframework.cloud.commons.util.InetUtils
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile

/**
 * Eureka aws stack auto configuration settings - Use annotation EnableEurekaAws
 * @author Dave Roberts
 * @since 1.0.0
 */
class EurekaAwsStackAutoConfiguration {
    /**
     * Base configuration for use within AWS
     * @param inetUtils InetUtils - The [InetUtils] to inject into the instance
     * @return EurekaInstanceConfigBean
     */
    @Bean
    @Profile("aws")
    fun eurekaInstanceConfig(inetUtils: InetUtils): EurekaInstanceConfigBean {
        val b = EurekaInstanceConfigBean(inetUtils)
        val info = AmazonInfo.Builder.newBuilder().autoBuild("eureka")
        b.dataCenterInfo = info
        return b
    }
}