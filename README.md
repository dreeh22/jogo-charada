# Jogo de Charada

Como o nome já diz, essa aplicação é para demonstrar um jogo básico de charada, onde o sistema apresenta algumas charadas e o participante tem que resolvê-las.

Essa aplicação é constituída de duas Views(Páginas), onde na primeira view o participante consiguirá jogar o jogo seguindo os seguintes passos: 

1. Informe seu nome; 
2. Selecione as respostas para as 4 charadas existentes na página; 
3. Clique no botão "Salvar";
4. O sistema vai apresentar um pop-up, onde você deve clicar no botão "OK" para salvar de fato as respostas das charadas. Ao concluir, o sistema deve te redirecionar para a mesma página de cadastro, para caso você queira jogar novamente; 
5. Ao clicar no botão "Verificar Respostas" o sistema redireciona para a página "Participantes", nessa página, você conseguirá visualizar os participantes que como você, jogou o jogo.
6. Ao acessar a página de participantes, o sistema apresenta duas tabelas, uma ao lado esquerdo da página constando o gabarito das charadas, e outra tabela a direita constando os participantes e suas respectivas respostas. 

## Pré-requisitos para executar a aplicação:

1. Importe o projeto ( File -> Import -> Existing Maven Project)
2. O Eclipse vai atualizar as dependencias;
3. Crie um banco mysql com nome jogo;
4. As configurações do banco ficam no arquivo **application.properties** faça o apontamento para o seu banco e
execute a aplicação (procure a clase **SpringBootWebApplication** e clique no botão oposto em cima dela e va até Run as -> Java Aplication). Com isso o projeto irá criar as tabelas automaticamente;
5. Se estiver tudo ok, acesse http://localhost:8080/ para visualizar a aplicação.

## Referências:

[1] Spring Boot 1 - É um Framework Java (baseado na Plataforma Spring) para Aplicações web que usam inversão de contêiner de controle para a plataforma Java. https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-security

[2] Thymeleaf - É um engine de modelo Java XML / XHTML / HTML5 que pode funcionar tanto em ambientes da Web (baseados em Servlet) quanto em ambientes não-web. É mais adequado para servir XHTML / HTML5 na camada de visualização de aplicativos da web baseados em MVC, mas pode processar qualquer arquivo XML mesmo em ambientes off-line. Ele fornece integração completa do Spring Framework. https://www.thymeleaf.org

[3] Bootstrap - Framework para Aplicações Web responsiva - https://v4-alpha.getbootstrap.com/getting-started/introduction

[4] JQuery - Biblioteca de Funções JavaScript - https://jquery.com/

[5] ORM JPA - Abstarçaõ de Acesso a Dados - https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

[6] Maven - Gestão de Builds e Dependências - https://maven.apache.org

[7] Mysql 5 - Sistema de Gerenciamento de Banco de Dados - https://dev.mysql.com/downloads/mysql/


