package jp.ac.it_college.std.s23005.messageboard.domain.repository

import jp.ac.it_college.std.s23005.message.board.domain.model.MessageWithThreads
import jp.ac.itcollege.s23005.messageboard.domain.model.User
import java.time.LocalDateTime

interface MessageRepository {
    fun findAllWithThreads(): List<MessageWithThreads>
    fun update(id: Long, thread: Thread, user: User, message:String, postedAt: LocalDateTime, updatedAt: LocalDateTime, deletedAt:Boolean): Boolean
    fun delete(id: Long): Boolean
}
