package org.stocks.module;

import com.google.inject.AbstractModule;
import org.stocks.controller.PingController;

public class StockModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PingController.class).to(PingController.class);
    }
}
