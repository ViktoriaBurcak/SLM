package model;

import strategy.ConversionStrategy;

public class Mmtocm implements ConversionStrategy {

    private final Unit unitFrom = Unit.MM;
    private final Unit unitTo = Unit.CM;

    @Override
    public Float convert(ConversionRequest conversionRequest) {
        Float result;
        Float valueToConvert = conversionRequest.getValue();
        result = valueToConvert / 10;
        return result;
    }
}
