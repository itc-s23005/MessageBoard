
package jp.ac.it_college.std.s23005.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23005.messageboard.infrastructure.database.dao.UserEntity
import jp.ac.it_college.std.s23005.messageboard.infrastructure.database.dao.UserTable
import jp.ac.itcollege.s23005.messageboard.domain.model.User
import jp.ac.itcollege.s23005.messageboard.domain.repository.UserRepository
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {
    override fun find(email: String): User? {
        return transaction {
            val entity = UserEntity.find {
                UserTable.email eq email
            }.singleOrNull()
            entity?.let(::toModel)
        }
    }
    private fun toModel(user: UserEntity) = User(
        id = user.id.value,
        email = user.email,
        password = user.password,
        name = user.view_name
    )

    override fun find(id: Long): User? {
        return transaction {
            val entity = UserEntity.findById(id)
            entity?.let(::toModel)
        }
    }
}
