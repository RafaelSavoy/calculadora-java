	INTRODUÇÃO AOS CONCEITOS DE LAYOUTS


	Os layout tem por serventia posicionar os elementos graficos dentro de uma interface, a escolha do layout correto se baseia na aplicação desejada. 
	Os 5 principais tipos de Layout são
	- BorderLayout: Divide a interface em cinco regiões: norte, sul, leste, oeste e centro.

	- FlowLayout: Posiciona os elementos em uma única linha segugindo a ordem que foram adcionados. 

	- GridLayout: Organiza os componentes em células e colunas de maneira uniforme.

	- CardLayout: Permite alternar entre diferentes painéis como se fossem cartões, exibindo apenas um de cada vez.

	- BoxLayout: Organiza os componentes de forma horizontal ou vertical, proporcionando flexibilidade na disposição.

	- GridBagLayout: Oferece um alto grau de controle sobre a disposição dos componentes, permitindo especificar características individuais para cada um.


RELATÓRIO DA CALCULADORA

Conceitos de Layouts e Sua Importância Os layouts desempenham um papel crucial na criação de interfaces de usuário eficientes e esteticamente agradáveis. Eles determinam como os componentes da interface são organizados e exibidos na janela do aplicativo. A escolha do layout adequado pode afetar a usabilidade, a eficiência e a estética de um aplicativo. Neste projeto, foram explorados dois tipos de layouts: BorderLayout e GridLayout.
BorderLayout: Este layout foi utilizado para a janela principal da calculadora. Ele divide a janela em cinco áreas principais: norte, sul, leste, oeste e centro. Isso permite que os componentes sejam organizados de forma hierárquica e eficaz. O campo de texto foi colocado na área norte, enquanto os botões da calculadora foram colocados na área central. O uso do BorderLayout permitiu uma disposição simples e intuitiva dos elementos.
GridLayout: Este layout foi utilizado para organizar os botões da calculadora. O GridLayout divide o espaço disponível em um número fixo de linhas e colunas, criando células uniformes para os componentes. Foi escolhido para organizar os botões da calculadora de forma uniforme em quatro linhas e quatro colunas. Isso criou uma grade de botões que facilita a interação do usuário com a calculadora.
Descrição Detalhada de Cada Versão da Calculadora Versão 1: BorderLayout A primeira versão da calculadora utilizou o layout BorderLayout para organizar os elementos. A janela principal da calculadora foi configurada com um BorderLayout, com o campo de texto na área norte e os botões da calculadora na área central. Essa versão ofereceu uma disposição simples e intuitiva dos elementos da interface.
Versão 2: GridLayout A segunda versão da calculadora utilizou o layout GridLayout para organizar os botões. Os botões foram organizados em quatro linhas e quatro colunas, criando uma grade uniforme. Isso facilitou a disposição dos botões e proporcionou uma experiência de usuário mais organizada.

Descrição da Calculadora de Conversão de Moeda 
Introdução:
A "Calculadora de Conversão de Moeda" é uma aplicação Java Swing que permite aos usuários converter valores monetários entre diferentes moedas estrangeiras. Ela utiliza uma interface gráfica para interagir com o usuário e fornecer resultados de conversão de moeda.

Componentes da Interface Gráfica:
A aplicação utiliza diversos componentes da biblioteca Swing para criar sua interface gráfica:

    JTextField (caixa1): É um campo de texto onde os usuários podem inserir o valor que desejam converter. 

    JLabels (label1, label2, label3, label4): São rótulos de texto que fornecem informações ao usuário. label1 e label3 fornecem informações sobre a conversão, enquanto label2 e label4 exibem as moedas selecionadas.

    JComboBoxes (comboBox1, comboBox2): São caixas de seleção que permitem aos usuários escolher as moedas de origem e destino para a conversão.

    JButtons: São botões que os usuários podem clicar para inserir valores, limpar a entrada ou iniciar a conversão. Eles também são usados para inserir dígitos e o botão "Converter" é usado para iniciar a conversão.

Layouts Utilizados:

A aplicação utiliza 3 layouts para organizar os componentes na interface gráfica:

    GridBagLayout (container principal): É o layout do painel principal da aplicação. Ele permite posicionar os componentes de forma flexível em linhas e colunas usando restrições de grade (GridBagConstraints). Isso é usado para organizar os painéis principais e subpainéis.

    GridLayout (painel2a): É usado para organizar os JComboBoxes (comboBox1 e comboBox2) e os Jlabels (label1, label2, label3 e label4) relacionados em uma grade de 2x3.

    BorderLayout (painel3): Organiza os componentes no painel de entrada de texto (caixa1) na parte superior e os botões na parte central. É um layout simples que aloca espaço de forma eficaz.

    GridBagLayout (painel3b): Este layout é usado para organizar os botões em uma grade flexível. Ele permite que os botões tenham tamanhos diferentes, com o botão "Converter" ocupando o espaço de 4 colunas.

Funcionalidade:

