package br.com.jkalango.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JIntro extends JFrame {
    public JIntro() {
        setTitle("Inicio");
        setSize(900, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JTextPane texto = new JTextPane();
        texto.setContentType("text/html");
        texto.setText("<html><body style='font-family:Arial; font-size:14pt; color:#0000FF;'>"
                + "Em um mundo distante e misterioso, Jkalango é "
                + "um calango do cerrado mágico, "
                + "mas algo estranho ronda seu habitat. As árvores sussurram segredos antigos, e "
                + "sombras desconhecidas espreitam ao cair da noite. Jkalango, junto com seus amigos "
                + "JFormigas e JAbelhinhas, precisa lutar para preservar sua espécie e proteger seus lares. "
                + "Mas para isso, eles terão que enfrentar missões perigosas, onde nem tudo é o que parece... "
                + "Entre névoas e silêncios inquietantes, a linha entre realidade e pesadelo começa a se apagar."
                + "</body></html>");
        texto.setEditable(false);
        texto.setOpaque(false); 
        texto.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 

        JScrollPane scrollPane = new JScrollPane(texto);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        // --- 2. Criar e Adicionar o JButton ---
        JButton iniciarMissaoButton = new JButton("Iniciar Primeira Missão");
        
        // Define a cor do texto do botão (opcional, mas complementa o tema)
        iniciarMissaoButton.setForeground(Color.WHITE);
        // Define a cor de fundo do botão (um cinza escuro para combinar com o tema)
        iniciarMissaoButton.setBackground(new Color(50, 50, 50)); // Um cinza bem escuro
        // Remove a borda padrão do botão (opcional, para um visual mais "limpo" de terror)
        iniciarMissaoButton.setFocusPainted(false); // Remove o "quadrado" de foco

        add(texto);
        

        iniciarMissaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JMissaoObjeto();
                dispose();
            }
        });
        // --- Layout e Adição dos Componentes ---
        // Usamos BorderLayout para colocar a mensagem no centro e o botão no sul (parte inferior)
        setLayout(new BorderLayout()); // Define o gerenciador de layout do JFrame

        // Adiciona a mensagem ao centro
        add(texto, BorderLayout.CENTER);

        // Cria um JPanel para o botão para que ele não ocupe toda a largura do BorderLayout.SOUTH
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY); // Fundo do painel do botão igual ao do JFrame
        buttonPanel.add(iniciarMissaoButton); // Adiciona o botão ao painel
        
        // Adiciona o painel do botão ao sul (parte inferior) do JFrame
        add(buttonPanel, BorderLayout.SOUTH);
        
        

        getContentPane().setBackground(new Color(128, 128, 128));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}
