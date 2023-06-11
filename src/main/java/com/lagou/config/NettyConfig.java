package com.lagou.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: NettyConfig
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-06-11 下午7:34   @Version 1.0        描述
 */

@Component
@ConfigurationProperties(prefix = "netty")
@Data
public class NettyConfig {

    private int port;//netty监听的端口

    private String path;//websocket访问路径

}
