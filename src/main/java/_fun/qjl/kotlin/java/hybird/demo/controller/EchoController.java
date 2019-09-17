package _fun.qjl.kotlin.java.hybird.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jarrod Quan
 */
@RestController
@RequestMapping("api/echo")
public class EchoController {
    @GetMapping("{sth}")
    public ResponseEntity<String> echo(
            @PathVariable("sth") String sth
    ) {
        return ResponseEntity.ok(sth);
    }
}
