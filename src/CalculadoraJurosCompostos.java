import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

public class CalculadoraJurosCompostos extends JPanel {
    private JTextField principalField;
    private JTextField taxaField;
    private JTextField periodoField;
    private JTextArea resultadoArea;

    public CalculadoraJurosCompostos() {
        setLayout(new BorderLayout());

        // Painel para a entrada de valores
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 5));
        principalField = createInputField("Principal (R$)");
        taxaField = createInputField("Taxa de Juros Anual (%)");
        periodoField = createInputField("Período (anos)");

        // Adicione um preenchimento interno nos campos de entrada para reduzir o
        // tamanho vertical
        principalField.setMargin(new Insets(2, 2, 2, 2));
        taxaField.setMargin(new Insets(2, 2, 2, 2));
        periodoField.setMargin(new Insets(2, 2, 2, 2));

        inputPanel.add(new JLabel("Principal (R$)"));
        inputPanel.add(principalField);
        inputPanel.add(new JLabel("Taxa de Juros Anual (%)"));
        inputPanel.add(taxaField);
        inputPanel.add(new JLabel("Período (anos)"));
        inputPanel.add(periodoField);

        // Botão para calcular
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularJurosCompostos();
            }
        });

        // Painel para o resultado
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        resultadoArea.setFont(new Font("Arial", Font.PLAIN, 16));
        resultadoArea.setOpaque(false);
        resultadoArea.setPreferredSize(new Dimension(200, 60));

        // Painel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(resultadoArea, BorderLayout.NORTH);
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(calcularButton, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.CENTER);

        setPreferredSize(new Dimension(400, 300));
    }

    private JTextField createInputField(String placeholder) {
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (textField.getForeground() == Color.GRAY) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
        return textField;
    }

    private void calcularJurosCompostos() {
        try {
            double principal = Double.parseDouble(principalField.getText().replace(',', '.'));
            double taxa = Double.parseDouble(taxaField.getText().replace(',', '.')) / 100.0;
            int periodo = Integer.parseInt(periodoField.getText().replace(',', '.'));

            double montante = principal * Math.pow(1 + taxa, periodo);
            double juros = montante - principal;

            DecimalFormat df = new DecimalFormat("#.00");
            String montanteFormatado = df.format(montante);
            String jurosFormatado = df.format(juros);

            resultadoArea.setText("Valor Final: R$ " + montanteFormatado + "\nJuros: R$ " + jurosFormatado);

        } catch (NumberFormatException ex) {
            resultadoArea.setText("Entrada inválida");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Calculadora de Juros Compostos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new CalculadoraJurosCompostos());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
