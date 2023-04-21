package fr.dauphine.miageif.Agile.MusicStreamingTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/music_streaming.feature")
public class MusicStreamingTest {
}

