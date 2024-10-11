package org.example.model;

import org.example.model.event.Event;
import org.example.model.event.EventType;

import java.awt.*;

public class ParaElm extends HtmlElement implements Renderable {
    public ParaElm() {
        super("p");
    }

    @Override
    protected void handleEvent(Event event) {
        System.out.println("Clicked paragraph Element");
    }

    @Override
    boolean canHandle(EventType eventType) {
        return eventType == EventType.CLICK;
    }

    String content;
    int x, y;

    @Override
    public void render(Graphics2D g) {
        g.drawString(content, x, y);
    }
}
