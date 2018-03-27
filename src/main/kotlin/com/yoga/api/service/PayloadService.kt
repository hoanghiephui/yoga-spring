package com.yoga.api.service

import com.yoga.api.entiry.Payload
import com.yoga.api.entiry.Response

interface PayloadService {
    fun showPoses(slug: String): Payload
}