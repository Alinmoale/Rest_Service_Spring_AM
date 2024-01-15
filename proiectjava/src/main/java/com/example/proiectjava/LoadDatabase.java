package com.example.proiectjava;

import com.example.proiectjava.models.User;
import com.example.proiectjava.models.UserStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading: " + repository.save(new User("Alin", "moalealin15@gmail.com", UserStatus.ACTIVE,true, 21)));
            log.info("Preloading: " +repository.save(new User("Ionut", "ionutcret@yahoo.com", UserStatus.ACTIVE, false, 20)));
            log.info("Preloading: " +repository.save(new User("Andrei", "andreiro@gmail.com", UserStatus.INACTIVE, true, 19)));
        };
    }
}