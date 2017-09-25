//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.25 ʱ�� 02:40:34 PM CST 
//


package com.demo.xml.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="age">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="120"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dateborn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="car">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Audi"/>
 *               &lt;enumeration value="Golf"/>
 *               &lt;enumeration value="BMW"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="letter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="product">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="prodid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "items",
    "password",
    "car",
    "letter",
    "product"
})
@XmlRootElement(name = "res")
public class Res {

    @XmlElement(required = true)
    protected Res.Items items;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String car;
    @XmlElement(required = true)
    protected String letter;
    @XmlElement(required = true)
    protected Res.Product product;

    /**
     * ��ȡitems���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Res.Items }
     *     
     */
    public Res.Items getItems() {
        return items;
    }

    /**
     * ����items���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Res.Items }
     *     
     */
    public void setItems(Res.Items value) {
        this.items = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡcar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCar() {
        return car;
    }

    /**
     * ����car���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCar(String value) {
        this.car = value;
    }

    /**
     * ��ȡletter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetter() {
        return letter;
    }

    /**
     * ����letter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetter(String value) {
        this.letter = value;
    }

    /**
     * ��ȡproduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Res.Product }
     *     
     */
    public Res.Product getProduct() {
        return product;
    }

    /**
     * ����product���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Res.Product }
     *     
     */
    public void setProduct(Res.Product value) {
        this.product = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="age">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="120"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dateborn" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        @XmlElement(required = true)
        protected List<Res.Items.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Res.Items.Item }
         * 
         * 
         */
        public List<Res.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Res.Items.Item>();
            }
            return this.item;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="age">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="120"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dateborn" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "lastname",
            "age",
            "dateborn"
        })
        public static class Item {

            @XmlElement(required = true)
            protected BigInteger id;
            @XmlElement(required = true)
            protected String lastname;
            protected int age;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateborn;

            /**
             * ��ȡid���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * ����id���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

            /**
             * ��ȡlastname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastname() {
                return lastname;
            }

            /**
             * ����lastname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastname(String value) {
                this.lastname = value;
            }

            /**
             * ��ȡage���Ե�ֵ��
             * 
             */
            public int getAge() {
                return age;
            }

            /**
             * ����age���Ե�ֵ��
             * 
             */
            public void setAge(int value) {
                this.age = value;
            }

            /**
             * ��ȡdateborn���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateborn() {
                return dateborn;
            }

            /**
             * ����dateborn���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateborn(XMLGregorianCalendar value) {
                this.dateborn = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="prodid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Product {

        @XmlAttribute(name = "prodid")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger prodid;

        /**
         * ��ȡprodid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProdid() {
            return prodid;
        }

        /**
         * ����prodid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProdid(BigInteger value) {
            this.prodid = value;
        }

    }

}
