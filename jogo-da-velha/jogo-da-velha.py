import random
board = [[1,2,3],[4,5,6],[7,8,9]]
board[1][1] = "X"


def DisplayBoard(board):
    print("+-------+-------+-------+")
    print("|       |       |       |")
    print("|   "+str(board[0][0])+"   |   "+str(board[0][1])+"   |   "+str(board[0][2])+"   |")
    print("|       |       |       |")
    print("+-------+-------+-------+")
    print("|       |       |       |")
    print("|   "+str(board[1][0])+"   |   "+str(board[1][1])+"   |   "+str(board[1][2])+"   |")
    print("|       |       |       |")
    print("+-------+-------+-------+")
    print("|       |       |       |")
    print("|   "+str(board[2][0])+"   |   "+str(board[2][1])+"   |   "+str(board[2][2])+"   |")
    print("|       |       |       |")
    print("+-------+-------+-------+")
    

def EnterMove(board):
    move = int(input("Escolha uma jogada: "))
    if (move <= 0 or move>9):
        print("Posição inválida")
    elif move <= 3:
        if (board[0][move-1] != "O" and board[0][move-1] != "X"):
            board[0][move-1]= "O"
        else: print("Posição inválida")
    elif move <= 6:
        if (board[1][move-4] != "O" and board[1][move-4] != "X"):
            board[1][move-4]= "O"
        else: print("Posição inválida")
    else:
        if (board[2][move-7] != "O" and board[2][move-7] != "X"):
            board[2][move-7]= "O"
        else: print("Posição inválida")

def MakeListOfFreeFields(board):
    freefields = []
    row = 0
    coluns = 0
    while (row < 3 and coluns < 3):
        while(row == 0 and coluns < 3):
            if (board[row][coluns]!="O" and board[row][coluns]!="X"):
                freefields.append((row,coluns))
            coluns +=1
        coluns = 0
        while(row == 1 and coluns < 3):
            if (board[row][coluns]!="O" and board[row][coluns]!="X"):
                freefields.append((row,coluns))
            coluns +=1
        coluns = 0
        while(row == 2 and coluns < 3):
            if (board[row][coluns]!="O" and board[row][coluns]!="X"):
                freefields.append((row,coluns))
            coluns +=1
        row+=1
    return freefields
        
def VictoryFor(board, sign):
    if board[0][0]==board[0][1]==board[0][2]==sign:
        print("Vitória do ",sign)
    elif board[1][0]==board[1][1]==board[1][2]==sign:
        print("Vitória do ",sign)
    elif board[2][0]==board[2][1]==board[2][2]==sign:
        print("Vitória do ",sign)
    elif board[0][0]==board[1][0]==board[2][0]==sign:
        print("Vitória do ",sign)
    elif board[0][1]==board[1][1]==board[2][1]==sign:
        print("Vitória do ",sign)
    elif board[0][2]==board[1][2]==board[2][2]==sign:
        print("Vitória do ",sign)
    elif board[0][0]==board[1][1]==board[2][2]==sign:
        print("Vitória do ",sign)
    elif board[0][2]==board[1][1]==board[2][0]==sign:
        print("Vitória do ",sign)
    else: return True

def DrawMove(board):
    freefields = MakeListOfFreeFields(board)
    move = random.choice(freefields)
    board[move[0]][move[1]] = "X"


while(True):
    DisplayBoard(board)
    EnterMove(board)
    vitoria = VictoryFor(board,"O")
    if (vitoria != True):
        DisplayBoard(board)
        break
    MakeListOfFreeFields(board)
    print("Bela jogada, minha vez .....")
    DrawMove(board)
    vitoria = VictoryFor(board,"X")
    if (vitoria !=True):
        DisplayBoard(board)
        break  
    if(MakeListOfFreeFields(board)==[]):
        print("Rapaixxx, deu velha!!!")
        break
    
