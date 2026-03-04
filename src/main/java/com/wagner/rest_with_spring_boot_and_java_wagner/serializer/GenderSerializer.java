package com.wagner.rest_with_spring_boot_and_java_wagner.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class GenderSerializer extends JsonSerializer {

    @Override
    public void serialize(Object value, JsonGenerator gen,
            SerializerProvider serializers) throws IOException {
        String formatedGender = "MALE".equals((value).toString().toUpperCase()) ? "M" : "F";
        gen.writeString(formatedGender);
    }

}
