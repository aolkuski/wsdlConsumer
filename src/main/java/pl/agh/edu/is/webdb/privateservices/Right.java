
package pl.agh.edu.is.webdb.privateservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for right complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="right">
 *   &lt;complexContent>
 *     &lt;extension base="{http://privateservices.webDB.is.edu.agh.pl/}webDBEntity">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groups" type="{http://privateservices.webDB.is.edu.agh.pl/}group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "right", propOrder = {
    "description",
    "groups",
    "rightName"
})
public class Right
    extends WebDBEntity
{

    protected String description;
    @XmlElement(nillable = true)
    protected List<Group> groups;
    protected String rightName;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroups() {
        if (groups == null) {
            groups = new ArrayList<Group>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the rightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightName() {
        return rightName;
    }

    /**
     * Sets the value of the rightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightName(String value) {
        this.rightName = value;
    }

}
