package jp.ac.itcollege.s23005.messageboard.domain.model

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val password: String
)