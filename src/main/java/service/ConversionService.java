package service;

import lombok.AllArgsConstructor;
import model.CmtoMm;
import model.ConversionRequest;
import model.Unit;
import org.springframework.stereotype.Service;
import strategy.ConversionStrategy;

@Service


public class ConversionService {
     ConversionStrategy conversionStrategy;


//100 cm  to mm
    public Float makeConversion(ConversionRequest conversionRequest){

        Unit unitFrom = conversionRequest.getUnitFrom();
        Unit unitTo = conversionRequest.getUnitTo();
        if (unitFrom == Unit.CM && unitTo == Unit.MM){
            conversionStrategy = new CmtoMm();

        }

        return conversionStrategy.convert(conversionRequest);
    }
}
