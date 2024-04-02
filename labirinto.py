import turtle

# Funções para movimentar a tartaruga
def move_forward():
    turtle.forward(10)

def move_backward():
    turtle.backward(10)

def turn_left():
    turtle.left(10)

def turn_right():
    turtle.right(10)

def labirinto():
  t = turtle.Turtle()
  t.hideturtle()
  t.speed(0)
  t.penup()

# Configurações iniciais
screen = turtle.Screen()
screen.listen()
screen.title("Labirinto")

labirinto()

# Mapeamento das teclas para as funções correspondentes
screen.onkey(move_forward, "w")
screen.onkey(move_backward, "s")
screen.onkey(turn_left, "a")
screen.onkey(turn_right, "d")

# Mantém a janela aberta
turtle.done()
