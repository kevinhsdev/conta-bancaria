<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=200&section=header&text=Exercício%20de%20Fixação&fontSize=60&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Sistema%20Java%20-%20Conta%20Bancária%20em%20POO%20%7C%20kevinhsdev&descAlignY=55&descSize=18"/>

</div>

<img src="https://skillicons.dev/icons?i=java,idea" />

![Status](https://img.shields.io/badge/Status-Concluído-639922?style=for-the-badge)

---

## 📖 Sobre o projeto

Exercício de fixação em Java que simula operações básicas de uma conta bancária.
O usuário informa seus dados, pode realizar um depósito inicial, e em seguida
efetua um depósito e um saque com taxa fixa — aplicando conceitos de POO,
encapsulamento e manipulação de entrada de dados via console.

---

## ⚙️ Funcionalidades

| Função | Descrição |
|--------|-----------|
| Cadastro de conta | Informa código, nome e saldo inicial opcional |
| Depósito | Adiciona valor ao saldo atual |
| Saque | Subtrai valor + taxa fixa de $5,00 do saldo |
| Exibição de dados | Mostra conta, proprietário e saldo após cada operação |

---

## 🖥️ Demonstração

```
Digite o código da conta: 1234
Digite o seu nome: Kevin
Se tiver um valor inicial, digite 's', caso contrário 'n': s
Digite o valor inicial: 500.00

Dados da Conta:
Conta 1234, Proprietário: Kevin, Saldo: $ 500.0

Entre com o valor de deposito: 200.00

Dados da Conta:
Conta 1234, Proprietário: Kevin, Saldo: $ 700.0

Entre com o valor de saque: 100.00

Dados da Conta:
Conta 1234, Proprietário: Kevin, Saldo: $ 595.0
```

---

## 📂 Estrutura do projeto

```
fixacao/
├── src/
│   ├── Main.java       — fluxo principal e entrada de dados
│   └── Usuario.java    — modelo da conta (saldo, depósito, saque)
└── README.md
```

---

## ▶️ Como executar

```bash
# 1. Clone o repositório
git clone https://github.com/kevinhsdev/fixacao.git

# 2. Abra no IntelliJ IDEA

# 3. Execute Main.java e siga as instruções no console
```

---

## 📚 Conceitos praticados

- Programação Orientada a Objetos (POO)
- Encapsulamento · Getters e Setters
- Scanner e entrada de dados via console
- Operações com `double` e lógica condicional

---

## 👨‍💻 Autor

Feito por **Kevin Henrique** 🚀

[![GitHub](https://img.shields.io/badge/kevinhsdev-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kevinhsdev)

---

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=120&section=footer&text=Let's%20Code!&fontSize=40&fontColor=fff&animation=twinkling"/>
