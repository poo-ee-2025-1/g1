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

## Estratégias de Implementação
### Análise de Requisitos
Levantar e documentar todos os requisitos funcionais e não funcionais do sistema, como o percurso pelo mapa, definição dos pontos inicial e final, e critérios para cálculo da rota mínima, em colaboração com os envolvidos no projeto.

### Modelagem do Sistema
Criar diagramas UML, incluindo diagramas de classes e de sequência, para representar a estrutura do sistema e o fluxo da movimentação do robô.

### Desenvolvimento Modular
Implementar o sistema em módulos, separando a lógica do cálculo da rota, a representação do mapa e a movimentação do robô para facilitar manutenção e testes.

### Testes e Validação
Realizar testes unitários e de integração para assegurar que o cálculo da rota mínima está correto e que o robô percorre a matriz conforme esperado.

## 📌 Divisão de Tarefas
- Maria Fernanda: Desenvolvedor Backend
- Samuel Vaz: Desenvolvedor Frontend
- Yasmin: Analista de Sistemas + Testador

## 🗂️ Organização
- Código-fonte: `/src/`
  
  📦 [Projeto Robo (.zip)](codigo-fonte/ProjetoRoboFinal.zip)

- Diagramas:
  
 ![Diagrama Casos de Uso](https://github.com/poo-ee-2025-1/g1/blob/main/diagramas/casos%20de%20uso.png?raw=true)
  
- Diagrama de Classes UML

 ![Diagrama UML](https://github.com/poo-ee-2025-1/g1/blob/main/diagramas/diagrama%20de%20classes%20projeto%20robo.png?raw=true)

  
- Relatórios individuais: [relatórios](./relatorios)

## 🛠️ Instruções de Instalação e Execução
### ✅ Instalação da IDE
Recomenda-se o uso da IDE BlueJ, utilizada no desenvolvimento deste projeto.

Site oficial para download: [Baixar BlueJ](https://www.bluej.org)

### ✅ Instalação do Java
Recomenda-se a instalação da versão Java 21.0.2 (Java SE Development Kit).

Site oficial para download: [Baixar Java 21.0.2](https://www.oracle.com/java/technologies/javase-downloads.html)

## ▶️ Execução do Projeto
- Certifique-se de que o Java e o BlueJ estão corretamente instalados.

- Abra a IDE BlueJ.

- No menu, clique em “Projeto” → “Abrir Projeto…” e selecione a pasta do projeto.

- Com o projeto carregado, clique com o botão direito na classe MainJavaFX.

- Selecione a opção “Executar aplicação JavaFX”.

- A simulação será iniciada, exibindo o deslocamento do robô na matriz.
