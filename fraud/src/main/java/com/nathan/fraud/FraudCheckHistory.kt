package com.nathan.fraud

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDateTime
import javax.persistence.*

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
class FraudCheckHistory(@Id @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence"),

                        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_sequence")
                        private val id: Int? = null
        private val customerId: Int? = null
        private val isFraudster: Boolean? = null
        private val createdAt: LocalDateTime? = null) {

}