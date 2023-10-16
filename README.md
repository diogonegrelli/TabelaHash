Projeto realizado na aula de Estrutura de Dados, para a PUC-PR, o projeto tem como foco a criação de uma tabela HASH em java sem utilizar estruturas próprias do JAVA, no projeto foi criado
uma classe Cliente para representar os objetos que serão inseridos na tabela hash, tendo como atributos o ID e o nome do Cliente, mas para fins de manipulação da tabela hash vamos utilizar apenas o ID. Também foi criado dois modos de tratamento de colisões que são os seguintes:

1) Encadeamento Interior Heterogêneo, nesse tratamento o foco está em limitar as posições que podem ser usadas para inserção de elementos na tabela, nesse caso existem 13 slots para serem preenchidos porém a função hash irá se limitar a apenas 9 deles para serem usados para alocação inicial, e, em caso de colisão, serão usados os últimos slots de 9 a 13 para alocar elementos que colidiram. A imagem abaixo demonstra como foi feita a limitação de posições:
   ![image](https://github.com/diogonegrelli/TabelaHash/assets/85641230/69e24f53-badc-40c8-8d5e-2f32546cd259)
Para realizar a alocação de elementos nos slots finais é utilizada uma iteração dos slots a partir da posição 9. O resultado pode ser analisado nas prints abaixo:
![image](https://github.com/diogonegrelli/TabelaHash/assets/85641230/be9a3400-aa4a-430a-be77-3797870f48b6)

Cliente Carlos que estava na posição 0 foi removido e fica registrado o valor -2 para constar a remoção para fins de busca e futuras remoções.

Em seguida o cliente Cláudio, que pela função hash deveria estar na posição 0 também, foi alocado na posição 9, também foi removido. Importante perceber que o método de remoção passa pela posição 0 e percebe o valor -2 e segue a busca para o cliente Cláudio dentro dos slots reservados para colisões e realiza sua remoção também, como demonstra o print abaixo:

![image](https://github.com/diogonegrelli/TabelaHash/assets/85641230/0a848397-b011-4459-9c5f-9b7e8332ab8b)


   
2) Encadeamento Interior Homogêneo, nesta forma de tratamento de colisão o foco é encontrar o primeiro slot vazio para alocar os elementos que colidiram, e, caso colidam no mesmo slot novamente ele encontrará um novo slot para o mesmo. Isso também acontece em casos em que o resultado da função Hash da um valor X e esse valor já está ocupado por um valor Y que colidiu previamente com um valor Z, então o valor X será alocado no primeiro slot disponível após o seu valor. Para utilizar esse tratamento usaremos a função hash da seguinte maneira:

![image](https://github.com/diogonegrelli/TabelaHash/assets/85641230/a17123ff-5705-420a-bda8-a84a09e1dde4)

Desta forma o resultado será diferente da outra forma de tratamento visto que os elementos vao se alocando no primeiro slot disponível que encontram como demonstra o print a seguir:

