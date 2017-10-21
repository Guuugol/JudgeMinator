package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import dao.UserProfileDao;
import domain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anshipanov
 */
@Service
public class UserProfileService {

    @Autowired
    private UserProfileDao userProfileDao;

    public UserProfile find(long id) throws JsonProcessingException {
        return userProfileDao.find(id);
    }

    public void insert(UserProfile profile) throws JsonProcessingException {
        userProfileDao.create(profile);
    }
}
