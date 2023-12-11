
// Importar as classes necessárias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Criar uma classe que estende JFrame e implementa ActionListener
public class TelaDespesas extends JFrame implements ActionListener {

    // Declarar os componentes da tela
    private JLabel titulo, combustivel, financiamento, diversos, total;
    private JTextField campoCombustivel, campoFinanciamento, campoDiversos, campoTotal;
    private JButton botaoCalcular, botaoLimpar;

    // Criar um construtor para inicializar os componentes e definir suas
    // propriedades
    public TelaDespesas() {
        // Definir o título da tela
        super("Tela de Cadastro de Despesas");

        // Obter o painel de conteúdo da tela
        Container painel = getContentPane();

        // Definir o layout do painel como nulo (sem gerenciador de layout)
        painel.setLayout(null);

        // Criar os componentes da tela
        titulo = new JLabel("Cadastro de Despesas");
        combustivel = new JLabel("Combustível (R$):");
        financiamento = new JLabel("Financiamento (R$):");
        diversos = new JLabel("Diversos (R$):");
        total = new JLabel("Total (R$):");
        campoCombustivel = new JTextField();
        campoFinanciamento = new JTextField();
        campoDiversos = new JTextField();
        campoTotal = new JTextField();
        botaoCalcular = new JButton("Calcular");
        botaoLimpar = new JButton("Limpar");

        // Definir as posições e tamanhos dos componentes
        titulo.setBounds(150, 20, 200, 30);
        combustivel.setBounds(50, 70, 150, 30);
        campoCombustivel.setBounds(200, 70, 100, 30);
        financiamento.setBounds(50, 120, 150, 30);
        campoFinanciamento.setBounds(200, 120, 100, 30);
        diversos.setBounds(50, 170, 150, 30);
        campoDiversos.setBounds(200, 170, 100, 30);
        total.setBounds(50, 220, 150, 30);
        campoTotal.setBounds(200, 220, 100, 30);
        botaoCalcular.setBounds(100, 270, 100, 30);
        botaoLimpar.setBounds(250, 270, 100, 30);

        // Definir as fontes dos componentes
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        combustivel.setFont(new Font("Arial", Font.PLAIN, 16));
        financiamento.setFont(new Font("Arial", Font.PLAIN, 16));
        diversos.setFont(new Font("Arial", Font.PLAIN, 16));
        total.setFont(new Font("Arial", Font.PLAIN, 16));

        // Definir o campo total como não editável
        campoTotal.setEditable(false);

        // Adicionar os componentes ao painel
        painel.add(titulo);
        painel.add(combustivel);
        painel.add(campoCombustivel);
        painel.add(financiamento);
        painel.add(campoFinanciamento);
        painel.add(diversos);
        painel.add(campoDiversos);
        painel.add(total);
        painel.add(campoTotal);
        painel.add(botaoCalcular);
        painel.add(botaoLimpar);

        // Adicionar os ouvintes de ação aos botões
        botaoCalcular.addActionListener(this);
        botaoLimpar.addActionListener(this);

    }

    // Sobrescrever o método actionPerformed para tratar os eventos dos botões
    @Override
    public void actionPerformed(ActionEvent e) {

        // Verificar qual botão foi acionado
        if (e.getSource() == botaoCalcular) {
            // Obter os valores dos campos de texto
            String sCombustivel = campoCombustivel.getText();
            String sFinanciamento = campoFinanciamento.getText();
            String sDiversos = campoDiversos.getText();

            // Verificar se os campos não estão vazios
            if (!sCombustivel.isEmpty() && !sFinanciamento.isEmpty() && !sDiversos.isEmpty()) {
                try {
                    // Converter os valores para números reais
                    double dCombustivel = Double.parseDouble(sCombustivel);
                    double dFinanciamento = Double.parseDouble(sFinanciamento);
                    double dDiversos = Double.parseDouble(sDiversos);

                    // Calcular o total das despesas
                    double dTotal = dCombustivel + dFinanciamento + dDiversos;

                    // Exibir o total no campo de texto
                    campoTotal.setText(String.format("%.2f", dTotal));

                } catch (NumberFormatException ex) {
                    // Exibir uma mensagem de erro se os valores não forem números válidos
                    JOptionPane.showMessageDialog(this, "Valores inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Exibir uma mensagem de aviso se algum campo estiver vazio
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == botaoLimpar) {
            // Limpar os campos de texto
            campoCombustivel.setText("");
            campoFinanciamento.setText("");
            campoDiversos.setText("");
            campoTotal.setText("");
        }
    }

    // Criar um método main para testar a tela
    public static void main(String[] args) {
        // Criar um objeto da classe TelaDespesas
        TelaDespesas tela = new TelaDespesas();

        // Definir as propriedades da tela
        tela.setSize(500, 400);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}