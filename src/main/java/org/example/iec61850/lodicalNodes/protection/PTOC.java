package org.example.iec61850.lodicalNodes.protection;

import lombok.Getter;
import lombok.Setter;
import org.example.iec61850.lodicalNodes.LN;
import org.example.iec61850.node_parameters.DataObject.controls.INC;
import org.example.iec61850.node_parameters.DataObject.settings.*;
import org.example.iec61850.node_parameters.DataObject.status_information.ACD;
import org.example.iec61850.node_parameters.DataObject.status_information.ACT;

@Getter
@Setter
public class PTOC extends LN {
    /**
     * LN: Time overcurrent Name: PTOC (LN: Временная перегрузка по току Название: PTOC)
     *
     * Функция, которая срабатывает, когда входной переменный ток превышает заданное значение, и в которой
     * входной ток и время работы находятся в обратной зависимости на протяжении значительной
     * части диапазона рабочих характеристик.
     * */
    /**
     * Status information
     */
    private ACD Str = new ACD();
    private ACT Op = new ACT();
    /**
     * Controls
     */
    private INC OpCntRs = new INC();
    /**
     * Settings
     */
    private CURVE TmACrv = new CURVE();
    private CSG TmAChr33 = new CSG();
    private CSD TmASt = new CSD();
    private ASG StrVal = new ASG();
    private ASG TmMult = new ASG();
    private ING MinOpTmms = new ING();
    private ING MaxOpTmms = new ING();
    private ING OpDlOpTmms = new ING();
    private ENG TypRsCrv = new ENG();
    private ING RsDlTmms = new ING();
    private ENG DirMod = new ENG();

    public PTOC() {

    }

    @Override
    public void process() {

    }
}
