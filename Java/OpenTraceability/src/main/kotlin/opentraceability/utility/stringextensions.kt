package utility

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

object StringExtensions {
    private val digitsOnlyRegex = Regex("^[0-9]+$")

    fun String.IsOnlyDigits(): Boolean {
        return digitsOnlyRegex.matches(this)
    }

    private val IsURICompatibleCharsRegex = Regex("(.*[^._\\-:0-9A-Za-z])")

    fun String.IsURICompatibleChars(): Boolean {
        return !IsURICompatibleCharsRegex.matches(this)
    }

    fun String.tryConvertToDateTimeOffset(): OffsetDateTime? {
        val formatters = listOf(
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX"),
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSX")
        )

        for (formatter in formatters) {
            try {
                return OffsetDateTime.parse(this, formatter)
            } catch (e: Exception) {
                // Ignore parse exceptions and try the next formatter
            }
        }

        return null
    }

    fun String.splitXPath(): List<String> {
        val regex = "(?=[^{}]*(?:{[^{}]*}[^{}]*)*\$)/"
        var str = this.replace(regex, "%SLASH%")
        return str.split("%SLASH%")
    }
}
