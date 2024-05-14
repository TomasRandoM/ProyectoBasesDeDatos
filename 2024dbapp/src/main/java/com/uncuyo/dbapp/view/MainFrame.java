package com.uncuyo.dbapp.view;

import com.uncuyo.dbapp.backup.PostgresBackup;
import com.uncuyo.dbapp.control.UsuarioController;
import com.uncuyo.dbapp.model.Usuario;
import com.uncuyo.dbapp.control.DietaController;
import com.uncuyo.dbapp.control.MedicionController;
import com.uncuyo.dbapp.control.PesajeController;
import com.uncuyo.dbapp.model.Dieta;
import com.uncuyo.dbapp.model.Medicion;
import com.uncuyo.dbapp.model.Pesaje;
import com.uncuyo.dbapp.pdf.ExportPDF;
import java.sql.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        iniciarCompVisuales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevoUsuario = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDietas = new javax.swing.JTable();
        btEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btEliminarDieta = new javax.swing.JButton();
        btNuevaDieta = new javax.swing.JButton();
        btModificarDieta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dietasusuarios = new javax.swing.JButton();
        Recargar = new javax.swing.JButton();
        realizarbackup = new javax.swing.JButton();
        importarbackup = new javax.swing.JButton();
        exportarpdf = new javax.swing.JButton();
        pesaje1 = new javax.swing.JButton();
        medicion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btNuevoUsuario.setText("Nuevo");
        btNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNuevoUsuarioMouseClicked(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btModificarMouseClicked(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        tblDietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDietas);

        btEliminar.setText("Eliminar");
        btEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarMouseClicked(evt);
            }
        });

        jLabel1.setText("Dietas");

        jLabel2.setText("Usuarios");

        btEliminarDieta.setText("Eliminar");
        btEliminarDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarDietaMouseClicked(evt);
            }
        });

        btNuevaDieta.setText("Nuevo");
        btNuevaDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNuevaDietaMouseClicked(evt);
            }
        });

        btModificarDieta.setText("Modificar");
        btModificarDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btModificarDietaMouseClicked(evt);
            }
        });

        jLabel3.setText("Otras opciones:");

        dietasusuarios.setText("Ver dietas y usuarios");
        dietasusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dietasusuariosMouseClicked(evt);
            }
        });

        Recargar.setText("Recargar");
        Recargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecargarMouseClicked(evt);
            }
        });

        realizarbackup.setText("Realizar backup");
        realizarbackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realizarbackupMouseClicked(evt);
            }
        });

        importarbackup.setText("Importar backup");
        importarbackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importarbackupMouseClicked(evt);
            }
        });

        exportarpdf.setText("Exportar PDF");
        exportarpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportarpdfMouseClicked(evt);
            }
        });

        pesaje1.setText("Agregar Pesaje");
        pesaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesaje1MouseClicked(evt);
            }
        });

        medicion1.setText("Agregar Medicion");
        medicion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicion1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNuevaDieta)
                                .addGap(18, 18, 18)
                                .addComponent(btModificarDieta)
                                .addGap(18, 18, 18)
                                .addComponent(btEliminarDieta))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dietasusuarios)
                                .addGap(18, 18, 18)
                                .addComponent(realizarbackup)
                                .addGap(18, 18, 18)
                                .addComponent(importarbackup)
                                .addGap(18, 18, 18)
                                .addComponent(exportarpdf)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Recargar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btNuevoUsuario)
                            .addGap(18, 18, 18)
                            .addComponent(btModificar)
                            .addGap(18, 18, 18)
                            .addComponent(btEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesaje1)
                            .addGap(18, 18, 18)
                            .addComponent(medicion1)))
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Recargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevoUsuario)
                    .addComponent(btModificar)
                    .addComponent(btEliminar)
                    .addComponent(pesaje1)
                    .addComponent(medicion1))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevaDieta)
                    .addComponent(btModificarDieta)
                    .addComponent(btEliminarDieta))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dietasusuarios)
                    .addComponent(realizarbackup)
                    .addComponent(importarbackup)
                    .addComponent(exportarpdf))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoUsuarioMouseClicked
        JDUsuario jdusuario = new JDUsuario(this, rootPaneCheckingEnabled);
        jdusuario.setMainFrame(this);
        jdusuario.setVisible(true);
        
    }//GEN-LAST:event_btNuevoUsuarioMouseClicked

    private void btModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btModificarMouseClicked
        ModificarUsuario modificarusuario = new ModificarUsuario();
        modificarusuario.setMainframe(this);
        modificarusuario.setVisible(true);
    }//GEN-LAST:event_btModificarMouseClicked

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int row = tblUsuarios.rowAtPoint(evt.getPoint());
        int col = tblUsuarios.columnAtPoint(evt.getPoint());
        System.out.println("row = " +  row + "col" + col);
        System.out.println("********************************");
        Long cuil =(Long)tblUsuarios.getValueAt(row,0);
        System.out.println(cuil);
        System.out.println("*********************************");
        System.out.print("Autor id " + cuil);        
        Usuario usuario = usuarioctrl.getUsuario(cuil);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(usuario.toString());
        System.out.println("+++++++++++++++++++++++++++++++");
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarMouseClicked
        EliminarUsuario eliminarUsuarioJD = new EliminarUsuario();
        eliminarUsuarioJD.setMainframe(this);
        eliminarUsuarioJD.setVisible(true);
        

    }//GEN-LAST:event_btEliminarMouseClicked

    private void btEliminarDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarDietaMouseClicked
        EliminarDieta eliminardieta = new EliminarDieta();
        eliminardieta.setMainframe(this);
        eliminardieta.setVisible(true);
    }//GEN-LAST:event_btEliminarDietaMouseClicked

    private void btNuevaDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevaDietaMouseClicked
        NuevaDieta nuevadieta = new NuevaDieta();
        nuevadieta.setMainframe(this);
        nuevadieta.setVisible(true);
    }//GEN-LAST:event_btNuevaDietaMouseClicked

    private void btModificarDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btModificarDietaMouseClicked
        ModificarDieta modificardieta = new ModificarDieta();
        modificardieta.setMainframe(this);
        modificardieta.setVisible(true);
    }//GEN-LAST:event_btModificarDietaMouseClicked

    private void dietasusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dietasusuariosMouseClicked
        DietaUsuario dietausuario = new DietaUsuario();
        dietausuario.setVisible(true);
    }//GEN-LAST:event_dietasusuariosMouseClicked

    private void RecargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecargarMouseClicked
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_RecargarMouseClicked

    private void realizarbackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realizarbackupMouseClicked
        backup.realizarBackup();
    }//GEN-LAST:event_realizarbackupMouseClicked

    private void importarbackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importarbackupMouseClicked
        backup.importarBackup();
    }//GEN-LAST:event_importarbackupMouseClicked

    private void exportarpdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarpdfMouseClicked
        pdf.exportarPDF();
    }//GEN-LAST:event_exportarpdfMouseClicked

    private void pesaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesaje1MouseClicked
        NuevoPesaje nuevopesaje = new NuevoPesaje();
        nuevopesaje.setMainframe(this);
        nuevopesaje.setVisible(true);
    }//GEN-LAST:event_pesaje1MouseClicked

    private void medicion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicion1MouseClicked
        NuevaMedicion nuevamedicion = new NuevaMedicion();
        nuevamedicion.setMainframe(this);
        nuevamedicion.setVisible(true);
    }//GEN-LAST:event_medicion1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void iniciarCompVisuales(){
        List<Usuario> usuarios = usuarioctrl.getUsuarios();
        usuarioModel = new UsuarioTableModel(usuarios);
        tblUsuarios.setModel(usuarioModel);
        List<Dieta> dietas = dietactrl.getDietas();
        dietaModel = new DietaTableModel(dietas);
        tblDietas.setModel(dietaModel);
        
    }
    
    
    public void setDatosUsuario(String cuil, String nombre, String apellido, String suenopromedio, String aguapromedio, String fechaNacimiento, String sexo, String genero, String horasDeporteSemanales) {

    // Convertir el cuil a Long
    Long cuilLong = Long.valueOf(cuil);
    Float suenoPromedio = Float.valueOf(suenopromedio);
    Float aguaPromedio = Float.valueOf(aguapromedio);
    char sexo1 = sexo.charAt(0);
    Float horasDeporteSemanales1 = Float.valueOf(horasDeporteSemanales);
    // Crear un objeto Usuario con los datos proporcionados
    Usuario usuario = new Usuario(cuilLong, nombre, apellido, suenoPromedio, aguaPromedio, fechaNacimiento, sexo1, genero, null, null, horasDeporteSemanales1);
    usuarioctrl.insertarUsuario(usuario);
    }
    
    public void modificarDatosUsuario(String cuil, String nombre, String apellido, String suenopromedio, String aguapromedio, String fechaNacimiento, String sexo, String genero, String horasDeporteSemanales, Float imc, String estadopeso) {
    // Convertir el cuil a Long
    Long cuilLong = Long.valueOf(cuil);
    Float suenoPromedio = Float.valueOf(suenopromedio);
    Float aguaPromedio = Float.valueOf(aguapromedio);
    char sexo1 = sexo.charAt(0);
    Float horasDeporteSemanales1 = Float.valueOf(horasDeporteSemanales);
    // Crear un objeto Usuario con los datos proporcionados
    Usuario usuario = new Usuario(cuilLong, nombre, apellido, suenoPromedio, aguaPromedio, fechaNacimiento, sexo1, genero, imc, estadopeso, horasDeporteSemanales1);
    usuarioctrl.modificarUsuario(usuario);
    }
    public void eliminarUsuario(String cuil1) {
        Long cuil = Long.valueOf(cuil1);
        Usuario usuario = usuarioctrl.getUsuario(cuil);
        System.out.println(cuil + usuario.getNombre());
        usuarioctrl.eliminarUsuario(usuario);     
    }
    
    public Usuario getUsuario(String cuil1) {
        Long cuil = Long.valueOf(cuil1);
        Usuario usuario = usuarioctrl.getUsuario(cuil);
        return usuario;
    }
    
    public void eliminarDieta(Integer id) {
        dietactrl.eliminarDieta(dietactrl.getDieta(id));
    }
    
    public Dieta getDieta(Integer id) {
        Dieta dieta2 = dietactrl.getDieta(id);
        return dieta2;
    }
    
    public void modificarDieta(Integer id, String objetivo) {
        dietactrl.modificarDieta(id, objetivo);
    }
    
    public void nuevaDieta(String objetivo) {
        Dieta dieta = new Dieta(objetivo);
        dietactrl.insertarDieta(dieta);
    }
    
    public void insertarPesaje(String cuil1, String fecha1, String peso1) {
        Long cuil = Long.valueOf(cuil1);
        Date fecha = Date.valueOf(fecha1);
        Float peso = Float.valueOf(peso1);
        Pesaje pesaje = new Pesaje(cuil, fecha, peso);
        pesajectrl.insertarPesaje(pesaje);
    }
    
    public void insertarMedicion(String cuil1, String fecha1, String altura1) {
        Long cuil = Long.valueOf(cuil1);
        Date fecha = Date.valueOf(fecha1);
        Float altura = Float.valueOf(altura1);
        Medicion medicion = new Medicion(cuil, fecha, altura);
        medicionctrl.insertarMedicion(medicion);
    }
    
    private final MedicionController medicionctrl = new MedicionController();
    private final PesajeController pesajectrl = new PesajeController();
    private ExportPDF pdf = new ExportPDF();
    private PostgresBackup backup = new PostgresBackup();
    private final UsuarioController usuarioctrl= new UsuarioController();
    private UsuarioTableModel usuarioModel;
    private DietaTableModel dietaModel;
    private final DietaController dietactrl = new DietaController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Recargar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarDieta;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btModificarDieta;
    private javax.swing.JButton btNuevaDieta;
    private javax.swing.JButton btNuevoUsuario;
    private javax.swing.JButton dietasusuarios;
    private javax.swing.JButton exportarpdf;
    private javax.swing.JButton importarbackup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton medicion1;
    private javax.swing.JButton pesaje1;
    private javax.swing.JButton realizarbackup;
    private javax.swing.JTable tblDietas;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

}





