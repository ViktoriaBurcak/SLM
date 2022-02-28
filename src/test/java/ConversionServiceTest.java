import model.CmtoMm;
import model.ConversionRequest;
import model.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ConversionService;

public class ConversionServiceTest {


    @Test

    public void convertCmtoMm(){
        ConversionService conversionService = new ConversionService();
        ConversionRequest conversionRequest = new ConversionRequest();
        conversionRequest.setUnitFrom(Unit.CM);
        conversionRequest.setUnitTo(Unit.MM);
        conversionRequest.setValue(100f);

        Float result = conversionService.makeConversion(conversionRequest);

        Assertions.assertEquals(1000,result);


    }

}

