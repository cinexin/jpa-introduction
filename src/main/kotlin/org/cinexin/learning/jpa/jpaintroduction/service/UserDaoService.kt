package org.cinexin.learning.jpa.jpaintroduction.service

import org.cinexin.learning.jpa.jpaintroduction.domain.User

interface UserDaoService {

    fun insert(user: User): Long
}