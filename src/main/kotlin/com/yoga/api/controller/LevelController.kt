package com.yoga.api.controller

import com.yoga.api.entiry.ErrorDetails
import com.yoga.api.entiry.Response
import com.yoga.api.service.LevelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
class LevelController {
    private val SUCCESS_STATUS = "success"
    private val ERROR_STATUS = "error"
    private val CODE_SUCCESS = 100
    private val AUTH_FAILURE = 102

    @Autowired
    lateinit var levelService: LevelService

    @RequestMapping("/levels")
    @ResponseStatus(HttpStatus.OK)
    fun findAllLevel(): Response {
        return levelService.findAll()
    }

    @RequestMapping(value = ["/"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun sendViaResponseEntity(): ResponseEntity<ErrorDetails> {
        return ResponseEntity(HttpStatus.NOT_FOUND)
    }
}