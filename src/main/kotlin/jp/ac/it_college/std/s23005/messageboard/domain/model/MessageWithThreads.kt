package jp.ac.it_college.std.s23005.message.board.domain.model

import jp.ac.it_college.std.s23005.messageboard.domain.model.Message

data class MessageWithThreads(
    val message: Message,
    val threads: Thread
){
    val isThreads : Boolean
        get() = threads != null
}
