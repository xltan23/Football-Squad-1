package sg.edu.nus.iss.PlayerProfile.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.edu.nus.iss.PlayerProfile.models.Footballer;
import sg.edu.nus.iss.PlayerProfile.models.Player;
import sg.edu.nus.iss.PlayerProfile.models.PlayerForm;
import sg.edu.nus.iss.PlayerProfile.services.FootballerService;
import sg.edu.nus.iss.PlayerProfile.services.PlayerService;

@Controller
public class PlayerController {
    private List<Player> applicants = new ArrayList<>();
    private List<Footballer> squad = new ArrayList<>();

    @Autowired
    PlayerService plySvc;

    @Autowired
    FootballerService fbSvc;

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value={"/dejavufc"}, method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping(value="/applicants", method=RequestMethod.GET)
    public String applicants(Model model) {
        applicants = plySvc.getApplicants();
        model.addAttribute("applicantList", applicants);
        return "applicants";
    }

    @RequestMapping(value="/playerForm", method=RequestMethod.GET)
    public String playerForm(Model model) {
        PlayerForm plyForm = new PlayerForm();
        model.addAttribute("playerForm", plyForm);
        return "playerForm"; 
    }

    @PostMapping(value="/playerForm")
    public String savePlayer(Model model, 
    @ModelAttribute("playerForm") PlayerForm playerForm) {
        String n = playerForm.getName();
        String e = playerForm.getEmail();
        int h = playerForm.getHeight();
        int w = playerForm.getWeight();
        String p = playerForm.getPosition();

        if (n != null && n.length() > 0 && e != null && e.length() > 0 && p != null && p.length() > 0 &&
        h > 150 && w > 50) {
            Player newPlayer = new Player(n, e, h, w, p);
            plySvc.addPlayer(newPlayer);

            return "redirect:/applicants";
        } else {
            model.addAttribute("errorMessage", errorMessage);
            return "playerForm";
        }

    }

    @GetMapping(value="/squad")
    public String squad(Model model) {
        squad = fbSvc.getSquad();
        model.addAttribute("squadList", squad);
        return "squad";
    }


}
