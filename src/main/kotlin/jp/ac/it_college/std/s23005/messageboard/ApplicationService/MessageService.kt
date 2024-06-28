package jp.ac.it_college.std.s23005.messageboard.ApplicationService

import jp.ac.it_college.std.s23005.message.board.domain.model.MessageWithThreads
import jp.ac.it_college.std.s23005.messageboard.domain.repository.MessageRepository

class MessageService {
    private val messageRepository : MessageRepository (
    ){
        fun getList(): List<MessageWithThreads>{
            return messageRepository.findAllWithThreads()
        }
    }
}