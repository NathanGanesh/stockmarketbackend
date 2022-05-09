package com.stockmarketai.customer.model

import javax.persistence.*
import javax.persistence.GenerationType.*

@Entity
data class Customer(
    @Id
    @Column(name = "id_2", nullable = false)
    open var id2: Long? = null,
    private val email: String,
    private val firstName: String,
    private val lastName: String,
) {

//    @SequenceGenerator(
//        name = "customer_id_sequence",
//        sequenceName = "customer_id_sequence"
//    )
//    @GeneratedValue(
//        strategy = SEQUENCE,
//        generator = "customer_id_sequence"
//    ) @Id val id: Int? = null
}
