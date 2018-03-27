package com.yoga.api.controller

import com.yoga.api.entiry.Payload
import com.yoga.api.service.PayloadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PayloadController {
    @Autowired
    lateinit var payloadService: PayloadService

    @RequestMapping(value = ["content/pose/{slug}"], method = arrayOf(RequestMethod.GET))
    @ResponseStatus(HttpStatus.OK)
    fun getPosesDetail(@PathVariable("slug") slug: String): ResponseEntity<Payload> {
        try {
            val payload = payloadService.showPoses(slug)
            if (payload == null) {
                return ResponseEntity(HttpStatus.NO_CONTENT)
            }
            return ResponseEntity(payload, HttpStatus.OK)
        } catch (ex: Exception) {
            return ResponseEntity(HttpStatus.NO_CONTENT)
        }

    }
}