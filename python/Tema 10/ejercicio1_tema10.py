import tkinter
from tkinter import ttk


def reset():
    eleccion.set('')

def console_print(*args):
    print(eleccion.get())


window = tkinter.Tk()

main_frame = ttk.Frame(window, border=1, borderwidth=1, padding=15)
main_frame.pack(fill='both', expand=True, ipadx=20, ipady=20)

main_frame.columnconfigure(0, weight=6)

eleccion = tkinter.StringVar()
rb1 =ttk.Radiobutton(main_frame, text='Primera opcion', value='1', variable=eleccion)
rb2 =ttk.Radiobutton(main_frame, text='Segunda opcion', value='2', variable=eleccion)
rb3 =ttk.Radiobutton(main_frame, text='Tercera opcion', value='3', variable=eleccion)
rb4 =ttk.Radiobutton(main_frame, text='Cuarta opcion', value='4', variable=eleccion)
rb5 =ttk.Radiobutton(main_frame, text='Quinta opcion', value='5', variable=eleccion)

rb1.grid(column=0, row=0, padx=15, pady=5, sticky=tkinter.W)
rb2.grid(column=0, row=1, padx=15, pady=5, sticky=tkinter.W)
rb3.grid(column=0, row=2, padx=15, pady=5, sticky=tkinter.W)
rb4.grid(column=0, row=3, padx=15, pady=5, sticky=tkinter.W)
rb5.grid(column=0, row=4, padx=15, pady=5, sticky=tkinter.W)


eleccion.trace_add('write', console_print)

reset_button = ttk.Button(main_frame, text='Reset', command=reset)
reset_button.grid(column=0, row=6, padx=20, pady=20, sticky=tkinter.W)

window.mainloop()
