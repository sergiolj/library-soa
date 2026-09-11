
package br.com.biblioteca.client.stub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de userCategory.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>{@code
 * <simpleType name="userCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STUDENT"/>
 *     <enumeration value="TEATCHER"/>
 *     <enumeration value="ATTENDANT"/>
 *     <enumeration value="SUPERVISOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "userCategory")
@XmlEnum
public enum UserCategory {

    STUDENT,
    TEATCHER,
    ATTENDANT,
    SUPERVISOR;

    public String value() {
        return name();
    }

    public static UserCategory fromValue(String v) {
        return valueOf(v);
    }

}
