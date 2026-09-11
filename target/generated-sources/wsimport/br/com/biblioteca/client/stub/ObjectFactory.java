
package br.com.biblioteca.client.stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.biblioteca.client.stub package. 
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

    private static final QName _CheckUserStatus_QNAME = new QName("http://service.soa.library.com/", "checkUserStatus");
    private static final QName _CheckUserStatusResponse_QNAME = new QName("http://service.soa.library.com/", "checkUserStatusResponse");
    private static final QName _LoginUser_QNAME = new QName("http://service.soa.library.com/", "loginUser");
    private static final QName _LoginUserResponse_QNAME = new QName("http://service.soa.library.com/", "loginUserResponse");
    private static final QName _RegisterAttendant_QNAME = new QName("http://service.soa.library.com/", "registerAttendant");
    private static final QName _RegisterAttendantResponse_QNAME = new QName("http://service.soa.library.com/", "registerAttendantResponse");
    private static final QName _RegisterUser_QNAME = new QName("http://service.soa.library.com/", "registerUser");
    private static final QName _RegisterUserResponse_QNAME = new QName("http://service.soa.library.com/", "registerUserResponse");
    private static final QName _RetrieveUserLoanHistory_QNAME = new QName("http://service.soa.library.com/", "retrieveUserLoanHistory");
    private static final QName _RetrieveUserLoanHistoryResponse_QNAME = new QName("http://service.soa.library.com/", "retrieveUserLoanHistoryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.biblioteca.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckUserStatus }
     * 
     * @return
     *     the new instance of {@link CheckUserStatus }
     */
    public CheckUserStatus createCheckUserStatus() {
        return new CheckUserStatus();
    }

    /**
     * Create an instance of {@link CheckUserStatusResponse }
     * 
     * @return
     *     the new instance of {@link CheckUserStatusResponse }
     */
    public CheckUserStatusResponse createCheckUserStatusResponse() {
        return new CheckUserStatusResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     * @return
     *     the new instance of {@link LoginUser }
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     * @return
     *     the new instance of {@link LoginUserResponse }
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link RegisterAttendant }
     * 
     * @return
     *     the new instance of {@link RegisterAttendant }
     */
    public RegisterAttendant createRegisterAttendant() {
        return new RegisterAttendant();
    }

    /**
     * Create an instance of {@link RegisterAttendantResponse }
     * 
     * @return
     *     the new instance of {@link RegisterAttendantResponse }
     */
    public RegisterAttendantResponse createRegisterAttendantResponse() {
        return new RegisterAttendantResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     * @return
     *     the new instance of {@link RegisterUser }
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     * @return
     *     the new instance of {@link RegisterUserResponse }
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link RetrieveUserLoanHistory }
     * 
     * @return
     *     the new instance of {@link RetrieveUserLoanHistory }
     */
    public RetrieveUserLoanHistory createRetrieveUserLoanHistory() {
        return new RetrieveUserLoanHistory();
    }

    /**
     * Create an instance of {@link RetrieveUserLoanHistoryResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveUserLoanHistoryResponse }
     */
    public RetrieveUserLoanHistoryResponse createRetrieveUserLoanHistoryResponse() {
        return new RetrieveUserLoanHistoryResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckUserStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "checkUserStatus")
    public JAXBElement<CheckUserStatus> createCheckUserStatus(CheckUserStatus value) {
        return new JAXBElement<>(_CheckUserStatus_QNAME, CheckUserStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckUserStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "checkUserStatusResponse")
    public JAXBElement<CheckUserStatusResponse> createCheckUserStatusResponse(CheckUserStatusResponse value) {
        return new JAXBElement<>(_CheckUserStatusResponse_QNAME, CheckUserStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAttendant }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterAttendant }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "registerAttendant")
    public JAXBElement<RegisterAttendant> createRegisterAttendant(RegisterAttendant value) {
        return new JAXBElement<>(_RegisterAttendant_QNAME, RegisterAttendant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAttendantResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterAttendantResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "registerAttendantResponse")
    public JAXBElement<RegisterAttendantResponse> createRegisterAttendantResponse(RegisterAttendantResponse value) {
        return new JAXBElement<>(_RegisterAttendantResponse_QNAME, RegisterAttendantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveUserLoanHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveUserLoanHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "retrieveUserLoanHistory")
    public JAXBElement<RetrieveUserLoanHistory> createRetrieveUserLoanHistory(RetrieveUserLoanHistory value) {
        return new JAXBElement<>(_RetrieveUserLoanHistory_QNAME, RetrieveUserLoanHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveUserLoanHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveUserLoanHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.soa.library.com/", name = "retrieveUserLoanHistoryResponse")
    public JAXBElement<RetrieveUserLoanHistoryResponse> createRetrieveUserLoanHistoryResponse(RetrieveUserLoanHistoryResponse value) {
        return new JAXBElement<>(_RetrieveUserLoanHistoryResponse_QNAME, RetrieveUserLoanHistoryResponse.class, null, value);
    }

}
