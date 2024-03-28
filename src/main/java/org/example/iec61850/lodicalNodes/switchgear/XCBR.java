package org.example.iec61850.lodicalNodes.switchgear;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.lodicalNodes.LN;
import org.example.iec61850.node_parameters.DataObject.controls.DPC;
import org.example.iec61850.node_parameters.DataObject.controls.INC;
import org.example.iec61850.node_parameters.DataObject.controls.SPC;
import org.example.iec61850.node_parameters.DataObject.descriptions.DPL;
import org.example.iec61850.node_parameters.DataObject.measured_and_metered_values.BCR;
import org.example.iec61850.node_parameters.DataObject.settings.ING;
import org.example.iec61850.node_parameters.DataObject.status_information.ENS;
import org.example.iec61850.node_parameters.DataObject.status_information.INS;
import org.example.iec61850.node_parameters.DataObject.status_information.SPS;

@Getter
@Setter
public class XCBR extends LN {
    /**
     * LN: Circuit breaker Name: XCBR (LN: Название автоматического выключателя: XCBR)
     * */
    /**
     * Descriptions
     */
    private DPL EEName = new DPL();
    /**
     * Status information
     */
    private ENS EEHealth = new ENS();
    private SPS LocKey = new SPS();
    private SPS Loc = new SPS();
    private INC OpCnt = new INC();
    private ENS CBOpCap = new ENS();
    private ENS POWCap = new ENS();
    private INS MaxOpCAp = new INS();
    private SPS Dsc = new SPS();
    /**
     * Measured and metered values
     */
    private BCR SumSwARs = new BCR();
    /**
     * Controls
     * */
    private SPC LocSta = new SPC();
    private DPC Pos = new DPC();
    private SPC BlkOpn = new SPC();
    private SPC BlkCls = new SPC();
    private SPC ChaMotEna = new SPC();
    /**
     * Settings
     */
    private ING CBTmms = new ING();

    @Override
    public void process() {

    }
}
