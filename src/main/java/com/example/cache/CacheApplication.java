package com.example.cache;

import com.example.cache.movie.MovieDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@Slf4j
public class CacheApplication implements CommandLineRunner {

    @Autowired
    MovieDao movieDao;

    public static void main(String[] args) {
	SpringApplication.run(CacheApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//	log.info("Result : {}", movieDao.findByDirector("dummy"));
//	log.info("Result : {}", movieDao.findByDirector("dummy"));
//	log.info("Result : {}", movieDao.findByDirector("dummy"));
    }


}
