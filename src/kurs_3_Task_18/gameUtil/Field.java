package kurs_3_Task_18.gameUtil;

import kurs_3_Task_18.units.UnitType;

import java.util.ArrayList;

public class Field {
    ArrayList<ArrayList<Vertex>> adj;

    public class Vertex {
        private int index;
        private UnitType type;

        public Vertex(int index, UnitType type) {
            this.index = index;
            this.type = type;
        }

        public int getIndex() {
            return index;
        }

        public UnitType getType() {
            return type;
        }

    }

    public Field(ArrayList<ArrayList<Vertex>> adj) {
        this.adj = adj;
    }

    public Field() {
    }

    void addEdge(int u, int v) {

    }

    void addVertex() {

    }

    void removeEdge(int u, int v) {

    }

    void removeVertex(int u){

    }
}
