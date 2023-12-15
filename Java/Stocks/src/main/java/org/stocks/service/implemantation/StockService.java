package org.stocks.service.implemantation;

import com.google.inject.Singleton;
import io.javalin.http.Context;
import lombok.NoArgsConstructor;
import org.stocks.dao.BrAPI;
import org.stocks.dto.BrApiStocksResponse;
import org.stocks.dto.request.MyStocksRequest;
import org.stocks.dto.responses.MyStocksResponse;
import org.stocks.mapper.StockMapper;
import org.stocks.mapper.StockMapperImp;
import org.stocks.service.interfaces.StockServiceInterface;
import org.stocks.utils.DateAndTime;
import org.stocks.utils.StockUtils;

@Singleton
@NoArgsConstructor
public class StockService implements StockServiceInterface {

  public MyStocksResponse getStocks(final Context ctx) {

    MyStocksRequest myStocksRequest = ctx.bodyAsClass(MyStocksRequest.class);

    StockMapperImp mapper = new StockMapperImp();

    BrApiStocksResponse brApiStocksResponse = BrAPI.brApiDao(myStocksRequest.getStocks());

    MyStocksResponse myStocksResponse = mapper.toMyStocksResponse(brApiStocksResponse);

    DateAndTime dateAndTime = StockUtils.getTimeFromDateTime(myStocksResponse.getRequestDateTime());

    myStocksResponse.setRequestDate(dateAndTime.getDate());
    myStocksResponse.setRequestTime(dateAndTime.getTime());

    return myStocksResponse;
  }
}
