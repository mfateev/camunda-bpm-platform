package org.camunda.spin.groovy.xml.dom

result = XML(input, org.camunda.spin.DataFormats.xmlDom().mapper().config("schema", schema).done()).mapTo("org.camunda.spin.xml.mapping.Order");