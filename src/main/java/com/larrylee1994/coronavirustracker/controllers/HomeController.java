package com.larrylee1994.coronavirustracker.controllers;

import com.larrylee1994.coronavirustracker.CoronavirusTrackerApplication;
import com.larrylee1994.coronavirustracker.models.LocationStats;
import com.larrylee1994.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(LocationStats::getLatestTotalCases).sum();
        int totalReportedYesterday = allStats.stream().mapToInt(LocationStats::getDifference).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalCases", totalReportedCases);
        model.addAttribute("totalDifference", totalReportedYesterday);
        return "home";
    }
}
