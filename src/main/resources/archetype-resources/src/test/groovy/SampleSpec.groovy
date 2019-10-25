package $package

import spock.lang.Specification

class SampleSpec extends Specification {

  Sample sample

  def setup() {
    sample = new Sample()
  }

  def "sample test"() {
    when:
        def result = sample.constructSampleString()
    then:
        result == "some string"
  }
}
