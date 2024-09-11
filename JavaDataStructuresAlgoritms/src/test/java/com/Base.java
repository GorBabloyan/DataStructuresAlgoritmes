package com;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Base {


    public static Logger logger ;

    @BeforeSuite
    public void setupSuite() {
        String folderPathAllure = "./allure-results";
        String folderPathLogs = "./log/testlogs.log";

        File folderAllure = new File(folderPathAllure);
        if (folderAllure.exists()) {
            deleteFolder(folderAllure);
        }
        File folderLogs = new File(folderPathLogs);
        if (folderLogs.exists()) {
            deleteFolder(folderLogs);
        }
        logger = Logger.getLogger("DataStructuresAlgorithms");
        PropertyConfigurator.configure("log4j.properties");

        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<< Test Suite Started  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");
        logger.info("");

    }


    @AfterSuite
    public void tearDownSuite() {

        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Test Suite finished  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ");

    }




//region < Extra >

    public static void deleteFolder(File folder) {
        // Check if the provided file is a directory
        if (folder.isDirectory()) {
            // Get list of files and subdirectories within the directory
            File[] files = folder.listFiles();

            // Delete each file and subdirectory recursively
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file);
                }
            }
        }
        // Delete the directory itself
        folder.delete();
    }


    public static String dateTimeNow() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");  //2024-05-29T15:30:45.123
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");  //2024-06-09 12:39

        // Format the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    public static String dateTimeNowMinusOneDay() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Subtract one day from the current date and time
        LocalDateTime dateTimeMinusOneDay = currentDateTime.minusDays(1);

        // Define the desired date-time format
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");  //2024-05-29T15:30:45.123
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");  //2024-06-09 12:39


        // Format the date and time minus one day
        String formattedDateTime = dateTimeMinusOneDay.format(formatter);

        return formattedDateTime;
    }

//        this._signalR.sendMessage(Methods.SubscribeToMatch, {MatchId:this.MatchId});
//        this.signalR.sendMessage(Methods.GetBanners, {Type:this.fragmentId});
//        this.signalR.sendMessage(Methods.GetFavoriteMatchIds, {ViewType:1})
//        this.signalR.sendMessage(Methods.AddMatchToFavorites, match.MatchId)
//        this.signalR.sendMessage(Methods.RemoveFavorite, match.MatchId)
//        this.signalR.sendMessage(Methods.AddCompetitionToFavorites, compId)
//        this.signalR.sendMessage(Methods.RemoveFavoriteCompetition, compId)
//        this.signalR.sendMessage(Methods.AddTeamToFavorites, teamId)
//        this.signalR.sendMessage(Methods.RemoveFavoriteTeam, teamId)
//        this.signalR.sendMessage(Methods.GetPlayerFavoriteTeams, {OddsType:0})
//        this.signalR.sendMessage(Methods.GetFavoriteMatches, {})
//        this.signalR.sendMessage(Methods.GetMatchesByTypeId, typeId, id, marketTypeId)
//        this.signalR.sendMessage(Methods.GetResults, this.resultsData)
//        this.signalR.sendMessage(Methods.Search, this.searchObj.pattern, this.searchObj.sportId)
//        this.signalR.sendMessage(Methods.UnsubscribeFromSport, sportId)

//        this.signalR.sendMessage(Methods.SubscribeToLiveMatchesOverView);
//        this.signalR.sendMessage(Methods.UnsubscribeFromLiveMatchesOverView)
//        this.signalR.sendMessage(Methods.SubscribeToLiveMatchesEventView);
//        this.signalR.sendMessage(Methods.UnsubscribeFromLiveMatchesEventView)
//        this.signalR.sendMessage(Methods.SubscribeToTopLiveMatches);
//        this.signalR.sendMessage(Methods.SubscribeToLiveMatchesEventView);
//        this.signalR.sendMessage(Methods.GetLiveTvSource);
//        this.signalR.sendMessage(Methods.MinLimit)
//        this.signalR.sendMessage(Methods.UnsubscribeFromOpenBets)
//        this.signalR.sendMessage(Methods.GetPlayerFavoriteCompetitionIds)
//        this.signalR.sendMessage(Methods.GetPlayerFavoriteTeamIds)

    //        client.sendMessage("{\"arguments\":[],\"invocationId\":\"0\",\"streamIds\":[],\"target\":\"Authorized\",\"type\":1}\u001e");


    //endregion










}

