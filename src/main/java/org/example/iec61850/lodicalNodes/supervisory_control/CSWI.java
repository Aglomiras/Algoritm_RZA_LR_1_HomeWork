package org.example.iec61850.lodicalNodes.supervisory_control;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.lodicalNodes.LN;
import org.example.iec61850.node_parameters.DataObject.controls.DPC;
import org.example.iec61850.node_parameters.DataObject.controls.INC;
import org.example.iec61850.node_parameters.DataObject.controls.SPC;
import org.example.iec61850.node_parameters.DataObject.status_information.ACT;
import org.example.iec61850.node_parameters.DataObject.status_information.SPS;

@Getter
@Setter
public class CSWI extends LN {
    /**
     * LN: Switch controller Name: CSWI (LN: Название контроллера коммутатора: CSWI)
     * */
    /**
     * Status information
     */
    private SPS LocKey = new SPS();
    private SPS Loc = new SPS();
    private ACT OpOpn = new ACT();
    private SPS SelOpn = new SPS();
    private ACT OpCls = new ACT();
    private SPS SelCLs = new SPS();
    /**
     * Controls
     */
    private INC OpCntRs = new INC();
    private SPC LocSta = new SPC();
    private DPC Pos = new DPC();
    private DPC PosA = new DPC();
    private DPC PosB = new DPC();
    private DPC PosC = new DPC();

    @Override
    public void process() {

    }
}
