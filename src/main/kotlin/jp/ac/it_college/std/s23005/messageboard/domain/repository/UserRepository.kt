package jp.ac.itcollege.s23005.messageboard.domain.repository

import jp.ac.itcollege.s23005.messageboard.domain.model.User

interface UserRepository {
    fun find(email: String): User?
    fun find(id: Long): User?
}