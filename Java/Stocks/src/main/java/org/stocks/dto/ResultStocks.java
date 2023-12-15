package org.stocks.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultStocks {
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("shortName")
    @Expose
    public String shortName;
    @SerializedName("longName")
    @Expose
    public String longName;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("regularMarketPrice")
    @Expose
    public Double regularMarketPrice;
    @SerializedName("regularMarketDayHigh")
    @Expose
    public Double regularMarketDayHigh;
    @SerializedName("regularMarketDayLow")
    @Expose
    public Double regularMarketDayLow;
    @SerializedName("regularMarketDayRange")
    @Expose
    public String regularMarketDayRange;
    @SerializedName("regularMarketChange")
    @Expose
    public Double regularMarketChange;
    @SerializedName("regularMarketChangePercent")
    @Expose
    public Double regularMarketChangePercent;
    @SerializedName("regularMarketTime")
    @Expose
    public String regularMarketTime;
    @SerializedName("regularMarketPreviousClose")
    @Expose
    public Double regularMarketPreviousClose;
    @SerializedName("regularMarketOpen")
    @Expose
    public Double regularMarketOpen;
    @SerializedName("priceEarnings")
    @Expose
    public Double priceEarnings;
    @SerializedName("earningsPerShare")
    @Expose
    public Double earningsPerShare;
    @SerializedName("logourl")
    @Expose
    public String logourl;
}
