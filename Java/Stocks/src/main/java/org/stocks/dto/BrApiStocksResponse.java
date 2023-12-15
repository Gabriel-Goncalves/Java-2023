package org.stocks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BrApiStocksResponse {
    @SerializedName("results")
    @Expose
    public List<ResultStocks> results;
    @SerializedName("requestedAt")
    @Expose
    public String requestedAt;
}
