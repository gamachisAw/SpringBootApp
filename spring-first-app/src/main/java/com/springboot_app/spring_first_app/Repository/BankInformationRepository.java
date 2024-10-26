package com.springboot_app.spring_first_app.Repository;

import com.springboot_app.spring_first_app.Model.BankInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInformationRepository extends JpaRepository<BankInformation, Long> {
}
