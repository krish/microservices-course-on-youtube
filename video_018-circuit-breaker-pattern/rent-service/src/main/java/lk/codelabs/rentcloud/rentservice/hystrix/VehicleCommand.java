package lk.codelabs.rentcloud.rentservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import org.springframework.web.client.RestTemplate;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 13-November-2019 02:32
 * @Project vehicle-service
 */
public class VehicleCommand extends HystrixCommand<Vehicle> {


    RestTemplate restTemplate;
    int vehicleId;



    public VehicleCommand(RestTemplate restTemplate, int vehicleId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate=restTemplate;
        this.vehicleId=vehicleId;
    }


    @Override
    protected Vehicle run() throws Exception {
        return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);
    }

    @Override
    protected Vehicle getFallback() {
        System.out.println("hit on fallback");
        return new Vehicle();
    }
}
