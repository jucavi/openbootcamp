import sqlite3

def drop_table(conn, table_name):
    cur = conn.cursor()

    query = f'DROP TABLE IF EXISTS {table_name};'
    cur.execute(query)

    cur.close()


def create_table(conn, table_name):
    cur = conn.cursor()

    query = f'CREATE TABLE {table_name} (id INT, nombre TEXT, apellido TEXT);'
    cur.execute(query)

    cur.close()


def insert_into_table(conn, table_name, id, nombre, apellido):
    cur = conn.cursor()

    query = f'INSERT INTO {table_name} (id, nombre, apellido) VALUES (?, ?, ?);'
    cur.execute(query, (id, nombre, apellido))

    conn.commit()
    cur.close()


def find_into_table(conn, table_name, **kwargs):
    cur = conn.cursor()
    condiciones = ' AND '.join(f'{column}="{value}"' for column, value in kwargs.items())

    query = f'SELECT * FROM {table_name} WHERE {condiciones}'
    res = cur.execute(query).fetchone()

    cur.close()
    return res


if __name__ == '__main__':
    db = 'tema11.db'
    table_name = 'Alumnos'
    nombres = [
        'Jorge',
        'Sara',
        'Lucia',
        'Javier',
        'Oscar',
        'Arantxa',
        'Carmen',
        'Leire'
    ]

    apellidos = [
        'Garcia',
        'Martinez',
        'Lopez',
        'Sanchez',
        'Rodriguez',
        'Fernandez',
        'Perez',
        'Gonzalez'
    ]

    conn = sqlite3.connect(db)

    drop_table(conn, table_name)
    create_table(conn, table_name)

    for id, (nombre, apellido) in enumerate(zip(nombres, apellidos), start=1):
        insert_into_table(conn, table_name, id, nombre, apellido)

    res = find_into_table(conn, table_name, nombre='Oscar1')
    if res:
        print('Encontrado:', res)
    else:
        print('No encontrado')

    conn.close()
