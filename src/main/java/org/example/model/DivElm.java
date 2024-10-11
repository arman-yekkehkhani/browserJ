package org.example.model;

import org.example.model.event.Event;
import org.example.model.event.EventType;

import java.awt.*;

public class DivElm extends HtmlElement implements Renderable{

    public DivElm() {
        super("div");
    }

    @Override
    public void render(Graphics2D g) {

    }

    @Override
    protected void handleEvent(Event event) {
        System.out.println("Clicked Div Element");
    }

    @Override
    boolean canHandle(EventType eventType) {
        return eventType == EventType.CLICK;
    }
}
