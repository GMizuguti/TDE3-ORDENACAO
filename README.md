# TDE3-ORDENACAO

Trabalho de Ordenação da materia Problemas Estruturados em Computação. 

# Vetor 1 - Desordenado

Classificado pela quantidade de laços
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Bucket    | 100   | 21     |
| 2°      | Comb      | 138   | 22     |
| 3°      | Cocktail  | 160   | 78     |
| 4°      | Gnome     | 176   | 78     |
| 5°      | Bubble    | 195   | 78     |
| 6°      | Selection | 209   | 18     |

Classificado pela quantidade de trocas
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Selection | 209   | 18     |
| 2°      | Bucket    | 100   | 21     |
| 3°      | Comb      | 138   | 22     |
| 4°      | Cocktail  | 160   | 78     |
| 5°      | Gnome     | 176   | 78     |
| 6°      | Bubble    | 195   | 78     |


<img width="816" height="467" alt="Untitled design (2)" src="https://github.com/user-attachments/assets/8812e80b-c65d-4b27-ba9f-742e594fc7b0" />


<img width="825" height="459" alt="Untitled design (1)" src="https://github.com/user-attachments/assets/5dfeeeaf-5bf6-41a1-87c8-3b668046a678" />

# Vetor 2 - Ordem Crescente

Classificado pela quantidade de laços
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Cocktail  | 20    | 0      |
| 1°      | Bubble    | 20    | 0      |
| 1°      | Gnome     | 20    | 0      |
| 2°      | Bucket    | 90    | 11     |
| 3°      | Comb      | 118   | 0      |
| 4°      | Selection | 209   | 0      |

Classificado pela quantidade de trocas
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Cocktail  | 20    | 0      |
| 1°      | Bubble    | 20    | 0      |
| 1°      | Gnome     | 20    | 0      |
| 1°      | Selection | 209   | 0      |
| 1°      | Comb      | 118   | 0      |
| 2°      | Bucket    | 90    | 11     |


<img width="825" height="459" alt="Untitled design (3)" src="https://github.com/user-attachments/assets/ab25f350-ee43-49ad-83ad-dbb258f39432" />


<img width="815" height="459" alt="Untitled design (4)" src="https://github.com/user-attachments/assets/43a3a5c2-ebdb-49d7-99d7-4c2fa5a05d8e" />


# Vetor 3 - Ordem Decrescente

Classificado pela quantidade de laços
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Bucket    | 112   | 33     |
| 2°      | Comb      | 138   | 18     |
| 3°      | Cocktail  | 209   | 190    |
| 4°      | Bubble    | 209   | 190    |
| 5°      | Selection | 209   | 10     |
| 6°      | Gnome     | 400   | 190    |

Classificado pela quantidade de trocas
| Posição | Algoritmo | laços | trocas |
|---------|-----------|-------|--------|
| 1°      | Selection | 209   | 10     |
| 2°      | Comb      | 138   | 18     |
| 3°      | Bucket    | 112   | 33     |
| 4°      | Cocktail  | 209   | 190    |
| 5°      | Bubble    | 209   | 190    |
| 6°      | Gnome     | 400   | 190    |

<img width="825" height="474" alt="Untitled design (5)" src="https://github.com/user-attachments/assets/a0dcd50e-f732-4856-a731-f5472a7d5ba9" />

<img width="825" height="459" alt="Untitled design (6)" src="https://github.com/user-attachments/assets/cc58ee57-e537-40de-8108-df735c869f9a" />


# Saida do codigo

<details>

<summary> Saida no terminal </summary>


```javascript
Comb Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 22
Lacos = 138

Gnome Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 78
Lacos = 176

Bucket Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 21
Lacos = 100

Bubble Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 78
Lacos = 195

Selection Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 18
Lacos = 209

Cocktail Sort
Vetor ordenado = [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] 
Trocas = 78
Lacos = 160

-------------------------------------

Comb Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 0
Lacos = 118

Gnome Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 0
Lacos = 20

Bucket Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 11
Lacos = 90

Bubble Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 0
Lacos = 20

Selection Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 0
Lacos = 209

Cocktail Sort
Vetor ordenado = [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] 
Trocas = 0
Lacos = 20

-------------------------------------

Comb Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 18
Lacos = 138

Gnome Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 190
Lacos = 400

Bucket Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 33
Lacos = 112

Bubble Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 190
Lacos = 209

Selection Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 10
Lacos = 209

Cocktail Sort
Vetor ordenado = [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] 
Trocas = 190
Lacos = 200
```
</details>
