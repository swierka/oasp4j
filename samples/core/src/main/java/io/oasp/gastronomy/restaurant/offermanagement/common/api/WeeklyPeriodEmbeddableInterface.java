package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.time.DayOfWeek;

/**
 * @author ASWIERKO
 *
 */
public interface WeeklyPeriodEmbeddableInterface {

  public DayOfWeek getStartingDay();

  public int getStartingHour();

  public void setStartingHour(int startingHour);

  public DayOfWeek getEndingDay();

  public void setEndingDay(DayOfWeek endingDay);

  public int getEndingHour();

  public void setEndingHour(int endingHour);

}
