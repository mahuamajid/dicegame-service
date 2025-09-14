package com.example.dicegame.service;

import com.example.common.model.event.NotificationEvent;

public interface NotificationService {
    void send(NotificationEvent event);
}
