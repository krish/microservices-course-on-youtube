package lk.codelabs.rentcloud.rentprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 17-October-2019 01:23
 * @Project rent-process-task
 */

public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    RentProcessService rentProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length>0) {
            System.out.println("task running with arguments");

            if (rentProcessService.validateDL(args[0])) {
                System.out.println("valid driving license");
            } else
                System.out.println("invalid driving license");
        }else
            System.out.println("task running without arguments");


    }
}
