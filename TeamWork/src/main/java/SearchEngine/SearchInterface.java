package SearchEngine;

import base.EventsEntity;
import base.UsersEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by demon on 06.03.2017.
 */
public interface SearchInterface {
    public UsersEntity getUserByloginAndPass(String login, String password);
    public List<EventsEntity> getFutureEvents(int lastEventNumber);
    public List<EventsEntity> getUsersEvents(UsersEntity user);
    public List<EventsEntity> getEventsForSearch(Map<String, String> SearchArguments);
    public List<EventsEntity> getClosestEvents();
}
