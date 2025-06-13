package br.com.jkalango.view;

//Classes Swing (javaxswing)
import javax.swing.JFrame; //(janela principal)
import javax.swing.JButton; //(Botoes interativos)
import javax.swing.JLabel; //(exibição de texto e imagens)
import javax.swing.ImageIcon; //carregamento de imagens
import javax.swing.JOptionPane; // caixa de dialogo simples
import javax.swing.JTextPane;

//classes awt (java.awt)
import java.awt.FlowLayout; //gerenciador de layout para
import java.awt.event.ActionEvent; //evento de ação
import java.awt.event.ActionListener; //interface para lidar com eventos de ação



public class JSplash extends JFrame {
    public JSplash(){
        setTitle("JKalango Splash"); //titulo da aplicação
        setSize(400, 300); //tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //quando fechar a aplicação, encerra o processo liberando memoria
        setLocationRelativeTo(null); //centralizar a janela na tela
        setLayout(new FlowLayout()); //como vai organizar os componentes
        
        //adicionando o botao
        JButton startButton = new JButton("Iniciar");
        add(startButton);

        //adicionando o evento ao botão
        startButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            new JIntro();
            dispose();
            }
        
    
        });
        setVisible(true);
    }
   
}
