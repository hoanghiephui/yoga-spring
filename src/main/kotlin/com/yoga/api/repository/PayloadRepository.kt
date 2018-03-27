package com.yoga.api.repository

import com.yoga.api.entiry.Payload
import org.springframework.data.jpa.repository.JpaRepository

interface PayloadRepository : JpaRepository<Payload, Int> {
}