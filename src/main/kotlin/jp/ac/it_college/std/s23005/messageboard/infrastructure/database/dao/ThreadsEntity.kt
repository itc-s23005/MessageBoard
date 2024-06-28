package jp.ac.itcollege.s23005.messageboard.infrastructure.database.dao

import jp.ac.it_college.std.s23005.message.board.infrastructure.database.dao.ThreadsTable
import jp.ac.it_college.std.s23005.message.board.infrastructure.database.dao.UserEntity
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ThreadsEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<ThreadsEntity>(ThreadsTable)
    var title by ThreadsTable.title
    var user by UserEntity referencedOn ThreadsTable.user
    var createdAt by ThreadsTable.createdAt
    var updatedAt by ThreadsTable.updatedAt
    var deleted by ThreadsTable.deleted
    override fun toString() = """
        ThreadsEntity(id=$id, title=$title, user=${user.view_name}, createdAt=$createdAt, updatedAt=$updatedAt, deleted=$deleted)
    """.trimIndent()
}