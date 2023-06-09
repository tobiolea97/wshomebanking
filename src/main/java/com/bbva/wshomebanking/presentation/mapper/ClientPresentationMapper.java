package com.bbva.wshomebanking.presentation.mapper;

import com.bbva.wshomebanking.domain.models.Client;
import com.bbva.wshomebanking.presentation.request.client.ClientCreateRequest;
import com.bbva.wshomebanking.presentation.response.client.ClientCreateResponse;
import org.springframework.stereotype.Component;

@Component
public class ClientPresentationMapper {

    public ClientCreateResponse domainToResponse(Client client) {
        return ClientCreateResponse.builder()
                .id(client.getId())
                .personalId(client.getPersonalId())
                .firstName(client.getFirstName())
                .lastName(client.getFirstName())
                .email(client.getEmail())
                .phone(client.getPhone())
                .address(client.getAddress())
                .build();
    }

    public Client requestToDomain(ClientCreateRequest request) {
        return Client.builder()
                .personalId(request.getPersonalId())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();
    }



}
