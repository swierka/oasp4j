package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.module.basic.common.api.to.AbstractCto;

/**
 * @author ASWIERKO
 *
 */
public class SpecialCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private SpecialEto specialEto;

  private OfferEto offerEto;

  private WeeklyPeriodEmbeddableEto weeklyPeriodEmbeddableEto;

  /**
   * @return specialEto
   */
  public SpecialEto getSpecialEto() {

    return this.specialEto;
  }

  /**
   * @param specialEto new value of {@link #getspecialEto}.
   */
  public void setSpecialEto(SpecialEto specialEto) {

    this.specialEto = specialEto;
  }

  /**
   * @return offerEto
   */
  public OfferEto getOfferEto() {

    return this.offerEto;
  }

  /**
   * @param offerEto new value of {@link #getofferEto}.
   */
  public void setOfferEto(OfferEto offerEto) {

    this.offerEto = offerEto;
  }

  /**
   * @return weeklyPeriodEmbeddableEto
   */
  public WeeklyPeriodEmbeddableEto getWeeklyPeriodEmbeddableEto() {

    return this.weeklyPeriodEmbeddableEto;
  }

  /**
   * @param weeklyPeriodEmbeddableEto new value of {@link #getweeklyPeriodEmbeddableEto}.
   */
  public void setWeeklyPeriodEmbeddableEto(WeeklyPeriodEmbeddableEto weeklyPeriodEmbeddableEto) {

    this.weeklyPeriodEmbeddableEto = weeklyPeriodEmbeddableEto;
  }

  /**
   * @return serialversionuid
   */
  public static long getSerialversionuid() {

    return serialVersionUID;
  }

}
