package com.quickstart.consumer

import com.quickstart.user.model.User
import jakarta.enterprise.context.ApplicationScoped
import java.util.concurrent.CompletionStage
import org.eclipse.microprofile.reactive.messaging.Incoming
import org.eclipse.microprofile.reactive.messaging.Message
import org.slf4j.LoggerFactory

@ApplicationScoped
class UserConsumer {
    @Incoming("user-event")
    fun consume(
        message: Message<User>
    ) : CompletionStage<Void> {

        message.payload.also { logger.info("Created user: $it") }
        return message.ack()
    }

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }
}