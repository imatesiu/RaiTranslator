/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Administrator
 */
public class raimid extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form form;
    private ChoiceGroup choiceGroup;
    private TextBox textBox;
    private Form form1;
    private ImageItem imageItem;
    private StringItem stringItem;
    private Command okCommand;
    private Command exitCommand;
    private Command backCommand;
    private Command okCommand2;
    private Command helpCommand;
    private Command backCommand1;
    private Image image;
    private Font font;
    //</editor-fold>//GEN-END:|fields|0|
    private String RaiUno = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=180090";
    private String RaiDue = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=180116";
    private String RaiTre = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=180117";
    private String Rai4 = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=75708";
    private String RaiSatExtra = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=72382";
    private String RaiSatPremium = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=72383";
    private String RaiSatCinema = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=72381";
    private String RaiSatYoYo = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=72918";
    private String RaiGulp = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=4119";
    private String RaiNews24 = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=1";
    private String RaiSportPiu = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=4145";
    private String RaiStoria = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=24269";
    private String RaiEdu1 = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=24268";
    private String Canale5 = "mms://95.154.193.121/Liveencoder09";
    private String Italia1 = "mms://95.154.193.121/Liveencoder12";
    private String Rete4 = "mms://live.mediashopping.it/enc2-c3";
    private String SkyNews = "";
    private String TG1 = "http://link.rai.it/x/vod/ue/wmx/ultimo_tg1.asx";
    private String TG2 = "http://link.rai.it/x/vod/ue/wmx/ultimo_tg2.asx";
    private String TG3 = "http://link.rai.it/x/vod/ue/wmx/ultimo_tg3.asx";

    /** The raimid constructor. */
    public raimid() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|38-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|38-preAction
                // write pre-action user code here
                this.destroyApp(true);
