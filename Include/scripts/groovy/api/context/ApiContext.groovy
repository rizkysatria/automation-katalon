package api.context

class ApiContext {
    static int lastStatus
    static Map lastBody

    static void reset() {
        lastStatus = 0
        lastBody = null
    }

}