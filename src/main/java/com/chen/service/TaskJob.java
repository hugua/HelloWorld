package com.chen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by cvter on 2017/6/6.
 */
@Component("taskJob")
public class TaskJob {
    Logger LOGGER = LoggerFactory.getLogger(TaskJob.class);
    @Scheduled(cron = "0 24 09 * * ?")
    public void job1() {
        LOGGER.debug("任务进行中。。。");
    }
}