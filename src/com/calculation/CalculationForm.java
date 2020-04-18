package com.calculation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;

public class CalculationForm extends JFrame {

	private JPanel contentPane;
	private JTextField txt_width;
	private JTextField txt_depth;
	private JTextField txt_wthikness;
	private JTextField txt_fthickness;
	private JTextField txt_slabthikness;
	private JTextField txt_specificheat;
	private JTextField txt_cp;
	private JTextField txt_density;
	private JTextField txt_rough;
	private JTextField txt_p;
	private JTextField txt_thermalCon;
	private JTextField txt_lamda;
	private JTextField txt_p2;
	private JTextField txt_designLTemp;
	private JTextField txt_time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					CalculationForm frame = new CalculationForm();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public CalculationForm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSteelSection = new JLabel("Steel Section :");
		lblSteelSection.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSteelSection.setBounds(15, 16, 119, 33);
		contentPane.add(lblSteelSection);
		
		txt_width = new JTextField();
		txt_width.setToolTipText("");
		txt_width.setBounds(216, 19, 238, 26);
		contentPane.add(txt_width);
		txt_width.setColumns(10);
		
		txt_depth = new JTextField();
		txt_depth.setBounds(216, 61, 238, 26);
		contentPane.add(txt_depth);
		txt_depth.setColumns(10);
		
		txt_wthikness = new JTextField();
		txt_wthikness.setBounds(216, 145, 238, 26);
		contentPane.add(txt_wthikness);
		txt_wthikness.setColumns(10);
		
		txt_fthickness = new JTextField();
		txt_fthickness.setBounds(216, 103, 238, 26);
		contentPane.add(txt_fthickness);
		txt_fthickness.setColumns(10);
		
		JLabel lblWidth = new JLabel("Width :");
		lblWidth.setBounds(149, 16, 52, 33);
		contentPane.add(lblWidth);
		
		JLabel lblDepth = new JLabel("Depth :");
		lblDepth.setBounds(136, 54, 65, 33);
		contentPane.add(lblDepth);
		
		JLabel lblFlangeThickness = new JLabel("Web Thickness :");
		lblFlangeThickness.setBounds(80, 142, 119, 33);
		contentPane.add(lblFlangeThickness);
		
		JLabel label = new JLabel("Flange Thickness :");
		label.setBounds(70, 88, 131, 33);
		contentPane.add(label);
		
		JLabel lblExposedSurfaces = new JLabel("Exposed surfaces :");
		lblExposedSurfaces.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblExposedSurfaces.setBounds(20, 191, 161, 33);
		contentPane.add(lblExposedSurfaces);
		
		JRadioButton rdo_threeside = new JRadioButton("Three sides");
		rdo_threeside.setBounds(216, 191, 113, 29);
		contentPane.add(rdo_threeside);
		
		JRadioButton rdo_foursides = new JRadioButton("Four sides");
		rdo_foursides.setBounds(341, 191, 113, 29);
		contentPane.add(rdo_foursides);
		
		JLabel lblSlabThickness = new JLabel("Slab Thickness :");
		lblSlabThickness.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSlabThickness.setBounds(15, 240, 141, 33);
		contentPane.add(lblSlabThickness);
		
		txt_slabthikness = new JTextField();
		txt_slabthikness.setToolTipText("");
		txt_slabthikness.setColumns(10);
		txt_slabthikness.setBounds(216, 240, 238, 26);
		contentPane.add(txt_slabthikness);
		
		JLabel lblThermalProperties = new JLabel("Thermal Properties :");
		lblThermalProperties.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblThermalProperties.setBounds(15, 309, 177, 33);
		contentPane.add(lblThermalProperties);
		
		txt_specificheat = new JTextField();
		txt_specificheat.setToolTipText("");
		txt_specificheat.setColumns(10);
		txt_specificheat.setBounds(216, 312, 238, 26);
		contentPane.add(txt_specificheat);
		
		txt_cp = new JTextField();
		txt_cp.setToolTipText("");
		txt_cp.setColumns(10);
		txt_cp.setBounds(469, 312, 238, 26);
		contentPane.add(txt_cp);
		
		txt_density = new JTextField();
		txt_density.setToolTipText("");
		txt_density.setColumns(10);
		txt_density.setBounds(216, 375, 238, 26);
		contentPane.add(txt_density);
		
