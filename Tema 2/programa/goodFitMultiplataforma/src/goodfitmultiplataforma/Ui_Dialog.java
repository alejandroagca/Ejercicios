package goodfitmultiplataforma;

/********************************************************************************
 ** Form generated from reading ui file 'frmAlta.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Dialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget layoutWidget;
    public QGridLayout gridLayout;
    public QLabel label_3;
    public QLineEdit lineEdit_Entrenamiento;
    public QLabel label_8;
    public QLabel label_9;
    public QSpacerItem verticalSpacer;
    public QLabel label_4;
    public QLineEdit lineEdit_Entrenador;
    public QCalendarWidget calendarWidget_FechaAlta;
    public QLineEdit lineEdit_Codigo;
    public QLabel label_6;
    public QLineEdit lineEdit_Telefono;
    public QLabel label_5;
    public QLabel label_2;
    public QLabel label_7;
    public QLabel label;
    public QSpacerItem verticalSpacer_2;
    public QSpacerItem verticalSpacer_3;
    public QComboBox comboBox_AreaEntrenamiento;
    public QGroupBox groupBox_TipoEntreno;
    public QRadioButton radioButton_Muscular;
    public QRadioButton radioButton_Funcional;
    public QRadioButton radioButton_Crossfit;
    public QRadioButton radioButton_Fuerza;
    public QRadioButton radioButton_Running;
    public QRadioButton radioButton_Fisico;
    public QSpinBox spinBox_Precio;
    public QGroupBox groupBox_Maquinas;
    public QCheckBox checkBox_Cinta;
    public QCheckBox checkBox_Bicicleta;
    public QCheckBox checkBox_Placas;
    public QCheckBox checkBox_Palancas;
    public QCheckBox checkBox_Multifuncion;
    public QCheckBox checkBox_Bancos;
    public QGroupBox groupBox_Ubicacion;
    public QRadioButton radioButton_SalaFitness;
    public QRadioButton radioButton_SalaCross;
    public QRadioButton radioButton_SalaMusculacion;
    public QWidget layoutWidget1;
    public QHBoxLayout horizontalLayout;
    public QPushButton pushButton_Aceptar;
    public QPushButton pushButton_Cancelar;

    public Ui_Dialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(546, 604).expandedTo(Dialog.minimumSizeHint()));
        layoutWidget = new QWidget(Dialog);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(0, 10, 542, 541));
        gridLayout = new QGridLayout(layoutWidget);
        gridLayout.setObjectName("gridLayout");
        label_3 = new QLabel(layoutWidget);
        label_3.setObjectName("label_3");
        QFont font = new QFont();
        font.setFamily("Arial");
        font.setPointSize(10);
        font.setBold(true);
        font.setWeight(75);
        label_3.setFont(font);

        gridLayout.addWidget(label_3, 2, 0, 1, 2);

        lineEdit_Entrenamiento = new QLineEdit(layoutWidget);
        lineEdit_Entrenamiento.setObjectName("lineEdit_Entrenamiento");
        lineEdit_Entrenamiento.setMaxLength(10);

        gridLayout.addWidget(lineEdit_Entrenamiento, 1, 3, 1, 2);

        label_8 = new QLabel(layoutWidget);
        label_8.setObjectName("label_8");
        QFont font1 = new QFont();
        font1.setFamily("Arial");
        font1.setPointSize(10);
        font1.setBold(true);
        font1.setWeight(75);
        label_8.setFont(font1);

        gridLayout.addWidget(label_8, 7, 0, 1, 1);

        label_9 = new QLabel(layoutWidget);
        label_9.setObjectName("label_9");
        QFont font2 = new QFont();
        font2.setFamily("Arial");
        font2.setPointSize(10);
        font2.setBold(true);
        font2.setWeight(75);
        label_9.setFont(font2);

        gridLayout.addWidget(label_9, 8, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 60, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        gridLayout.addItem(verticalSpacer, 2, 2, 1, 1);

        label_4 = new QLabel(layoutWidget);
        label_4.setObjectName("label_4");
        QFont font3 = new QFont();
        font3.setFamily("Arial");
        font3.setPointSize(10);
        font3.setBold(true);
        font3.setWeight(75);
        label_4.setFont(font3);

        gridLayout.addWidget(label_4, 3, 0, 1, 2);

        lineEdit_Entrenador = new QLineEdit(layoutWidget);
        lineEdit_Entrenador.setObjectName("lineEdit_Entrenador");
        lineEdit_Entrenador.setMaxLength(10);

        gridLayout.addWidget(lineEdit_Entrenador, 5, 3, 1, 2);

        calendarWidget_FechaAlta = new QCalendarWidget(layoutWidget);
        calendarWidget_FechaAlta.setObjectName("calendarWidget_FechaAlta");

        gridLayout.addWidget(calendarWidget_FechaAlta, 4, 3, 1, 2);

        lineEdit_Codigo = new QLineEdit(layoutWidget);
        lineEdit_Codigo.setObjectName("lineEdit_Codigo");
        lineEdit_Codigo.setMaxLength(5);

        gridLayout.addWidget(lineEdit_Codigo, 0, 3, 1, 2);

        label_6 = new QLabel(layoutWidget);
        label_6.setObjectName("label_6");
        QFont font4 = new QFont();
        font4.setFamily("Arial");
        font4.setPointSize(10);
        font4.setBold(true);
        font4.setWeight(75);
        label_6.setFont(font4);

        gridLayout.addWidget(label_6, 5, 0, 1, 1);

        lineEdit_Telefono = new QLineEdit(layoutWidget);
        lineEdit_Telefono.setObjectName("lineEdit_Telefono");
        lineEdit_Telefono.setMaxLength(9);

        gridLayout.addWidget(lineEdit_Telefono, 6, 3, 1, 2);

        label_5 = new QLabel(layoutWidget);
        label_5.setObjectName("label_5");
        QFont font5 = new QFont();
        font5.setFamily("Arial");
        font5.setPointSize(10);
        font5.setBold(true);
        font5.setWeight(75);
        label_5.setFont(font5);

        gridLayout.addWidget(label_5, 4, 0, 1, 1);

        label_2 = new QLabel(layoutWidget);
        label_2.setObjectName("label_2");
        QFont font6 = new QFont();
        font6.setFamily("Arial");
        font6.setPointSize(10);
        font6.setBold(true);
        font6.setWeight(75);
        label_2.setFont(font6);

        gridLayout.addWidget(label_2, 1, 0, 1, 2);

        label_7 = new QLabel(layoutWidget);
        label_7.setObjectName("label_7");
        QFont font7 = new QFont();
        font7.setFamily("Arial");
        font7.setPointSize(10);
        font7.setBold(true);
        font7.setWeight(75);
        label_7.setFont(font7);

        gridLayout.addWidget(label_7, 6, 0, 1, 1);

        label = new QLabel(layoutWidget);
        label.setObjectName("label");
        QFont font8 = new QFont();
        font8.setFamily("Arial");
        font8.setPointSize(10);
        font8.setBold(true);
        font8.setWeight(75);
        label.setFont(font8);

        gridLayout.addWidget(label, 0, 0, 1, 1);

        verticalSpacer_2 = new QSpacerItem(20, 30, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        gridLayout.addItem(verticalSpacer_2, 8, 1, 1, 1);

        verticalSpacer_3 = new QSpacerItem(20, 50, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        gridLayout.addItem(verticalSpacer_3, 9, 1, 1, 1);

        comboBox_AreaEntrenamiento = new QComboBox(layoutWidget);
        comboBox_AreaEntrenamiento.setObjectName("comboBox_AreaEntrenamiento");
        comboBox_AreaEntrenamiento.setEnabled(true);

        gridLayout.addWidget(comboBox_AreaEntrenamiento, 3, 3, 1, 1);

        groupBox_TipoEntreno = new QGroupBox(layoutWidget);
        groupBox_TipoEntreno.setObjectName("groupBox_TipoEntreno");
        radioButton_Muscular = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Muscular.setObjectName("radioButton_Muscular");
        radioButton_Muscular.setEnabled(true);
        radioButton_Muscular.setGeometry(new QRect(0, 10, 61, 17));
        radioButton_Muscular.setChecked(true);
        radioButton_Funcional = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Funcional.setObjectName("radioButton_Funcional");
        radioButton_Funcional.setGeometry(new QRect(70, 10, 71, 17));
        radioButton_Crossfit = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Crossfit.setObjectName("radioButton_Crossfit");
        radioButton_Crossfit.setGeometry(new QRect(140, 10, 61, 17));
        radioButton_Fuerza = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Fuerza.setObjectName("radioButton_Fuerza");
        radioButton_Fuerza.setGeometry(new QRect(0, 30, 51, 17));
        radioButton_Running = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Running.setObjectName("radioButton_Running");
        radioButton_Running.setGeometry(new QRect(70, 30, 61, 17));
        radioButton_Fisico = new QRadioButton(groupBox_TipoEntreno);
        radioButton_Fisico.setObjectName("radioButton_Fisico");
        radioButton_Fisico.setGeometry(new QRect(140, 30, 51, 17));

        gridLayout.addWidget(groupBox_TipoEntreno, 2, 3, 1, 2);

        spinBox_Precio = new QSpinBox(layoutWidget);
        spinBox_Precio.setObjectName("spinBox_Precio");
        spinBox_Precio.setMinimum(1);
        spinBox_Precio.setMaximum(200);

        gridLayout.addWidget(spinBox_Precio, 7, 3, 1, 1);

        groupBox_Maquinas = new QGroupBox(layoutWidget);
        groupBox_Maquinas.setObjectName("groupBox_Maquinas");
        checkBox_Cinta = new QCheckBox(groupBox_Maquinas);
        checkBox_Cinta.setObjectName("checkBox_Cinta");
        checkBox_Cinta.setEnabled(true);
        checkBox_Cinta.setGeometry(new QRect(0, 0, 51, 17));
        checkBox_Cinta.setChecked(true);
        checkBox_Bicicleta = new QCheckBox(groupBox_Maquinas);
        checkBox_Bicicleta.setObjectName("checkBox_Bicicleta");
        checkBox_Bicicleta.setEnabled(true);
        checkBox_Bicicleta.setGeometry(new QRect(90, 0, 61, 17));
        checkBox_Bicicleta.setChecked(true);
        checkBox_Placas = new QCheckBox(groupBox_Maquinas);
        checkBox_Placas.setObjectName("checkBox_Placas");
        checkBox_Placas.setEnabled(true);
        checkBox_Placas.setGeometry(new QRect(180, 0, 51, 17));
        checkBox_Placas.setChecked(true);
        checkBox_Palancas = new QCheckBox(groupBox_Maquinas);
        checkBox_Palancas.setObjectName("checkBox_Palancas");
        checkBox_Palancas.setEnabled(true);
        checkBox_Palancas.setGeometry(new QRect(0, 30, 70, 17));
        checkBox_Palancas.setChecked(true);
        checkBox_Multifuncion = new QCheckBox(groupBox_Maquinas);
        checkBox_Multifuncion.setObjectName("checkBox_Multifuncion");
        checkBox_Multifuncion.setEnabled(true);
        checkBox_Multifuncion.setGeometry(new QRect(90, 30, 81, 17));
        checkBox_Multifuncion.setChecked(true);
        checkBox_Bancos = new QCheckBox(groupBox_Maquinas);
        checkBox_Bancos.setObjectName("checkBox_Bancos");
        checkBox_Bancos.setEnabled(true);
        checkBox_Bancos.setGeometry(new QRect(180, 30, 61, 17));
        checkBox_Bancos.setChecked(true);

        gridLayout.addWidget(groupBox_Maquinas, 9, 3, 1, 2);

        groupBox_Ubicacion = new QGroupBox(layoutWidget);
        groupBox_Ubicacion.setObjectName("groupBox_Ubicacion");
        radioButton_SalaFitness = new QRadioButton(groupBox_Ubicacion);
        radioButton_SalaFitness.setObjectName("radioButton_SalaFitness");
        radioButton_SalaFitness.setGeometry(new QRect(0, 0, 82, 17));
        radioButton_SalaFitness.setCheckable(true);
        radioButton_SalaFitness.setChecked(true);
        radioButton_SalaCross = new QRadioButton(groupBox_Ubicacion);
        radioButton_SalaCross.setObjectName("radioButton_SalaCross");
        radioButton_SalaCross.setGeometry(new QRect(90, 0, 71, 17));
        radioButton_SalaCross.setChecked(false);
        radioButton_SalaMusculacion = new QRadioButton(groupBox_Ubicacion);
        radioButton_SalaMusculacion.setObjectName("radioButton_SalaMusculacion");
        radioButton_SalaMusculacion.setGeometry(new QRect(170, 0, 101, 17));

        gridLayout.addWidget(groupBox_Ubicacion, 8, 3, 1, 2);

        layoutWidget1 = new QWidget(Dialog);
        layoutWidget1.setObjectName("layoutWidget1");
        layoutWidget1.setGeometry(new QRect(180, 560, 158, 41));
        horizontalLayout = new QHBoxLayout(layoutWidget1);
        horizontalLayout.setObjectName("horizontalLayout");
        pushButton_Aceptar = new QPushButton(layoutWidget1);
        pushButton_Aceptar.setObjectName("pushButton_Aceptar");

        horizontalLayout.addWidget(pushButton_Aceptar);

        pushButton_Cancelar = new QPushButton(layoutWidget1);
        pushButton_Cancelar.setObjectName("pushButton_Cancelar");

        horizontalLayout.addWidget(pushButton_Cancelar);

        label_8.setBuddy(spinBox_Precio);
        label_4.setBuddy(comboBox_AreaEntrenamiento);
        label_6.setBuddy(lineEdit_Entrenador);
        label_5.setBuddy(calendarWidget_FechaAlta);
        label_2.setBuddy(lineEdit_Entrenamiento);
        label_7.setBuddy(lineEdit_Telefono);
        label.setBuddy(lineEdit_Codigo);
        QWidget.setTabOrder(lineEdit_Codigo, lineEdit_Entrenamiento);
        QWidget.setTabOrder(lineEdit_Entrenamiento, radioButton_Muscular);
        QWidget.setTabOrder(radioButton_Muscular, radioButton_Funcional);
        QWidget.setTabOrder(radioButton_Funcional, radioButton_Crossfit);
        QWidget.setTabOrder(radioButton_Crossfit, radioButton_Fuerza);
        QWidget.setTabOrder(radioButton_Fuerza, radioButton_Running);
        QWidget.setTabOrder(radioButton_Running, radioButton_Fisico);
        QWidget.setTabOrder(radioButton_Fisico, comboBox_AreaEntrenamiento);
        QWidget.setTabOrder(comboBox_AreaEntrenamiento, calendarWidget_FechaAlta);
        QWidget.setTabOrder(calendarWidget_FechaAlta, lineEdit_Entrenador);
        QWidget.setTabOrder(lineEdit_Entrenador, lineEdit_Telefono);
        QWidget.setTabOrder(lineEdit_Telefono, spinBox_Precio);
        QWidget.setTabOrder(spinBox_Precio, radioButton_SalaFitness);
        QWidget.setTabOrder(radioButton_SalaFitness, radioButton_SalaCross);
        QWidget.setTabOrder(radioButton_SalaCross, radioButton_SalaMusculacion);
        QWidget.setTabOrder(radioButton_SalaMusculacion, checkBox_Cinta);
        QWidget.setTabOrder(checkBox_Cinta, checkBox_Bicicleta);
        QWidget.setTabOrder(checkBox_Bicicleta, checkBox_Placas);
        QWidget.setTabOrder(checkBox_Placas, checkBox_Palancas);
        QWidget.setTabOrder(checkBox_Palancas, checkBox_Multifuncion);
        QWidget.setTabOrder(checkBox_Multifuncion, checkBox_Bancos);
        retranslateUi(Dialog);
        
        pushButton_Cancelar.clicked.connect(Dialog, "close()");
        pushButton_Aceptar.clicked.connect(this, "comprobarCampos()");
        pushButton_Aceptar.clicked.connect(Dialog, "accept()");
        
        radioButton_Fisico.clicked.connect(this, "activarCombo()");
        radioButton_Muscular.clicked.connect(this, "activarCombo()");
        radioButton_Crossfit.clicked.connect(this, "desactivarCombo()");
        radioButton_Fuerza.clicked.connect(this, "desactivarCombo()");
        radioButton_Funcional.clicked.connect(this, "desactivarCombo()");
        radioButton_Running.clicked.connect(this, "desactivarCombo()");
        
        radioButton_SalaFitness.clicked.connect(this, "activarMaquinasFitness()");
        radioButton_SalaCross.clicked.connect(this, "activarMaquinasCross()");
        radioButton_SalaMusculacion.clicked.connect(this, "activarMaquinasMusculacion()");
        
        lineEdit_Telefono.textEdited.connect(this, "comprobarTelefono()");
        lineEdit_Entrenador.textEdited.connect(this, "comprobarEntrenador()");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tipo entrenamiento", null));
        lineEdit_Entrenamiento.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>M\u00e1ximo 10 caracteres alfanum\u00e9ricos</p></body></html>", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Precio", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Ubicaci\u00f3n", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Area entrenamiento", null));
        lineEdit_Entrenador.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>M\u00e1ximo 10 caracteres</p></body></html>", null));
        lineEdit_Codigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>M\u00e1ximo 5 caracteres alfanum\u00e9ricos</p></body></html>", null));
        lineEdit_Codigo.setText("");
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Entrenador", null));
        lineEdit_Telefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>M\u00e1ximo 9 caracteres num\u00e9ricos</p></body></html>", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Fecha alta", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Nombre entrenamiento", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Telefono", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&C\u00f3digo", null));
        comboBox_AreaEntrenamiento.clear();
        comboBox_AreaEntrenamiento.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tren superior", null));
        comboBox_AreaEntrenamiento.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tren inferior", null));
        comboBox_AreaEntrenamiento.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tronco", null));
        comboBox_AreaEntrenamiento.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Core", null));
        groupBox_TipoEntreno.setTitle("");
        radioButton_Muscular.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Muscular", null));
        radioButton_Funcional.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Funcional", null));
        radioButton_Crossfit.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Crossfit", null));
        radioButton_Fuerza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fuerza", null));
        radioButton_Running.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Running", null));
        radioButton_Fisico.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "F\u00edsico", null));
        groupBox_Maquinas.setTitle("");
        checkBox_Cinta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cinta", null));
        checkBox_Bicicleta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Bicicleta", null));
        checkBox_Placas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Placas", null));
        checkBox_Palancas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Palancas", null));
        checkBox_Multifuncion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Multifunci\u00f3n", null));
        checkBox_Bancos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Bancos", null));
        groupBox_Ubicacion.setTitle("");
        radioButton_SalaFitness.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala Fitness", null));
        radioButton_SalaCross.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala Cross", null));
        radioButton_SalaMusculacion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala Musculaci\u00f3n", null));
        pushButton_Aceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Aceptar", null));
        pushButton_Cancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Cancelar", null));
    } // retranslateUi
    
    void activarCombo(){
        comboBox_AreaEntrenamiento.setEnabled(true);
    }
    
    void desactivarCombo(){
    comboBox_AreaEntrenamiento.setEnabled(false);
    }
    
    void activarMaquinasFitness(){
        checkBox_Bancos.setEnabled(true);
        checkBox_Bicicleta.setEnabled(true);
        checkBox_Cinta.setEnabled(true);
        checkBox_Multifuncion.setEnabled(true);
        checkBox_Palancas.setEnabled(true);
        checkBox_Placas.setEnabled(true);
        checkBox_Bancos.setChecked(true);
        checkBox_Bicicleta.setChecked(true);
        checkBox_Cinta.setChecked(true);
        checkBox_Multifuncion.setChecked(true);
        checkBox_Palancas.setChecked(true);
        checkBox_Placas.setChecked(true);
    }
    
    void activarMaquinasCross(){
        checkBox_Bancos.setEnabled(false);
        checkBox_Bicicleta.setEnabled(false);
        checkBox_Cinta.setEnabled(false);
        checkBox_Multifuncion.setEnabled(false);
        checkBox_Palancas.setEnabled(true);
        checkBox_Placas.setEnabled(true);
        checkBox_Bancos.setChecked(false);
        checkBox_Bicicleta.setChecked(false);
        checkBox_Cinta.setChecked(false);
        checkBox_Multifuncion.setChecked(false);
        checkBox_Palancas.setChecked(true);
        checkBox_Placas.setChecked(true);
    }
    
    void activarMaquinasMusculacion(){
        checkBox_Bancos.setEnabled(true);
        checkBox_Bicicleta.setEnabled(false);
        checkBox_Cinta.setEnabled(false);
        checkBox_Multifuncion.setEnabled(true);
        checkBox_Palancas.setEnabled(false);
        checkBox_Placas.setEnabled(false);
        checkBox_Bancos.setChecked(true);
        checkBox_Bicicleta.setChecked(false);
        checkBox_Cinta.setChecked(false);
        checkBox_Multifuncion.setChecked(true);
        checkBox_Palancas.setChecked(false);
        checkBox_Placas.setChecked(false);
    }
    
    void comprobarTelefono(){
        String telefono = lineEdit_Telefono.text();
        if (telefono.length() > 0) {
            char ultimoCaracter = telefono.charAt(telefono.length()-1);
            if (ultimoCaracter < '1' || ultimoCaracter > '9') {
                String nuevaCadena = telefono.substring(0, telefono.length()-1);
                lineEdit_Telefono.setText(nuevaCadena);
            }
        }
    }
    
    void comprobarEntrenador(){
        String entrenador = lineEdit_Entrenador.text();
        if (entrenador.length() > 0) {
            char ultimoCaracter = entrenador.charAt(entrenador.length()-1);
            if ((ultimoCaracter < 'a' || ultimoCaracter > 'z') && (ultimoCaracter < 'A' || ultimoCaracter > 'Z')) {
                String nuevaCadena = entrenador.substring(0, entrenador.length()-1);
                lineEdit_Entrenador.setText(nuevaCadena);
            }
        }
    }
    
    void comprobarCampos(){
        String codigo = lineEdit_Codigo.text();
        String telefono =  lineEdit_Telefono.text();
        String entrenador = lineEdit_Entrenador.text();
        String entrenamiento = lineEdit_Entrenamiento.text();
        QMessageBox mensaje = new QMessageBox();
        mensaje.setWindowTitle("Información");
        if (codigo.length() > 0 && telefono.length() > 0 && entrenador.length() > 0 && entrenamiento.length() > 0) {
            mensaje.setText("Entrenamiento guardado con exito");
            mensaje.show();
            
        } else{
            mensaje.setText("Fallo al guardar el entrenamiento porque alguno de los campos estaba vacío");
            mensaje.show();
        }
    }

}

