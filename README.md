![ReservaDeHotel(1)](https://github.com/user-attachments/assets/4e7a8b7c-90ca-4e7b-9417-db644f83bf66)

README - Sistema de Gerenciamento de Hotel
Descrição do Projeto

Este é um sistema desenvolvido em Java para gerenciamento de um hotel. O projeto contém funcionalidades que permitem criar, visualizar e gerenciar informações sobre quartos, reservas e clientes. O objetivo do sistema é facilitar a administração do hotel, otimizando o processo de registro e consulta de dados.

Funcionalidades do Sistema
1. Tela de Criação de Quarto

    Permite o cadastro de novos quartos no sistema.
    Campos disponíveis:
        Número do quarto.
        Tipo de quarto (ex.: simples, luxo).
        Preço por diária.
    Validação de dados para evitar duplicidade de número de quarto.

2. Tela de Criação de Clientes

    Permite o cadastro de clientes.
    Campos disponíveis:
        Nome completo.
        CPF.
        Telefone.
        E-mail.
    Inclui validações para documentos duplicados e formato de e-mail.

3. Tela de Criação de Reservas

    Permite o registro de novas reservas no sistema.
    Integração com as telas de Clientes e Quartos:
        Seleção de cliente a partir do cadastro existente.
        Escolha de um quarto disponível.
    Campos disponíveis:
        Cliente.
        Quarto.
        Data de check-in.
        Data de check-out.
        Status da reserva (ex.: pendente, confirmada).
    Verificação de disponibilidade do quarto antes de registrar a reserva.

4. Tela de Visualização de Quartos

    Exibe a lista de todos os quartos cadastrados no sistema.
    Informações exibidas:
        Número do quarto.
        Tipo de quarto.
        Disponibilidade atual.
    Filtros disponíveis para facilitar a consulta (ex.: por tipo ou disponibilidade).

5. Tela de Visualização de Reservas

    Exibe a lista de todas as reservas registradas.
    Informações exibidas:
        Cliente associado.
        Quarto reservado.
        Datas de check-in e check-out.
        Status da reserva.
    Opção de buscar reservas por cliente, quarto ou período.

Estrutura Relacional

    A Tela de Reservas possui um relacionamento direto com as telas de Clientes e Quartos:
        Uma reserva está vinculada a um cliente e a um quarto específico.
        O cliente e o quarto selecionados são exibidos nas informações da reserva.
    A tela de Criação de Reservas garante que somente quartos disponíveis possam ser reservados e que o cliente selecionado já esteja cadastrado no sistema.

Tecnologias Utilizadas

    Linguagem de Programação: Java
    Interface Gráfica: JavaSwing (dependendo do contexto do projeto).
    Banco de Dados: Postgres (para armazenar dados persistentes).
    ORM : Hibernate (para mapeamento objeto-relacional).
