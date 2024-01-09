package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="ownerPlan")
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlan {
    @Id
    private String planId;
    @Column(name="plan_name", unique = true)
    private String planName;
    @Column(name="price")
    private int price;
    @Column(name="plan_validity")
    private int planeValidity;
    @Column(name="relationship_Manager")
    private boolean relationshipManager;
    @Column(name="rental_agreement")
    private boolean rentalAgreement;
    @Column(name="property_promotion")
    private boolean propertyPromotion;
    @Column(name="guaranteed_Tenant")
    private boolean guaranteedTenant;
    @Column(name="showing_Property")
    private boolean showingProperty;
    @Column(name="facebook_marketing_")
    private boolean faceBookMarketingOfProperty;

}
