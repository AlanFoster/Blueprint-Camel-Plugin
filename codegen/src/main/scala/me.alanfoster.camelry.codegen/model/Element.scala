package me.alanfoster.camelry.codegen.model

/**
 * Represents the DataModel for both XmlReferences and XmlElements, there is no distinguishing features between the
 * two within this data model. Other than both have a core name, datatype, and a list of possible subtag/reference values.
 *
 * @param name @{inheritDoc}
 * @param dataType @{inheritDoc}
 * @param references The list of string XmlElement name references
 * @param isCollection Whether the element contains a collection;
 *                     If true, this suggests a SubTagsList annotation should be generated
 */
class Element(name: String, dataType: String, val references: Set[String], val isCollection: Boolean) extends Base(name, dataType) {

}