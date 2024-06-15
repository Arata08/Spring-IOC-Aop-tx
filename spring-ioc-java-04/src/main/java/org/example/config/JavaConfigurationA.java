package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description: 配置类
 */

@Import(value = {JavaConfigurationB.class})
@Configuration
public class JavaConfigurationA {
}