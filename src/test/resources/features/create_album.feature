Feature: US No.1 Create an album containing multiple music tracks
  As a music enthusiast
  I want to create an album containing multiple music tracks
  So that I can organize and enjoy my favorite songs

  Scenario: Create a new album and add multiple music tracks
    Given I have an empty album
    When I add a music track with title "Track 1" and edition 2022
    Then the album should contain 1 music tracks
    And the album should have a music track with title "Track 1" and edition 2022

