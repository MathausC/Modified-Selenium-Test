# Utilizando o novo metodo

O metodo By.keyword() recebe string como parametro especificamente XPaths. O diferencial 'e que para se for encontrado na string o padrao *${keyword-present}* o metodo substituira em tempo de execucao essa substring pelo valor correspondente presente em um arquivo de propriedade previamente carregado.

`By.keyword("//*[text()='${keyword-present}']");`

Para carregar uma propriedade no webdriber se utiliza o metodo estatico RemoteWebDriver.addLanguagePropertie() passando como parametro a string com o caminho para o arquivo de propriedade.

`RemoteWebDriver.addLanguagePropertie("path/to/language.properties")`

# Atividades a serem implementadas

## 1. Teste do Google.com

### Utilizando os metodos conhecidos do Selenium

Crie testes para as linguas:

* Ingles (https://www.google.com/?hl=en)
* Portugues (https://www.google.com/?hl=pt)
* Espanhol (https://www.google.com/?hl=es)
* Italiano (https://www.google.com/?hl=it)

Prerequisitos do teste

* Ja deve existir instancia de opcoes para o navegador
* Ja deve existir instancia de do webdriver para o navegador.

Passos do teste

1. Va para a pagina do https://www.google.com/?hl=en (Para a pagina em ingles)
2. Verifique que o botao Google Search esta visivel
3. Verifique que o botao I'm Felling Lucky esta presente
4. Verifique que a ancora Gmail esta presente
5. Verifique que a ancora Imagens esta presente

Apos o cada teste

* Finalize o webdriver.

### Utilizando novo metodo By.keyword

Crie um teste para as linguas:

* Ingles (https://www.google.com/?hl=en)
* Portugues (https://www.google.com/?hl=pt)
* Espanhol (https://www.google.com/?hl=es)
* Italiano (https://www.google.com/?hl=it)

Prerequisitos do teste

* Ja deve estar carregado no webdrive as propriedades de linguas
* Ja deve existir instancia de opcoes para o navegador
* Ja deve existir instancia de do webdriver para o navegador

Passos do teste

1. Va para a pagina do https://www.google.com/?hl=en (Para a pagina em ingles)
2. Verifique que o botao Google Search esta visivel
3. Verifique que o botao I'm Felling Lucky esta presente
4. Verifique que a ancora Gmail esta presente
5. Verifique que a ancora Imagens esta presente

Apos o teste

* Finalize o webdriver

## 2. Teste Liferay.com

### Utilizando os metodos conhecidos do Selenium

Crie testes para as linguas:

Site: https://www.liferay.com

* Ingles
* Portugues
* Espanhol
* Italiano
* Frances

Prerequisitos do teste

* Ja deve existir instancia de opcoes para o navegador
* Ja deve existir instancia de do webdriver para o navegador.

Passos do teste

1. Va para a pagina do https://www.liferay.com
2. Click na selecao de linguas no topo da pagina
3. Selecione a lingua desejada para o teste
4. Verifique se os textos presentes na pagina estao visiveis.

Apos o cada teste

1. Finalize o webdriver.

### Utilizando novo metodo By.keyword

Crie um teste para as linguas:

Site: https://www.liferay.com

* Ingles
* Portugues
* Espanhol
* Italiano
* Frances

Prerequisitos do teste

* Ja deve existir instancia de opcoes para o navegador
* Ja deve existir instancia de do webdriver para o navegador.

Passos do teste

1. Va para a pagina do https://www.liferay.com
2. Click na selecao de linguas no topo da pagina
3. Selecione a lingua desejada para o teste
4. Verifique se os textos presentes na pagina estao visiveis.
5. Repita os passos 2 a 4 ate que todas as linguas tenham sido verificadas.

Apos o cada teste

1. Finalize o webdriver.
