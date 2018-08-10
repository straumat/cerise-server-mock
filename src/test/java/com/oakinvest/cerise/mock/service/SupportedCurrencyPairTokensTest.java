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
 * Enumerating supported currency-pair tokens implementation test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SupportedCurrencyPairTokensTest {

    @Autowired
    private MockMvc mvc;

    /**
     * Test for Enumerating supported currency-pair tokens results.
     */
    @Test
    public void getSupportedCurrencyPairTokensResults() throws Exception {
        mvc.perform(get("/")
                .param("mode", "list")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().string(not(containsString("\\n\\r"))))
                .andExpect(jsonPath("$", hasSize(3)))
                // First result.
                .andExpect(jsonPath("$[0].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[0].quote").value("USD"))
                .andExpect(jsonPath("$[0].base").value("XBT"))
                .andExpect(jsonPath("$[0].locale").value("en_US"))
                .andExpect(jsonPath("$[0].desc").value("Smoothed averages"))
                .andExpect(jsonPath("$[0].signature").doesNotExist())
                // Second result.
                .andExpect(jsonPath("$[1].cp").value("2"))
                .andExpect(jsonPath("$[1].quote").value("USD"))
                .andExpect(jsonPath("$[1].base").value("XBT"))
                .andExpect(jsonPath("$[1].locale").value("en_US"))
                .andExpect(jsonPath("$[1].desc").value("Updated per-trade"))
                .andExpect(jsonPath("$[1].signature").doesNotExist())
                // Third result.
                .andExpect(jsonPath("$[2].cp").value("XBTUSD-european"))
                .andExpect(jsonPath("$[2].quote").value("USD"))
                .andExpect(jsonPath("$[2].base").value("XBT"))
                .andExpect(jsonPath("$[2].locale").value("en_GB"))
                .andExpect(jsonPath("$[2].desc").doesNotExist())
                .andExpect(jsonPath("$[2].signature").doesNotExist());
    }

}
