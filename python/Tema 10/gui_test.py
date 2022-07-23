import tkinter
from tkinter import ttk
import pprint


def click_izquierdo(event):
    pprint.pprint(event.widget)


window = tkinter.Tk()

# Grid configuration
window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=3)

username_label = ttk.Label(window, text='Username:')
username_label.grid(column=0, row=0, padx=5, pady=5, sticky=tkinter.W)

username_entry = ttk.Entry(window)
username_entry.grid(column=1, row=0, padx=5, pady=5, sticky=tkinter.E)


passw_label = ttk.Label(window, text='Password:')
passw_label.grid(column=0, row=1, padx=5, pady=5, sticky=tkinter.W)

passw_entry = ttk.Entry(window, show='*')
passw_entry.grid(column=1, row=1, padx=5, pady=5, sticky=tkinter.E)

login_button = ttk.Button(window, text='Login')
login_button.grid(column=1, row=3, padx=5, pady=5, sticky=tkinter.E)
login_button.bind('<Button-1>', click_izquierdo)

window.mainloop()
