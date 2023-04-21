Feature: Search and play music tracks
  As a user of the music streaming service
  I want to search for music tracks by title
  And play the selected track
  So that I can listen to my favorite songs

  Scenario: Search for a music track by title and play it
    Given the music streaming service has the following music tracks
      | title    | edition |
      | Track 1  | 2021    |
      | Track 2  | 2022    |
      | Track 3  | 2020    |
    When I search for the music track with title "Track 1"
    Then I should see the music track with title "Track 1" and edition 2021
    When I select the music track with title "Track 1"
    Then the music track "Track 1" should start playing
