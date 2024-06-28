package jp.ac.it_college.std.s23005.message.board.domain.model

data class ThreadsWithUser(
    val id:Long,
    val title: String,
    val userId: Long,
    val username: String,
    val createdAt: kotlinx.datetime.LocalDateTime,
    val updatedAt: kotlinx.datetime.LocalDateTime,
    val deleted: Boolean
)
