package org.cinexin.learning.jpa.jpaintroduction.repository

import org.cinexin.learning.jpa.jpaintroduction.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>