package org.stocks.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class StockUtils {
  public static DateAndTime getTimeFromDateTime(final String dateTime ) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);

    DateTimeFormatter finalFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    String finalDate = localDateTime.format(finalFormatter);

    String time = finalDate.split(" ")[1];

    String date = finalDate.split(" ")[0];

    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    LocalTime localTime = LocalTime.parse(time, timeFormatter);

    ZoneId zoneId = ZoneId.of("UTC-3");

    ZonedDateTime zonedDateTime = ZonedDateTime.of(localTime.atDate(LocalDate.now()), zoneId);

    return DateAndTime.builder().date(date).time(zonedDateTime.toString()).build();
  }
}
