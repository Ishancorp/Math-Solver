/* Ishan Sharma
 * January 19, 2017*/

/* Math_Solver.java
 * Main class of Math Solver, a program to perform a series of mathematical functions
 */

/* Input: A bunch of numbers and the user's choice for which operation to do with those numbers. 
 * Output: Text that does a bunch of mathematical operations to those numbers
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;


public class Math_Solver extends JFrame {
	
	//Declaration of variables
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField text_1,text_2,text_3,text_4;
	public JLabel label_1,label_2,label_3,label_4,answer,answer_2;
	public JButton calculate;
	public Boolean error=false;
	public String value,fin_ans,fin_ans_2;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math_Solver frame = new Math_Solver();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 //Create the frame.
	public Math_Solver() {
		
		//Create the window
		setResizable(false);
		setTitle("Math Solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Create all of the objects in the window
		
		//Creates the combobox
		String[] combobox_list={"<select an item>","Root of quadratic equation","Point of intersection","Slope","Area of triangle","Midpoint","Circumference and area of circle","Distance between two points","Exponent calculator","Algebra","Vertex of quadratic equation","Sine","Cosine","Tangent","Arcsine","Arccosine","Arctangent","Deriviative","Integral","Exponential from 4 points","Exponential from 3 points","Sine law (angle)","Sine law (side)","Cosine law (angle)","Cosine law (side)"};
		JComboBox<Object> options = new JComboBox<Object>(combobox_list);
		options.setBounds(0, 0, 500, 30);
		contentPane.add(options);
		
		//Creates the combobox
		calculate = new JButton("Calculate");
		calculate.setBounds(0, 321, 500, 30);
		contentPane.add(calculate);
		
		//Creates all of the textfields
		
		text_1 = new JTextField();
		text_1.setHorizontalAlignment(SwingConstants.CENTER);
		text_1.setForeground(Color.BLACK);
		text_1.setBounds(0, 95, 165, 30);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_3 = new JTextField();
		text_3.setHorizontalAlignment(SwingConstants.CENTER);
		text_3.setForeground(Color.BLACK);
		text_3.setColumns(10);
		text_3.setBounds(0, 225, 165, 30);
		contentPane.add(text_3);
		
		text_2 = new JTextField();
		text_2.setHorizontalAlignment(SwingConstants.CENTER);
		text_2.setForeground(Color.BLACK);
		text_2.setColumns(10);
		text_2.setBounds(335, 95, 165, 30);
		contentPane.add(text_2);
		
		text_4 = new JTextField();
		text_4.setHorizontalAlignment(SwingConstants.CENTER);
		text_4.setForeground(Color.BLACK);
		text_4.setColumns(10);
		text_4.setBounds(335, 225, 165, 30);
		contentPane.add(text_4);
		
		//Creates all of the labels
		
		label_1 = new JLabel("<text>");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 70, 165, 16);
		contentPane.add(label_1);
		
		label_2 = new JLabel("<text>");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(335, 70, 165, 16);
		contentPane.add(label_2);
		
		label_3 = new JLabel("<text>");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 200, 165, 16);
		contentPane.add(label_3);
		
		label_4 = new JLabel("<text>");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(335, 200, 165, 16);
		contentPane.add(label_4);
		
		answer = new JLabel("Answer");
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(0, 275, 500, 16);
		contentPane.add(answer);
		
		answer_2 = new JLabel("");
		answer_2.setHorizontalAlignment(SwingConstants.CENTER);
		answer_2.setBounds(0, 291, 500, 16);
		contentPane.add(answer_2);
		
		//The action listener for the combobox, that detects any selection of an item
		options.addActionListener(
		new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
                value = (String)options.getSelectedItem();//retrieves the value from the combobox
                answer.setText("");
                answer_2.setText("");
                
                //the switch statement, that scans what is selected in the combobox
                switch(value){
                case "Deriviative":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Coefficient");
                	label_2.setText("Exponent");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Integral":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Exponent");
                	label_2.setText("Coefficient");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Root of quadratic equation":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("a");
                	label_2.setText("b");
                	label_3.setText("c");
                	label_4.setText("");
                	break;
                case "Point of intersection":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(true);
                	label_1.setText("m1");
                	label_2.setText("b1");
                	label_3.setText("m2");
                	label_4.setText("b2");
                    break;
                case "Slope":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(true);
                	label_1.setText("x1");
                	label_2.setText("y1");
                	label_3.setText("x2");
                	label_4.setText("y2");
                    break;
                case "Area of triangle":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("h");
                	label_2.setText("b");
                	label_3.setText("");
                	label_4.setText("");
                    break;
                case "Midpoint":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(true);
                	label_1.setText("x1");
                	label_2.setText("y1");
                	label_3.setText("x2");
                	label_4.setText("y2");
                	break;
                case "Circumference and area of circle":
                	text_1.setVisible(true);
                	text_2.setVisible(false);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("r");
                	label_2.setText("");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Distance between two points":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(true);
                	label_1.setText("x1");
                	label_2.setText("y1");
                	label_3.setText("x2");
                	label_4.setText("y2");
                	break;
                case "Exponent calculator":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Base");
                	label_2.setText("Exponent");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Algebra":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Coefficient");
                	label_2.setText("Variable");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Vertex of quadratic equation":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("a");
                	label_2.setText("b");
                	label_3.setText("c");
                	label_4.setText("");
                	break;
                case "Sine":
                	text_1.setVisible(true);
                	text_2.setVisible(false);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Angle");
                	label_2.setText("");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Cosine":
                	text_1.setVisible(true);
                	text_2.setVisible(false);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Angle");
                	label_2.setText("");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Tangent":
                	text_1.setVisible(true);
                	text_2.setVisible(false);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Angle");
                	label_2.setText("");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Arcsine":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Opposite");
                	label_2.setText("Hypotenuse");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Arccosine":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Adjacent");
                	label_2.setText("Hypotenuse");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Arctangent":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(false);
                	text_4.setVisible(false);
                	label_1.setText("Opposite");
                	label_2.setText("Adjacent");
                	label_3.setText("");
                	label_4.setText("");
                	break;
                case "Exponential from 4 points":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(true);
                	label_1.setText("First point");
                	label_2.setText("Second point");
                	label_3.setText("Third point");
                	label_4.setText("Fourth point");
                	break;
                case "Exponential from 3 points":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("First point");
                	label_2.setText("Second point");
                	label_3.setText("Third point");
                	label_4.setText("");
                	break;
                case "Sine law (angle)":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("Side 1");
                	label_2.setText("Side 2");
                	label_3.setText("Angle opp. to Side 1");
                	label_4.setText("");
                	break;
                case "Sine law (side)":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("Side 1");
                	label_2.setText("Angle opp. to Side 1");
                	label_3.setText("Angle opp. to unk.");
                	label_4.setText("");
                	break;
                case "Cosine law (angle)":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("Side opp. to angle");
                	label_2.setText("Side");
                	label_3.setText("Side");
                	label_4.setText("");
                	break;
                case "Cosine law (side)":
                	text_1.setVisible(true);
                	text_2.setVisible(true);
                	text_3.setVisible(true);
                	text_4.setVisible(false);
                	label_1.setText("Side");
                	label_2.setText("Side");
                	label_3.setText("Angle opp. unknown side");
                	label_4.setText("");
                	break;
                }
			}
        });
		
		//The action listener for the button
		calculate.addActionListener(
		new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				fin_ans="";
				fin_ans_2="";
				//the switch statement that detects which item the combobox has selected
                switch(value){
                case "Deriviative":
                	Double coefficient=try_double(text_1.getText());
                	Double exponent=try_double(text_2.getText());
                	if(exponent==null || coefficient==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double dCoefficient=exponent*coefficient;
                		double dExponent=exponent-1;
                		if(error==false){
                			fin_ans=(String.format("d/dx(%.5fx^%.5f) = %.5fx^%.5f",coefficient,exponent,dCoefficient,dExponent));
                		}
                	}
                	break;
                case "Integral":
                	Double exponent_i=try_double(text_1.getText());
                	Double coefficient_i=try_double(text_2.getText());
                	if(exponent_i==null || coefficient_i==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double iExponent=exponent_i+1;
                		if(error==false){
                			fin_ans=(String.format("∫x^%.5f dx= %.5f/%.5fx^%.5f+C",exponent_i,coefficient_i,iExponent,iExponent));
                		}
                	}
                	break;
				case "Root of quadratic equation":
					Double A=try_double(text_1.getText());
					Double B=try_double(text_2.getText());
					Double C=try_double(text_3.getText());
                	if(A==null || B==null || C==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
				        double discriminant=B*B-4*A*C;
				        if(discriminant>=0){
				            double answerone=(double)(-B+Math.sqrt(discriminant))/(2*A);
				            double answertwo=(-B-Math.sqrt(discriminant))/(2*A);
				            fin_ans=("The real values of x are:");
				            fin_ans_2=(+answerone+" and "+answertwo+".");
				        } 
				        else{
				            double imaginaryPart=java.lang.Math.sqrt(-discriminant)/2*A;
				            double realPart=(-B)/2*A;
				            fin_ans=(String.format("The non-real roots of x are:"));
				            fin_ans_2=(String.format(" %.5f - %.5fi and %.5f + %.5fi",
				            		realPart,
				            		imaginaryPart,
				            		realPart,
				            		imaginaryPart
				            		));
				        }
                	}
			        break;
				case "Point of intersection":
					Double m1=try_double(text_1.getText());
					Double b1=try_double(text_2.getText());
					Double m2=try_double(text_3.getText());
					Double b2=try_double(text_4.getText());
                	if(m1==null || b1==null || m2==null || b2==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
				        double x=(b2-b1)/(m2-m1);
				        double y=m1*x+b1;
				        fin_ans=("The point of intersection for this linear system is:");
				        fin_ans_2=(String.format("(%.5f,%.5f)",x,y));
                	}
			        break;
				case "Slope":
					Double x1=try_double(text_1.getText());
					Double y1=try_double(text_2.getText());
					Double x2=try_double(text_3.getText());
					Double y2=try_double(text_4.getText());
                	if(x1==null || y1==null || x2==null || y2==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
				        double s1=(x2-x1);
					    double s2=(y2-y1);
					    double m=s2/s1;
					    if(error==false){
					    	fin_ans=(String.format("The slope is %.5f, or approximately %.0f/%.0f.",m,s2,s1));
					    }
                	}
			        break;
				case "Area of triangle":
					Double h=try_double(text_1.getText());
					Double b=try_double(text_2.getText());
                	if(h==null || b==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double area=(h*b)/2;
			    		fin_ans=(String.format("The answer is %.5f.",area));
			    	}
			        break;
				case "Midpoint":
					Double x11=try_double(text_1.getText());
					Double y11=try_double(text_2.getText());
					Double x21=try_double(text_3.getText());
					Double y21=try_double(text_4.getText());
                	if(x11==null || y11==null || x21==null || y21==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
				        double x12=(x11+x21)/2;
				        double y12=(y11+y21)/2;
			        	fin_ans=(String.format("The midpoint is"));
			        	fin_ans_2=(String.format("(%.5f,%.5f)",x12,y12));
			        }
			        break;
				case "Circumference and area of circle":
					Double r=try_double(text_1.getText());
                	if(r==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
				    	double answer1=Math.PI*r*r;
				    	double answer2=2*Math.PI*r;
			        	fin_ans=(String.format("The circumference of the circle is %.5f.",answer2)); 
			        	fin_ans_2=(String.format("The area of that circle is %.5f.",answer1));
			        }
			        break;
				case "Distance between two points":
					Double x22=try_double(text_1.getText());
					Double y22=try_double(text_2.getText());
					Double x23=try_double(text_3.getText());
					Double y23=try_double(text_4.getText());
                	if(x22==null || y22==null || x23==null || y23==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double d=Math.sqrt(((x23-x22)*(x23-x22))+((y23-y22)*(y23-y22)));
			        	fin_ans=(String.format("The distance between the two lines is %.5f.",d));
			        }
			        break;
				case "Exponent calculator":
					Double base=try_double(text_1.getText());
					Double exp=try_double(text_2.getText());
                	if(base==null || exp==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
					double ans=Math.pow(base,exp);
			        	fin_ans=(String.format("The answer is %.5f.",ans));
                	}
					break;
				case "Algebra":
					Double aCoefficient=try_double(text_1.getText());
					Double variable=try_double(text_2.getText());
                	if(aCoefficient==null || variable==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
						double answar=aCoefficient/variable;
			        	fin_ans=(String.format("The variable is %.5f, or %.5f/%.5f.",answar,aCoefficient,variable));
			        }
					break;
				case "Vertex of quadratic equation":
					Double avertex=try_double(text_1.getText());
					Double bvertex=try_double(text_2.getText());
					Double cvertex=try_double(text_3.getText());
                	if(avertex==null || bvertex==null || cvertex==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
						double xvertex=-bvertex/(2*avertex);
						double yvertex=avertex*xvertex*xvertex+bvertex*xvertex+cvertex;
			        	fin_ans=(String.format("The vertex is at")); 
			        	fin_ans_2=(String.format("(%.5f,%.5f).",xvertex,yvertex));
			        }
                    break;
				case "Sine":
					Double angle=try_double(text_1.getText());
                	if(angle==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double sin_val=Math.sin(Math.toRadians(angle));
                		fin_ans=("The ratio of the opposite and hypotenuse sides is");
                		fin_ans_2=(String.format("%.20f / 1",sin_val));
                	}
					break;
				case "Cosine":
					Double angle_c=try_double(text_1.getText());
                	if(angle_c==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double cos_val=Math.cos(Math.toRadians(angle_c));
                		fin_ans=("The ratio of the adjacent and hypotenuse sides is");
                		fin_ans_2=(String.format("%.20f / 1",cos_val));
                	}
					break;
				case "Tangent":
					Double angle_t=try_double(text_1.getText());
                	if(angle_t==null){
                		fin_ans=("Error. A real number must be inputted");
                	}
                	else{
                		double tan_val=Math.tan(Math.toRadians(angle_t));
                		fin_ans=("The ratio of the opposite and adjacent sides is");
                		fin_ans_2=(String.format("%.20f / 1",tan_val));
                	}
					break;
				case "Arcsine":
					Double opposite=try_double(text_1.getText());
					Double hypotenuse=try_double(text_2.getText());
					if(opposite==null || hypotenuse==null){
                		fin_ans=("Error. A real number must be inputted");
					}
					else{
						double arcsin_val=Math.toDegrees(Math.asin(opposite/hypotenuse));
						fin_ans=("The angle is");
						fin_ans_2=(String.format("%20f°.",arcsin_val));
					}
					break;
				case "Arccosine":
					Double adjacent=try_double(text_1.getText());
					Double hypotenuse_c=try_double(text_2.getText());
					if(adjacent==null || hypotenuse_c==null){
                		fin_ans=("Error. A real number must be inputted");
					}
					else{
						double arccos_val=Math.toDegrees(Math.acos(adjacent/hypotenuse_c));
						fin_ans=("The angle is");
						fin_ans_2=(String.format("%20f°.",arccos_val));
					}
					break;
				case "Arctangent":
					Double opposite_t=try_double(text_1.getText());
					Double adjacent_t=try_double(text_2.getText());
					if(opposite_t==null || adjacent_t==null){
                		fin_ans=("Error. A real number must be inputted");
					}
					else{
						double arctan_val=Math.toDegrees(Math.atan(opposite_t/adjacent_t));
						fin_ans=("The angle is");
						fin_ans_2=(String.format("%20f°.",arctan_val));
					}
					break;
                case "Exponential from 4 points":
					String[] str_coor1=text_1.getText().split(",");
					String[] str_coor2=text_2.getText().split(",");
					String[] str_coor3=text_3.getText().split(",");
					String[] str_coor4=text_4.getText().split(",");
					Double[] coor1={try_double(str_coor1[0]),try_double(str_coor1[1])};
					Double[] coor2={try_double(str_coor2[0]),try_double(str_coor2[1])};
					Double[] coor3={try_double(str_coor3[0]),try_double(str_coor3[1])};
					Double[] coor4={try_double(str_coor4[0]),try_double(str_coor4[1])};
					if(coor1[0]==null || coor1[1]==null || coor2[0]==null || coor2[1]==null || coor3[0]==null || coor3[1]==null || coor4[0]==null || coor4[1]==null){
						fin_ans="Error. A real number must be inputted";
					}
					else{
	                	Double delta1=Math.pow((coor2[1]-coor1[1]),(1/(coor2[0]-coor1[0])));
	                	Double delta2=Math.pow((coor3[1]-coor2[1]),(1/(coor3[0]-coor2[0])));
	                	Double delta3=Math.pow((coor4[1]-coor3[1]),(1/(coor4[0]-coor3[0])));
	                	System.out.println(delta1);
	                	System.out.println(delta2);
	                	System.out.println(delta3);
	                	if((delta2/delta1)!=(delta3/delta2)){
	                		fin_ans="This is not an exponential";
	                	}
	                	else{
	                		Double a=coor1[1]/(Math.pow(delta1,coor1[0]));
	                		fin_ans=String.format("The exponential is f(x)=%5f*%5f^x",a,delta2/delta1);
	                	}
					}
                	break;
                case "Exponential from 3 points":
					String[] str_coor11=text_1.getText().split(",");
					String[] str_coor21=text_2.getText().split(",");
					String[] str_coor31=text_3.getText().split(",");
					Double[] coor11={try_double(str_coor11[0]),try_double(str_coor11[1])};
					Double[] coor21={try_double(str_coor21[0]),try_double(str_coor21[1])};
					Double[] coor31={try_double(str_coor31[0]),try_double(str_coor31[1])};

					if(coor11[0]==null || coor11[1]==null || coor21[0]==null || coor21[1]==null || coor31[0]==null || coor31[1]==null){
						fin_ans="Error. A real number must be inputted";
					}
					else{
	                	Double delta11=Math.pow((coor21[1]-coor11[1]),(1/(coor21[0]-coor11[0])));
	                	Double delta21=Math.pow((coor31[1]-coor21[1]),(1/(coor31[0]-coor21[0])));
	                	System.out.println(delta11);
	                	System.out.println(delta21);
	                	Double a=coor11[1]/(Math.pow(delta11,coor11[0]));
	                	fin_ans=String.format("The exponential is f(x)=%5f*%5f^x",a,delta21/delta11);
					}
                	break;
                case "Sine law (angle)":
                	Double side_one=try_double(text_1.getText());
                	Double side_two=try_double(text_2.getText());
                	Double angle_one=try_double(text_3.getText());
                	if(side_one==null || side_two==null || angle_one==null){
                		fin_ans="Error. A real number must be inputted";
                	}
                	else{
                		System.out.println(angle_one);
                		double angle_val=Math.toDegrees(Math.asin((side_two*Math.sin(Math.toRadians(angle_one)))/side_one));
                		fin_ans="The angle is";
                		fin_ans_2=String.format("%10f",angle_val);
                	}
                	break;
                case "Sine law (side)":
                	Double side_one1=try_double(text_1.getText());
                	Double angle_one1=try_double(text_2.getText());
                	Double angle_unk=try_double(text_3.getText());
                	if(side_one1==null || angle_one1==null || angle_unk==null){
                		fin_ans="Error. A real number must be inputted";
                	}
                	double sinde=(side_one1*Math.sin(Math.toRadians(angle_unk)))*Math.sin(Math.toRadians(angle_one1));
                	fin_ans="The answer is";
                	fin_ans_2=String.format("%10f",sinde);
                	break;
                case "Cosine law (angle)":
                	Double side_a=try_double(text_1.getText());
                	Double side_b=try_double(text_2.getText());
                	Double side_c=try_double(text_3.getText());
                	if(side_a==null || side_b==null || side_c==null){
                		fin_ans="Error. A real number must be inputted";
                	}
                	else{
                		double angle_cos=Math.toDegrees(Math.acos((Math.pow(side_b,2)+Math.pow(side_c,2)-Math.pow(side_a,2))/(2*side_b*side_c)));
                		fin_ans="The angle is";
                		fin_ans_2=String.format("%10f",angle_cos);
                	}
                	break;
                case "Cosine law (side)":
                	Double side_1=try_double(text_1.getText());
                	Double side_2=try_double(text_2.getText());
                	Double angle_1=try_double(text_3.getText());
                	if(side_1==null || side_2==null || angle_1==null){
                		fin_ans="Error. A real number must be inputted";
                	}
                	else{
                		double side_cos=Math.pow(Math.pow(side_1,2)+Math.pow(side_2,2)-2*side_1*side_2*Math.cos(Math.toRadians(angle_1)),0.5);
                		fin_ans="The answer is";
                		fin_ans_2=String.format("%10f",side_cos);
                	}
                	break;
                }
                answer.setText(fin_ans);
                answer_2.setText(fin_ans_2);
			}
        });
	}
	public Double try_double(String t){
		try{
			Double.parseDouble(t);
		}
		catch(NumberFormatException e){
			return (Double) null;
		}
		return Double.parseDouble(t);
	}
}
