package jp.ac.it_college.std.s23005.messageboard.infrastructure.database

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
    class MessageBoardApplication {

    fun main(args: Array<String>) {
        runApplication<MessageBoardApplication>(*args)
    }
}