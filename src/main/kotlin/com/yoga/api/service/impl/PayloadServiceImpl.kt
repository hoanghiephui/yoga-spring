package com.yoga.api.service.impl

import com.yoga.api.entiry.Payload
import com.yoga.api.repository.PayloadRepository
import com.yoga.api.service.PayloadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PayloadServiceImpl : PayloadService {

    @Autowired
    lateinit var payloadRepository: PayloadRepository

    override fun showPoses(slug: String): Payload {
        return payloadRepository.getOne(1)
    }
}