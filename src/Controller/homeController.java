package Controller;
import View.homeView;
public class homeController {

    int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    private home home = new home(); //model

    public void controller(){

        homeView homeView = new homeView();
        switch (this.option) {
            case 1: //read/edit/delete
                //call auth controller
                break;
            case 2: //new register
                //call new register controller
                break;
            case 3: //safe pass
                //call pass controller
                break;
            case 4: //cypher doc
                //call cypher controller
            break;
            default:
                break;
        }
    }
}
