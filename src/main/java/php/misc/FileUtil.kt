package php.misc

import java.io.File

object FileUtil {
    fun saveFile(path: String, content: String) {
        val file = File(path)

        // 确保文件夹已创建
        file.parentFile?.mkdirs()

        file.writeText(content)
    }
}