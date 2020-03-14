package org.cinexin.learning.jpa.jpaintroduction.service

import org.cinexin.learning.jpa.jpaintroduction.domain.User
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Repository
@Transactional
class UserDaoServiceImpl(private val entityManager: EntityManager): UserDaoService {

    override fun insert(user: User): Long {
        // Open transaction
        entityManager.persist(user)
        // Close transaction
        return user.id ?: 0L
    }
}