package lk.codelabs.rentcloud.rentservice.model;

import lk.codelabs.rentcloud.model.rent.Rent;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 22-October-2019 23:25
 * @Project rent-service
 */
public class SimpleResponse implements Response {

    Rent rent;


    public SimpleResponse(Rent rent) {
        this.rent = rent;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
