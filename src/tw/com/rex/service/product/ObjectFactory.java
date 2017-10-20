
package tw.com.rex.service.product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tw.com.rex.service.product package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckDuplicate_QNAME = new QName("http://service.web.com.tw/", "checkDuplicate");
    private final static QName _CheckDuplicateResponse_QNAME = new QName("http://service.web.com.tw/", "checkDuplicateResponse");
    private final static QName _Delete_QNAME = new QName("http://service.web.com.tw/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.web.com.tw/", "deleteResponse");
    private final static QName _FindAll_QNAME = new QName("http://service.web.com.tw/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://service.web.com.tw/", "findAllResponse");
    private final static QName _FindById_QNAME = new QName("http://service.web.com.tw/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://service.web.com.tw/", "findByIdResponse");
    private final static QName _FindByIds_QNAME = new QName("http://service.web.com.tw/", "findByIds");
    private final static QName _FindByIdsResponse_QNAME = new QName("http://service.web.com.tw/", "findByIdsResponse");
    private final static QName _FindBySupplier_QNAME = new QName("http://service.web.com.tw/", "findBySupplier");
    private final static QName _FindBySupplierResponse_QNAME = new QName("http://service.web.com.tw/", "findBySupplierResponse");
    private final static QName _Insert_QNAME = new QName("http://service.web.com.tw/", "insert");
    private final static QName _InsertResponse_QNAME = new QName("http://service.web.com.tw/", "insertResponse");
    private final static QName _Update_QNAME = new QName("http://service.web.com.tw/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.web.com.tw/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tw.com.rex.service.product
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckDuplicate }
     * 
     */
    public CheckDuplicate createCheckDuplicate() {
        return new CheckDuplicate();
    }

    /**
     * Create an instance of {@link CheckDuplicateResponse }
     * 
     */
    public CheckDuplicateResponse createCheckDuplicateResponse() {
        return new CheckDuplicateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindByIds }
     * 
     */
    public FindByIds createFindByIds() {
        return new FindByIds();
    }

    /**
     * Create an instance of {@link FindByIdsResponse }
     * 
     */
    public FindByIdsResponse createFindByIdsResponse() {
        return new FindByIdsResponse();
    }

    /**
     * Create an instance of {@link FindBySupplier }
     * 
     */
    public FindBySupplier createFindBySupplier() {
        return new FindBySupplier();
    }

    /**
     * Create an instance of {@link FindBySupplierResponse }
     * 
     */
    public FindBySupplierResponse createFindBySupplierResponse() {
        return new FindBySupplierResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link BaseModel }
     * 
     */
    public BaseModel createBaseModel() {
        return new BaseModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDuplicate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "checkDuplicate")
    public JAXBElement<CheckDuplicate> createCheckDuplicate(CheckDuplicate value) {
        return new JAXBElement<CheckDuplicate>(_CheckDuplicate_QNAME, CheckDuplicate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDuplicateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "checkDuplicateResponse")
    public JAXBElement<CheckDuplicateResponse> createCheckDuplicateResponse(CheckDuplicateResponse value) {
        return new JAXBElement<CheckDuplicateResponse>(_CheckDuplicateResponse_QNAME, CheckDuplicateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findByIds")
    public JAXBElement<FindByIds> createFindByIds(FindByIds value) {
        return new JAXBElement<FindByIds>(_FindByIds_QNAME, FindByIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findByIdsResponse")
    public JAXBElement<FindByIdsResponse> createFindByIdsResponse(FindByIdsResponse value) {
        return new JAXBElement<FindByIdsResponse>(_FindByIdsResponse_QNAME, FindByIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findBySupplier")
    public JAXBElement<FindBySupplier> createFindBySupplier(FindBySupplier value) {
        return new JAXBElement<FindBySupplier>(_FindBySupplier_QNAME, FindBySupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBySupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "findBySupplierResponse")
    public JAXBElement<FindBySupplierResponse> createFindBySupplierResponse(FindBySupplierResponse value) {
        return new JAXBElement<FindBySupplierResponse>(_FindBySupplierResponse_QNAME, FindBySupplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
