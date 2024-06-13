package Controller;
import View.homeView;
import Model.home;
import View.securePassView;

public class homeController {

    int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    private home home = new home(); //model

    public void homeController(){

        homeView homeView = new homeView();
        switch (this.option) {
            case 1: //read/edit/delete
                //call auth controller
                break;
            case 2: //new register
                //call new register controller
                break;
            case 3: //safe pass
                generatePassController gen = new generatePassController();
                String pass = gen.generateSecureRandomPassword();
                securePassView passView = new securePassView(pass);
                break;
            case 4: //cypher doc
                //call cypher controller
            case 5: //decypher doc
                //i need an option to decypher a document
            break;
            default:
                homeView.showHome();
                break;
        }
    }
}
