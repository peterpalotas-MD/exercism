public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return "You're a level %d %s with %d hit points.".formatted(
                character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return "You've arrived at %s, which has %d inhabitants.".formatted(
                destination.getName(), destination.getInhabitants());
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination %s.".formatted(
                travelMethod.getDescription());
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return "You're a level %d %s with %d hit points. You're traveling to your destination %s. You've arrived at %s, which has %d inhabitants.".formatted(
                character.getLevel(), character.getCharacterClass(), character.getHitPoints(),
                travelMethod.getDescription(), destination.getName(), destination.getInhabitants());
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return "You're a level %d %s with %d hit points. You've arrived at %s, which has %d inhabitants.".formatted(
                character.getLevel(), character.getCharacterClass(), character.getHitPoints(),
                destination.getName(), destination.getInhabitants());
    }

}
