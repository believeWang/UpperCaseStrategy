package com.robertwang.upperCaseStrategy.controller;

import com.robertwang.upperCaseStrategy.request.DemoRequest;
import com.robertwang.upperCaseStrategy.request.DemoSubRequest;
import com.robertwang.upperCaseStrategy.response.DemoResponse;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class DemoController {

  @PostMapping("/query")
  public ResponseEntity<DemoResponse> showDemo(@RequestBody DemoRequest request) {

    log.info("input: {}", request);

    String allName =
        request.getDemoName()
            + " :"
            + request.getSubRequests().stream()
                .map(DemoSubRequest::getSubDemoName)
                .collect(Collectors.joining(","));

    DemoResponse response = new DemoResponse(allName);

    log.info("output: {}", response);
    return new ResponseEntity<>((response), HttpStatus.OK);
  }
}
