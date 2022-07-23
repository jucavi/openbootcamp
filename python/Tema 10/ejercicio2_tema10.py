import tkinter
from tkinter import ttk

window = tkinter.Tk()

main_frame = ttk.Frame(window, border=1, borderwidth=1, padding=15)
main_frame.pack(fill='both', expand=True, ipadx=20, ipady=40)

main_frame.columnconfigure(0, weight=2)
main_frame.columnconfigure(1, weight=2)

lenguajes = [
    'Python',
    'Java',
    'JavaScript',
    'C',
    'PHP',
    'C/C++',
    'R',
    'TypeScript'
]

desc_label = ttk.Label(main_frame, text='Lenguajes de Programación')
desc_label.grid(column=0, row=0, padx=15, pady=5)

lista_lenguajes = ttk.Combobox(main_frame, values=lenguajes)
lista_lenguajes.grid(column=0, row=1)


window.mainloop()
