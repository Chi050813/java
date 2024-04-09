import pygame
import random
import time

pygame.init()

size = [400, 350]
screen = pygame.display.set_mode(size)
clock = pygame.time.Clock()

x = size[0] // 2
y = size[1] // 2 + 25

ballX = random.randrange(0, size[0])
ballY = random.randrange(50, size[1] - 50)

goalX = size[0] // 2 - 10
goalY = size[1] // 2 - 10
goalW = 20
goalH = 20

points = 0

blue = pygame.color.Color('#8080FF')
white = pygame.color.Color('#FFFFFF')
black = pygame.color.Color('#000000')

total_time = 30
start_time = time.time()

def checkOffScreenX(x):
    if x > size[0]:
        x = 0
    elif x < 0:
        x = size[0]
    return x

def checkOffScreenY(y):
    if y > size[1]:
        y = 50
    elif y < 50:
        y = size[1]
    return y

def checkTouching():
    global x, y, points

    if goalX <= x <= goalX + goalH and goalY <= y <= goalY + goalH:
        points += 1
        x = size[0] // 2
        y = size[1] // 2 + 25

done = False
while not done:
    screen.fill(black)

    pygame.draw.rect(screen, white, (0, 0, size[0], 50))

    keys = pygame.key.get_pressed()

    if keys[pygame.K_w]:
        y -= 1
    if keys[pygame.K_s]:
        y += 1
    if keys[pygame.K_a]:
        x -= 1
    if keys[pygame.K_d]:
        x += 1

    x = checkOffScreenX(x)
    y = checkOffScreenY(y)

    checkTouching()

    for point in range(points):
        pointX = 0 + point * 5
        pygame.draw.rect(screen, white, (pointX, 53, 4, 7))

    pygame.draw.circle(screen, blue, [ballX, ballY], 6)

    mouse_pos = pygame.mouse.get_pos()
    if pygame.mouse.get_pressed()[0]:
        if ballX - 6 <= mouse_pos[0] <= ballX + 6 and ballY - 6 <= mouse_pos[1] <= ballY + 6:
            points += 1
            ballX = random.randrange(0, size[0])
            ballY = random.randrange(50, size[1] - 50)

    remaining_time = max(0, total_time - (time.time() - start_time))
    remaining_time_str = "{:.1f}".format(remaining_time)
    font = pygame.font.Font(None, 36)
    text = font.render("Time left: " + remaining_time_str, True, black)
    text_rect = text.get_rect()
    text_rect.topright = (size[0] - 10, 10)
    screen.blit(text, text_rect)

    pygame.display.flip()
    
    if remaining_time <= 0:
        break

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True

    clock.tick(72)
pygame.quit()

print("Total points: " + str(points))