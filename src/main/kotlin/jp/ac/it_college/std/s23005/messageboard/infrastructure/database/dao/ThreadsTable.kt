package jp.ac.it_college.std.s23005.message.board.infrastructure.database.dao

import jp.ac.it_college.std.s23005.messageboard.infrastructure.database.dao.UserTable
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.CurrentDateTime
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object ThreadsTable : LongIdTable("threads") {
    val title = varchar("title", 256)
    val user = reference("user_id", UserTable)
    val createdAt = datetime("created_at").defaultExpression(CurrentDateTime)
    val updatedAt = datetime("updated_at").defaultExpression(CurrentDateTime)
    val deleted = bool("deleted").default(false)
}
