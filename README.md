# g1
# Projeto Robô Seguidor de Linha

## 📘 Introdução
O avanço da tecnologia e o crescimento da automação têm impulsionado o desenvolvimento de sistemas inteligentes capazes de tomar decisões autônomas com base em lógica computacional. Entre esses sistemas, destacam-se os robôs móveis programados para executar trajetos definidos de forma eficiente, otimizando tempo e recursos. Este projeto propõe o desenvolvimento de um robô seguidor de linha virtual, utilizando a linguagem de programação Java e os princípios da Programação Orientada a Objetos (POO).

O robô atuará em um ambiente representado por uma matriz bidimensional, onde cada célula indica uma posição válida do mapa. A principal funcionalidade do sistema será permitir que o robô percorra a menor rota possível entre um ponto de partida e um ponto de destino, realizando o trajeto mais curto disponível. A rota será gerada por meio de algoritmos de caminho mínimo, com o objetivo de minimizar a quantidade de movimentos necessários para alcançar o destino.

O foco do projeto está na simulação lógica do deslocamento do robô sobre o mapa, utilizando estruturas de dados adequadas, algoritmos de busca e técnicas de modelagem orientada a objetos. A movimentação será feita passo a passo, respeitando as coordenadas da matriz e seguindo uma sequência previamente calculada com base na menor distância.

Este projeto oferece uma oportunidade prática de aplicar conceitos fundamentais de POO, como encapsulamento, herança e abstração, ao mesmo tempo em que introduz os alunos à resolução de problemas computacionais relacionados a rotas e otimização. Ao simular um robô capaz de analisar o mapa e escolher automaticamente o melhor caminho, busca-se desenvolver uma solução eficiente, clara e funcional para um desafio comum em áreas como logística e automação.

## Descrição do Problema
Encontrar o caminho mais curto entre dois pontos dentro de um ambiente é um desafio comum em sistemas de automação e logística. Quando esse ambiente é representado por uma matriz, a ausência de um algoritmo eficiente pode levar à escolha de trajetos mais longos, resultando em desperdício de tempo e recursos.

Mesmo em um mapa sem obstáculos, escolher o melhor trajeto manualmente ou de forma aleatória não garante a eficiência do percurso. Além disso, a falta de estruturação orientada a objetos dificulta a organização do código e a reutilização de componentes.

Diante disso, torna-se necessário desenvolver um sistema capaz de calcular automaticamente a menor rota em uma matriz e simular o deslocamento de um robô virtual, aplicando conceitos de POO e lógica computacional para otimizar o trajeto.

## Motivação
Este projeto foi escolhido como uma forma de consolidar conhecimentos de programação orientada a objetos por meio de um desafio concreto e didático. A ideia de simular um robô que percorre uma matriz seguindo a menor rota até um destino combina lógica computacional, organização de código e clareza na estruturação das classes.

A proposta também desperta interesse por permitir a visualização prática do resultado: o caminho mais eficiente sendo percorrido passo a passo. Isso torna o aprendizado mais envolvente, ao mesmo tempo que desenvolve habilidades úteis para problemas que exigem análise de trajetos, otimização e autonomia de execução.



## 🎯 Objetivos

### Objetivo Geral:
Desenvolver um sistema, utilizando Java e Programação Orientada a Objetos, que simule o deslocamento de um robô virtual sobre um mapa representado por uma matriz, permitindo que ele encontre e percorra automaticamente a menor rota possível até um ponto de destino.


### Objetivos Específicos:
- Representar o mapa do ambiente por meio de uma matriz bidimensional.

- Definir posições inicial e final do percurso a ser realizado pelo robô.

- Implementar um algoritmo que calcule a menor rota possível entre os dois pontos.

- Criar uma classe Robo que percorra a matriz seguindo a rota calculada.

- Simular o deslocamento do robô, atualizando sua posição a cada movimento.

- Aplicar os conceitos de Programação Orientada a Objetos, como encapsulamento, herança e abstração, na estrutura do sistema.

- Organizar o projeto com diagramas UML, como diagrama de classes e de sequência.

- Testar e validar o funcionamento correto da rota e da movimentação do robô.
- 
## 👥 Integrantes
- Yasmin
- Maria Fernanda
- Samuel

## 📌 Divisão de Tarefas

| Tarefa                               | Responsável | Descrição                                                                                           | Prazo   |
|--------------------------------------|-------------|---------------------------------------------------------------------------------------------------- |---------|
| Modelagem das classes                | Maria       | Levantar as classes iniciais do projeto: Robô, Sensor, Motor,<br>Controlador.                       | 09/06   |
| Atributos e métodos                  | Yasmin      | Identificar os atributos e<br>comportamentos de cada classe.                                        | 09/06   |
| Herança e composição                 | Maria       | Estruturar relações de herança como SensorDeLuz,<br>Potência e ControladorDeMovimento.              | 16/06   |
| Diagrama de classes UML              | Yasmin      | Criar o diagrama UML com classes,<br>atributos, métodos e heranças.                                 | 16/06   |
| Documentação                         | Samuel      | Redigir as seções 1 e 2<br>do relatório.                                                            | 09/06   |
| Diagrama de sequência e casos de uso | Samuel      | Montar os diagramas de sequência<br>e casos de uso.                                                 | 09/06   |
| Implementação inicial                | Todos       | Iniciar a implementação colaborativa das classes<br>e métodos definidos em Java.                    | 30/06   |



## 🗂️ Organização
- Código-fonte: `/src/`
  
  📦 [Download da tarefa Atributos e métodos (.zip)](atributos_metodos.zip)
  
  📦 [Download da classe criada em sala Mapa (.zip)](mapaAtacadista.zip)


- Diagramas:
  
  ![Diagrama de Classes](https://github.com/poo-ee-2025-1/g1/blob/main/diagramas/diagrama.png?raw=true)
  
- Diagrama de Classes UML

![Diagrama UML](https://github.com/poo-ee-2025-1/g1/blob/main/diagramas/diagrama%20UML%20das%20classes.png?raw=true)

  
- Relatórios individuais: `/relatorios/`

## 🔧 Tecnologias
- Java
- Git & GitHub
- UML (Draw.io)
- BlueJ / VS Code
