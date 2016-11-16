package com.volshell.classmates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by volshell on 16-11-16.
 */
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.error("nice to meet you {},now is {}","volshell",new Date());
    }
}
