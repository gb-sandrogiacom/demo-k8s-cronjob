package br.com.blz.demo.k8s

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoK8sCronjobApplication : CommandLineRunner {

	override fun run(vararg args: String?) {
		println("Job is starting...")
		for (i in 1..10) {
			Thread.sleep(1000)
			println("Job is running...")
		}
		println("Job is done!")
	}
}

fun main(args: Array<String>) {
	runApplication<DemoK8sCronjobApplication>(*args)
}

