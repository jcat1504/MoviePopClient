package unicorndev.movies;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import unicorndev.movies.controller.MovieController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private MovieController movieController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(movieController).build();
    }

    @Test
    public void testGetNowPlayingMovies() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/movies/now-playing")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].title").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].releaseDate").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[*].poster").exists())
                .andReturn();
    }
}
