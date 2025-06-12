package br.com.jkalango.view;
//Classes Swing (javaxswing)
import javax.swing.JFrame; //(janela principal)
import javax.swing.JButton; //(Botoes interativos)
import javax.swing.JLabel; //(exibição de texto e imagens)
import javax.swing.ImageIcon; //carregamento de imagens
import javax.swing.JOptionPane; // caixa de dialogo simples

import java.awt.BorderLayout;
import java.awt.Color;
//classes awt (java.awt)
import java.awt.FlowLayout; //gerenciador de layout para
import java.awt.Font;
import java.awt.event.ActionEvent; //evento de ação
import java.awt.event.ActionListener; //interface para lidar com eventos de ação

public class JIntro extends JFrame{
    public JIntro(){
        setTitle("Inicio");
        setSize(900, 400);
        setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        
        JLabel texto = new JLabel("<html><body style='width: 600px;'>"
    + "Em um mundo distante e misterioso, Jkalango é "
    + "um calango do cerrado mágico, "
    + "mas algo estranho ronda seu habitat. As árvores sussurram segredos antigos, e "
    + "sombras desconhecidas espreitam ao cair da noite. Jkalango, junto com seus amigos "
    + "JFormigas e JAbelhinhas, precisa lutar para preservar sua espécie e proteger seus lares. "
    + "Mas para isso, eles terão que enfrentar missões perigosas, onde nem tudo é o que parece... "
    + "Entre névoas e silêncios inquietantes, a linha entre realidade e pesadelo começa a se apagar."
    + "</body></style></html>");

        texto.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setForeground(new Color(0x491010));
        add(texto);
        
        JButton startButton = new JButton("Iniciar missão");
        add(startButton, BorderLayout.SOUTH);
        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(JIntro.this,"Primeira missão iniciada...");
            }
        
    
        });

        getContentPane().setBackground(new Color(0x8b0000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
