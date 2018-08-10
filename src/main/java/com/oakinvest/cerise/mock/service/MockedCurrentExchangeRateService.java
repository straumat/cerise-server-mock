package com.oakinvest.cerise.mock.service;

import com.oakinvest.cerise.dto.CurrentExchangeRateParameters;
import com.oakinvest.cerise.dto.CurrentExchangeRateResult;
import com.oakinvest.cerise.service.CurrentExchangeRateService;
import com.oakinvest.cerise.util.generic.CeriseService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Current exchange rate implementation.
 */
@Service
public class MockedCurrentExchangeRateService extends CeriseService implements CurrentExchangeRateService {

    @Override
    public List<CurrentExchangeRateResult> getCurrentExchangeRate(final CurrentExchangeRateParameters parameters) {
        List<CurrentExchangeRateResult> results = new LinkedList<>();
        CurrentExchangeRateResult result;

        // First result.
        result = new CurrentExchangeRateResult();
        result.setCp("XBTUSD-ver4");
        result.setTime(1488767410.5463133);
        result.addRates("typical", 1349.332215);
        result.addRates("high", 1351.2);
        results.add(result);

        // Second result.
        result = new CurrentExchangeRateResult();
        result.setCp("2");
        result.setTime(1488767410D);
        result.addRates("typical", 1350.111332);
        results.add(result);

        return results;
    }

}
