![ReservaDeHotel(2)](https://github.com/user-attachments/assets/69db23cd-75ab-42d1-8dec-623ae15eb794)
Projeto para a disciplina de LPOO do 4 semestre 

Tecnologias Utilizadas

Java 17

Hibernate JPA (para mapeamento objeto-relacional)

H2 Database (banco de dados em memória para desenvolvimento e testes)

Maven (para gerenciamento de dependências)

JavaFX (para criação das interfaces gráficas)

Funcionalidades

Gerenciamento de Reservas:

Criar novas reservas com informações de cliente, data de check-in e check-out.

Modificar reservas existentes.

Gerenciamento de Quartos:

Adicionar novos quartos com atributos como número, tipo e preço.

Atualizar informações dos quartos cadastrados.

Configuração Inicial do Banco de Dados

Durante a inicialização, o Hibernate criará as tabelas automaticamente com base nas classes anotadas.
Caso deseje adicionar dados iniciais, edite o arquivo data.sql na pasta resources/db.

Exemplo de Estruturas do Banco:

Tabela de Reservas (Reserva):

ID

Nome do cliente

Data de check-in

Data de check-out

Tabela de Quartos (Quarto):

ID

Número do quarto

Tipo (ex.: solteiro, casal, luxo)

Preço por noite
