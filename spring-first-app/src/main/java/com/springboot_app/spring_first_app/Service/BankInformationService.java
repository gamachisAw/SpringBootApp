package com.springboot_app.spring_first_app.Service;

import com.springboot_app.spring_first_app.Model.BankInformation;
import com.springboot_app.spring_first_app.Repository.BankInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BankInformationService {
    @Autowired
    private BankInformationRepository bankInformationRepository;

    public List<BankInformation> getBankInformation(){
        return bankInformationRepository.findAll();
    }
    public void saveBankInformation(BankInformation bankInformation){
        bankInformationRepository.save(bankInformation);
    }
    public void deleteBankInformation(Long id){
        bankInformationRepository.deleteById(id);
    }
    public void updateUser(BankInformation bankInformation, long id) {
        BankInformation bankInformation1 = bankInformationRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        bankInformation1.setBankName(bankInformation.getBankName());
        bankInformation1.setUserID(bankInformation.getUserID());
        bankInformation1.setAccountType(bankInformation.getAccountType());
        bankInformation1.setBankAccountNumber(bankInformation.getBankAccountNumber());
        bankInformationRepository.save(bankInformation1);
    }

}
