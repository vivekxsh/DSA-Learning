package OOPS;

interface ChessMoves {
    void moves();
}

class Queen implements ChessMoves {
    public void moves() {
        System.out.println("Up, Down, Right, Left, Diagonal (All the direction)");
    }
}

class Rook implements ChessMoves {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessMoves {
    public void moves() {
        System.out.println("Up, Down, left, Right, Diagonal (By 1 place)");
    }
}

public class InterfaceOrMultipleInheritance {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
