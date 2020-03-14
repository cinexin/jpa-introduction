package org.cinexin.learning.jpa.jpaintroduction.cli

import org.cinexin.learning.jpa.jpaintroduction.domain.User
import org.cinexin.learning.jpa.jpaintroduction.repository.UserRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class UserRepositoryCommandLineRunner(private val userRepository: UserRepository): CommandLineRunner {

    private final val logger: Logger = LoggerFactory.getLogger(this::class.java)

    override fun run(vararg args: String?) {
        val user = User("cinexin", "USER")
        userRepository.save(user)
        logger.info("Inserted user: $user")
        userRepository.findById(1L).ifPresent {
            logger.info ("Retrieved user: $it")
        }
        logger.info("All users list: ${userRepository.findAll()}")
    }
}