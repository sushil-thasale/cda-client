package gw.cda.api.utils

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.scala.DefaultScalaModule

/** Supplier object for jackson JSON mapper and YAML mapper object instances.
 * Initializes them here so that that only one instance of each is needed throughout
 * the code
 */
object ObjectMapperSupplier {

  val jsonMapper =new ObjectMapper().registerModule(DefaultScalaModule).enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
  val yamlMapper = new ObjectMapper(new YAMLFactory)
  yamlMapper.registerModule(DefaultScalaModule)

}
