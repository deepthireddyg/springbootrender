package rocks.zipcode.passion.springbootrender.entities;

import jakarta.persistence.*;

@Entity(name = "UserSubmission")
@Table(name = "UserSubmission")
public class UserSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SubmissionId;
    private String PersonName;
    private String EmailId;
    private String servicename;
    private Double Price;
    private String ProviderName;
    private String ProviderStreet;
    private String ProviderCity;
    private String ProviderState;
    private String ProviderZipcode;
    private String ProviderRating;

    public int getSubmissionId() {
        return SubmissionId;
    }

    public void setSubmissionId(int submissionId) {
        SubmissionId = submissionId;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getservicename() {
        return servicename;
    }

    public void setservicename(String serviceName) {
        servicename = serviceName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String providerName) {
        ProviderName = providerName;
    }

    public String getProviderStreet() {
        return ProviderStreet;
    }

    public void setProviderStreet(String providerStreet) {
        ProviderStreet = providerStreet;
    }

    public String getProviderCity() {
        return ProviderCity;
    }

    public void setProviderCity(String providerCity) {
        ProviderCity = providerCity;
    }

    public String getProviderState() {
        return ProviderState;
    }

    public void setProviderState(String providerState) {
        ProviderState = providerState;
    }

    public String getProviderZipcode() {
        return ProviderZipcode;
    }

    public void setProviderZipcode(String providerZipcode) {
        ProviderZipcode = providerZipcode;
    }

    public String getProviderRating() {
        return ProviderRating;
    }

    public void setProviderRating(String providerRating) {
        ProviderRating = providerRating;
    }

    @Override
    public String toString() {
        return "UserSubmission{" +
                "SubmissionId=" + SubmissionId +
                ", PersonName='" + PersonName + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", ServiceName='" + servicename + '\'' +
                ", Price=" + Price +
                ", ProviderName='" + ProviderName + '\'' +
                ", ProviderStreet='" + ProviderStreet + '\'' +
                ", ProviderCity='" + ProviderCity + '\'' +
                ", ProviderState='" + ProviderState + '\'' +
                ", ProviderZipcode='" + ProviderZipcode + '\'' +
                ", ProviderRating='" + ProviderRating + '\'' +
                '}';
    }
}
