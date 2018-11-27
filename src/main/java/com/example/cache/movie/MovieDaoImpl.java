package com.example.cache.movie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

    @Override
    @Cacheable(value="movieFindCache", key="#name", condition = "#name.equals('dummy')")
    public Movie findByDirector(String name) {
	slowQuery(2000L);
	log.info("findByDirector is running... " + name);
	return new Movie(1, name,"Director");
    }

    private void slowQuery(long seconds){
	try {
	    Thread.sleep(seconds);
	} catch (InterruptedException e) {
	    throw new IllegalStateException(e);
	}
    }

}
