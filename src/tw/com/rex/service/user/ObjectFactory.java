
package tw.com.rex.service.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tw.com.rex.service.user package.
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
    private final static QName _Insert_QNAME = new QName("http://service.web.com.tw/", "insert");
    private final static QName _InsertResponse_QNAME = new QName("http://service.web.com.tw/", "insertResponse");
    private final static QName _Login_QNAME = new QName("http://service.web.com.tw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://service.web.com.tw/", "loginResponse");
    private final static QName _Logout_QNAME = new QName("http://service.web.com.tw/", "logout");
    private final static QName _LogoutResponse_QNAME = new QName("http://service.web.com.tw/", "logoutResponse");
    private final static QName _Update_QNAME = new QName("http://service.web.com.tw/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.web.com.tw/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tw.com.rex.service.user
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
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
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
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web.com.tw/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
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
