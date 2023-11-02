//package unicorndev.movies;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import unicorndev.movies.external.ApiMovieListDto;
//import unicorndev.movies.model.Movie;
//import unicorndev.movies.service.TmdbService;
//
//import java.io.IOException;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TmdbServiceTest {
//
//    @Autowired
//    private TmdbService tmdbService;
//
//    @Test
//    public void testGetTop10NowPlayingMovies() throws IOException {
//        List<ApiMovieListDto.ApiMovie> nowPlayingMovies = tmdbService.getTop10NowPlayingMovies();
//
//        assertNotNull(nowPlayingMovies);
//        assertEquals(10, nowPlayingMovies.size());
//    }
//}
