package sg.edu.nus.iss.PlayerProfile.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.PlayerProfile.models.Footballer;

@Service
public class FootballerService {
    List<Footballer> squad = new ArrayList<>();

    public FootballerService() {
        squad.add(new Footballer("Cristiano", "Ronaldo", 187, 85, "ST"));
        squad.add(new Footballer("Anthony", "Martial", 181, 76, "ST"));
        squad.add(new Footballer("Jadon", "Sancho", 180, 76, "LW"));
        squad.add(new Footballer("Marcus", "Rashford", 180, 70, "LW"));
        squad.add(new Footballer("Bruno", "Fernandes", 179, 69, "CAM"));
        squad.add(new Footballer("Christian", "Eriksen", 182, 76, "CAM"));
        squad.add(new Footballer("Raphael", "Varane", 191, 81, "CB"));
        squad.add(new Footballer("Lisandro", "Martinez", 175, 77, "CB"));
        squad.add(new Footballer("Tyrell", "Malacia", 169, 67, "LB"));
        squad.add(new Footballer("David", "De Gea", 192, 82, "GK"));

    }

    public List<Footballer> getSquad() {
        return squad;
    }

    
}
