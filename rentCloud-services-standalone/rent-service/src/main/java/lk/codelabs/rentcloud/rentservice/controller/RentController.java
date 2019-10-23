package lk.codelabs.rentcloud.rentservice.controller;

import lk.codelabs.rentcloud.model.rent.Rent;
import lk.codelabs.rentcloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:36
 * @Project rentcloudmodel
 */
@RestController
@RequestMapping("/services/rents")
public class RentController {


    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Rent getRent(@PathVariable int id) {
        return rentService.findById(id);
    }

    @GetMapping
    public List<Rent> getAllRents(@PathVariable int id) {
        return rentService.findAll();
    }

    @RequestMapping("/test")
    public Rent test() {
        Rent r = new Rent();
        r.setCustomerId(1);
        r.setCurrentOdometer(1223);
        r.setRentFrom(LocalDateTime.now());
        r.setRentTill(LocalDateTime.of(2019, 12, 31, 00, 00, 00));
        r.setReturnLocation("Colombo");
        r.setVehicleId(1);

        return r;

    }
}
