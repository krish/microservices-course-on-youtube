package lk.codelabs.rentcloud.model.customer;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-October-2019 16:24
 * @Project rentcloudmodel
 */


@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipcode;
    @OneToMany(mappedBy = "customer")
    private List<Loyality> loyalities;


}
