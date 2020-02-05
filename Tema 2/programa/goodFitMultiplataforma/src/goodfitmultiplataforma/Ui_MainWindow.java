package goodfitmultiplataforma;

/********************************************************************************
 ** Form generated from reading ui file 'frmPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionSalir;
    public QAction actionAlta;
    public QWidget centralwidget;
    public QPushButton pushButton_Alta;
    public QPushButton pushButton_Salir;
    public QLabel label;
    public QMenuBar menubar;
    public QMenu menuAplicaci_n;
    public QMenu menuGesti_n;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(500, 300).expandedTo(MainWindow.minimumSizeHint()));
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        actionAlta = new QAction(MainWindow);
        actionAlta.setObjectName("actionAlta");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        pushButton_Alta = new QPushButton(centralwidget);
        pushButton_Alta.setObjectName("pushButton_Alta");
        pushButton_Alta.setGeometry(new QRect(370, 30, 98, 27));
        pushButton_Salir = new QPushButton(centralwidget);
        pushButton_Salir.setObjectName("pushButton_Salir");
        pushButton_Salir.setGeometry(new QRect(370, 60, 98, 27));
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(20, 30, 251, 211));
        label.setPixmap(new QPixmap(("classpath:recursos/gimnasio.png")));
        label.setScaledContents(true);
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 500, 21));
        menuAplicaci_n = new QMenu(menubar);
        menuAplicaci_n.setObjectName("menuAplicaci_n");
        menuGesti_n = new QMenu(menubar);
        menuGesti_n.setObjectName("menuGesti_n");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuAplicaci_n.menuAction());
        menubar.addAction(menuGesti_n.menuAction());
        menuAplicaci_n.addAction(actionSalir);
        menuGesti_n.addAction(actionAlta);
        retranslateUi(MainWindow);
        pushButton_Salir.clicked.connect(MainWindow, "close()");
        
        pushButton_Alta.clicked.connect(this, "abrir()");
        actionSalir.triggered.connect(MainWindow, "close()");
        actionAlta.triggered.connect(this, "abrir()");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        actionAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Alta", null));
        pushButton_Alta.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Alta", null));
        pushButton_Salir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Salir", null));
        label.setText("");
        menuAplicaci_n.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Aplicaci\u00f3n", null));
        menuGesti_n.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Gesti\u00f3n", null));
    } // retranslateUi
    
    void abrir(){
        Ui_Dialog alta = new Ui_Dialog();
        QDialog dialog = new QDialog();
        alta.setupUi(dialog);
        dialog.show();
   }

}

