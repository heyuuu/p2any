package php.misc

import com.google.gson.Gson
import com.google.gson.GsonBuilder

object JsonUtil {
    fun encode(obj: Any?): String {
        return Gson().toJson(obj)
    }

    fun encodePretty(obj: Any?): String {
        val gson = GsonBuilder().setPrettyPrinting().create()
        return gson.toJson(obj)
    }
}