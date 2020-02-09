package $package$.common.controller

import org.springframework.web.bind.annotation._

@RestController
class StatusController() {

  @GetMapping(value = Array("/status"), produces = Array("application/json"))
  def status() = "OK"

  @GetMapping(value = Array("/", "/buildinfo", "/info"),
              produces = Array("application/json"))
  def buildInfo() = Map("name" -> "$name$", "version" -> "TBD")

}
