package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("unused")
public class Calculator implements ActionListener{

	JFrame frame;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	JButton clear, clearEntry, arrow, multi, div, add, sub, equals, dot;
	JPanel container1, container2, panel2;
	JTextField screen;

	private static final String DOUBLE_OR_NUMBER_REGEX = "([-]?\\d+[.]\\d*)|(\\d+)|(-\\d+)";
	private static final String APPLICATION_TITLE = "Calculator";
	private static final int WINDOW_HEIGHT = 525;
	private static final int WINDOW_WIDTH = 340;
	private static final int MARGIN_X = 10; 
	private static final int MARGIN_Y = 8;
	private static final int BTN_WIDTH = 70;
	private static final int BTN_HEIGHT = 60;
	
	private char selectedOperator = ' ';
                private boolean canCalculate = true; 			 // if true ? calculate, else  do not calculate
                private boolean addToDisplay = true;             // Connect numbers in display
                private double typedValue = 0;					
	
	
	public Calculator() {
		
		container1 = new JPanel();
		container1.setBounds(0,0,327,131);
		container1.setLayout(null);

		container2 = new JPanel();
		container2.setBounds(0, 131 , 335, 355);
		container2.setLayout(null);
		
		initButtons();
		initInputScreen(MARGIN_X, MARGIN_Y);
		
		btn0 = new JButton("0");
		btn0.setBounds(MARGIN_X, MARGIN_Y + 280, BTN_WIDTH * 2 + 10, BTN_HEIGHT);
	    btn0.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
	    btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btn0.setFocusable(false);
//	    btn0.setBackground(new Color(93, 170, 222, 15));
	    btn0.addActionListener(event -> {
                        if (addToDisplay) {
                            if (Pattern.matches("0", screen.getText())) {
                                screen.setText("0");
                            } else {
                                screen.setText(screen.getText() + "0");
                            }
                        } else {
                            screen.setText("0");
                            addToDisplay = true;
                        }
                        canCalculate = true;
                    });
	    container2.add(btn0);

		frame = new JFrame(APPLICATION_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		frame.add(container1);
		frame.add(container2);
	}
	
		
	private void initButtons() {
		
		btn1 = createButton("1", MARGIN_X, MARGIN_Y + 70 * 3);
		btn1.addActionListener(event -> {
                                                if (addToDisplay) {
                                                    if (Pattern.matches("0", screen.getText())) {
                                                        screen.setText("1");
                                                    } 
                                                    else {
                                                        screen.setText(screen.getText() + "1");
                                                    }
                                                } 
                                                else {
                                                    screen.setText("1");
                                                    addToDisplay = true;
                                                }
                                                canCalculate = true;
                                            });
		
		
		btn2 = createButton("2", MARGIN_X + 80, MARGIN_Y + 70 * 3);
		btn2.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("2");
                                            } 
                                            else {
                                                screen.setText(screen.getText() + "2");
                                            }
                                        } 
                                        else {
                                            screen.setText("2");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });
		
		btn3 = createButton("3", MARGIN_X + 80 * 2, MARGIN_Y + 70 * 3);
		btn3.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("3");
                                            } 
                                            else {
                                                screen.setText(screen.getText() + "3");
                                            }
                                        } 
                                        else {
                                            screen.setText("3");	
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });
		
		
		
		btn4 = createButton("4", MARGIN_X, MARGIN_Y + 70 * 2);
		btn4.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("4");
                                            } 
                                            else {
                                                screen.setText(screen.getText() + "4");
                                            }
                                        } 
                                        else {
                                            screen.setText("4");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });

		btn5 = createButton("5", MARGIN_X + 80, MARGIN_Y + 70 * 2);
		btn5.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("5");
                                            } 
                                            else {
                                                screen.setText(screen.getText() + "5");
                                            }
                                        } 
                                        else {
                                            screen.setText("5");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });
		
		btn6 = createButton("6", MARGIN_X + 80 * 2, MARGIN_Y + 70 * 2);
		btn6.addActionListener(event -> {
                                    if (addToDisplay) {
                                        if (Pattern.matches("0", screen.getText())) {
                                            screen.setText("6");
                                        } 
                                        else {
                                            screen.setText(screen.getText() + "6");
                                        }
                                    } 
                                    else {
                                        screen.setText("6");
                                        addToDisplay = true;
                                    }
                                    canCalculate = true;
                                });
		
		btn7 = createButton("7", MARGIN_X, MARGIN_Y + 70);
		btn7.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("7");
                                            } else {
                                                screen.setText(screen.getText() + "7");
                                            }
                                        } 
                                        else {
                                            screen.setText("7");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });
		
		
		btn8 = createButton("8", MARGIN_X + 80, MARGIN_Y + 70);
		btn8.addActionListener(event -> {
                                        if (addToDisplay) {
                                            if (Pattern.matches("0", screen.getText())) {
                                                screen.setText("8");
                                            } 
                                            else {
                                                screen.setText(screen.getText() + "8");
                                            }
                                        } 
                                        else {
                                            screen.setText("8");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;
                                    });
		
		btn9 = createButton("9", MARGIN_X + 80 * 2, MARGIN_Y + 70);
		btn9.addActionListener(event -> {
                                    if (addToDisplay) {
                                        if (Pattern.matches("0", screen.getText())) {
                                            screen.setText("9");
                                        } 
                                        else {
                                            screen.setText(screen.getText() + "9");
                                        }
                                    } 
                                    else {
                                        screen.setText("9");
                                        addToDisplay = true;
                                    }
                                    canCalculate = true;
                                });
		
		
		arrow = createButton("<-", MARGIN_X, MARGIN_Y);
		arrow.addActionListener(e -> {
			String screenNumber = screen.getText();
			
			StringBuilder newNumber = new StringBuilder();
			for(int i = 0; i < screenNumber.length()-1; i++) {
				newNumber.append(screenNumber.charAt(i));
			} 
			if(newNumber.toString().equals("")) {
				screen.setText("0");
			}
			else {
				screen.setText(newNumber.toString());
			}
		});
		
		clearEntry = createButton("CE", MARGIN_X + 80, MARGIN_Y);
		clearEntry.addActionListener(e ->{
			screen.setText("0");
		});
		
		clear = createButton("C", MARGIN_X + 80 * 2, MARGIN_Y);
		clear.addActionListener(e ->{
			screen.setText("0");
			selectedOperator = ' ';
                                                    canCalculate = true;
                                                    addToDisplay = true;
                                                    typedValue = 0;
		});
		
		
		sub = createButton("-", MARGIN_X + 80 * 3, MARGIN_Y + 70 * 2);
		sub.addActionListener(event -> {
                                   
                                    if (!Pattern.matches(DOUBLE_OR_NUMBER_REGEX, screen.getText())) {
			    return;
		}
			
                                    if (canCalculate) {
                                        typedValue = calculate(typedValue, Double.parseDouble(screen.getText()), selectedOperator);
                                        if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(typedValue))) {
                                            screen.setText(String.valueOf((int) typedValue));
                                        } else {
                                            screen.setText(String.valueOf(typedValue));
                                        }
                                        selectedOperator = '-';
                                        canCalculate = false;
                                        addToDisplay = false;
                                    } else {
                                        selectedOperator = '-';
                                    }
                  });
		
		div = createButton("/", MARGIN_X + 80 * 3, MARGIN_Y);
		div.addActionListener(e -> {		
                                        if (!Pattern.matches(DOUBLE_OR_NUMBER_REGEX, screen.getText()))
                                        return;
			
                                        if (canCalculate) {
                                                typedValue = calculate(typedValue, Double.parseDouble(screen.getText()), selectedOperator);
                                                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(typedValue))) {
                                                    screen.setText(String.valueOf((int) typedValue));
                                                } else {
                                                    screen.setText(String.valueOf(typedValue));
                                                }
                                                selectedOperator = '/';
                                                canCalculate = false;
                                                addToDisplay = false;
                                            } else {
                                                selectedOperator = '/';
                                            }
                                    });
		
		
		add = createButton("+", MARGIN_X + 80 * 3, MARGIN_Y + 70 * 3);
		add.addActionListener(e -> {	
                                    if (!Pattern.matches(DOUBLE_OR_NUMBER_REGEX, screen.getText()))
                                                return;
			
                                            if (canCalculate) {
                                                        typedValue = calculate(typedValue, Double.parseDouble(screen.getText()), selectedOperator);
                                                        if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(typedValue))) {
                                                            screen.setText(String.valueOf((int) typedValue));
                                                        } else {
                                                            screen.setText(String.valueOf(typedValue));
                                                        }
                                                        selectedOperator = '+';
                                                        canCalculate = false;
                                                        addToDisplay = false;
                                                    } else {
                                                        selectedOperator = '+';
                                               }
		});
		
		multi = createButton("*", MARGIN_X + 80 * 3, MARGIN_Y + 70);
		multi.addActionListener(e -> {
			
		if (!Pattern.matches(DOUBLE_OR_NUMBER_REGEX, screen.getText()))
                                         return;
			
		if (canCalculate) {
	            typedValue = calculate(typedValue, Double.parseDouble(screen.getText()), selectedOperator);
	            if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(typedValue))) {
	                screen.setText(String.valueOf((int) typedValue));
	            } else {
	                screen.setText(String.valueOf(typedValue));
	            }
	            selectedOperator = '*';
	            canCalculate = false;
	            addToDisplay = false;
	        } else {
	            selectedOperator = '*';
	        }
		});
		
	         dot = createButton(".", MARGIN_X + 80 * 2, MARGIN_Y + 70 * 4);
	         dot.addActionListener(e ->{
		if (addToDisplay) {
                                            if (!screen.getText().contains(".")) {
                                                    screen.setText(screen.getText() + ".");
                                            }
                                        } else {
                                            screen.setText("0.");
                                            addToDisplay = true;
                                        }
                                        canCalculate = true;	
                                            });

                            equals = createButton("=", MARGIN_X + 80 * 3, MARGIN_Y + 70 * 4);
                            equals.addActionListener(e -> {

                                    if (!Pattern.matches(DOUBLE_OR_NUMBER_REGEX, screen.getText()))
                                                return;
			
                            if (canCalculate) {
                                    typedValue = calculate(typedValue, Double.parseDouble(screen.getText()), selectedOperator);
                                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(typedValue))) {
                                        screen.setText(String.valueOf((int) typedValue));
                                    } else {
                                        screen.setText(String.valueOf(typedValue));
                                    }
                                    selectedOperator = '=';
                                    addToDisplay = false;
                                }
                        });	
	}
	
	private JButton createButton(String label, int x, int y) {
		JButton btn = new JButton(label);
		btn.setBounds(x, y, BTN_WIDTH, BTN_HEIGHT);
                                    btn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
                                    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                    btn.setFocusable(false);
                                    container2.add(btn);
	    
	    return btn;
	}
	
                        private  void initInputScreen(int x, int y) {
		Insets padding = new Insets(5, 10, 5, 10); // top, left, bottom, right
                                EmptyBorder borderWithPadding = new EmptyBorder(padding);
		
		screen = new JTextField("0");
		screen.setBounds(x, y, BTN_WIDTH + 238, 110);
		screen.setEditable(false);
		screen.setBackground(Color.WHITE);
		screen.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 33));
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
                                   screen.setBorder(borderWithPadding);
		container1.add(screen);
	}
	
	public double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) { 
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return Math.pow(firstNumber, secondNumber);
            default:
                return secondNumber;
        }
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
