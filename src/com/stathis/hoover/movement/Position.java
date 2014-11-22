package com.stathis.hoover.movement;

import java.awt.Point;

import com.stathis.hoover.validation.Validatable;

public class Position extends Point implements Validatable {
    
    private Dimensions dimensions = null;
    
    public Position(int x, int y) {
        super(x, y);
        
    }
    
    public Position(int x, int y, Dimensions dimensions) {
        super(x, y);
        this.dimensions = dimensions;
    }

    public Position(Point point, Dimensions dimensions) {
        this(point.x, point.y, dimensions);
    }

    public boolean isValid() {
        boolean isValid = false;
        
        if (dimensions != null && 
            x <= dimensions.x &&
            y <= dimensions.y) {
            return true;
        }
        
        return isValid;
    }
}
