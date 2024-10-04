package recargaBus;

import java.awt.*;
import java.math.RoundingMode;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JMonthChooser;
import javax.swing.border.EmptyBorder;
import java.text.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazRecarga extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantRecarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRecarga frame = new InterfazRecarga();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazRecarga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(10, 11, 364, 459);
		ImageIcon recarBus = new ImageIcon("C:/Users/.Wito/Desktop/Medac/Desarrollo de interfaces/recarBus/recarbus.jpg");
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JButton btnRecarga = new JButton("Recargar");
		btnRecarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bonobús recargado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRecarga.setBounds(87, 71, 191, 50);
		mainPanel.add(btnRecarga);
		
		JPanel panelRecarga_1 = new JPanel();
		panelRecarga_1.setLayout(null);
		panelRecarga_1.setBounds(62, 376, 267, 62);
		mainPanel.add(panelRecarga_1);
		
		JLabel lblEuro = new JLabel("€");
		lblEuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEuro.setBounds(235, 24, 22, 14);
		panelRecarga_1.add(lblEuro);
		
		JLabel lblSeleccionaCantidad = new JLabel("   Selecciona cantidad a recargar");
		lblSeleccionaCantidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccionaCantidad.setBounds(0, 0, 267, 62);
		panelRecarga_1.add(lblSeleccionaCantidad);
		
		txtCantRecarga = new JTextField();
		txtCantRecarga.setBounds(199, 21, 36, 20);
		panelRecarga_1.add(txtCantRecarga);
		txtCantRecarga.setColumns(10);
		
		JPanel panelRecarga = new JPanel();
		panelRecarga.setBounds(62, 303, 267, 62);
		mainPanel.add(panelRecarga);
		panelRecarga.setLayout(null);
		
		JLabel lblSeleccionaMes = new JLabel("     Selecciona el mes");
		lblSeleccionaMes.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccionaMes.setBounds(0, 0, 267, 62);
		panelRecarga.add(lblSeleccionaMes);
		
		//Calendario
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(127, 14, 101, 30);
		panelRecarga.add(monthChooser);
		monthChooser.getSpinner().setBounds(0, 0, 100, 30);
		monthChooser.setLayout(null);
		
		JLabel imagenLabel = new JLabel(new ImageIcon("C:\\Users\\.Wito\\Desktop\\Medac\\Desarrollo de interfaces\\recarBus\\recarBus.jpg"));
		imagenLabel.setBounds(0, 0, 364, 459);
		mainPanel.add(imagenLabel, BorderLayout.CENTER);
		mainPanel.add(imagenLabel);
	}
}
