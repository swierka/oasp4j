package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.LocalDateTime;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * @author ASWIERKO
 *
 */
public class SpecialSearchCriteriaTo extends SearchCriteriaTo {

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private String name;

  private Long offerNumber;

  private LocalDateTime dateOfChecking;

  public SpecialSearchCriteriaTo() {

    super();
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return offerNumber
   */
  public Long getOfferNumber() {

    return this.offerNumber;
  }

  /**
   * @param offerNumber new value of {@link #getofferNumber}.
   */
  public void setOfferNumber(Long offerNumber) {

    this.offerNumber = offerNumber;
  }

  /**
   * @return dateOfChecking
   */
  public LocalDateTime getDateOfChecking() {

    return this.dateOfChecking;
  }

  /**
   * @param dateOfChecking new value of {@link #getdateOfChecking}.
   */
  public void setDateOfChecking(LocalDateTime dateOfChecking) {

    this.dateOfChecking = dateOfChecking;
  }

}
