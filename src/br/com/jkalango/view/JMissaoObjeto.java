package br.com.jkalango.view;

import javax.swing.*;
import java.awt.*;

public class JMissaoObjeto extends JFrame {

    public JMissaoObjeto() {
        setTitle("Primeira Missão");
        setSize(900, 500);
        setLocationRelativeTo(null); // Centraliza a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextPane texto = new JTextPane();
        texto.setContentType("text/html");
        texto.setEditable(false);
        texto.setText("<html><body style='font-family:Fantasy; font-size:18pt; color:#000000; padding:10px;'>"
                + "<h2>🔮 Java: A Linguagem dos Antigos</h2>"
                + "<b>O que é?</b><br>Java é uma linguagem de programação orientada a objetos. Assim como a magia, ela permite criar mundos, criaturas e sistemas lógicos com poucas palavras.<br><br>"
                + "<b>Para que serve?</b><br>Java serve para criar programas — desde pequenos feitiços até portais poderosos (sistemas empresariais, jogos e até apps Android).<br><br>"
                + "<b>Como fazer?</b><br>Com códigos! Escrevemos comandos mágicos em arquivos .java, usamos compiladores e damos vida aos nossos mundos.<br><br>"

                + "<h3>⏺︎ Objeto</h3>"
                + "Um objeto é como uma criatura viva: tem características (atributos) e ações (métodos).<br>Ex: Um Jkalango pode correr ou lutar.<br><br>"

                + "<h3>🏛️ Classe</h3>"
                + "A classe é um molde para criar objetos.<br>Ex: A classe Calango define como os calangos devem ser.<br><br>"

                + "<h3>🛠️ Construtor</h3>"
                + "Construtores dão vida a novos objetos.<br>Ex: O construtor define a cor e o nome de um Jkalango.<br><br>"

                + "<h3>⚔️ Método</h3>"
                + "Métodos são ações que um objeto realiza.<br>Ex: lutar(), esconder(), fugir().<br><br>"

                + "<h3>👑 Herança</h3>"
                + "Permite que uma classe herde de outra.<br>Ex: JFormiga herda de Inseto.<br><br>"

                + "<h3>💎 Atributos</h3>"
                + "São propriedades dos objetos, como força, cor, tipoDeAtaque.<br><br>"

                + "<h3>🌀 Polimorfismo</h3>"
                + "Permite que métodos se comportem de forma diferente dependendo do objeto.<br><br>"

                + "<h3>🔒 Encapsulamento</h3>"
                + "Protege os dados internos de um objeto, revelando só o necessário.<br><br>"

                + "<h3>🌐 Interfaces</h3>"
                + "São contratos. Ex: Interface Lutador exige o método lutar().<br><br>"

                + "<h3>🌫️ Abstrato</h3>"
                + "Algo indefinido que serve de base para outras classes.<br><br>"

                + "<h3>🏰 Classe Abstrata</h3>"
                + "Um molde incompleto que não pode ser instanciado.<br><br>"

                + "<h3>🗡️ Método Abstrato</h3>"
                + "Método sem corpo. Cada classe filha precisa implementá-lo.<br><br>"

                + "</body></html>");

        JScrollPane scrollPane = new JScrollPane(texto);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