		txt_rough = new JTextField();
		txt_rough.setToolTipText("");
		txt_rough.setColumns(10);
		txt_rough.setBounds(469, 375, 238, 26);
		contentPane.add(txt_rough);
		
		txt_p = new JTextField();
		txt_p.setToolTipText("");
		txt_p.setColumns(10);
		txt_p.setBounds(734, 375, 238, 26);
		contentPane.add(txt_p);
		
		txt_thermalCon = new JTextField();
		txt_thermalCon.setToolTipText("");
		txt_thermalCon.setColumns(10);
		txt_thermalCon.setBounds(216, 428, 238, 26);
		contentPane.add(txt_thermalCon);
		
		txt_lamda = new JTextField();
		txt_lamda.setToolTipText("");
		txt_lamda.setColumns(10);
		txt_lamda.setBounds(469, 428, 238, 26);
		contentPane.add(txt_lamda);
		
		txt_p2 = new JTextField();
		txt_p2.setToolTipText("");
		txt_p2.setColumns(10);
		txt_p2.setBounds(734, 428, 238, 26);
		contentPane.add(txt_p2);
		
		JLabel lblDesignLimitingTemperature = new JLabel("Design Limiting Temperature:");
		lblDesignLimitingTemperature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDesignLimitingTemperature.setBounds(15, 515, 252, 33);
		contentPane.add(lblDesignLimitingTemperature);
		
		txt_designLTemp = new JTextField();
		txt_designLTemp.setToolTipText("");
		txt_designLTemp.setColumns(10);
		txt_designLTemp.setBounds(267, 518, 238, 26);
		contentPane.add(txt_designLTemp);
		
		JLabel lblSpecificHeat = new JLabel("Specific Heat");
		lblSpecificHeat.setBounds(216, 282, 146, 33);
		contentPane.add(lblSpecificHeat);
		
		JLabel lblCp = new JLabel("CP");
		lblCp.setBounds(469, 282, 146, 33);
		contentPane.add(lblCp);
		
		JLabel lblDensity = new JLabel("Density");
		lblDensity.setBounds(216, 342, 146, 33);
		contentPane.add(lblDensity);
		
		JLabel lblRough = new JLabel("Rough");
		lblRough.setBounds(479, 342, 146, 33);
		contentPane.add(lblRough);
		
		JLabel lblP = new JLabel("P");
		lblP.setBounds(748, 342, 146, 33);
		contentPane.add(lblP);
		
		JLabel lblThermalConductivity = new JLabel("Thermal Conductivity");
		lblThermalConductivity.setBounds(216, 403, 170, 33);
		contentPane.add(lblThermalConductivity);
		
		JLabel lblLamda = new JLabel("Lamda");
		lblLamda.setBounds(472, 403, 170, 33);
		contentPane.add(lblLamda);
		
		JLabel label_1 = new JLabel("P");
		label_1.setBounds(734, 403, 146, 33);
		contentPane.add(label_1);
		
		JLabel lblWmk = new JLabel("W/mK");
		lblWmk.setBounds(987, 425, 52, 33);
		contentPane.add(lblWmk);
		
		JLabel lblKgm = new JLabel("kg/m3");
		lblKgm.setBounds(983, 372, 59, 33);
		contentPane.add(lblKgm);
		
		JLabel lblJkgk = new JLabel("J/kgK");
		lblJkgk.setBounds(722, 309, 59, 33);
		contentPane.add(lblJkgk);
		
		JLabel lblDesignFireRating = new JLabel("Design Fire Rating:");
		lblDesignFireRating.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDesignFireRating.setBounds(15, 470, 166, 33);
		contentPane.add(lblDesignFireRating);
		
		txt_time = new JTextField();
		txt_time.setToolTipText("");
		txt_time.setColumns(10);
		txt_time.setBounds(216, 473, 238, 26);
		contentPane.add(txt_time);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(469, 470, 52, 26);
		contentPane.add(lblMin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 180, 528, 2);
		contentPane.add(separator);
		
		JLabel lblDp = new JLabel("DP :");
		lblDp.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDp.setBounds(316, 560, 41, 33);
		contentPane.add(lblDp);
		
		JLabel lbl_totalvalue = new JLabel("00");
		lbl_totalvalue.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_totalvalue.setBounds(380, 560, 41, 33);
		contentPane.add(lbl_totalvalue);
		
		JButton btn_calculate = new JButton("Calculate");
		btn_calculate.setBounds(543, 560, 115, 29);
		contentPane.add(btn_calculate);
	}
}
