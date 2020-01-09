package sample

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.specs.StringSpec

class SampleTestsJVM: StringSpec({
    "hello" {
        hello() shouldContain "JVM"
    }
})