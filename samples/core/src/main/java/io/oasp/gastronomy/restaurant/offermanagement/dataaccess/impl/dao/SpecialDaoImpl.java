package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import static com.querydsl.core.alias.Alias.$;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import javax.inject.Named;

import org.hibernate.mapping.List;

import com.querydsl.core.alias.Alias;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.jpa.impl.JPAQuery;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.OfferDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;

/**
 * Implementation of {@link OfferDao}.
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  /**
   * The constructor.
   */

  public SpecialDaoImpl() {

    super();
  }

  @Override
  public Class<SpecialEntity> getEntityClass() {

    return SpecialEntity.class;
  }

  @Override
  public List<SpecialEntity> findActiveSpecials(SpecialSearchCriteriaTo criteria) {

    SpecialEntity special = Alias.alias(SpecialEntity.class);
    WeeklyPeriodEmbeddable weeklyPeriodEmbeddable = Alias.alias(WeeklyPeriodEmbeddable.class);

    EntityPathBase<SpecialEntity> alias = $(special);
    JPAQuery<SpecialEntity> query = new JPAQuery<SpecialEntity>(getEntityManager()).from(alias);

    String name = criteria.getName();
    if (name != null) {
      query.where($(special.getName()).eq(name));
    }

    Long offerNumber = criteria.getOfferNumber();
    if (offerNumber != null) {
      query.where($(special.getOffer().getNumber()).eq(offerNumber));
    }

    LocalDateTime dateOfChecking = criteria.getDateOfChecking();
    DayOfWeek currentDayOfweek = dateOfChecking.getDayOfWeek();
    int currentHour = dateOfChecking.getHour();

    buildQueryForDateInActivePeriod(currentDayOfweek, currentHour, special, query);

    return query.fetch();
    return null;
  }

}
