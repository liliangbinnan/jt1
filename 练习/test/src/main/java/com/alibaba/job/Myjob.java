package com.alibaba.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Myjob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("测试quartz"+simpleDateFormat.format(nowDate));
        System.out.println("测试的类名：\t"+jobExecutionContext.getJobDetail().getJobClass().getName());
        System.out.println("测试的组名： \t" +jobExecutionContext.getTrigger().getKey().getGroup());
    }
}
