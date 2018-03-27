package com.yoga.api.entiry

class Response {
    var level: Iterable<Level>? = null
    var payload: Payload? = null
    var errorDeatail: ErrorDetails? = null

    constructor(errorDetails: ErrorDetails, level: Iterable<Level>) {
        this.level = level
        this.errorDeatail = errorDetails
    }

    constructor(payload: Payload, errorDetails: ErrorDetails) {
        this.payload = payload
        this.errorDeatail = errorDeatail
    }
}