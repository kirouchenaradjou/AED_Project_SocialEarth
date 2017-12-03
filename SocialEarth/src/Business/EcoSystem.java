package Business;

import Business.Event.EventDirectory;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ragha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    private EventDirectory eventDirectory;
    private HashMap<Integer, UserAccount> registeredUsers;
    public static int counter = 4000;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        this.networkDirectory = new NetworkDirectory();
        this.eventDirectory = new EventDirectory();
        this.registeredUsers = new HashMap<Integer, UserAccount>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public EventDirectory getEventDirectory() {
        return eventDirectory;
    }

    public void setEventDirectory(EventDirectory eventDirectory) {
        this.eventDirectory = eventDirectory;
    }

    public HashMap<Integer, UserAccount> getRegisteredUsers() {
        return registeredUsers;
    }

    public void addRegisteredEventUser(UserAccount account) {
        registeredUsers.put(counter++, account);
    }

    public boolean checkIfUsernameIsUnique(String username) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}
