package com.codecool.coolwarsbackend.service;

import com.codecool.coolwarsbackend.model.UserSolution;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CompilerService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.compiler-service.url}")
    private String compilerServiceUrl;

    public String get_output(UserSolution userSolution) throws JSONException {
        StringBuilder requestUrl = new StringBuilder(compilerServiceUrl);
        switch (userSolution.getLanguage()) {
            case JAVA:
                requestUrl.append("/java");
                break;
            case PYTHON:
                requestUrl.append("/python");
                break;
            default:
                throw new RuntimeException("Not a valid language");
        }

        /*MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        jsonHttpMessageConverter.getObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        restTemplate.getMessageConverters().add(jsonHttpMessageConverter);*/


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject requestObject = new JSONObject();
        requestObject.put("usercode", userSolution.getCode());

        HttpEntity<String> request = new HttpEntity<>(requestObject.toString(), headers);
        ResponseEntity<String> responseEntityStr = restTemplate.postForEntity(requestUrl.toString(), request, String.class);




        /*ResponseEntity<String> response = restTemplate.postForEntity(requestUrl.toString(), requestObject, String.class);
        String output = response.getBody();*/
        return responseEntityStr.getBody();
    }
}
