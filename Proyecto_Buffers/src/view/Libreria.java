package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class Libreria extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField TextTitulo;
	private JTextField textA�o;
	private JTextField textEditor;
	private JTextField TextPag;
	private JTextField textResult;
	private JTextField TextIDR;
	private JButton btnEnviar;
	private JButton btnIDR;
	private JTextField textAutor;
	private JTextField nombreAutor;
	public Libreria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblIdentificador = new JLabel("Identificador: ");
		lblIdentificador.setBounds(15, 92, 90, 19);
		lblIdentificador.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textID = new JTextField();
		textID.setBounds(109, 93, 144, 20);
		textID.setColumns(10);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(15, 121, 90, 19);
		lblTtulo.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		TextTitulo = new JTextField();
		TextTitulo.setBounds(109, 119, 144, 20);
		TextTitulo.setColumns(10);

		JLabel lblA�o = new JLabel("A\u00F1o de publicaci\u00F3n:");
		lblA�o.setBounds(15, 179, 134, 19);
		lblA�o.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textA�o = new JTextField();
		textA�o.setBounds(136, 179, 86, 20);
		textA�o.setColumns(10);

		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setBounds(15, 209, 90, 19);
		lblEditor.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		textEditor = new JTextField();
		textEditor.setBounds(109, 209, 144, 20);
		textEditor.setColumns(10);

		JLabel lblNumeroDePginas = new JLabel("Numero de p\u00E1ginas:");
		lblNumeroDePginas.setBounds(15, 243, 146, 19);
		lblNumeroDePginas.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		TextPag = new JTextField();
		TextPag.setBounds(149, 243, 86, 20);
		TextPag.setColumns(10);

		btnEnviar = new JButton("Guardar");
		btnEnviar.setBounds(90, 290, 90, 23);

		textResult = new JTextField();
		textResult.setBounds(277, 92, 311, 231);
		textResult.setColumns(10);

		TextIDR = new JTextField();
		TextIDR.setBounds(648, 96, 86, 20);
		TextIDR.setColumns(10);





		btnIDR = new JButton("Buscar");
		btnIDR.setBounds(648, 122, 105, 23);

		JButton btnRecogerTodo = new JButton(" Todos");
		btnRecogerTodo.setBounds(648, 196, 105, 23);
		
		JLabel lblAutor_1 = new JLabel("Autor:");
		lblAutor_1.setBounds(15, 149, 146, 19);
		lblAutor_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textAutor = new JTextField();
		textAutor.setBounds(109, 150, 116, 20);
		textAutor.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblIdentificador);
		contentPane.add(textID);
		contentPane.add(lblTtulo);
		contentPane.add(TextTitulo);
		contentPane.add(lblEditor);
		contentPane.add(textEditor);
		contentPane.add(lblA�o);
		contentPane.add(textA�o);
		contentPane.add(lblNumeroDePginas);
		contentPane.add(TextPag);
		contentPane.add(lblAutor_1);
		contentPane.add(textAutor);
		contentPane.add(textResult);
		contentPane.add(TextIDR);
		contentPane.add(btnRecogerTodo);
		contentPane.add(btnIDR);
		contentPane.add(btnEnviar);
		
		JLabel lblAadaUnLibro = new JLabel("A\u00F1ada un libro:");
		lblAadaUnLibro.setBounds(10, 46, 139, 19);
		lblAadaUnLibro.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblAadaUnLibro);
		
		JLabel lblParaBuscarUn = new JLabel("Para buscar un libro, introduzca la ID:");
		lblParaBuscarUn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblParaBuscarUn.setBounds(491, 38, 281, 34);
		contentPane.add(lblParaBuscarUn);
		
		JLabel lblBuscarTodos = new JLabel("Buscar todos:");
		lblBuscarTodos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblBuscarTodos.setBounds(598, 166, 127, 16);
		contentPane.add(lblBuscarTodos);
		
		JLabel lblBuscarLosLibros = new JLabel("Buscar los libros de un autor:");
		lblBuscarLosLibros.setBounds(601, 246, 152, 14);
		contentPane.add(lblBuscarLosLibros);
		
		nombreAutor = new JTextField();
		nombreAutor.setBounds(667, 291, 86, 20);
		contentPane.add(nombreAutor);
		nombreAutor.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(601, 294, 46, 14);
		contentPane.add(lblNombre);
	}
	public JButton getBtnEnviar() {
		return btnEnviar;
	}
	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}
	public JButton getBtnIDR() {
		return btnIDR;
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	public JTextField getTextPag() {
		return TextPag;
	}
	public void setTextPag(JTextField textPag) {
		TextPag = textPag;
	}
	public JTextField getTextID() {
		return textID;
	}
	public void setTextID(JTextField textID) {
		this.textID = textID;
	}
	public JTextField getTextTitulo() {
		return TextTitulo;
	}
	public void setTextTitulo(JTextField textTitulo) {
		TextTitulo = textTitulo;
	}
	public JTextField getTextA�o() {
		return textA�o;
	}
	public void setTextA�o(JTextField textA�o) {
		this.textA�o = textA�o;
	}
	public JTextField getTextEditor() {
		return textEditor;
	}
	public void setTextEditor(JTextField textEditor) {
		this.textEditor = textEditor;
	}
	public JTextField getTextResult() {
		return textResult;
	}
	public void setTextResult(JTextField textResult) {
		this.textResult = textResult;
	}
	public JTextField getTextIDR() {
		return TextIDR;
	}
	public void setTextIDR(JTextField textIDR) {
		TextIDR = textIDR;
	}
	public JTextField getTextAutor() {
		return textAutor;
	}
	public void setTextAutor(JTextField textAutor) {
		this.textAutor = textAutor;
	}
	public JTextField getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(JTextField nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public void setBtnIDR(JButton btnIDR) {
		this.btnIDR = btnIDR;
	}
}