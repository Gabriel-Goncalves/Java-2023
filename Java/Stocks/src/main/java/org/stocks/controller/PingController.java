package org.stocks.controller;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;

public abstract class PingController {

    public static String getPing() {
        return "pong";
    }
}
