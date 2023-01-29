# teste-backend-conexa
Repositório destinado ao teste para desenvolvedor Backend da Conexa.
</br>
Foram desenvolvidas duas apis com Spring boot:
</br>
**star-wars-api**: Referente ao desafio 1, onde é feita a comunicação com a api da SWAPI, obtendo os dados dos filmes e personagens de Star Wars.
</br>
**new-movie-api**: Referente ao desafio 2, esta api comporta-se como um client para a anterior, obtendo dados dos filmes com o personagem "Luke Skywalker" e adicionado mais um.
</br></br>
## Executando a aplicação
</br>
Para executar as aplicações, é necessário ter instalado o <b>Docker</b> e o <b>docker-compose</b>, além do <b>maven</b>, para buildar o projeto de ambas as apis.
</br>
Basta executar o comando abaixo: 
</br> <b>sh run.sh</b>
</br>
Será feito o build das duas apis e será feito o deploy de ambas com o Docker. 

## Testando a aplicação
</br>
<b>Desafio 1</b></br>
Para buscar a lista de filmes com o personagem "Luke "Skywalker", basta executar a seguinte requisição HTTP:</br>
GET: <b>http://localhost:8082/film/lukeSkywalkerFilms</b>
</br></br>
Para filtrar filmes por <b>title</b>, execute a seguinte requisição HTTP, passando como parâmetro na url o título:
</br>
GET: <b>http://localhost:8082/film/getByTitle?title=A+New+Hope</b> (Neste exemplo, consultando o filme com título "A new Hope")
</br></br>
Para filtrar filmes por <b>episode_id</b>, execute a seguinte requisição HTTP, passando como parâmetro na url o id do episódio:
</br>
GET: <b>http://localhost:8082/film/getByEpisodeId?id=5</b> (Neste exemplo, consultando o filme com episode_id 5)
</br></br>

<b>Desafio 2</b></br>
Para buscar a lista de filmes com participação de "Luke Skywalker" com adição de um novo filme, utilize a seguinte requisição Http:
</br>
GET: <b>http://localhost:8081/film/</b>
</br>
