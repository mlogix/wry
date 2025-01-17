package {{app-domain-reversed}}.{{app-name-snake-case}}

import android.webkit.*

class Ipc {
    @JavascriptInterface
    fun postMessage(message: String) {
        this.ipc(message)
    }

    companion object {
        init {
            System.loadLibrary("{{app-name-snake-case}}")
        }
    }

    private external fun ipc(message: String)

    {{class-extension}}
}
