package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GenericModelTest {

    @Test
    void createSimpleDOM() {
        ParaElm p = new ParaElm();
        p.x = 10;
        p.y = 10;
        p.content = "Hello babe!";

        DivElm div = new DivElm();
        div.children = List.of(p);
    }

}
