package org.stocks;

import org.stocks.dao.BrAPI;
import org.stocks.router.Router;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    Router router = new Router();
    router.mainRouter();
  }
}