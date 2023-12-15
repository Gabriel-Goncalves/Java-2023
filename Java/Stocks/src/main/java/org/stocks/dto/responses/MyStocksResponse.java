package org.stocks.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyStocksResponse {
  private List<MyStocks> myStocks;
  private String requestDateTime;
  private String requestDate;
  private String requestTime;

  @Getter
  @Setter
  public static class MyStocks {
//    @JsonProperty("stock_code")
    private String stockCode;
    private String stockName;
    private String actualPrice;
    private String openDayValue;
    private String urlStockLogo;
//  private
  }
}


