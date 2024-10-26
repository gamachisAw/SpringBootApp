package com.springboot_app.spring_first_app.Model;

import com.springboot_app.spring_first_app.Service.BankAccountNumberEncryptor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Bank_information")
public class BankInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private User userID;

    @Convert(converter = BankAccountNumberEncryptor.class)
    private  String bankAccountNumber;

    private String bankName;

    private  String accountType;

}
