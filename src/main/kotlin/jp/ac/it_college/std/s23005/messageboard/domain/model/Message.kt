package jp.ac.it_college.std.s23005.messageboard.domain.model

import jp.ac.itcollege.s23005.messageboard.domain.model.Threads
import jp.ac.itcollege.s23015.messageboard.domain.model.User
import java.time.LocalDateTime

data class Message(
    val id: Long,
    val thread: Threads,
    val user: User,
    val message: String,
    val postedAt: LocalDateTime,
    var updatedAt: LocalDateTime,
    val deletedAt: Boolean,
)

