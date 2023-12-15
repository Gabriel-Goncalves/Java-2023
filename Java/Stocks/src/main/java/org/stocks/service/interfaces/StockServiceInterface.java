package org.stocks.service.interfaces;

import io.javalin.http.Context;
import org.stocks.dto.responses.MyStocksResponse;

public interface StockServiceInterface {
  MyStocksResponse getStocks(Context ctx);
}
