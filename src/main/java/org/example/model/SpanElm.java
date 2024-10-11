package org.example.model;

import org.example.model.event.Event;
import org.example.model.event.EventType;

import java.awt.*;

public class SpanElm extends HtmlElement implements Renderable {

    public SpanElm() {
        super("span");
    }


    @Override
    public void render(Graphics2D g) {

    }

    @Override
    protected void handleEvent(Event event) {
        System.out.println("Clicked span Element");
    }

    @Override
    boolean canHandle(EventType eventType) {
        return eventType == EventType.CLICK;
    }
}
