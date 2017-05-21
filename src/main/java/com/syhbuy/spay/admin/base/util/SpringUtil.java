package com.syhbuy.spay.admin.base.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * Created by Administrator on 2016/8/19.
 */
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        SpringUtil.applicationContext = context;
    }
    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }
}
