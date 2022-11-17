package org.example.adapter.exercise;

public class SquareAdapter implements Rectangle{
    private Square square;


    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double getWidth() {
        return square.getSide();
    }

    @Override
    public double getHeight() {
        return square.getSide();
    }
}
