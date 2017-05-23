package fi.jajvirta.demo

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component


data class Joukkue(val nimi: String)

@Component
class TestDao(val jdbcTemplate: JdbcTemplate) {

    fun helloworld(): String {
        return jdbcTemplate.queryForList("select * from joukkue").toString()
    }
}