class UsuarioTableModel extends AbstractTableModel {
    private List<Usuario> usuarios;
    private final String[] columnNames = {"Cuil", "Nombre", "Apellido", "Sueño_Promedio", "Agua_Promedio", "Fecha_Nacimiento", "Sexo", "Género", "IMC", "Estado_Peso", "Horas_Deporte_Semanales"};
    private Long idClicked=-1L;

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0: return usuario.getCuil();
            case 1: return usuario.getNombre();
            case 2: return usuario.getApellido();
            case 3: return usuario.getSuenopromedio();
            case 4: return usuario.getAguapromedio();
            case 5: return usuario.getFechaNacimiento();
            case 6: return usuario.getSexo();
            case 7: return usuario.getGenero();
            case 8: return usuario.getImc();
            case 9: return usuario.getEstadoPeso();
            case 10: return usuario.getHorasDeporteSemanales();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Permite la edición en todas las celdas
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                usuario.setCuil((Long) value);
                break;
            case 1:
                usuario.setNombre((String) value);
                break;
            case 2:
                usuario.setApellido((String) value);
                break;
            case 3:
                usuario.setSuenopromedio((Float) value);
                break;
            case 4:
                usuario.setAguapromedio((Float) value);
                break;
            case 5:
                usuario.setFechaNacimiento((String) value);
                break;
            case 6:
                usuario.setSexo((char) value);
                break;
            case 7:
                usuario.setGenero((String) value);
                break;
            case 8:
                usuario.setImc((Float) value);
                break;
            case 9:
                usuario.setEstadoPeso((String) value);
                break;
            case 10:
                usuario.setHorasDeporteSemanales((Float) value);
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        fireTableRowsInserted(usuarios.size() - 1, usuarios.size() - 1);
    }

    public void removeUsuario(int rowIndex) {
        usuarios.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void updateUsuario(int rowIndex, Usuario usuario) {
        usuarios.set(rowIndex, usuario);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
    
class DietaTableModel extends AbstractTableModel {
    private List<Dieta> dietas;
    private final String[] columnNames = {"ID", "Objetivo"};
    private Long idClicked=-1L;

    public DietaTableModel(List<Dieta> dietas) {
        this.dietas = dietas;
    }

    @Override
    public int getRowCount() {
        return dietas.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dieta dieta = dietas.get(rowIndex);
        switch (columnIndex) {
            case 0: return dieta.getId();
            case 1: return dieta.getObjetivodieta();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Permite la edición en todas las celdas
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Dieta dieta = dietas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                dieta.setId((Integer) value);
                break;
            case 1:
                dieta.setObjetivodieta((String) value);
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addDieta(Dieta dieta) {
        dietas.add(dieta);
        fireTableRowsInserted(dietas.size() - 1, dietas.size() - 1);
    }

    public void removeDieta(int rowIndex) {
        dietas.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void updateDieta(int rowIndex, Dieta dieta) {
        dietas.set(rowIndex, dieta);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }
}
