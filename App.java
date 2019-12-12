import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App {
	int turn=2;
	int[] buttonValue= {0,0,0,0,0,0,0,0,0};
	int[] p1won= {0,0,0,0,0,0,0,0,0};
	int[] p2won= {0,0,0,0,0,0,0,0,0};
	int p1won() {
		if (p1won[0]==1 && p1won[1]==1 && p1won[2]==1) {
			return 1;
		}
		if (p1won[3]==1 && p1won[4]==1 && p1won[5]==1) {
			return 1;
		}
		if (p1won[6]==1 && p1won[7]==1 && p1won[8]==1) {
			return 1;
		}
		if (p1won[0]==1 && p1won[3]==1 && p1won[6]==1) {
			return 1;
		}
		if (p1won[1]==1 && p1won[4]==1 && p1won[7]==1) {
			return 1;
		}
		if (p1won[2]==1 && p1won[5]==1 && p1won[8]==1) {
			return 1;
		}
		if (p1won[0]==1 && p1won[4]==1 && p1won[8]==1) {
			return 1;
		}
		if (p1won[6]==1 && p1won[4]==1 && p1won[2]==1) {
			return 1;
		}
		
		return 0;
	}
	int p2won() {
		if (p2won[0]==1 && p2won[1]==1 && p2won[2]==1) {
			return 1;
		}
		if (p2won[3]==1 && p2won[4]==1 && p2won[5]==1) {
			return 1;
		}
		if (p2won[6]==1 && p2won[7]==1 && p2won[8]==1) {
			return 1;
		}
		if (p2won[0]==1 && p2won[3]==1 && p2won[6]==1) {
			return 1;
		}
		if (p2won[1]==1 && p2won[4]==1 && p2won[7]==1) {
			return 1;
		}
		if (p2won[2]==1 && p2won[5]==1 && p2won[8]==1) {
			return 1;
		}
		if (p2won[0]==1 && p2won[4]==1 && p2won[8]==1) {
			return 1;
		}
		if (p2won[6]==1 && p2won[4]==1 && p2won[2]==1) {
			return 1;
		}
		
		return 0;
	}

	public App() {
		JFrame jfram=new JFrame("Tic Tac Toe");
		jfram.setSize(500,500);
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfram.setLayout(null);
		JLabel toplabel=new JLabel("Tic Tac Toe");
		toplabel.setFont(new Font("SansSerif",Font.PLAIN,30));
		toplabel.setBounds(140, 1, 200, 100);
		JButton playAgain=new JButton("Play Again");
		playAgain.setFont(new Font("SansSerif",Font.PLAIN,30));
		JButton B1=new JButton();
		JButton B2=new JButton();
		JButton B3=new JButton();
		JButton B4=new JButton();
		JButton B5=new JButton();
		JButton B6=new JButton();
		JButton B7=new JButton();
		JButton B8=new JButton();
		JButton B9=new JButton();
		
		B1.setBounds(100, 70, 75, 75);
		B2.setBounds(100, 145, 75, 75);
		B3.setBounds(100, 220, 75, 75);
		B4.setBounds(175, 70, 75, 75);
		B5.setBounds(175, 145, 75, 75);
		B6.setBounds(175,220,75,75);
		B7.setBounds(250, 70, 75, 75);
		B8.setBounds(250, 145, 75, 75);
		B9.setBounds(250, 220, 75, 75);
		playAgain.setBounds(120, 350, 180, 70);
		
		
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				B1.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[0]==0) {
					if (turn%2==0) {
					turn++;
					B1.setText("X");
					buttonValue[0]=1;
					p1won[0]=1;
					int result1=p1won();
					int result2=p2won();
					if (result1==1) {
						JOptionPane.showMessageDialog(jfram, "Player 1 won");
					}
					else if (result2==1) {
						JOptionPane.showMessageDialog(jfram, "Player 2 won");
					}
					}
					else {
						turn++;
						B1.setText("0");
						buttonValue[0]=1;
						p2won[0]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				B2.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[1]==0) {
					if (turn%2==0) {
						turn++;
						B2.setText("X");
						buttonValue[1]=1;
						p1won[1]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B2.setText("0");
						buttonValue[1]=1;
						p2won[1]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B3.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[2]==0) {
					if (turn%2==0) {
						turn++;
						B3.setText("X");
						buttonValue[2]=1;
						p1won[2]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B3.setText("0");
						buttonValue[2]=1;
						p2won[2]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B4.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[3]==0) {
					if (turn%2==0) {
						turn++;
						B4.setText("X");
						buttonValue[3]=1;
						p1won[3]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B4.setText("0");
						buttonValue[3]=1;
						p2won[3]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B5.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[4]==0) {
					if (turn%2==0) {
						turn++;
						B5.setText("X");
						buttonValue[4]=1;
						p1won[4]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				else {
					turn++;
					B5.setText("0");
					buttonValue[4]=1;
					p2won[4]=1;
					int result1=p1won();
					int result2=p2won();
					if (result1==1) {
						JOptionPane.showMessageDialog(jfram, "Player 1 won");
					}
					else if (result2==1) {
						JOptionPane.showMessageDialog(jfram, "Player 2 won");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(jfram, "Value aready used");
			}
		}
		});
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B6.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[5]==0) {
				if (turn%2==0) {
					turn++;
					B6.setText("X");
					buttonValue[5]=1;
					p1won[5]=1;
					int result1=p1won();
					int result2=p2won();
					if (result1==1) {
						JOptionPane.showMessageDialog(jfram, "Player 1 won");
					}
					else if (result2==1) {
						JOptionPane.showMessageDialog(jfram, "Player 2 won");
					}
				}
				else {
					turn++;
					B6.setText("0");
					buttonValue[5]=1;
					p2won[5]=1;
					int result1=p1won();
					int result2=p2won();
					if (result1==1) {
						JOptionPane.showMessageDialog(jfram, "Player 1 won");
					}
					else if (result2==1) {
						JOptionPane.showMessageDialog(jfram, "Player 2 won");
					}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B7.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[6]==0) {
					if (turn%2==0) {
						turn++;
						B7.setText("X");
						buttonValue[6]=1;
						p1won[6]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B7.setText("0");
						buttonValue[6]=1;
						p2won[6]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B8.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[7]==0) {
					if (turn%2==0) {
						turn++;
						B8.setText("X");
						buttonValue[7]=1;
						p1won[7]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B8.setText("0");
						buttonValue[7]=1;
						p2won[7]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B9.setFont(new Font("SansSerif",Font.BOLD,35));
				if(buttonValue[8]==0) {
					if (turn%2==0) {
						turn++;
						B9.setText("X");
						buttonValue[8]=1;
						p1won[8]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
					else {
						turn++;
						B9.setText("0");
						buttonValue[8]=1;
						p2won[8]=1;
						int result1=p1won();
						int result2=p2won();
						if (result1==1) {
							JOptionPane.showMessageDialog(jfram, "Player 1 won");
						}
						else if (result2==1) {
							JOptionPane.showMessageDialog(jfram, "Player 2 won");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(jfram, "Value aready used");
				}
			}
		});
		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				B1.setText("");
				B2.setText("");
				B3.setText("");
				B4.setText("");
				B5.setText("");
				B6.setText("");
				B7.setText("");
				B8.setText("");
				B9.setText("");
				turn =2;
				for (int i = 0; i < buttonValue.length; i++) {
					buttonValue[i]=0;
				}
				for (int j = 0; j < 9; j++) {
					p1won[j]=0;
					p2won[j]=0;
				}
			}
		});
		jfram.add(toplabel);
		jfram.add(B1);
		jfram.add(B2);
		jfram.add(B3);
		jfram.add(B4);
		jfram.add(B5);
		jfram.add(B6);
		jfram.add(B7);
		jfram.add(B8);
		jfram.add(B9);
		jfram.add(playAgain);
		jfram.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new App();
			}
		});
	}
}
