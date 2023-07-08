package CucumberDataTables.StepDefinitions;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTablesSteps {

    @Given("{string} play their home games at {string}")
    public void club_play_their_home_games_at_stadium(String club, String stadium) {
        System.out.printf("%s play their home games at %s%n", club, stadium);
    }

    @Given("the following clubs and their stadiums")
    public void the_following_clubs_and_their_stadiums(Map<String, String> stadiums) {
//        System.out.println(stadiums);
        stadiums.forEach((club, stadium) ->
                System.out.println(club + " play their home games at " + stadium));
    }


    @Given("{string} of {string}, born on {string}, plays for Juventus since the {string} season")
    public void player_of_country_born_on_date_plays_for_juventus_since_the_years_season(String name, String nationality, String dateOfBirth, String firstSeason) {
        System.out.printf("%s of %s, born on %s, plays for Juventus since the %s season%n", name, nationality, dateOfBirth, firstSeason);
    }

    @Given("the following Juventus players")
    public void the_following_juventus_players(List<Map<String, String>> players) {
//        System.out.println(players);

        for (Map<String, String> player : players) {
            System.out.printf(
                    "%s of %s, born on %s, plays for Juventus since the %s season%n",
                    player.get("name"),
                    player.get("nationality"),
                    player.get("dateOfBirth"),
                    player.get("atJuventusSince")
            );
        }

    }

    @Given("the final score of the Derby d'Italia played on {string} was Internazionale {int}, Juventus {int}")
    public void the_final_score_of_the_derby_d_italia_played_on_was_internazionale_juventus(String date, int interGoals, int juveGoals) {
        System.out.printf("The final score of the Derby d'Italia played on %s was Internazionale %d, Juventus %d", date, interGoals, juveGoals);
    }

    @Given("the following historic Derby d'Italia results")
    public void the_following_historic_derby_dItalia_results(Map<String, Map<String, Integer>> results) {
//        System.out.println(results);
        results.forEach((date, scores) ->
                System.out.printf(
                        "The final score of the Derby d'Italia played on %s was Internazionale %d, Juventus %d%n",
                        date,
                        scores.get("Internazionale"),
                        scores.get("Juventus")
                )
        );
    }

}
