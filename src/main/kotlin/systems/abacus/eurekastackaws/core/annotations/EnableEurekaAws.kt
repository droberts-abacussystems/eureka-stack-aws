package systems.abacus.eurekastackaws.core.annotations

import org.springframework.context.annotation.Import
import systems.abacus.eurekastackaws.core.config.EurekaAwsStackAutoConfiguration

/**
 * Enable eureka aws configuration within the project
 *
 * @constructor Enable eureka aws on the project
 * @author Dave Roberts
 * @since 2.0.0
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Import(EurekaAwsStackAutoConfiguration::class)
annotation class EnableEurekaAws