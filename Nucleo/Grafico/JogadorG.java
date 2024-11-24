package Nucleo.Grafico;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

class Posicao {
    public int posX, posY;
}

public class JogadorG {
    private Posicao posicaoAtual;
    private Image icone;
    private String nome;
    private int id;

    public JogadorG(Image i, int id, String nome) {
        icone = i;
        this.nome = nome;
        this.id = id;
        posicaoAtual = new Posicao();
    }

    public void atualizarPosicao(int casa, int tabPosx, int tabPosy, int tabDim) {
        double xEscala, yEscala;
        AffineTransform transforma;
        Point2D transformado;
        Point2D original = new Point2D.Double(Posicoes.x[casa][id], Posicoes.y[casa][id]);

        xEscala = yEscala = (double)tabDim / 1156;
        transforma = new AffineTransform();
        transforma.scale(xEscala, yEscala);
        transformado = transforma.transform(original, null);

        posicaoAtual.posX = (int)transformado.getX() + tabPosx;
        posicaoAtual.posY = (int)transformado.getY() + tabPosy;
    }

    public int obterX() {
        return posicaoAtual.posX;
    }

    public int obterY() {
        return posicaoAtual.posY;
    }

    public Image obterIcone() {
        return icone;
    }

    public String obterNome() {
        return nome;
    }
}

class Posicoes {
    public static int[][] x = 
    {{3, 40,  77, 3, 40, 77},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {12, 49, 86, 12, 49, 86},
     {25, 62, 99, 25, 62, 99},
     {141, 178, 215, 141, 178, 215},
     {267, 305, 343, 267, 305, 343},
     {397, 435, 473, 397, 435, 473},
     {525, 563, 601, 525, 563, 601},
     {653, 691, 729, 653, 691, 729},
     {781, 819, 857, 781, 819, 857},
     {910, 948, 986, 910, 948, 986},
     {1031, 1069, 1107, 1031, 1069, 1107},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1037, 1075, 1113, 1037, 1075, 1113},
     {1028, 1066, 1104, 1028, 1066, 1104},
     {909, 947, 985, 909, 947, 985},
     {779, 817, 855, 779, 817, 855},
     {654, 692, 730, 654, 692, 730},
     {526, 564, 602, 526, 564, 602},
     {399, 437, 475, 399, 437, 475},
     {269, 307, 345, 269, 307, 345},
     {142, 180, 218, 142, 180, 218}};

    public static int[][] y = 
    {{1030, 1030, 1030, 1068, 1068, 1068},
     {938, 938, 938, 976, 976, 976},
     {811, 811, 811, 849, 849, 849},
     {684, 684, 684, 722, 722, 722},
     {559, 559, 559, 597, 597, 597},
     {430, 430, 430, 468, 468, 468},
     {303, 303, 303, 341, 341, 341},
     {174, 174, 174, 212, 212, 212},
     {35, 35, 35, 38, 38, 38, 38},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {40, 40, 40, 78, 78, 78},
     {50, 50, 50, 88, 88, 88},
     {170, 170, 170, 208, 208, 208},
     {300, 300, 300, 338, 338, 338},
     {424, 424, 424, 462, 462, 462},
     {553, 553, 553, 591, 591, 591},
     {680, 680, 680, 718, 718, 718},
     {808, 808, 808, 846, 846, 846},
     {938, 938, 938, 976, 976, 976},
     {1032, 1032, 1032, 1070, 1070},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105},
     {1067, 1067, 1067, 1105, 1105, 1105}};
}
