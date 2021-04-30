package com.example.demo;

import lombok.Data;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

@Data
public class MultipartSampleData {
    @FormParam("file")
    @PartType("text/scv")
    InputStream part;

    @FormParam("test")
    String test;
}