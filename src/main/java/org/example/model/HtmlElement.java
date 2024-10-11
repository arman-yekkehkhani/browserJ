package org.example.model;

import org.example.model.event.Event;
import org.example.model.event.EventType;

import java.util.List;
import java.util.Map;

public abstract class HtmlElement {
    String token;
    Map<String, String> metadata;
    List<HtmlElement> children;
    HtmlElement parent;

    public HtmlElement(String token) {
        this.token = token;
    }

    void propagateEvent(Event event) {
        if (canHandle(event.type())) {
            handleEvent(event);
        }
        if (parent == null) return;
        parent.handleEvent(event);
    }

    protected abstract void handleEvent(Event event);

    abstract boolean canHandle(EventType eventType);
}
