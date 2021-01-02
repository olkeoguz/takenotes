package com.example.takenotes.service.currentuser;

import com.example.takenotes.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
