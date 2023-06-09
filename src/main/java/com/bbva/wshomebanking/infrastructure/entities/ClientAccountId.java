package com.bbva.wshomebanking.infrastructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ClientAccountId implements Serializable {
    @Column(name = "account_id")
    private int accountId;

    @Column(name = "client_id")
    private int clientId;

}
