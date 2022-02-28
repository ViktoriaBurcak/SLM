package model;


import strategy.ConversionStrategy;

public class CmtoMm implements ConversionStrategy {

    private final Unit unitFrom = Unit.CM;
    private final Unit unitTo = Unit.MM;

    @Override
    public Float convert(ConversionRequest conversionRequest) {
        Float result;
        Float valueToConvert = conversionRequest.getValue();
        result = valueToConvert*10;
        return result;
    }
}
