import time
import random
from tkinter import *

random_r = random.randint(0 , 255)
time.sleep(1)
random_g = random.randint(0 , 255)
time.sleep(1)
random_b = random.randint(0 , 255)

colour = (random_r , random_g , random_b)
print(colour)

clicks_r = 0
clicks_g = 0
clicks_b = 0

start = time.time()

goal = colour

def rgb_to_hex(rgb):
    return '#%02x%02x%02x' % (rgb)

def rendering():

    def get_values():
        return(int(red_slider.get()) , int(green_slider.get()) , int(blue_slider.get()))
    
    def check_correct():
        global goal
        global clicks_r
        global clicks_g
        global clicks_b
        global start

        if clicks_r == goal[0]:
            if clicks_g == goal[1]:
                if clicks_b == goal[2]:
                    score = time.time() - start
                    label.config(text = "Time: " + str(score))

    def button_r_Click():
        global clicks_r
    
        if clicks_r + 1 >= 255:
            clicks_r = 0
    
        else:
            clicks_r = clicks_r + 1
    
        red_slider.set(clicks_r)
        change = (clicks_r , clicks_g , clicks_b)
        canvas_second.configure(bg = rgb_to_hex(change))
        check_correct()

    def button_g_Click():
        global clicks_g
    
        if clicks_g + 1 >= 255:
            clicks_g = 0
    
        else:
            clicks_g = clicks_g + 1
    
        green_slider.set(clicks_g)
        change = (clicks_r , clicks_g , clicks_b)
        canvas_second.configure(bg = rgb_to_hex(change))
        check_correct()
    
    def button_b_Click():
        global clicks_b
    
        if clicks_b + 1 >= 255:
            clicks_b = 0
    
        else:
            clicks_b = clicks_b + 1
    
        blue_slider.set(clicks_b)
        change = (clicks_r , clicks_g , clicks_b)
        canvas_second.configure(bg = rgb_to_hex(change))
        check_correct()

    window = Tk()

    global colour

    canvas_first = Canvas(window , height = 300 , width = 300 , bg = rgb_to_hex(colour))
    red_slider = Scale(window , from_ = 0 , to = 255)
    green_slider = Scale(window , from_ = 0 , to = 255)
    blue_slider = Scale(window , from_ = 0 , to = 255)
    button_r = Button(window , text = "Click me" , command = button_r_Click)
    button_g = Button(window , text = "Click me" , command = button_g_Click)
    button_b = Button(window , text = "Click me" , command = button_b_Click)
    canvas_second = Canvas(window , height = 300 , width = 300 , bg = rgb_to_hex((0 , 0 , 0)))
    label = Label(window)

    canvas_first.grid(column = 1 , row = 0)
    red_slider.grid(column = 0 , row = 1)
    green_slider.grid(column = 1, row = 1)
    blue_slider.grid(column = 2 , row = 1)
    button_r.grid(column = 0 , row = 2)
    button_g.grid(column = 1 , row = 2)
    button_b.grid(column = 2 , row = 2)
    canvas_second.grid(column = 1 , row = 3)
    label.grid(column = 1 , row = 4)

    mainloop()

rendering()