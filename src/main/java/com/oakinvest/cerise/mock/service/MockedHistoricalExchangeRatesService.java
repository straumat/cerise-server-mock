package com.oakinvest.cerise.mock.service;

import com.oakinvest.cerise.dto.HistoricalExchangeRatesParameters;
import com.oakinvest.cerise.dto.HistoricalExchangeRatesResult;
import com.oakinvest.cerise.service.HistoricalExchangeRatesService;
import com.oakinvest.cerise.util.generic.CeriseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Historical exchange rates implementation.
 */
@Service
public class MockedHistoricalExchangeRatesService extends CeriseService implements HistoricalExchangeRatesService {

    @Override
    public List<HistoricalExchangeRatesResult> getHistoricalExchangeRates(final HistoricalExchangeRatesParameters parameters) {
        List<HistoricalExchangeRatesResult> results = new LinkedList<>();
        HistoricalExchangeRatesResult result;

        // First result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760000D);
        result.addRates("typical", 1300);
        results.add(result);

        // Second result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760010D);
        result.addRates("typical", 1301.1);
        results.add(result);

        // Third result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760020D);
        result.addRates("typical", 1320);
        results.add(result);

        // Fourth result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760030D);
        result.addRates("typical", 1305);
        results.add(result);

        // 5th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760000.1);
        result.addRates("typical", 1300);
        results.add(result);

        // 6th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760010.2);
        result.addRates("typical", 1301.1);
        results.add(result);

        // 7th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760020.2);
        result.addRates("typical", 1320.111332);
        results.add(result);

        // 8th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760031D);
        result.addRates("typical", 1305.222311);
        results.add(result);

        // 9th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760040D);
        result.addRates("typical", 1303.33);
        results.add(result);

        // 10th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760042D);
        result.addRates("typical", 1303.33);
        results.add(result);

        // 11th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760050D);
        result.addRates("typical", 1305);
        results.add(result);

        // 12th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760052D);
        result.addRates("typical", 1307);
        results.add(result);

        // 13th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760060D);
        result.addRates("typical", 1309);
        results.add(result);

        // 14th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760072D);
        result.addRates("typical", 1308);
        results.add(result);

        // 15th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760062D);
        result.addRates("typical", 1309.55555555);
        results.add(result);

        // 16th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760072D);
        result.addRates("typical", 1308);
        results.add(result);

        // 17th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488760082D);
        result.addRates("typical", 1309);
        results.add(result);

        // 18th result.
        result = new HistoricalExchangeRatesResult();
        result.setCp("2");
        result.setTime(1488760082D);
        result.addRates("typical", 1309.1);
        results.add(result);

        return results;
    }

}
