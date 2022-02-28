package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ConversionRequest {
    private Unit unitFrom;
    private float value;
    private Unit unitTo;


    public ConversionRequest convert(ConversionRequest conversionRequest) {

        return conversionRequest;
    }
}
