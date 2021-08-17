package com.example.jwt.util;

import org.slf4j.Logger;

public class AElog {

    public static void println1(String msg) {
        System.out.println(msg);
    }

    public static void println2(String msg) {
        System.out.println(msg);
    }

    public static void println3(String msg) {
        System.out.println(msg);
    }

    // --------------------------- DEBUG ---------------------------
    public static synchronized void debug1(Logger logger, String msg) {
        logger.debug(msg);
    }

    public static synchronized void debug1(Logger logger, String msg, Throwable t) {
        logger.debug(msg, t);
    }

    public static synchronized void debug2(Logger logger, String msg) {
        logger.debug(msg);
    }

    public static synchronized void debug2(Logger logger, String msg, Throwable t) {
        logger.debug(msg, t);
    }

    public static synchronized void debug3(Logger logger, String msg) {
        logger.debug(msg);
    }

    public static synchronized void debug3(Logger logger, String msg, Throwable t) {
        logger.debug(msg, t);
    }

    // --------------------------- INFO ---------------------------
    public static synchronized void info1(Logger logger, String msg) {
        logger.info(msg);
    }

    public static synchronized void info1(Logger logger, String msg, Throwable t) {
        logger.info(msg, t);
    }

    public static synchronized void info2(Logger logger, String msg) {
        logger.info(msg);
    }

    public static synchronized void info2(Logger logger, String msg, Throwable t) {
        logger.info(msg, t);
    }

    public static synchronized void info3(Logger logger, String msg) {
        logger.info(msg);
    }

    public static synchronized void info3(Logger logger, String msg, Throwable t) {
        logger.info(msg, t);
    }

    // --------------------------- WARNING ---------------------------
    public static synchronized void warn1(Logger logger, String msg) {
        logger.warn(msg);
    }

    public static synchronized void warn1(Logger logger, String msg, Throwable t) {
        logger.warn(msg, t);
    }

    public static synchronized void warn2(Logger logger, String msg) {
        logger.warn(msg);
    }

    public static synchronized void warn2(Logger logger, String msg, Throwable t) {
        logger.warn(msg, t);
    }

    public static synchronized void warn3(Logger logger, String msg) {
        logger.warn(msg);
    }

    public static synchronized void warn3(Logger logger, String msg, Throwable t) {
        logger.warn(msg, t);
    }

    // --------------------------- ERROR ---------------------------
    public static synchronized void error1(Logger logger, String msg) {
        logger.error(msg);
    }

    public static synchronized void error1(Logger logger, String msg, Throwable t) {
        logger.error(msg, t);
    }

    public static synchronized void error2(Logger logger, String msg) {
        logger.error(msg);
    }

    public static synchronized void error2(Logger logger, String msg, Throwable t) {
        logger.error(msg, t);
    }

    public static synchronized void error3(Logger logger, String msg) {
        logger.error(msg);
    }

    public static synchronized void error3(Logger logger, String msg, Throwable t) {
        logger.error(msg, t);
    }
}
