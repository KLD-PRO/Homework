package ru.gb.KLD_PRO;

import javax.swing.*;

    public class Play {
        private MyPanel Pan;
        private int PlayBoard[][];
        public int k;

        Play(MyPanel B) {
            PlayBoard = new int[3][3];
            Pan = B;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    PlayBoard[i][j] = 0;
                }
            }
        }

        public void InArray(int i, int j, int Check, int DrawCheck) {
            PlayBoard[i][j] = Check;
            ResultCheck(Check, DrawCheck);
        }

        public void ResultCheck(int Check, int DrawCheck) {
            if ((PlayBoard[0][0] == Check && PlayBoard[0][1] == Check && PlayBoard[0][2] == Check) || (PlayBoard[1][0] == Check && PlayBoard[1][1] == Check && PlayBoard[1][2] == Check) || (PlayBoard[2][0] == Check && PlayBoard[2][1] == Check && PlayBoard[2][2] == Check)) {
                if (Check == 1) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 1 игроком");
                    k = 1;
                } else if (Check == 2) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 2 игроком");
                    k = 2;
                }
                Pan.AllButtons(false);

            } else if ((PlayBoard[0][0] == Check && PlayBoard[1][0] == Check && PlayBoard[2][0] == Check) || (PlayBoard[0][1] == Check && PlayBoard[1][1] == Check && PlayBoard[2][1] == Check) || (PlayBoard[0][2] == Check && PlayBoard[1][2] == Check && PlayBoard[2][2] == Check)) {
                if (Check == 1) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 1 игроком");
                    k = 1;
                } else if (Check == 2) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 2 игроком");
                    k = 2;
                }
                Pan.AllButtons(false);

            } else if ((PlayBoard[0][0] == Check && PlayBoard[1][1] == Check && PlayBoard[2][2] == Check) || (PlayBoard[2][0] == Check && PlayBoard[1][1] == Check && PlayBoard[0][2] == Check)) {
                if (Check == 1) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 1 игроком");
                    k = 1;

                } else if (Check == 2) {
                    JOptionPane.showMessageDialog(Pan, "Победа за 2 игроком");
                    k = 2;

                }
                Pan.AllButtons(false);

            } else if (DrawCheck == 8) {
                JOptionPane.showMessageDialog(Pan, "Никто не победил");
                k = 3;
            }
        }
    }

