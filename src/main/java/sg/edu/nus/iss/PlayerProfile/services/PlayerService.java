package sg.edu.nus.iss.PlayerProfile.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.PlayerProfile.models.Player;

@Service
public class PlayerService {
    
    List<Player> applicants = new ArrayList<>();

    public PlayerService() {
        
    }

    public List<Player> getApplicants() {
        return applicants;
    }

    public void addPlayer(Player p) {
        applicants.add(new Player(p.getName(), p.getEmail(), p.getHeight(), p.getWeight(), p.getPosition()));
    }
}
