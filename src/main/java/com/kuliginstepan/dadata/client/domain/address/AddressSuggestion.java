package com.kuliginstepan.dadata.client.domain.address;

import com.kuliginstepan.dadata.client.domain.DadataResponse;
import com.kuliginstepan.dadata.client.domain.SuggestionType;
import org.springframework.core.ParameterizedTypeReference;

public class AddressSuggestion implements SuggestionType<Address> {

    @Override
    public ParameterizedTypeReference<DadataResponse<Address>> getResponseClass() {
        return new ParameterizedTypeReference<DadataResponse<Address>>() {};
    }

    @Override
    public String getSuggestOperationPrefix() {
        return "/address";
    }
}
