package com.stockmarketai.customer

import com.stockmarketai.customer.model.Customer
import org.springframework.stereotype.Service

@Service
class CustomerService {
    fun registerCustomer(customerRegistrationDto: CustomerRegistrationDto){

        val customer: Customer = Customer(email = customerRegistrationDto.email, firstName = customerRegistrationDto.firstName,
                lastName = customerRegistrationDto.lastName)
    }
}