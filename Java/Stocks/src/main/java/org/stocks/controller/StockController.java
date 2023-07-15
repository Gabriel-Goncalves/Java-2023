package org.stocks.controller;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;
import lombok.NoArgsConstructor;
import org.stocks.dto.responses.MyStocksResponse;
import org.stocks.service.implemantation.StockService;

@Singleton
@NoArgsConstructor
public class StockController {

  @Inject
  private final StockService stockService = new StockService();

  public MyStocksResponse getStocks(final Context ctx) {
    MyStocksResponse myStocksResponse = stockService.getStocks(ctx);
    ctx.status(HttpStatus.CREATED);
    return myStocksResponse;
  }
}
