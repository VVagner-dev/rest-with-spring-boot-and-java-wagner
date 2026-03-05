package com.wagner.rest_with_spring_boot_and_java_wagner.serialization.converter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public final class YamlJackson2HttpMenssageConverter extends AbstractJackson2HttpMessageConverter {

    protected YamlJackson2HttpMenssageConverter() {
        super(new YAMLMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL),
                MediaType.parseMediaType("application/yaml"));
        // TODO Auto-generated constructor stub
    }

}
