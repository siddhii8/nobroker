package com.nobroker.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {
    @Id
    private String planId;
   private String planName;
   private int price;
   private int planeValidity;
   private boolean relationshipManager;
   private boolean rentalAgreement;
   private boolean propertyPromotion;
   private boolean guaranteedTenant;
   private boolean showingProperty;
   private boolean faceBookMarketingOfProperty;

}
