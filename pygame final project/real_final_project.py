import pygame
import sys
import random

# 初始化 Pygame
pygame.init()

# 設定初始視窗大小和標題
initial_window_size = (640, 480)
screen = pygame.display.set_mode(initial_window_size)
pygame.display.set_caption("阿偉的冒險")

# 加載背景圖片
background = pygame.image.load(r"pygame final project\Picture\Awei.png")
background = pygame.transform.scale(background, initial_window_size)

# 加載圖片
dirt_image = pygame.image.load(r"pygame final project\Picture\Road.png")
dirt_image = pygame.transform.scale(dirt_image, (225, 225))

positive_image = pygame.image.load(r"pygame final project\Picture\Grand ma.jpg")
positive_image = pygame.transform.scale(positive_image, (640, 480))
positive2_image = pygame.image.load(r"pygame final project\Picture\Drink.png")
positive2_image = pygame.transform.scale(positive2_image, (640, 480))
neutral_image = pygame.image.load(r"pygame final project\Picture\Nothinghappen.png")
negative_image = pygame.image.load(r"pygame final project\Picture\GAY p2-1.png")
negative2_image = pygame.image.load(r"pygame final project\Picture\Awei Bear.png")
negative2_image = pygame.transform.scale(negative2_image, (640, 480))
negative3_image = pygame.image.load(r"pygame final project\Picture\hole.png")
negative3_image = pygame.transform.scale(negative3_image, (640, 480))

end1 = pygame.image.load(r"pygame final project\Picture\End-1.png")
end1 = pygame.transform.scale(end1, (640, 480))
end2 = pygame.image.load(r"pygame final project\Picture\END2.png")
end2 = pygame.transform.scale(end2, (640, 480))

steve_hole_shovel_image = pygame.image.load(r"pygame final project\Picture\20b0148bbb39af5c9fbfd28e548faa36_AI Face Swap.png")
steve_hole_shovel_image = pygame.transform.scale(steve_hole_shovel_image, (225, 225))

# 加載音效
positive_sound = pygame.mixer.Sound(r"pygame final project\Music\you-are-my-sunshine-lebron-james.mp3")
positive2_sound = pygame.mixer.Sound(r"pygame final project\Music\我的世界~喝水‖视频音效‖Video Sound Effect‖Minecraft Drinking.MP3")
neutral_sound = pygame.mixer.Sound(r"pygame final project\Music\spongebob-squarepants-the-yellow-album-21-electric-zoo-audiotrimmer.mp3")
negative_sound = pygame.mixer.Sound(r"pygame final project\Music\Yelling.mp3")
negative2_sound = pygame.mixer.Sound(r"pygame final project\Music\Run.mp3")
negative3_sound = pygame.mixer.Sound(r"pygame final project\Music\oh hell no.MP3")
background_sound = pygame.mixer.Sound(r"pygame final project\Music\The Journey Ahead.mp3")

# 設定字體
font = pygame.font.SysFont(None, 30)

# 定義顯示時間（單位：毫秒）
display_time = 4000  # 5秒

# 設定計時器事件
SHOW_IMAGE_EVENT = pygame.USEREVENT + 1

# 創建按鈕函數
def create_button(text, x, y, width, height, color, hover_color, action=None):
    mouse = pygame.mouse.get_pos()
    click = pygame.mouse.get_pressed()

    if x + width > mouse[0] > x and y + height > mouse[1] > y:
        pygame.draw.rect(screen, hover_color, (x, y, width, height))
        if click[0] == 1 and action is not None:
            action()
    else:
        pygame.draw.rect(screen, color, (x, y, width, height))

    text_surf = font.render(text, True, (0, 0, 0))
    text_rect = text_surf.get_rect(center=(x + width / 2, y + height / 2))
    screen.blit(text_surf, text_rect)

# 定義按鈕功能
def start_game():
    global in_game, screen, game_window_size, steve_x, steve_y, move_direction, move_start_time, round_number, event_number, move_distance, initial_x, initial_y, HP, game_over, event_active
    in_game = True
    game_over = False
    event_active = False
    game_window_size = (675, 685)
    screen = pygame.display.set_mode(game_window_size)
    initial_x, initial_y = 225, 10 + font.get_height() + 225
    steve_x, steve_y = initial_x, initial_y
    move_direction = None
    move_start_time = 0
    round_number = 0
    event_number = 0
    move_distance = 0
    HP = 20
    background_sound.play(-1)
    background_sound.set_volume(0.1)

    # 開始背景音樂
    background_sound.play(-1)

def quit_game():
    pygame.quit()
    sys.exit()

def apply_random_event():
    global HP, event_number, current_event_image, show_image, current_sound, event_active
    event_type = random.choices(
        ['positive', 'positive2', 'neutral', 'negative1', 'negative2', 'negative3'],
        weights=[20, 20, 20, 25, 25, 30],
        k=1
    )[0]
    if event_type == 'positive':
        change = random.randint(1, 3)
        current_sound = positive_sound
        current_event_image = positive_image
        current_sound.set_volume(0.8)
    elif event_type == 'negative1':
        change = -random.randint(3, 5)
        current_sound = negative_sound
        current_event_image = negative_image
        current_sound.set_volume(0.8)
    elif event_type == 'negative2':
        change = -random.randint(3, 5)
        current_sound = negative2_sound
        current_event_image = negative2_image
        current_sound.set_volume(0.8)
    elif event_type == 'positive2':
        change = random.randint(1, 3)
        current_sound = positive2_sound
        current_event_image = positive2_image
        current_sound.set_volume(0.8)
    elif event_type == 'negative3':
        change = -random.randint(3, 5)
        current_sound = negative3_sound
        current_event_image = negative3_image
        current_sound.set_volume(1)
    else:
        change = 0
        current_sound = neutral_sound
        current_event_image = neutral_image
        current_sound.set_volume(0.8)

    HP = min(20, HP + change)
    event_number = change
    show_image = True
    event_active = True
    current_sound.play()
    pygame.time.set_timer(SHOW_IMAGE_EVENT, display_time)

