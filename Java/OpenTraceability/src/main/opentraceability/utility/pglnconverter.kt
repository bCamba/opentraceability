package utility

import com.google.gson.JsonSerializer
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import models.identifiers.*
import models.identifiers.PGLN
import java.lang.reflect.Type

class PGLNConverter  /*: JsonConverter<PGLN>*/ {

    fun WriteJson(writer: JsonWriter, value: PGLN?, serializer: JsonSerializer<Any>) {
        TODO("Not yet implemented")
    }

    fun ReadJson(
        reader: JsonReader,
        objectType: Type,
        existingValue: PGLN?,
        hasExistingValue: Boolean,
        serializer: JsonSerializer<Any>
    ): PGLN? {
        TODO("Not yet implemented")
    }

}