A aplicação possui as seguintes funcionalidades:

    Os JComboBoxes (comboBox1 e comboBox2) permitem ao usuário escolher as moedas de origem e destino para a conversão.

    O campo de texto (caixa1) permite ao usuário inserir o valor a ser convertido.

    Os botões numéricos permitem que o usuário insira valores digitando-os diretamente na caixa de texto.

    O botão "C" limpa o conteúdo da caixa de texto.

    O botão "Converter" inicia a conversão de moeda com base nas moedas selecionadas e no valor inserido na caixa de texto. O resultado da conversão é exibido na caixa de texto.



Comparação dos Layouts A comparação dos layouts baseou-se em vários critérios:

Usabilidade: Ambos os layouts são usáveis,GridBagLayout é um gerenciador de layout em Java que oferece uma flexibilidade  mas o GridLayout oferece uma organização  uniforme dos botões, tornando mais fácil para o usuário identificar e pressionar os números e operadores desejados.
Estética: A estética é subjetiva, mas o GridLayout tende a parecer mais organizado e equilibrado, enquanto o BorderLayout é adequado para layouts simples.
Espaço Utilizado: O GridLayout utiliza espaço de forma mais eficiente para os botões, enquanto o BorderLayout permite uma organização hierárquica de elementos.
Complexidade de Implementação: Ambos os layouts são relativamente simples de implementar, mas o GridLayout requer menos código para organizar os botões.
Reflexão sobre a Experiência de Aprendizado Durante a implementação das duas versões da calculadora, aprendemos que a escolha do layout é fundamental para a experiência do usuário. A versão com BorderLayout é mais adequada quando se deseja criar uma interface simples com componentes hierárquicos, enquanto o GridLayout é uma escolha eficaz para organizar elementos uniformes, como botões.
Além disso, a implementação da lógica da calculadora nos ensinou a importância da modularização e da clareza do código. A separação das funções matemáticas em métodos distintos facilitou a manutenção do código e melhorou a legibilidade.
No futuro, podemos aplicar essa experiência em projetos de interface do usuário mais complexos, escolhendo layouts apropriados de acordo com as necessidades específicas do aplicativo. Também continuaremos a aprimorar nossas habilidades de programação e design de interface para criar experiências de usuário mais eficientes e agradáveis.


Critérios a serem usados também:

1 - Importações: O código começa importando as classes necessárias do pacote javax.swing e java.awt para construir a interface gráfica da calculadora.
2 - Método main: O método main inicia a execução do programa, chamando o método createGUI() dentro de um bloco SwingUtilities.invokeLater(). Isso garante que a criação da interface gráfica seja executada na thread de eventos da interface gráfica (Event Dispatch Thread), evitando problemas de concorrência.
3 - Método createGUI(): Este método é responsável por construir a interface gráfica da calculadora.
4 - Configuração do Look and Feel: O método tenta definir o Look and Feel (aparência) do sistema através do método UIManager.setLookAndFeel(), que é usado para dar à interface gráfica a aparência do sistema operacional em que o programa é executado.
5 - Configuração da Janela: É criada uma instância de JFrame (a janela da aplicação) com o título "Calculadora no Estilo do Windows 11". O método setDefaultCloseOperation() é chamado para definir o comportamento ao fechar a janela. setSize() define as dimensões da janela, setLayout() define o layout da janela como BorderLayout e setLocationRelativeTo() posiciona a janela no centro da tela.
6 - Campo de Texto: Um JTextField é criado para exibir as entradas e resultados dos cálculos. Ele é configurado como não editável e com alinhamento à direita. É adicionado à parte superior da janela (NORTH) usando o BorderLayout.
7 - Painel de Botões: Um JPanel chamado buttonPanel é criado com um layout de grade 4x4 e preenchimento entre os botões. Isso cria o layout da calculadora com 16 botões.
8 - Botões: Um array de botões JButton é criado, representando os botões da calculadora. Os rótulos dos botões são definidos em um array buttonLabels contendo os dígitos, operadores e botões especiais da calculadora.
9 - Ciclo de Criação dos Botões: Um loop for é utilizado para criar e configurar cada botão da calculadora. Cada botão é configurado com fonte, cor de fundo e um ouvinte de ação (ActionListener). O ouvinte de ação é implementado inline, respondendo a cliques nos botões.
10 - Lógica de Cálculo: A lógica de cálculo ocorre dentro do ouvinte de ação dos botões. Quando um botão é clicado, o rótulo do botão é recuperado. Se o rótulo for "C", o campo de texto é limpo. Se for "=", a expressão no campo de texto é avaliada e o resultado é exibido. Caso contrário, o rótulo do botão é adicionado ao campo de texto.
11 - Avaliação de Expressões: A avaliação das expressões é implementada usando um analisador de expressões simples. A implementação é feita dentro de uma classe anônima. Ela utiliza uma abordagem de análise recursiva para avaliar expressões aritméticas simples contendo números, operadores de adição, subtração, multiplicação e divisão, além de parênteses.
12 - Adição de Componentes: Os botões são adicionados ao painel de botões (buttonPanel) e o painel é adicionado ao centro da janela.
13 - Exibição da Janela: Finalmente, a janela é configurada como visível.

Em resumo, a escolha do layout e a clareza do código desempenharam um papel fundamental no sucesso deste projeto de calculadora. A experiência adquirida será valiosa para projetos futuros, onde buscaremos criar interfaces de usuário excepcionais e funcionais.
