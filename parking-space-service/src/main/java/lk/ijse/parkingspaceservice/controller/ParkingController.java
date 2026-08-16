package lk.ijse.parkingspaceservice.controller;

import lk.ijse.parkingspaceservice.entity.Parking;
import lk.ijse.parkingspaceservice.service.ParkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
@RequiredArgsConstructor
public class ParkingController {

    private final ParkingService parkingService;

    @GetMapping("/test")
    public String testEndpoint() {
        return "Parking Service is working successfully!";
    }

    // Save Parking
    @PostMapping
    public Parking saveParking(@RequestBody Parking parking) {
        return parkingService.saveParking(parking);
    }

    // Get All Parkings
    @GetMapping
    public List<Parking> getAllParkings() {
        return parkingService.getAllParkings();
    }

    // Get Parking By Id
    @GetMapping("/{id}")
    public Parking getParkingById(@PathVariable Long id) {
        return parkingService.getParkingById(id);
    }

    // Update Parking
    @PutMapping("/{id}")
    public Parking updateParking(@PathVariable Long id,
                                 @RequestBody Parking parking) {
        return parkingService.updateParking(id, parking);
    }

    // Delete Parking
    @DeleteMapping("/{id}")
    public String deleteParking(@PathVariable Long id) {
        return parkingService.deleteParking(id);
    }
}