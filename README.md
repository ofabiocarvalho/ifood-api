# ifood-api
Atividade da fase 6 FIAP

O código construído realiza a busca de informações em um JSON, não fizemos a implementação do crud completo para não criar complexidade de implementação de dados, porém com a abstração disponibilizada pelo JPA os métodos SAVE e DELETE são “nativas”.

* Pré-requisitos Java 8, Maven e Docker instalados

1 - Buildar o projeto com o comando: mvn clean install

2 - A imagem foi construída com o comando: docker build -t ofabiocarvalho/ifood:0.1 .

3 - Executar a imagem com o comando: docker run -p 8080:8080 ofabiocarvalho/ifood:0.1


