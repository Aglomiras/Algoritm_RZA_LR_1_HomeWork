package org.example;

import org.example.iec61850.lodicalNodes.LN;
import org.example.iec61850.lodicalNodes.measurement.MMXU;
import org.example.iec61850.lodicalNodes.system_logic_nodes.LSVS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<LN> logicalNode = new ArrayList<>();
    private static String path = "C:\\Users\\Aglomiras\\Изображения\\Рабочий стол\\AlgoritmRZAProgrammRealize\\Начало линии\\";
//    private static String path = "C:\\Users\\Aglomiras\\Изображения\\Рабочий стол\\AlgoritmRZAProgrammRealize\\Конец линии\\";
    private static String name = "PhAB80";
    /**Начало линии*/
//    private static String name = "PhA80";
//    private static String name = "PhB20";
//    private static String name = "PhBC20";

    /**Конец линии*/
//    private static String name = "PhABC20";
//    private static String name = "PhABC80";
//    private static String name = "PhB80";
//    private static String name = "PhC20";
    public static void main(String[] args) throws Exception {
        LSVS lsvs = new LSVS(); //Создаем узел LSVS
        logicalNode.add(lsvs); //Добавляем узел в лист узлов
        lsvs.setPath(path);
        lsvs.setFileName(name);

        MMXU mmxu = new MMXU(); //Создаем узел MMXU
        logicalNode.add(mmxu); //Добавляем узел в лист узлов
        mmxu.IaInst = lsvs.getOut().get(0);
        mmxu.IbInst = lsvs.getOut().get(1);
        mmxu.IcInst = lsvs.getOut().get(2);

    }
}