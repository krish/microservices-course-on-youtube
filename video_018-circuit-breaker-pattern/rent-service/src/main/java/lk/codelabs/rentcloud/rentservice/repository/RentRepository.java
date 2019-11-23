package lk.codelabs.rentcloud.rentservice.repository;

import lk.codelabs.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:32
 * @Project rentcloudmodel
 */
public interface RentRepository extends JpaRepository<Rent,Integer> {
}
