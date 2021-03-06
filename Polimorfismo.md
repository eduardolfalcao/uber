# Exercício sobre Polimorfismo

Polimorfismo só acontece em uma situação na qual diferentes entidades podem realizar uma mesma ação de modo diferente.
Tecnicamente falando, isto só é possível com a aplicação de sobrescrita de métodos.
Vamos experimentar mais um exemplo que aborde essa situação.

## Mortal Kombat

Imagine que estamos implementando o jogo de Mortal Kombat.
Implemente a seguinte hierarquia de classes. 

<p align="center">
  <img src="mk.png" width="550" height="550">
</p>

- Crie construtores (lembre-se do reuso, subclasse reusa construtor da superclasse)
- Cerquilha (#) significa modificador protected, e + significa modificador público
- Os métodos de lutador devem tirar os seguintes danos:
    - Socar: 7
    - Chutar: 5
    - Atirar: 10
    - Lançar magia: 12
- Nas subclasses iremos sobrescrever alguns métodos:
    - Jax
        - socar: adicione mais 10 ao dano original de socar
    - NightWolf
        - atirar: adicione mais 5 ao dano original de atirar
        - lançar magia: adicione mais 6 ao dano original de lançar magia
    - SubZero
        - lançar magia: adicione mais 8 ao dano original de lançar magia
    - Rayden
        - lançar magia: adicione mais 9 ao dano original de lançar magia
    - Liu Kang
        - chutar: adicione mais 9 ao dano original de chutar
        - lançar magia: adicione mais 8 ao dano original de lançar magia
    - Sônia
        - chutar: adicione mais 8 ao dano original de chutar
        - socar: adicione mais 8 ao dano original de socar
        
Por fim, crie a classe MortalKombat.
- MortalKombat recebe dois lutadores.
- MortalKombat deve ter um método chamado fight():
    - enquanto a vida dos dois lutadores for maior que zero (ou seja, enquanto alguém estiver vivo), faça o seguitne:
        - sorteia um dos lutadores para atacar;
        - sorteia um tipo de golpe
        - realiza o golpe.

No fim, o programa deve dizer qual dos lutadores venceu a partida.
Experimente seu programa algumas vezes com lutadores diferentes.