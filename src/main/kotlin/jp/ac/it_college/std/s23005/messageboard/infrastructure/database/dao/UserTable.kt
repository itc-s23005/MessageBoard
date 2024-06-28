package jp.ac.it_college.std.s23005.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable

object UserTable : LongIdTable("user") {
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
    val name = varchar("name", 32)
}