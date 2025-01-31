package org.koreait.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestJob {

    //@Scheduled(fixedRate = 3L, timeUnit = TimeUnit.SECONDS) // 3초마다 실행
    public void testScheduling() {
      log.info("3초 마다 실행!");
    }
}
