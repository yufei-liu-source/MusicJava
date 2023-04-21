package fr.dauphine.miageif.Agile.AlbumTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/create_album.feature")
public class AlbumCucumberTest {
}

