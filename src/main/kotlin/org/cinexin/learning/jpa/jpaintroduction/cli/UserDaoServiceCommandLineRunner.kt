package org.cinexin.learning.jpa.jpaintroduction.cli

import org.cinexin.learning.jpa.jpaintroduction.domain.User
import org.cinexin.learning.jpa.jpaintroduction.service.UserDaoService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class UserDaoServiceCommandLineRunner(private val userDaoService: UserDaoService): CommandLineRunner {

    private final val logger: Logger = LoggerFactory.getLogger(this::class.java)

    override fun run(vararg args: String?) {
        val user = User(name = "root", role = "ADMIN")
        userDaoService.insert(user)
        logger.info("Inserted user: $user")
    }
}