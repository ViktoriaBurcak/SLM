package strategy;

import model.ConversionRequest;

public interface ConversionStrategy {
    Float convert(ConversionRequest conversionRequest);
}
