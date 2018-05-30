1. Display board
2. piece enters board
3. piece falls slowly, temporal dependence
4. user input
	i. rotate piece
	ii. shift piece
5. piece stop on collision
6. check for complete row
7. delete complete row
    i. this will create piece fragments
8. compact after delete row
9. score
	i. points increase slowly, temporal dependence
	ii. point increase burst when delete row

	
	
Objects(things)/methods(tasks)

    1. pieces(made of squares)
        A. Data
            i. Square[4][4] shape
            ii. orientation
            iii. position x
            iv. position y
        
        B. methods
            i. rotateLeft, rotateRight(check for collision)
            ii. shiftLeft, shiftDown, shiftRight(check for collision)
    
    2. score
        A. Data
            i. int Score
            ii. int streakMultiplier
        B. methods
            i. updateScore
            ii. updateMultiplier
    
    3. board
        A. Data
            i. board state, boolean[][] tracking full/empty squares
            ii. int score
            iii. Square[width][height], entire board
            iv. Piece currPiece
        B. methods
            i. boolean collision(Piece)
            ii. checkforCompleteRows(), iterate board state if all in row not null, then row is complete
            iii. removeRows()
            iv. compactPieces()
            vi. startGame()
            vii. releasePiece()
            viii. addPiece(Piece p), once not moving, copy piece component                          blocks into board state
    
    4. square
        A. Data
            i. Color color

    5. board display
    
    
 Implementation Order
 1. Constructors/Accessors
 2. Display/Print infrastructure to visualize state
 3. IN PARALLEL BUILD TESTS