package com.oakinvest.cerise.mock.service;

import com.oakinvest.cerise.dto.SupportedCurrencyPairTokensParameters;
import com.oakinvest.cerise.dto.SupportedCurrencyPairTokensResult;
import com.oakinvest.cerise.service.SupportedCurrencyPairTokensService;
import com.oakinvest.cerise.util.generic.CeriseService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Enumerating supported currency-pair token implementation.
 */
@Service
public class MockedSupportedCurrencyPairTokensService extends CeriseService implements SupportedCurrencyPairTokensService {

    @Override
    public List<SupportedCurrencyPairTokensResult> getSupportedCurrencyPairTokens(final SupportedCurrencyPairTokensParameters parameters) {
        List<SupportedCurrencyPairTokensResult> results = new LinkedList<>();
        SupportedCurrencyPairTokensResult result;

        // First result.
        result = new SupportedCurrencyPairTokensResult();
        result.setCp("XBTUSD-ver4");
        result.setQuote("USD");
        result.setBase("XBT");
        result.setLocale("en_US");
        result.setDesc("Smoothed averages");
        results.add(result);

        // Second result.
        result = new SupportedCurrencyPairTokensResult();
        result.setCp("2");
        result.setQuote("USD");
        result.setBase("XBT");
        result.setLocale("en_US");
        result.setDesc("Updated per-trade");
        results.add(result);

        // Third result.
        result = new SupportedCurrencyPairTokensResult();
        result.setCp("XBTUSD-european");
        result.setQuote("USD");
        result.setBase("XBT");
        result.setLocale("en_GB");
        results.add(result);

        return results;
    }

}
