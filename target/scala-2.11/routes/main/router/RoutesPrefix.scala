
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/locus/kafka-manager/conf/routes
// @DATE:Thu May 24 21:33:01 NZST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
