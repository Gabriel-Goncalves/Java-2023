package org.stocks.utils;

import lombok.*;

@Getter
@Builder
@Setter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class DateAndTime {
  private String date;
  private String time;
}
