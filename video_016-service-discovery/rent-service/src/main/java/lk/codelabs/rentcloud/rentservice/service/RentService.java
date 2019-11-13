package lk.codelabs.rentcloud.rentservice.service;

import lk.codelabs.rentcloud.model.rent.Rent;
import lk.codelabs.rentcloud.rentservice.model.DetailResponse;
import lk.codelabs.rentcloud.rentservice.model.Response;

import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:34
 * @Project rentcloudmodel
 */
public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id);
}
