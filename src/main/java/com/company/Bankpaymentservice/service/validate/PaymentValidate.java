package com.company.Bankpaymentservice.service.validate;

import com.company.Bankpaymentservice.dto.ErrorDto;
import com.company.Bankpaymentservice.dto.PaymentDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaymentValidate {
    public List<ErrorDto> validate(PaymentDto dto) {
        List<ErrorDto>errors=new ArrayList<>();
        return errors;
    }
}
