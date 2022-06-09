package php.runtime

import php.lang.PBool
import php.lang.PObject
import php.lang.PVal

class Executor(val context: Context) {
    // call

    fun funcCall(name: String, args: List<PVal>): PVal {
        TODO()
    }

    fun newInstance(`class`: String, args: List<PVal>): PObject {
        TODO()
    }

    fun methodCall(obj: PObject, name: String, args: List<PVal>): PVal {
        TODO()
    }

    fun staticCall(`class`: String, args: List<PVal>): PVal {
        TODO()
    }
}