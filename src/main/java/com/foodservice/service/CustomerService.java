package com.foodservice.service;

import com.foodservice.entity.dto.*;
import jakarta.validation.constraints.Min;

import java.util.List;

public interface CustomerService {
    CustomerDTO getCustomerById(Integer customerId);

    List<CustomerDTO> getAllCustomers(Integer page , Integer size);

    Integer getAddressCount(Integer customerId);

    CustomerAnalyticsDTO getCustomerAnalytics(Integer customerId);

    List<OrderItemDetailDTO> getOrdersByCustomerId(Integer customerId);

    List<DeliveryAddressDTO> getAddressesByCustomerId(Integer customerId);

    List<CustomerDTO> getCustomersByCity(String city, @Min(0) Integer page, @Min(1) Integer size);
}