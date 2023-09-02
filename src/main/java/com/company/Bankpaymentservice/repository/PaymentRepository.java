package com.company.Bankpaymentservice.repository;

import com.company.Bankpaymentservice.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer> {
    Optional<Payment> findByPaymentIdAndDeletedAtIsNull(Integer id);
    Optional<Payment> findByLoanIdAndDeletedAtIsNull(Integer id);
}
