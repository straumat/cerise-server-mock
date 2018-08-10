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
 * Historical exchange rates implementation test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HistoricalExchangeRatesTest {

    @Autowired
    private MockMvc mvc;

    /**
     * Historical exchange rates test results.
     */
    @Test
    public void getHistoricalExchangeRatesResults() throws Exception {
        mvc.perform(get("/")
                .param("mode", "history")
                .param("cp", "XBTUSD-ver4,2")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().string(not(containsString("\\n\\r"))))
                .andExpect(jsonPath("$", hasSize(18)))
                // First result.
                .andExpect(jsonPath("$[0].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[0].time").value(1488760000))
                .andExpect(jsonPath("$[0].rates.typical").value(1300))
                // Second result.
                .andExpect(jsonPath("$[1].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[1].time").value(1488760010))
                .andExpect(jsonPath("$[1].rates.typical").value(1301.1))
                // Third result.
                .andExpect(jsonPath("$[2].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[2].time").value(1488760020))
                .andExpect(jsonPath("$[2].rates.typical").value(1320))
                // Fourth result.
                .andExpect(jsonPath("$[3].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[3].time").value(1488760030))
                .andExpect(jsonPath("$[3].rates.typical").value(1305))
                // Fifth result.
                .andExpect(jsonPath("$[4].cp").value("2"))
                .andExpect(jsonPath("$[4].time").value(1488760000.1))
                .andExpect(jsonPath("$[4].rates.typical").value(1300))
                // 6th result.
                .andExpect(jsonPath("$[5].cp").value("2"))
                .andExpect(jsonPath("$[5].time").value(1488760010.2))
                .andExpect(jsonPath("$[5].rates.typical").value(1301.1))
                // 7th result.
                .andExpect(jsonPath("$[6].cp").value("2"))
                .andExpect(jsonPath("$[6].time").value(1488760020.2))
                .andExpect(jsonPath("$[6].rates.typical").value(1320.111332))
                // 8th result.
                .andExpect(jsonPath("$[7].cp").value("2"))
                .andExpect(jsonPath("$[7].time").value(1488760031))
                .andExpect(jsonPath("$[7].rates.typical").value(1305.222311))
                // 9th result.
                .andExpect(jsonPath("$[8].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[8].time").value(1488760040))
                .andExpect(jsonPath("$[8].rates.typical").value(1303.33))
                // 10th result.
                .andExpect(jsonPath("$[9].cp").value("2"))
                .andExpect(jsonPath("$[9].time").value(1488760042))
                .andExpect(jsonPath("$[9].rates.typical").value(1303.33))
                // 11th result.
                .andExpect(jsonPath("$[10].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[10].time").value(1488760050))
                .andExpect(jsonPath("$[10].rates.typical").value(1305))
                // 12th result.
                .andExpect(jsonPath("$[11].cp").value("2"))
                .andExpect(jsonPath("$[11].time").value(1488760052))
                .andExpect(jsonPath("$[11].rates.typical").value(1307))
                // 13th result.
                .andExpect(jsonPath("$[12].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[12].time").value(1488760060))
                .andExpect(jsonPath("$[12].rates.typical").value(1309))
                // 14th result.
                .andExpect(jsonPath("$[13].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[13].time").value(1488760072))
                .andExpect(jsonPath("$[13].rates.typical").value(1308))
                // 15th result.
                .andExpect(jsonPath("$[14].cp").value("2"))
                .andExpect(jsonPath("$[14].time").value(1488760062))
                .andExpect(jsonPath("$[14].rates.typical").value(1309.55555555))
                // 16th result.
                .andExpect(jsonPath("$[15].cp").value("2"))
                .andExpect(jsonPath("$[15].time").value(1488760072))
                .andExpect(jsonPath("$[15].rates.typical").value(1308))
                // 17th result.
                .andExpect(jsonPath("$[16].cp").value("XBTUSD-ver4"))
                .andExpect(jsonPath("$[16].time").value(1488760082))
                .andExpect(jsonPath("$[16].rates.typical").value(1309))
                // 18th result.
                .andExpect(jsonPath("$[17].cp").value("2"))
                .andExpect(jsonPath("$[17].time").value(1488760082))
                .andExpect(jsonPath("$[17].rates.typical").value(1309.1));
    }

}
