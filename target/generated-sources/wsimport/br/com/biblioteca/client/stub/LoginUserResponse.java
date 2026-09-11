
package br.com.biblioteca.client.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de loginUserResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="loginUserResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="authenticated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginUserResponse", propOrder = {
    "authenticated"
})
public class LoginUserResponse {

    protected boolean authenticated;

    /**
     * Obtém o valor da propriedade authenticated.
     * 
     */
    public boolean isAuthenticated() {
        return authenticated;
    }

    /**
     * Define o valor da propriedade authenticated.
     * 
     */
    public void setAuthenticated(boolean value) {
        this.authenticated = value;
    }

}
