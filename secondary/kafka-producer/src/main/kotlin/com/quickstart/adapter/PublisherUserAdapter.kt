package com.quickstart.adapter

import com.quickstart.user.model.User
import com.quickstart.user.ports.secondary.PublisherUserPort
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import org.eclipse.microprofile.reactive.messaging.Message
import org.jboss.logging.Logger
import org.slf4j.LoggerFactory

@ApplicationScoped
class PublisherUserAdapter(
    @Channel("user-event")
    private val producer: Emitter<User>,

) : PublisherUserPort {
    override fun invoke(user: User) {

        runCatching { producer.send(user) }
            .onFailure { logger.error("Error sending message: ${it.message}", it)}
            .onSuccess { logger.info("Message sent successfully: $user") }
    }

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }
}