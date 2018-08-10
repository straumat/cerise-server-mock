package com.oakinvest.cerise.mock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Currency-pair information implementation test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CurrencyPairInformationServiceTest {

    @Autowired
    private MockMvc mvc;

    /**
     * Test for Currency-pair information results.
     */
    @Test
    public void getCurrencyPairInformationResults() throws Exception {
        mvc.perform(get("/")
                .param("mode", "info")
                .param("cp", "XBTUSD-ver4,2")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().string(not(containsString("\\n\\r"))))
                .andExpect(jsonPath("$", hasSize(2)))
                // First result.
                .andExpect(jsonPath("$[0].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[0].quote").value("USD"))
                .andExpect(jsonPath("$[0].base").value("XBT"))
                .andExpect(jsonPath("$[0].locale").value("en_US"))
                .andExpect(jsonPath("$[0].desc").value("Smoothed averages"))
                .andExpect(jsonPath("$[0].longdesc").value("USD price quotes as compared to Bitcoin value\\n\\nRecommended for casual usage"))
                .andExpect(jsonPath("$[0].symbol[0][0]").value("-$"))
                .andExpect(jsonPath("$[0].symbol[0][1]").value("$"))
                .andExpect(jsonPath("$[0].symbol[1]").isEmpty())
                .andExpect(jsonPath("$[0].digits").value("Arabic"))
                .andExpect(jsonPath("$[0].grouping[0]").value("3"))
                .andExpect(jsonPath("$[0].grouping[1]").value(","))
                .andExpect(jsonPath("$[0].grouping[2]").value("0"))
                .andExpect(jsonPath("$[0].fraction_sep").value("."))
                .andExpect(jsonPath("$[0].fraction_digits[0]").value(0))
                .andExpect(jsonPath("$[0].fraction_digits[1]").value(2))
                .andExpect(jsonPath("$[0].fraction_digits[2]").value(2))
                .andExpect(jsonPath("$[0].minpoll").value(300))
                .andExpect(jsonPath("$[0].longpoll").value(true))
                .andExpect(jsonPath("$[0].history").value(1457231416))
                .andExpect(jsonPath("$[0].archive").value(145723141))
                .andExpect(jsonPath("$[0].signature").doesNotExist())
                // Second result.
                .andExpect(jsonPath("$[1].cp").value("2"))
                .andExpect(jsonPath("$[1].quote").value("USD"))
                .andExpect(jsonPath("$[1].base").value("XBT"))
                .andExpect(jsonPath("$[1].locale").value("en_US"))
                .andExpect(jsonPath("$[1].desc").value("Updated per-trade"))
                .andExpect(jsonPath("$[1].longdesc").value("Maximum precision USD price quotes as compared to Bitcoin value"))
                .andExpect(jsonPath("$[1].symbol[0][0]").value("-$"))
                .andExpect(jsonPath("$[1].symbol[0][1]").value("$"))
                .andExpect(jsonPath("$[1].symbol[1]").isEmpty())
                .andExpect(jsonPath("$[1].digits").value("Arabic"))
                .andExpect(jsonPath("$[1].grouping[0]").value("3"))
                .andExpect(jsonPath("$[1].grouping[1]").value(","))
                .andExpect(jsonPath("$[1].grouping[2]").value("0"))
                .andExpect(jsonPath("$[1].fraction_sep").value("."))
                .andExpect(jsonPath("$[1].fraction_digits[0]").value(0))
                .andExpect(jsonPath("$[1].fraction_digits[1]").value(2))
                .andExpect(jsonPath("$[1].fraction_digits[2]").value(2))
                .andExpect(jsonPath("$[1].minpoll").value(3600))
                .andExpect(jsonPath("$[1].longpoll").value(false))
                .andExpect(jsonPath("$[1].history").value(1467458333.1225))
                .andExpect(jsonPath("$[1].archive").value(146745833.1225))
                .andExpect(jsonPath("$[1].signature").doesNotExist());
    }

}
