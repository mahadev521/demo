import java.awt.*;
import java.awt.event.*;

public class AWTcontrolslist5 extends Frame {
    String btnMsg = "";
    String lstMsg = "";
    Checkbox chkC, chkCpp, chkJava;
    CheckboxGroup cbgCompany;
    Checkbox optTcs, optInfosys, optSyntel;
    TextField txtName, txtPasswd;
    Choice chCity;
    List lstAccompany;
    Button ans;

    public AWTcontrolslist5() {
        Label lblName = new Label("Name : ");
        Label lblPasswd = new Label("Password : ");
        Label lblSkill = new Label("Software Skill(s) : ");

        Label lblDreamComp = new Label("Dream Company : ");
        Label lblCity = new Label("Preferred City : ");
        Label lblAccompany = new Label("Accompanying Persons:");
        ans = new Button("submit");
        txtName = new TextField("hai");
        txtPasswd = new TextField("hello");
        txtPasswd.setEchoChar('*');
        chkC = new Checkbox("C");
        chkCpp = new Checkbox("C++");
        chkJava = new Checkbox("Java", true);
        cbgCompany = new CheckboxGroup();
        optTcs = new Checkbox("Tata Consultancy Services", cbgCompany, true);
        optInfosys = new Checkbox("Infosys", cbgCompany, false);
        optSyntel = new Checkbox("Syntel India Ltd", cbgCompany, false);
        chCity = new Choice();
        chCity.add("Chennai");
        chCity.add("Bangalore");
        chCity.add("Hyderabad");

        chCity.add("Trivandrum");
        lstAccompany = new List(4, true);
        lstAccompany.add("Father");
        lstAccompany.add("Mother");
        lstAccompany.add("Brother");
        lstAccompany.add("Sister");
        add(lblName);
        add(txtName);
        add(lblPasswd);
        add(txtPasswd);
        add(lblSkill);
        add(chkC);
        add(chkCpp);
        add(chkJava);
        add(lblDreamComp);
        add(optTcs);
        add(optInfosys);
        add(optSyntel);
        add(lblCity);
        add(chCity);
        add(lblAccompany);

        add(lstAccompany);
        add(ans);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(800, 800);
        setVisible(true);
    }

    public static void main(String args[]) {
        new AWTcontrolslist5();
    }
}