
package tw.com.rex.service.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>insert complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="insert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entity" type="{http://service.web.com.tw/}product" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insert", propOrder = {
    "entity"
})
public class Insert {

    protected Product entity;

    /**
     * 取得 entity 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getEntity() {
        return entity;
    }

    /**
     * 設定 entity 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setEntity(Product value) {
        this.entity = value;
    }

}
