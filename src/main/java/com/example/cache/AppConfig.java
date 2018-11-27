package com.example.cache;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class AppConfig {

    @Bean("cacheManager")
    public CacheManager cacheManager() {
	return new EhCacheCacheManager(ehCacheCacheManager().getObject());
    }

    @Bean("EhCacheManagerFactoryBean")
    public EhCacheManagerFactoryBean ehCacheCacheManager() {
	EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
	cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
	cmfb.setShared(true);
	return cmfb;
    }

}
