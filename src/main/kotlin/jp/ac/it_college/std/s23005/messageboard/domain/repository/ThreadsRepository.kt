package jp.ac.it_college.std.s23005.messageboard.domain.repository

import jp.ac.it_college.std.s23005.message.board.domain.model.ThreadsWithUser
import java.time.LocalDate

interface ThreadsRepository {
    fun findAllWithThreads(): List<ThreadsWithUser>
    fun update(id: Long, title: String?, creator: String?, releaseDate: LocalDate)
    fun delete(id: Long, userId: Long)
}
