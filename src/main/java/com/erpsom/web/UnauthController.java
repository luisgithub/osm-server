package com.erpsom.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HMO SmartClinic Ninja Development Team on 4/14/17.
 */
@RestController
@RequestMapping("unauth")
public class UnauthController {

    @Value("${osm.cfd.cerfile}")
    private String cerFile;

    @Value("${osm.cfd.keyfile}")
    private String keyFile;

    @Value("${osm.csd.keypass}")
    private String keypass;

    String workingDir = System.getProperty("user.dir");


    @GetMapping("ping")
    public ResponseEntity<?> ping (){
        Map result = new HashMap();
        result.put("Date", new Date());
        result.put("keypass", keypass);
        result.put("keyfile", keyFile);
        result.put("cerfile", cerFile);
        String path = workingDir;
        result.put("path", path);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
