package org.stocks.mapper;

import org.stocks.dto.BrApiStocksResponse;
import org.stocks.dto.ResultStocks;
import org.stocks.dto.responses.MyStocksResponse;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StockMapperImp implements StockMapper{

  @Override
  public MyStocksResponse toMyStocksResponse(BrApiStocksResponse brApiStocksResponse) {
    if(brApiStocksResponse == null) return null;

    MyStocksResponse myStocksResponse = new MyStocksResponse();

    myStocksResponse.setRequestDateTime( brApiStocksResponse.getRequestedAt() );
    myStocksResponse.setMyStocks(resultStocksToMyStocks(brApiStocksResponse.results));

    return myStocksResponse;
  }

  protected MyStocksResponse.MyStocks stocksResponseListToMyStocksList(ResultStocks resultStocks) {
    if(resultStocks == null) return null;

    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    MyStocksResponse.MyStocks myStocks = new MyStocksResponse.MyStocks();

    myStocks.setStockCode( resultStocks.getSymbol() );
//    myStocks.setStockName(resultStocks.getLongName().substring(0, resultStocks.getLongName().indexOf("S.A.") - 1));
    myStocks.setStockName(resultStocks.getLongName());
    myStocks.setActualPrice(String.format("R$ %s", decimalFormat.format(resultStocks.getRegularMarketPrice())));
    myStocks.setOpenDayValue(String.format("R$ %s", decimalFormat.format(resultStocks.getRegularMarketOpen())));
    myStocks.setUrlStockLogo(resultStocks.getLogourl());

    return myStocks;
  }

  protected List<MyStocksResponse.MyStocks> resultStocksToMyStocks(List<ResultStocks> resultStocks) {
    if(resultStocks == null) return null;

    List<MyStocksResponse.MyStocks> myStocks = new ArrayList<MyStocksResponse.MyStocks>(resultStocks.size());

    for(ResultStocks rs : resultStocks) {
      myStocks.add(stocksResponseListToMyStocksList(rs));
    }
    return myStocks;
  }
}