def check_hp():
    global running, game_over
    if round_number > 15:
        screen.blit(end1, (25, 50))  # 回合數>=10時展示A圖
        pygame.display.flip()
        pygame.time.delay(4000)  # 展示圖片5秒鐘
        print(f"You reached {round_number} rounds.")
        pygame.quit()
        sys.exit()
    elif HP <= 0:
        screen.blit(end2, (25,50))  # HP<=0但未達到10回合時展示B圖 (negative_image)
        pygame.display.flip()
        pygame.time.delay(4000)  # 展示圖片5秒鐘
        print(f"You reached {round_number} rounds.")
        pygame.quit()
        sys.exit()



# 主遊戲循環
running = True
in_game = False
HP = 20
round_number = 0
event_number = 0
move_direction = None
move_start_time = 0
move_speed = 75
move_duration = 3000
move_step = move_speed // 10
move_distance = 0
show_image = False
current_event_image = None
current_sound = None
game_over = False
event_active = False

pygame.key.set_repeat(0, 0)

while running:
    current_time = pygame.time.get_ticks()
    
    if round_number > 15:
        screen.blit(end1, (25, 50))
        pygame.display.flip()
        pygame.time.delay(4000)
        print(f"Game ended. You reached {round_number} rounds.")
        break
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.KEYDOWN:
            if in_game and move_direction is None and not game_over and not event_active:
                if event.key in [pygame.K_w, pygame.K_s, pygame.K_a, pygame.K_d]:
                    round_number += 1
                    if event.key == pygame.K_w:
                        move_direction = 'UP'
                    elif event.key == pygame.K_s:
                        move_direction = 'DOWN'
                    elif event.key == pygame.K_a:
                        move_direction = 'LEFT'
                    elif event.key == pygame.K_d:
                        move_direction = 'RIGHT'
                    move_start_time = current_time
        if event.type == SHOW_IMAGE_EVENT:
            show_image = False  # 隱藏圖片
            event_active = False  # 允許移動
            if current_sound:
                current_sound.stop()  # 停止播放音樂
            pygame.time.set_timer(SHOW_IMAGE_EVENT, 0)  # 停止計時器
            if game_over:
                # 關閉背景音樂
                background_sound.stop()
    

    if in_game and not game_over:
        if move_direction is not None:
            elapsed_time = current_time - move_start_time
            if elapsed_time < move_duration and move_distance < 225:
                step = move_speed * (elapsed_time / 1000) - move_distance
                step = min(step, 225 - move_distance)
                if move_direction == 'UP' and steve_y > 10 + font.get_height():
                    steve_y -= step
                elif move_direction == 'DOWN' and steve_y < 685 - 225:
                    steve_y += step
                elif move_direction == 'LEFT' and steve_x > 0:
                    steve_x -= step
                elif move_direction == 'RIGHT' and steve_x < 675 - 225:
                    steve_x += step
                move_distance += abs(step)
            else:
                move_direction = None
                steve_x, steve_y = initial_x, initial_y
                move_distance = 0
                apply_random_event()
                check_hp()

        screen.fill((255, 255, 255))

        hp_text = font.render(f"HP: {HP}", True, (0, 0, 0))
        hp_text_rect = hp_text.get_rect(center=(112.5, 10 + font.get_height() / 2))
        screen.blit(hp_text, hp_text_rect)
        
        round_text = font.render(f"Round: {round_number}", True, (0, 0, 0))
        round_text_rect = round_text.get_rect(center=(screen.get_width() / 2, 10 + font.get_height() / 2))
        screen.blit(round_text, round_text_rect)

        event_text = font.render(f"Event: {event_number}", True, (0, 0, 0))
        event_text_rect = event_text.get_rect(center=(screen.get_width() - 100, 10 + font.get_height() / 2))
        screen.blit(event_text, event_text_rect)

        top_left_y = 10 + font.get_height()
        for i in range(3):
            for j in range(3):
                rect_x = j * 225
                rect_y = top_left_y + i * 225
                index = i * 3 + j + 1
                if index in {2, 4, 6, 8}:
                    screen.blit(dirt_image, (rect_x, rect_y))
                else:
                    pygame.draw.rect(screen, (0, 0, 0), (rect_x, rect_y, 225, 225))
        
        screen.blit(steve_hole_shovel_image, (steve_x, steve_y))

        if show_image and current_event_image:
            event_image_rect = current_event_image.get_rect(center=(screen.get_width() / 2, screen.get_height() / 2))
            screen.blit(current_event_image, event_image_rect)

    else:
        screen.blit(background, (0, 0))
        
        button_y = 120
        create_button("Start Game", 220, button_y, 200, 50, (200, 200, 200), (0, 0, 255), start_game)
        button_y += 60
        create_button("Leave Game", 220, button_y, 200, 50, (200, 200, 200), (0, 0, 255), quit_game)

    pygame.display.flip()

pygame.mixer.stop()
pygame.quit()