//GEN-LINE:|7-commandAction|2|38-postAction
                // write post-action user code here
            } else if (command == helpCommand) {//GEN-LINE:|7-commandAction|3|59-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|4|59-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|5|16-preAction
                // write pre-action user code here
                String sar = null;
                //   String rl = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=984";
                for (int i = 0; i < this.choiceGroup.size(); ++i) {
                    if (this.choiceGroup.isSelected(i)) {
                        if (i < 13) {
                            String URL = dammiurl(this.choiceGroup.getString(i));
                             String ID ="";
                            if(i<3){
                             ID =  URL.substring(URL.length()-3, URL.length());
                            }else{
                                 if(i==8 || i ==10){
                                  ID =  URL.substring(URL.length()-4, URL.length());
                                 }else{
                                     ID =  URL.substring(URL.length()-5, URL.length());
                                 }
                            }
                             Data data = this.date();
                              String token =  data.anno+";"+ID+";"+data.day+"-"+data.mese+"-"+"528"+"-"+data.ore+"-"+data.min+"-"+data.sec+"-565";

                              String aut =this.aut(token, 1);
                              String aut2 = this.aut2(aut+";1" , "hMrxuE2T8V0WRW0VmHaKMoFwy1XRc+hK7eBX2tTLVTw=");
                             Base64Code ds = new Base64Code(aut2.getBytes());
                            sar = traduci(ds.getResult(),URL);

                        } else {
                            if (i < 16) {
                                sar = traducitg(dammiurl(this.choiceGroup.getString(i)));
                            } else {
                                sar = dammiurl(this.choiceGroup.getString(i));
                            }

                        }
                    }
                }
                getTextBox().setMaxSize(625);
                if (textBox.size() > 0) {
                    textBox.delete(0, textBox.size());
                }
                //textBox = getTextBox();

                textBox.setString(sar);
                switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|6|16-postAction
                // write post-action user code here

            }//GEN-BEGIN:|7-commandAction|7|68-preAction
        } else if (displayable == form1) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|7|68-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|8|68-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|49-preAction
        } else if (displayable == textBox) {
            if (command == backCommand) {//GEN-END:|7-commandAction|9|49-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|10|49-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|11|52-preAction
                try {
                    // write pre-action user code here
                    this.platformRequest(this.textBox.getString());
                    // write post-action user code here
                } catch (ConnectionNotFoundException ex) {
                    ex.printStackTrace();
                }
//GEN-LINE:|7-commandAction|12|52-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|7-postCommandAction
        }//GEN-END:|7-commandAction|13|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|14|
    //</editor-fold>//GEN-END:|7-commandAction|14|

    private String dammiurl(String nomec) {

        if (nomec.equals("RaiUno")) {
            return RaiUno;
        } else {
            if (nomec.equals("RaiDue")) {
                return RaiDue;
            } else {
                if (nomec.equals("RaiTre")) {
                    return RaiTre;
                } else {
                    if (nomec.equals("Rai4")) {
                        return Rai4;
                    } else {
                        if (nomec.equals("RaiSatExtra")) {
                            return RaiSatExtra;
                        } else {
                            if (nomec.equals("RaiSatPremium")) {
                                return RaiSatPremium;
                            } else {
                                if (nomec.equals("RaiSatCinema")) {
                                    return RaiSatCinema;
                                } else {
                                    if (nomec.equals("RaiSatYoYo")) {
                                        return RaiSatYoYo;
                                    } else {
                                        if (nomec.equals("RaiGulp")) {
                                            return RaiGulp;
                                        } else {
                                            if (nomec.equals("RaiNews24")) {
                                                return RaiNews24;
                                            } else {
                                                if (nomec.equals("RaiSportPiu")) {
                                                    return RaiSportPiu;
                                                } else {
                                                    if (nomec.equals("RaiStoria")) {
                                                        return RaiStoria;
                                                    } else {
                                                        if (nomec.equals("RaiEdu1")) {
                                                            return RaiEdu1;
                                                        } else {
                                                            if (nomec.equals("Canale5")) {
                                                                return Canale5;
                                                            } else {
                                                                if (nomec.equals("Italia1")) {
                                                                    return Italia1;
                                                                } else {
                                                                    if (nomec.equals("Rete4")) {
                                                                        return Rete4;
                                                                    } else {
                                                                        if (nomec.equals("TG1")) {
                                                                            return TG1;
                                                                        } else {
                                                                            if (nomec.equals("TG2")) {
                                                                                return TG2;
                                                                            } else {
                                                                                if (nomec.equals("TG3")) {
                                                                                    return TG3;
                                                                                } else {
                                                                                    return RaiUno;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //SportItalia
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Rai Diretta", new Item[] { getChoiceGroup() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getOkCommand());
            form.addCommand(getExitCommand());
            form.addCommand(getHelpCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|15-getter|0|15-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|15-getter|0|15-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|15-getter|1|15-postInit
            // write post-init user code here
        }//GEN-BEGIN:|15-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|15-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Scegli il canale", Choice.EXCLUSIVE);//GEN-BEGIN:|22-getter|1|22-postInit
            choiceGroup.append("RaiUno", null);
            choiceGroup.append("RaiDue", null);
            choiceGroup.append("RaiTre", null);
            choiceGroup.append("Rai4", null);
            choiceGroup.append("RaiSatExtra", null);
            choiceGroup.append("RaiSatPremium", null);
            choiceGroup.append("RaiSatCinema", null);
            choiceGroup.append("RaiSatYoYo", null);
            choiceGroup.append("RaiGulp", null);
            choiceGroup.append("RaiNews24", null);
            choiceGroup.append("RaiSportPiu", null);
            choiceGroup.append("RaiStoria", null);
            choiceGroup.append("RaiEdu1", null);
            choiceGroup.append("TG1", null);
            choiceGroup.append("TG2", null);
            choiceGroup.append("TG3", null);
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_OFF);
            choiceGroup.setSelectedFlags(new boolean[] { false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false });//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|37-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|44-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of textBox component.
     * @return the initialized component instance
     */
    public TextBox getTextBox() {
        if (textBox == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            textBox = new TextBox("indirizzo dello streaming", null, 100, TextField.ANY);//GEN-BEGIN:|47-getter|1|47-postInit
            textBox.addCommand(getBackCommand());
            textBox.addCommand(getOkCommand2());
            textBox.setCommandListener(this);//GEN-END:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return textBox;
    }
    //</editor-fold>//GEN-END:|47-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initiliazed instance of okCommand2 component.
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return okCommand2;
    }
    //</editor-fold>//GEN-END:|51-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: helpCommand ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initiliazed instance of helpCommand component.
     * @return the initialized component instance
     */
    public Command getHelpCommand() {
        if (helpCommand == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            helpCommand = new Command("Help", Command.HELP, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return helpCommand;
    }
    //</editor-fold>//GEN-END:|58-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initiliazed instance of form1 component.
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            form1 = new Form("Disclaimer", new Item[] { getImageItem(), getStringItem() });//GEN-BEGIN:|64-getter|1|64-postInit
            form1.addCommand(getBackCommand1());
            form1.setCommandListener(this);//GEN-END:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return form1;
    }
    //</editor-fold>//GEN-END:|64-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItem ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of imageItem component.
     * @return the initialized component instance
     */
    public ImageItem getImageItem() {
        if (imageItem == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            imageItem = new ImageItem("", getImage(), ImageItem.LAYOUT_DEFAULT, "<Missing Image>");//GEN-LINE:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return imageItem;
    }
    //</editor-fold>//GEN-END:|65-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|67-getter|0|67-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|67-getter|1|67-postInit
            // write post-init user code here
        }//GEN-BEGIN:|67-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|67-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initiliazed instance of image component.
     * @return the initialized component instance
     */
    public Image getImage() {
        if (image == null) {//GEN-END:|71-getter|0|71-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|71-getter|1|71-@java.io.IOException
                image = Image.createImage("/rai.PNG");
            } catch (java.io.IOException e) {//GEN-END:|71-getter|1|71-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|71-getter|2|71-postInit
            // write post-init user code here
        }//GEN-BEGIN:|71-getter|3|
        return image;
    }
    //</editor-fold>//GEN-END:|71-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|72-getter|0|72-preInit
            // write pre-init user code here
            stringItem = new StringItem("", "Applicazione rilasciata sotto licenza Creative Commons http://creativecommons.org/licenses/by-nc-sa/3.0/ creata da si\u00F9 da un\'idea dell\'applicazione per win creata da dariocorsetti.com", Item.BUTTON);//GEN-LINE:|72-getter|1|72-postInit
            // write post-init user code here
        }//GEN-BEGIN:|72-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|72-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: font ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initiliazed instance of font component.
     * @return the initialized component instance
     */
    public Font getFont() {
        if (font == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            font = Font.getDefaultFont();//GEN-LINE:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return font;
    }
    //</editor-fold>//GEN-END:|73-getter|2|

    private String traducitg(String URL) {
        String pageText = "";
        String urlo = "";
        InputStream is = null;
        HttpConnection con = null;
        try {
            //Apro la connessione http
            con = (HttpConnection) Connector.open(URL);
            con.setRequestProperty("viaurl: ", "www.rai.tv");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux i686; it; rv:1.9.0.6) Gecko/2009011912 Firefox/3.0.6");
            //Apro un input stream collegato con la connessione
            is = con.openInputStream();
            //Leggo byte per byte l'input e lo appendo nella casella di testo
            int ch;
            while ((ch = is.read()) != -1) {
                char s = (char) ch;
                pageText = pageText + "" + s;
            }

            int inizio = pageText.indexOf("<REF HREF=\"http://streaming");

            int fine = pageText.indexOf(".wmv");
            if (inizio > 0) {
                urlo = "mms"+pageText.substring(inizio+15, fine + 4);
            }


        } catch (Exception e) {

            urlo = "errore " + e.toString() + e.getMessage();

        } finally {
            try {
                //Chiudo lo stream
                is.close();
//                //Chiudo la connessione
                con.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        return urlo;
    }

   

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
        notifyDestroyed();
    }
      private String traduci(String aut,String URL) {
       // String URL = "http://mediapolis.rai.it/relinker/relinkerServlet.htm?cont=984";
        String pageText = "";
        String urlo = "";
        InputStream is = null;
        HttpConnection con = null;
        try {
            //Apro la connessione http
            con = (HttpConnection) Connector.open(URL);
            con.setRequestProperty("viaurl ", "http://www.rai.tv");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.7) Gecko/20100106 Ubuntu/9.10 (karmic) Firefox/3.5.7");
//-H "Connection: keep-alive" -H "Keep-Alive: 300" -H "viaurl: www.rai.tv" -H "ttAuth: $TOKEN" -H "Content-Length: 0"
            con.setRequestProperty("Connection", "keep-alive");
            con.setRequestProperty("Keep-Alive", "300");
            con.setRequestProperty("ttAuth", aut);


            con.setRequestProperty("Content-Length", "0");
            //Apro un input stream collegato con la connessione
            is = con.openInputStream();
            //Leggo byte per byte l'input e lo appendo nella casella di testo
            int ch;
            while ((ch = is.read()) != -1) {
                char s = (char) ch;
                pageText = pageText + "" + s;
            }

            int inizio = pageText.indexOf("mms");
            int iniz = pageText.indexOf("http");
            int fine = pageText.indexOf("V001");
            if (inizio > 0) {
                urlo = pageText.substring(inizio, fine + 4);
            } else {
                urlo = "mms" + pageText.substring(iniz + 4, fine + 4);
            }

            //  this.platformRequest(urlo);
        } catch (Exception e) {
//            try {
//                //Chiudo lo stream
//                is.close();
//                //Chiudo la connessione
//                con.close();
            urlo = pageText + "errore " + e.toString() + e.getMessage();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
        } finally {
            try {
                //Chiudo lo stream
                is.close();
//                //Chiudo la connessione
                con.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        return urlo;
    }

    private Data date() {

        String pageText = "";
        Data data= new Data();
        InputStream is = null;
        HttpConnection con = null;
        try {
            //Apro la connessione http
            con = (HttpConnection) Connector.open("http://videowall.rai.it/cgi-bin/date");
            //con.setRequestProperty("viaurl ", "http://www.rai.tv");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux x86_64; it; rv:1.9.1.7) Gecko/20100106 Ubuntu/9.10 (karmic) Firefox/3.5.7");

            //Apro un input stream collegato con la connessione
            is = con.openInputStream();
            //Leggo byte per byte l'input e lo appendo nella casella di testo
            int ch;
            while ((ch = is.read()) != -1) {
                char s = (char) ch;
                pageText = pageText + "" + s;
            }

            data.anno=pageText.substring(6, 10);
            String ww =pageText.substring(3, 5);
            String dd =pageText.substring(0, 2);
            if(ww.startsWith("0")) {
                data.mese=ww.substring(1, ww.length());
            }else{
                 data.mese=pageText.substring(3, 5);
            }
            if(dd.startsWith("0")) {
                data.day=dd.substring(1, dd.length());
            }else{
                 data.day=pageText.substring(0, 2);
            }
            
             
              data.ore=pageText.substring(11, 13);
              data.min=pageText.substring(14, 16);
               data.sec=pageText.substring(17, 19);
              System.out.println("ciao");


            //  this.platformRequest(urlo);
        } catch (Exception e) {
//            try {
//                //Chiudo lo stream
//                is.close();
//                //Chiudo la connessione
//                con.close();
            pageText = "errore " + e.toString() + e.getMessage();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
        } finally {
            try {
                //Chiudo lo stream
                is.close();
//                //Chiudo la connessione
                con.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        return data;
    }

    private String aut(String token, int rand) {
       
        String result = "";
      //  int ii = 0;
       
        for (int i = 0; i < token.length(); i++) {
            int c = (int) token.charAt(i);
            c = c^rand;
           // ii = ii + 3;

            char s = (char) c;
            result += s;
        }
        return result;
    }

    private String aut2(String token, String string) {
        int j = 0;
        String result="";
        for (int i = token.length()-1; i >= 0; i--) {
            int c = (int) token.charAt(i);
            int g = (int) string.charAt(j);
            c = c^g;
           // ii = ii + 3;
            j++;
            char s = (char) c;
            result = s+result;
        }
        return result;
    }

    public class Base64Code {

        public String result;

        public Base64Code(byte[] data) {
            result = this.encodeString(data);
        }
        private char[] alphabet = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9', '+', '/'
        };
        private char padding = '=';

        public char[] encodeChar(byte[] data) {
            if (data == null) {
                throw new NullPointerException("'data' parameter cannot be null");
            }

            int i = 0, j = 0, len = data.length, tmp;

            char[] buf = new char[4 * ((len * 8 + 23) / 24)];

            while (len > 0) {
                tmp = (data[i++] & 0xFF) << 16;
                if (len >= 2) {
                    tmp |= (data[i++] & 0xFF) << 8;
                }
                if (len >= 3) {
                    tmp |= data[i++] & 0xFF;
                }

                buf[j++] = alphabet[tmp >>> 18];
                buf[j++] = alphabet[tmp >>> 12 & 63];
                buf[j++] = len >= 2 ? alphabet[tmp >>> 6 & 63] : padding;
                buf[j++] = len >= 3 ? alphabet[tmp & 63] : padding;

                len -= 3;
            }

            return buf;
        }

        public String encodeString(byte[] data) {
            return new String(encodeChar(data));
        }
        public String getResult(){
            return result;
        }
    }

    public class Data {

        public String anno="";
        public String mese="";
        public String day="";
        public String ore="";
        public String min="";
        public String sec="";

        public Data(String a, String b, String c, String d, String e, String f) {
            this.anno = a;
            this.mese = b;
            this.day = c;
            this.ore = d;
            this.min = e;
            this.sec = f;


        }
        public Data() {
            this.anno = "";
            this.mese = "";
            this.day = "";
            this.ore = "";
            this.min = "";
            this.sec = "";


        }
    }
}
