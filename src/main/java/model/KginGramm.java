package model;

import strategy.ConversionStrategy;

    public class KginGramm implements ConversionStrategy {

        private final Unit unitFrom = Unit.KG;
        private final Unit unitTo = Unit.G;

        @Override
        public Float convert(ConversionRequest conversionRequest) {
            Float result;
            Float valueToConvert = conversionRequest.getValue();
            result = valueToConvert/100;
            return result;
        }
}
