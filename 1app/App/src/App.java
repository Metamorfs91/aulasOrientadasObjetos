import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame {
    // Criando os componentes da tela
    private JLabel lblNome = new JLabel("Nome do produto/serviço:");
    private JTextField txtNome = new JTextField(20);
    private JLabel lblData = new JLabel("Data de entrada:");
    private JTextField txtData = new JTextField(10);
    private JLabel lblDurabilidade = new JLabel("Durabilidade:");
    private JTextField txtDurabilidade = new JTextField(10);
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnCancelar = new JButton("Cancelar");

    // Construtor da classe
    public App() {
        super("Cadastro de produtos e serviços"); // Título da janela
        setLayout(new GridLayout(4, 2, 5, 5)); // Definindo o layout da tela
        // Adicionando os componentes na tela
        add(lblNome);
        add(txtNome);
        add(lblData);
        add(txtData);
        add(lblDurabilidade);
        add(txtDurabilidade);
        add(btnSalvar);
        add(btnCancelar);
        // Adicionando ações aos botões
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salvar(); // Chamando o método salvar
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelar(); // Chamando o método cancelar
            }
        });
        // Configurando a janela
        setSize(400, 200); // Tamanho da janela
        setLocationRelativeTo(null); // Centralizando a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechando a janela ao sair
        setVisible(true); // Tornando a janela visível
    }

    // Método para salvar os dados digitados
    public void salvar() {
        String nome = txtNome.getText(); // Pegando o nome do produto/serviço
        String data = txtData.getText(); // Pegando a data de entrada
        String durabilidade = txtDurabilidade.getText(); // Pegando a durabilidade
        // Validando os dados
        if (nome.isEmpty() || data.isEmpty() || durabilidade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Salvando os dados em um arquivo ou banco de dados (aqui é apenas um exemplo)
        JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para cancelar o cadastro
    public void cancelar() {
        txtNome.setText(""); // Limpando o campo nome
        txtData.setText(""); // Limpando o campo data
        txtDurabilidade.setText(""); // Limpando o campo durabilidade
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        new App(); // Criando uma instância da classe Cadastro
    }
}
