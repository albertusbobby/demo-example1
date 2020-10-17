package com.example.demoexample1.service;

import com.example.demoexample1.entity.LogTransaction;
import com.example.demoexample1.entity.UserApp;
import com.example.demoexample1.repository.LogTransactionRepository;
import com.example.demoexample1.repository.UserAppRepository;
import com.example.demoexample1.response.UserAppResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;

@Service
@Log4j2
public class GetUserAppService {

    private UserAppRepository userAppRepository;
    private LogTransactionRepository logTransactionRepository;

    public GetUserAppService(UserAppRepository userAppRepository, LogTransactionRepository logTransactionRepository) {
        this.userAppRepository = userAppRepository;
        this.logTransactionRepository = logTransactionRepository;
    }

    public UserAppResponse getUserApp(Long id) {
        Optional<UserApp> userApp = userAppRepository.findById(id);

        if(userApp.isPresent()){
            log.info("data is present");

            Timestamp now = new Timestamp(System.currentTimeMillis());
            log.info("data now: {}", now);

            logTransactionRepository.save(
                    LogTransaction.builder()
                        .type("user-app")
                        .createdDate(now)
                        .updatedDate(now)
                        .build()
                    );

            return UserAppResponse.builder()
                    .id(userApp.get().getId())
                    .description(userApp.get().getDescription())
                    .name(userApp.get().getName())
                    .build();
        }
        log.info("data is empty");
        return UserAppResponse.builder().build();

    }
}
