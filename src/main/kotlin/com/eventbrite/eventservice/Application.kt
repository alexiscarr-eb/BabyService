package com.eventbrite.eventservice

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.eventbrite.eventservice")
		.start()
}

