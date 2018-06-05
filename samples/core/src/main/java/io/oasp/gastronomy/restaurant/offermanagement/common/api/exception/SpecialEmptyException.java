package io.oasp.gastronomy.restaurant.offermanagement.common.api.exception;

import io.oasp.gastronomy.restaurant.general.common.api.NlsBundleApplicationRoot;
import io.oasp.gastronomy.restaurant.general.common.api.exception.ApplicationBusinessException;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

/**
 * @author ASWIERKO
 *
 */
public class SpecialEmptyException extends ApplicationBusinessException {

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  /**
   * The constructor.
   *
   * @param offer is the empty {@link Offer}.
   */
  public SpecialEmptyException(Special special) {

    super(createBundle(NlsBundleApplicationRoot.class).errorOfferEmpty());
  }

}
