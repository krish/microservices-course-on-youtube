package lk.codelabs.rentcloud.rentservice.service;

import lk.codelabs.rentcloud.model.customer.Customer;
import lk.codelabs.rentcloud.model.rent.Rent;
import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import lk.codelabs.rentcloud.rentservice.model.DetailResponse;
import lk.codelabs.rentcloud.rentservice.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:33
 * @Project rentcloudmodel
 */
@Service
public class RentServiceImpl implements RentService {


    @Autowired
    RentRepository rentRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }


    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }


    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {


        Rent rent=findById(id);
        Customer customer=getCustomer(rent.getCustomerId());
        Vehicle vehicle= getVehicle(rent.getVehicleId());

        return new DetailResponse(rent,customer,vehicle);


    }

    private Customer getCustomer(int customerId){

        Customer customer=restTemplate.getForObject("http://localhost:8080/services/customers/"+customerId,Customer.class);
        return customer;

    }

    private Vehicle getVehicle(int vehicleId){

       return restTemplate.getForObject("http://localhost:9191/services/vehicles/"+vehicleId,Vehicle.class);


    }
}
