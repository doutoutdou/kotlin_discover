package com.doutoutdou.kotlindiscover

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDiscoverApplication

fun main(args: Array<String>) {
	runApplication<KotlinDiscoverApplication>(*args)
}
