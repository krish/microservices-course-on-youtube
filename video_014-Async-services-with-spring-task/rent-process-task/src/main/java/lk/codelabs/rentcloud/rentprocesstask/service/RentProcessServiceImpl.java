package lk.codelabs.rentcloud.rentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 17-October-2019 01:22
 * @Project rent-process-task
 */
@Service
public class RentProcessServiceImpl implements RentProcessService {



    @Override
    public boolean validateDL(String dlNumber) {
        return dlNumber.length() > 5;
    }

}
