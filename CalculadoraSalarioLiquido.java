//Primeiramente foi importada todas as bibliotecas, que possibilitaram o funcionamento dos layouts, sem elas o pacote básico do java não reconheceria os códigos usados

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.GridLayout;

//Foi definida uma "public class" para a "CalculadoraSalarioLiquido extends Jframe" que importa todos os métodos da classe
public class CalculadoraSalarioLiquido extends JFrame {

    // Foi definida uma variável privada boleana do tipo "Boolean" nomeada "isPlaceHolderActive"
    private boolean isPlaceholderActive = true;
     // Foi definida uma variável privada de texto do tipo "Boolean" nomeada "placeholderText"
    private final String placeholderText = "Digite seu Salário";

    //foi definido o construtor do tipo publico "public CalculadoraSalarioLiquido" 
    public CalculadoraSalarioLiquido() {
        //definimos o nome da frame através do construtor "Super"
        super("Calculadora Salario Líquido");

        //Foi usado o JPnael painel como painel principal
        JPanel painel = new JPanel(); // Painel principal
        JTextArea but = new JTextArea(1,15);
        JTextArea resultado = new JTextArea();
        JButton enviar = new JButton("Enviar");


        but.setForeground(Color.GRAY);
        but.setText(placeholderText);

        // Ao receber o foco, o placeholder desaparece
        but.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (isPlaceholderActive) {
                    but.setText("");
                    but.setForeground(Color.BLACK);
                    isPlaceholderActive = false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (but.getText().isEmpty()) {
                    but.setForeground(Color.GRAY);
                    but.setText(placeholderText);
                    isPlaceholderActive = true;
                }
            }
        });

        // set layout do painel principal para FlowLayout (padrão)
        painel.setLayout(new BorderLayout());

        // Painel para agrupar o campo de entrada e o botão
        JPanel inputPanel = new JPanel();
        inputPanel.add(but);
        inputPanel.add(enviar);

        painel.add(inputPanel, BorderLayout.NORTH);
        painel.add(resultado, BorderLayout.CENTER);

        // set do Frame
        setLayout(new BorderLayout()); // Definindo o layout do JFrame
        add(painel, BorderLayout.CENTER); // Adicionando o painel ao centro

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); // Ajustando o tamanho
        setLocationRelativeTo(null); // Centralizando a janela
        setVisible(true);

        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double salarioBruto = Double.parseDouble(but.getText());
                    double IR = salarioBruto * 0.11;
                    double INSS = salarioBruto * 0.08;
                    double sindicato = salarioBruto * 0.05;
                    double salarioLiquido = salarioBruto - IR - INSS - sindicato;

                    String resultadoTexto = "Salário Bruto: " + salarioBruto +
                            "\nGasto com IR: " + IR +
                            "\nGasto com INSS: " + INSS +
                            "\nGasto com Sindicato: " + sindicato +
                            "\nSalário Líquido: " + salarioLiquido;

                    resultado.setText(resultadoTexto);
                    but.setText(null);

                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
    }

}
