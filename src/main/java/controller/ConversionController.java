package controller;

import lombok.AllArgsConstructor;
import model.ConversionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.ConversionService;


@Controller
@AllArgsConstructor
public class ConversionController {
    private final ConversionService conversionService;

@PostMapping ("/convert")
    public ConversionService convert (@RequestBody  ConversionRequest conversionRequest){
        return conversionService;
    }
}