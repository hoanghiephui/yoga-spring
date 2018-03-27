package com.yoga.api.service

import com.yoga.api.entiry.ErrorDetails
import com.yoga.api.entiry.Response
import com.yoga.api.repository.LevelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LevelServiceImpl : LevelService {
    @Autowired
    lateinit var levelRepository: LevelRepository

    override fun findAll(): Response {
        return Response(ErrorDetails(), levelRepository.findAll())
    }
}