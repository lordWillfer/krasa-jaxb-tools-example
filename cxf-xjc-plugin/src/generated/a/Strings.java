//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 07:28:15 PM CEST 
//


package a;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Strings complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Strings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pattern" type="{a}pattern"/>
 *         &lt;element name="genericString" type="{a}minMaxLength"/>
 *         &lt;element name="maxLength" type="{a}maxLength"/>
 *         &lt;element name="minLength" type="{a}minLength"/>
 *         &lt;element name="someCollection" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strings", propOrder = {
		"pattern",
		"genericString",
		"maxLength",
		"minLength",
		"someCollection"
})
public class Strings {

	@XmlElement(required = true)
	@NotNull
	@Pattern(regexp = "[0-9]")
	protected String pattern;
	@XmlElement(required = true)
	@NotNull
	@Size(min = 0, max = 1024)
	protected String genericString;
	@XmlElement(required = true)
	@NotNull
	@Size(max = 1024)
	protected String maxLength;
	@XmlElement(required = true)
	@NotNull
	@Size(min = 0)
	protected String minLength;
	@XmlElement(required = true)
	@NotNull
	@Size(min = 1)
	protected List<Object> someCollection;

	/**
	 * Gets the value of the pattern property.
	 *
	 * @return possible object is
	 *         {@link String }
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * Sets the value of the pattern property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setPattern(String value) {
		this.pattern = value;
	}

	/**
	 * Gets the value of the genericString property.
	 *
	 * @return possible object is
	 *         {@link String }
	 */
	public String getGenericString() {
		return genericString;
	}

	/**
	 * Sets the value of the genericString property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setGenericString(String value) {
		this.genericString = value;
	}

	/**
	 * Gets the value of the maxLength property.
	 *
	 * @return possible object is
	 *         {@link String }
	 */
	public String getMaxLength() {
		return maxLength;
	}

	/**
	 * Sets the value of the maxLength property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMaxLength(String value) {
		this.maxLength = value;
	}

	/**
	 * Gets the value of the minLength property.
	 *
	 * @return possible object is
	 *         {@link String }
	 */
	public String getMinLength() {
		return minLength;
	}

	/**
	 * Sets the value of the minLength property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMinLength(String value) {
		this.minLength = value;
	}

	/**
	 * Gets the value of the someCollection property.
	 * <p/>
	 * <p/>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the someCollection property.
	 * <p/>
	 * <p/>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getSomeCollection().add(newItem);
	 * </pre>
	 * <p/>
	 * <p/>
	 * <p/>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Object }
	 */
	public List<Object> getSomeCollection() {
		if (someCollection == null) {
			someCollection = new ArrayList<Object>();
		}
		return this.someCollection;
	}

}
