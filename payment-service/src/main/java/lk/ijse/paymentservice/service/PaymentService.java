package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.entity.Payment;
import lk.ijse.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    // Save Payment
    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }

    // Get All Payments
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    // Get Payment By Id
    public Payment getPaymentById(Long id){
        return paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment Not Found"));
    }

    // Update Payment
    public Payment updatePayment(Long id, Payment payment){

        Payment existingPayment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment Not Found"));

        existingPayment.setVehicleNumber(payment.getVehicleNumber());
        existingPayment.setAmount(payment.getAmount());
        existingPayment.setPaymentMethod(payment.getPaymentMethod());
        existingPayment.setPaymentStatus(payment.getPaymentStatus());
        existingPayment.setPaymentDate(payment.getPaymentDate());

        return paymentRepository.save(existingPayment);
    }

    // Delete Payment
    public String deletePayment(Long id){

        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment Not Found"));

        paymentRepository.delete(payment);

        return "Payment Deleted Successfully";
    }
}