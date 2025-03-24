package com.quickstart

import io.quarkus.runtime.StartupEvent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes
import org.slf4j.LoggerFactory

@ApplicationScoped
class MainApplication {
    fun onStartup(@Observes event: StartupEvent) {
        logger.info("A aplicação Quarkus está iniciando a partir do módulo main...")
    }

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }
}