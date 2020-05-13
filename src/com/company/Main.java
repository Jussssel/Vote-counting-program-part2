package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int kandidatet = 4;
        int regjionet = 3;

        String[] emri = new String[kandidatet];
        String[] regjioni = new String[regjionet];

        for (int a = 0; a != kandidatet; a++) {
            emri[a] = JOptionPane.showInputDialog("Të dhënat për kandidatin " + a + ":" + "\n" + "Shënojeni emrin " +
                    "tuaj: ");
        }
        for (int b = 0; b != regjionet; b++) {
            regjioni[b] = JOptionPane.showInputDialog("Regjioni " + b + ":" + "\n" + "Shtypni regjionin e " +
                    "dëshiruar: ");
        }
        JOptionPane.showMessageDialog(null, "Kandidatët e dhënë janë: " + "\n" + emri[0] +
                "\n" + emri[1] + "\n" + emri[2] + "\n" + emri[3] + "\n" + "\n" + "E ndërsa regjionet e dhëna janë: " + "\n" +
                regjioni[0] + "\n" + regjioni[1] + "\n" + regjioni[2] + "\n" + " ");

        int[][] zgjedhjet = new int[regjionet][kandidatet];
        int procesimi = 0;
        while (procesimi <= 15) {
            int r = Integer.parseInt(JOptionPane.showInputDialog("Ju mund të votoni për këto regjione:" + "\n" + "\n" + regjioni[0] +
                            ", " + regjioni[1] + ", " + regjioni[2] + "\n" + "\n" + "---------------------------------------------------" +
                            "\n" + "\n" + "Shtypni 0, nëse dëshironi të votoni në regjionin e parë: " + regjioni[0] + "\n" +
                            "Shtypni 1, nëse dëshironi të votoni në regjionin e dytë: " + regjioni[1] + "\n" +
                            "Shtypni 2, nese dëshironi të votoni në regjionin e tretë: " + regjioni[2] + "\n" + " "));
            procesimi++;
            if (r > regjioni.length) {
                JOptionPane.showMessageDialog(null,
                        "Regjioni me këtë numër që keni shtypur nuk ekziston. Ju lutem, provoni përsëri!");
            } else if (r < 0) {
                JOptionPane.showMessageDialog(null, "Regjioni me këtë numër që keni shtypur nuk ekziston. Ju lutem, provoni përsëri!");
            }
            else {
                int k = Integer.parseInt(JOptionPane.showInputDialog("Ju mund të votoni për këta kandidatë: " +
                        "\n" + emri[0] + ", " + emri[1] + ", " + emri[2] + ", " + emri[3] + "\n" + "\n" + "---------------------------------------------------" +
                        "\n" + "\n" + "Shtypni 0, nëse dëshironi të votoni për kandidatin e parë: " + emri[0] + "\n" +
                        "Shtypni 1, nëse dëshironi të votoni për kandidatin e dytë: " + emri[1] + "\n" + "Shtypni 2," +
                        " nëse dëshironi të votoni për kandidatin e tretë: " + emri[2] + "\n" + "Shtypni 3, nëse " +
                        "dëshironi të votoni për kandidatin e katërt: " + emri[3] + "\n" + " "));

                if (k >= 0 && k < kandidatet) {
                    zgjedhjet[r][k] = zgjedhjet[r][k] + 1;
                } else if (k < 0){
                    JOptionPane.showMessageDialog(null, "Keni votuar gabim. Provoni perseri!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Keni votuar gabim. Provoni perseri!");
                }
            }
        }
        for (int e = 0; e != regjioni.length; e++) {
            int[] regj = zgjedhjet[e];
            int totali = 0;
            for (int f = 0; f != 4; f++) {
                totali = totali + regj[f];
            }
            JOptionPane.showMessageDialog(null, "Regjioni - " + regjioni[e] + " ka kaq vota: " + totali);
        }
        for (int g = 0; g != emri.length; g++) {
            int votat = 0;
            for (int h = 0; h != 3; h++) {
                votat = votat + zgjedhjet[h][g];
            }
            JOptionPane.showMessageDialog(null, "Kandidati - " + emri[g] + " ka kaq vota: " + votat);
        }
        System.exit(0);
    }
}

