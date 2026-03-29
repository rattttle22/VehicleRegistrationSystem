/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.system.vehicleregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {

    @Test
    public void testAuthentication() {
        LoginSignUp auth = new LoginSignUp();
        auth.signUp("Saurav Ansuman", "saurav@test.com", "secure123");
        assertTrue(auth.login("saurav@test.com", "secure123"));
    }

    @Test
    public void testVehicleRegistration() {
        VehicleRegistration reg = new VehicleRegistration();
        reg.registerVehicle("MH-15-AB-1234", "Saurav Ansuman");
        assertTrue(reg.getDetailsAndVerifyDetails());
    }

    @Test
    public void testLicenseEligibility() {
        VehicleLicensing license = new VehicleLicensing();
        license.age = 24;
        license.nameAddress = "Saurav Ansuman";
        assertTrue(license.provideLicenseToDrive());
    }

    @Test
    public void testLicenseDenial() {
        VehicleLicensing license = new VehicleLicensing();
        license.age = 16;
        assertFalse(license.provideLicenseToDrive());
    }

    @Test
    public void testExaminationPass() {
        Examination exam = new Examination();
        exam.name = "Saurav Ansuman";
        exam.figureOutEligibleCandidates(85);
        assertEquals("Approved_Examiner", exam.signature);
    }
}
