package lk.ijse.parkingspaceservice.service;

import lk.ijse.parkingspaceservice.entity.Parking;
import lk.ijse.parkingspaceservice.repository.ParkingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParkingService {

    private final ParkingRepository parkingRepository;

    // Save Parking
    public Parking saveParking(Parking parking) {
        return parkingRepository.save(parking);
    }

    // Get All Parkings
    public List<Parking> getAllParkings() {
        return parkingRepository.findAll();
    }

    // Get Parking By Id
    public Parking getParkingById(Long id) {
        return parkingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking Not Found"));
    }

    // Update Parking
    public Parking updateParking(Long id, Parking parking) {

        Parking existingParking = parkingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking Not Found"));

        existingParking.setSlotNumber(parking.getSlotNumber());
        existingParking.setVehicleNumber(parking.getVehicleNumber());
        existingParking.setStatus(parking.getStatus());
        existingParking.setEntryTime(parking.getEntryTime());
        existingParking.setExitTime(parking.getExitTime());

        return parkingRepository.save(existingParking);
    }

    // Delete Parking
    public String deleteParking(Long id) {

        Parking parking = parkingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking Not Found"));

        parkingRepository.delete(parking);

        return "Parking Deleted Successfully";
    }
}