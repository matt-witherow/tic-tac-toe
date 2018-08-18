
public class Game {

  private final Board _board;
  private final Reader<Move> _in;
  private final Writer<Board> _out;

  public Game(Board b, Reader<Move> in, Writer<Board> out) {
    this._board = b;
    this._in = in;
    this._out = out;
  }

  public void play(){
    Move move = _in.read();
    Board board = turn(move);
    _out.write(board);
  }


  public Board turn(Move move){
    return _board.place(move);
  }
}
