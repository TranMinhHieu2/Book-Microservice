package com.devmh.identity.repository.httpclient;

import com.devmh.identity.dto.request.ProfileCreationRequest;
import com.devmh.identity.dto.response.UserProfileReponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;

@FeignClient(name = "profile-service", url = "${app.services.profile}")
public interface ProfileClient {

    @PostMapping(value = "/internal/users", produces = MediaType.APPLICATION_JSON_VALUE)
    UserProfileReponse createProfile(@RequestBody ProfileCreationRequest request);

}
