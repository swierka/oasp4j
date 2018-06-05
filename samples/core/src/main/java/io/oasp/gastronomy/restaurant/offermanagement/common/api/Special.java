package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;

/**
 * @author ASWIERKO
 *
 */
public interface Special extends ApplicationEntity {

  public void setName(String name);

  public OfferEntity getOffer();

  public void setOffer(OfferEntity offer);

  public WeeklyPeriodEmbeddableInterface getActivePeriod();

  public void setActivePeriod(WeeklyPeriodEmbeddableInterface activePeriod);

  public Money getSpecialPrice();

  public void setSpecialPrice(Money specialPrice);

}
