package com.kuliginstepan.dadata.client.domain.organization;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kuliginstepan.dadata.client.domain.AdditionalProps;
import com.kuliginstepan.dadata.client.domain.OrganizationStatus;
import com.kuliginstepan.dadata.client.domain.Suggestion;
import com.kuliginstepan.dadata.client.domain.address.Address;
import com.kuliginstepan.dadata.client.json.LocalDateDeserializer;
import java.time.LocalDate;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @see <a href="https://confluence.hflabs.ru/pages/viewpage.action?pageId=204669126">Dadata organization object</a>
 */

@EqualsAndHashCode(callSuper = true)
@Value
public class Organization extends AdditionalProps {

    private String kpp;
    private Double capital;
    private Management management;
    private List<String> founders;
    private List<String> managers;
    private OrganizationType type;
    @JsonAlias("branch_type")
    private BranchType branchType;
    @JsonAlias("branch_count")
    private Integer branchCount;
    @JsonAlias("employee_count")
    private Integer employeeCount;
    private String source;
    private String qc;
    private String hid;
    private State state;
    private Opf opf;
    private Name name;
    private String inn;
    private String ogrn;
    private String okpo;
    private String okved;
    private List<Okved> okveds;
    private String authorities;
    private String documents;
    private List<String> licenses;
    private Suggestion<Address> address;
    private List<String> phones;
    private List<String> emails;
    @JsonAlias("ogrn_date")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate ogrnDate;
    @JsonAlias("okved_type")
    private String okvedType;

    @Value
    public static class Management {

        private String name;
        private String post;
    }

    @Value
    public static class State {

        private OrganizationStatus status;
        @JsonAlias("actuality_date")
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate actualityDate;
        @JsonAlias("registration_date")
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate registrationDate;
        @JsonAlias("liquidation_date")
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate liquidationDate;
    }

    @Value
    public static class Opf {

        private String type;
        private String code;
        @JsonAlias("full")
        private String fullName;
        @JsonAlias("short")
        private String shortName;
    }

    @Value
    public static class Name {

        @JsonAlias("full_with_opf")
        private String fullWithOpf;
        @JsonAlias("short_with_opf")
        private String shortWithOpf;
        private String latin;
        @JsonAlias("full")
        private String fullName;
        @JsonAlias("short")
        private String shortName;
    }

    @Value
    public static class Okved {

        private Boolean main;
        private String type;
        private String code;
        private String name;
    }
}
