package com.anas.Abstraction;

public abstract  class GraphicObject {
int x, y;


GraphicObject() {
	System.out.println("Abstract Base class");
}
void moveTo(int newX, int newY) {
	System.out.println("move to x :"  +x+"  and y:" +y);
}

abstract void draw();
abstract void resize();

}

