package org.cinexin.learning.jpa.jpaintroduction.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @Id
        @GeneratedValue
        val id: Long? = null,

        val name: String,

        val role: String
) {
    constructor():
            this(null, "user-name", "user-role")

    constructor(name: String, role: String):
            this(null, name, role)
}