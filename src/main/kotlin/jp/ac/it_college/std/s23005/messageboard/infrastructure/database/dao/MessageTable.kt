package jp.ac.it_college.std.s23005.messageboard.infrastructure.database.dao

import jp.ac.it_college.std.s23005.message.board.infrastructure.database.dao.ThreadsTable
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.CurrentDateTime
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object MessageTable : LongIdTable("message") {
    val thread = reference("thread_id", ThreadsTable)
    val user = reference("user_id", UserTable)
    val message = text("message")
    val postedAt = datetime("posted_at").defaultExpression(CurrentDateTime)
    val updatedAt = datetime("updated_at").defaultExpression(CurrentDateTime)
    val deleted = bool("deleted").default(false)
}
