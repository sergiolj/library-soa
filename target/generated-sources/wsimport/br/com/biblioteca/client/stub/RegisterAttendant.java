
package br.com.biblioteca.client.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de registerAttendant complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="registerAttendant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="attendant" type="{http://service.soa.library.com/}user" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerAttendant", propOrder = {
    "attendant"
})
public class RegisterAttendant {

    protected User attendant;

    /**
     * Obtém o valor da propriedade attendant.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAttendant() {
        return attendant;
    }

    /**
     * Define o valor da propriedade attendant.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAttendant(User value) {
        this.attendant = value;
    }

}
