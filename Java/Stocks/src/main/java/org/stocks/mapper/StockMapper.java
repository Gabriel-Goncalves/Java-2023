package org.stocks.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.stocks.dto.BrApiStocksResponse;
import org.stocks.dto.ResultStocks;
import org.stocks.dto.responses.MyStocksResponse;

@Mapper
public interface StockMapper {
  @Mapping(source = "brApiStocksResponse.results", target = "myStocks")
  @Mapping(source = "brApiStocksResponse.requestedAt", target = "requestDateTime")
  MyStocksResponse toMyStocksResponse(BrApiStocksResponse brApiStocksResponse);
}
