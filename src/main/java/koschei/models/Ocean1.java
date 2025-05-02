package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    @Autowired
    private Island2 island;

    public Island2 getIsland() {
        return island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}