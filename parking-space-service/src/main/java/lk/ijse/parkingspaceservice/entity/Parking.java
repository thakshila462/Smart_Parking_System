package lk.ijse.parkingspaceservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String slotNumber;

    private String vehicleNumber;

    private String status;

    private String entryTime;

    private String exitTime;
}