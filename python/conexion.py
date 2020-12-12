# -*- coding: utf-8 -*-
"""
Created on Wed Dec  9 20:10:21 2020

@author: Henry
"""


import pymssql

SERVER = "DESKTOP-A8HKVBP"
USER = "Hen"
PASSWORD = "123456"
DATABASE = "materias"

connection = pymssql.connect(server=SERVER, user=USER, 
                password=PASSWORD, database=DATABASE)

cursor = connection.cursor() # to access field as dictionary use cursor(as_dict=True)

cursor.execute("SELECT * FROM materia WHERE ci='7082735'")
resultado = cursor.fetchall()

print(resultado)
#for row in cursor:
 
#   print("1 |" + row[1] + " | " + "2 | " + row[2]+" | " + "3 |" + row[3]+" | ")
    # if you pass as_dict=True to cursor
    # print(row["message"])

connection.close()