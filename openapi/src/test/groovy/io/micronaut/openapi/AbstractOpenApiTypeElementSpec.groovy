package io.micronaut.openapi

import io.micronaut.annotation.processing.test.AbstractTypeElementSpec
import io.micronaut.openapi.visitor.OpenApiConfigProperty
import io.micronaut.openapi.visitor.Utils

abstract class AbstractOpenApiTypeElementSpec extends AbstractTypeElementSpec {

    def setup() {
        Utils.clean()
        System.clearProperty(OpenApiConfigProperty.MICRONAUT_OPENAPI_ENABLED)
        System.setProperty(Utils.ATTR_TEST_MODE, "true")
    }

    def cleanup() {
        Utils.clean()
        System.clearProperty(Utils.ATTR_TEST_MODE)
    }
}
