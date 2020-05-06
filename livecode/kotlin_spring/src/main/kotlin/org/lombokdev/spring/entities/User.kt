package org.lombokdev.spring.entities

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*
import kotlin.jvm.Transient


@Entity
data class User(
    @Id @GeneratedValue var id: Long? = null,
    var username: String? = null,
    var email: String? = null,
    var phone: String? = null,
    @Transient
    var password: String? = null
)

interface UserRepository: JpaRepository<User, Long> {
    fun findByEmail(email: String): User

}