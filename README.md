# Utilizando o novo método

O método By.keyword() recebe string como parâmetro especificamente XPaths. O diferencial é caso seja encontrado na string o padrão *${keyword-present}*, o método substituirá em tempo de execução essa substring pelo valor correspondente presente em um arquivo de propriedade previamente carregado.

`By.keyword("//*[text()='${keyword-present}']");`

Para carregar uma propriedade no webdriber é utilizado o método estático RemoteWebDriver.addLanguagePropertie() passando como parâmetro a string com o caminho para o arquivo de propriedade.

`RemoteWebDriver.addLanguagePropertie("path/to/language.properties")`

# Configurar ambiente

Para configurar o ambiente é necessário executar `mvn install` para que todas as dependencias sejam instaladas.

Para instalar a versão modificada do Selenium é necessário baixar os jars, códigos fonte e arquivos de documentação pelo link [Google Drive Link](https://drive.google.com/drive/folders/1i9sfR1VVaHCipVhRfWvY9zbMaoeg5_IB?usp=sharing) e importa-lo para o projeto.

**Nota**: É necessário importar todos os arquivos presentes no diretório baixado.

# Atividades a serem implementadas

## 1. Teste do Google.com

### Utilizando os métodos conhecidos do Selenium

Crie testes para as línguas:

* Inglês (https://www.google.com/?hl=en)
* Português (https://www.google.com/?hl=pt)
* Espanhol (https://www.google.com/?hl=es)
* Italiano (https://www.google.com/?hl=it)

Pré-requisitos do teste

* Já deve existir instância de opções para o navegador
* Já deve existir instância do webdriver para o navegador.

Passos do teste

1. Vá para a página do https://www.google.com/?hl=en (Para a página em inglês)
2. Verifique que o botão Google Search está visivel
3. Verifique que o botão I'm Felling Lucky está presente
4. Verifique que a âncora Gmail está presente
5. Verifique que a âncora Imagens está presente

Após cada teste

* Finalize o webdriver.

### Utilizando novo metodo By.keyword

Crie um teste para as línguas:

* Inglês (https://www.google.com/?hl=en)
* Português (https://www.google.com/?hl=pt)
* Espanhol (https://www.google.com/?hl=es)
* Italiano (https://www.google.com/?hl=it)

Pré-requisitos do teste

* Já deve estar carregado no webdrive as propriedades de línguas
* Já deve existir instância de opções para o navegador
* Já deve existir instância do webdriver para o navegador

Passos do teste

1. Vá para a página do https://www.google.com/?hl=en (Para a página em inglês)
2. Verifique que o botão Google Search esta vísivel
3. Verifique que o botão I'm Felling Lucky esta presente
4. Verifique que a âncora Gmail esta presente
5. Verifique que a âncora Imagens esta presente

Após o teste

* Finalize o webdriver

## 2. Teste Liferay.com

### Utilizando os metodos conhecidos do Selenium

Crie testes para as línguas:

Site: https://www.liferay.com

* Inglês
* Português
* Espanhol
* Italiano
* Francês

Pré-requisitos do teste

* Já deve existir instância de opções para o navegador
* Já deve existir instância do webdriver para o navegador.

Passos do teste

1. Vá para a página do https://www.liferay.com
2. Click na seleção de línguas no topo da página
3. Selecione a lingua desejada para o teste
4. Verifique se os textos presentes na página estão visíveis.

Após cada teste

1. Finalize o webdriver.

### Utilizando novo método By.keyword

Crie um teste para as línguas:

Site: https://www.liferay.com

* Inglês
* Português
* Espanhol
* Italiano
* Francês

Pré-requisitos do teste

* Já deve existir instância de opções para o navegador
* Já deve existir instância do webdriver para o navegador.

Passos do teste

1. Vá para a página do https://www.liferay.com
2. Click na seleção de línguas no topo da página
3. Selecione a língua desejada para o teste
4. Verifique se os textos presentes na página estão visíveis.
5. Repita os passos 2 a 4 ate que todas as línguas tenham sido verificadas.

Após cada teste

1. Finalize o webdriver.

## Formulario

Ao final é necessário preencher o seguinte formulário com algumas perguntas sobre sua experiência com a ferramenta:

Link: https://forms.gle/hJ7LrecciwALV95m8
