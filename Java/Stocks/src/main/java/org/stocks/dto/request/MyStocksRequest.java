package org.stocks.dto.request;

import lombok.Getter;

import java.util.List;

@Getter
public class MyStocksRequest {
  private List<String> stocks;
}
