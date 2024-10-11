package org.example.model.event;


public record Event(
        EventType type,
        String message
) {
}
