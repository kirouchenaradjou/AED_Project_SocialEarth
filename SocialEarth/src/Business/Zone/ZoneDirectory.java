/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Zone;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class ZoneDirectory {
    private ArrayList<Zone> zoneDirectory;
    private EnterpriseDirectory enterpriseDirectory;

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public ArrayList<Zone> getZoneDirectory() {
        return zoneDirectory;
    }

    public void setZoneDirectory(ArrayList<Zone> zoneDirectory) {
        this.zoneDirectory = zoneDirectory;
    }
    
}
