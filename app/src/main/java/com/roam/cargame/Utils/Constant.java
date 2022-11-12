package com.roam.cargame.Utils;

import com.roam.cargame.Model.Car;
import com.roam.cargame.R;

import java.util.ArrayList;
import java.util.Random;

public class Constant {
  public  static   ArrayList<Car> carArrayList =new ArrayList<Car>();

    public  static   ArrayList<String> carNameArrayList =new ArrayList<String>();
    public static void addCarData(){
        clearData();
        addCarNameData();
        carArrayList.add(new Car(R.drawable.audi_a3_2010,"Audi_A3_2010"));
        carArrayList.add(new Car(R.drawable.audi_a3_2015,"Audi_A3_2015"));
        carArrayList.add(new Car(R.drawable.audi_a3_2016,"Audi_A3_2016"));
        carArrayList.add(new Car(R.drawable.audi_a4_2011,"Audi_A4_2011"));
        carArrayList.add(new Car(R.drawable.audi_a4_2011_36,"Audi_A4_2011_36"));
        carArrayList.add(new Car(R.drawable.audi_a4_2013,"Audi_A4_2013"));
        carArrayList.add(new Car(R.drawable.audi_a6_2011,"Audi_A6_2011"));
        carArrayList.add(new Car(R.drawable.audi_a7_2014,"Audi_A7_2014"));
        carArrayList.add(new Car(R.drawable.audi_q5_2014,"Audi_Q5_2014"));
        carArrayList.add(new Car(R.drawable.audi_tt_2012,"Audi_TT_2012"));

        carArrayList.add(new Car(R.drawable.bentley_bentayga_2017,"Bentley_Bentayga_2017"));
        carArrayList.add(new Car(R.drawable.bentley_bentayga_2017_229,"Bentley_Bentayga_2017_229"));
        carArrayList.add(new Car(R.drawable.bentley_bentayga_2017_230,"Bentley_Bentayga_2017_230"));
        carArrayList.add(new Car(R.drawable.bentley_bentayga_2017_231,"Bentley_Bentayga_2017_231"));
        carArrayList.add(new Car(R.drawable.bentley_bentayga_2020,"Bentley_Bentayga_2020"));
        carArrayList.add(new Car(R.drawable.bentley_bentayga_2020_203,"Bentley_Bentayga_2020_203"));
        carArrayList.add(new Car(R.drawable.bentley_continental_gt_2011,"Bentley_Continental GT_2011"));
        carArrayList.add(new Car(R.drawable.bentley_continental_gt_2011_205,"Bentley_Continental GT_2011_205"));
        carArrayList.add(new Car(R.drawable.bentley_continental_gt_2011_206,"Bentley_Continental GT_2011_206"));
        carArrayList.add(new Car(R.drawable.bentley_continental_gt_2012,"Bentley_Continental GT_2012"));

        carArrayList.add(new Car(R.drawable.bmw_2_series_2014,"BMW_2-Series_2014"));
        carArrayList.add(new Car(R.drawable.bmw_2_series_2015,"BMW_2-Series_2015"));
        carArrayList.add(new Car(R.drawable.bmw_3_series_2011,"BMW_3-Series_2011"));
        carArrayList.add(new Car(R.drawable.bmw_3_series_2013,"BMW_3-Series_2013"));
        carArrayList.add(new Car(R.drawable.bmw_3_series_2019,"BMW_3-Series_2019"));
        carArrayList.add(new Car(R.drawable.bmw_4_series_2014,"BMW_4-Series_2014"));
        carArrayList.add(new Car(R.drawable.bmw_5_series_2011,"BMW_5-Series_2011"));
        carArrayList.add(new Car(R.drawable.bmw_6_series_2014,"BMW_6-Series_2014"));
        carArrayList.add(new Car(R.drawable.bmw_8_series_2020,"BMW_8-Series_2020"));
        carArrayList.add(new Car(R.drawable.bmw_i3_2014,"BMW_i3_2014"));

        carArrayList.add(new Car(R.drawable.fiat_124_spider_2017,"FIAT_124 Spider_2017"));
        carArrayList.add(new Car(R.drawable.fial_124_spider_2019,"FIAT_124 Spider_2019"));
        carArrayList.add(new Car(R.drawable.fiat_124_spider_2019_29,"FIAT_124 Spider_2019_29"));
        carArrayList.add(new Car(R.drawable.fiat_500_2011,"FIAT_500_2011"));
        carArrayList.add(new Car(R.drawable.fiat_500_2012,"FIAT_500_2012"));
        carArrayList.add(new Car(R.drawable.fiat_500l_2014,"FIAT_500L_2014"));
        carArrayList.add(new Car(R.drawable.fiat_500l_2017,"FIAT_500L_2017"));
        carArrayList.add(new Car(R.drawable.fiat_500x_2017,"FIAT_500X_2017"));
        carArrayList.add(new Car(R.drawable.fiat_500x_2017_27,"FIAT_500X_2017_27"));
        carArrayList.add(new Car(R.drawable.fiat_500x_2017_27_17,"FIAT_500X_2017_27_17"));

        carArrayList.add(new Car(R.drawable.ford_ecosport_2019_21,"Ford_Ecosport_2019_21"));
        carArrayList.add(new Car(R.drawable.ford_ecosport_2019_22,"Ford_Ecosport_2019_22"));
        carArrayList.add(new Car(R.drawable.ford_edge_2011_36,"Ford_Edge_2011_36"));
        carArrayList.add(new Car(R.drawable.ford_edge_2014_37,"Ford_Edge_2014_37"));
        carArrayList.add(new Car(R.drawable.ford_edge_2019_31,"Ford_Edge_2019_31"));
        carArrayList.add(new Car(R.drawable.ford_escape_2011_32,"Ford_Escape_2011_32"));
        carArrayList.add(new Car(R.drawable.ford_escape_2011_32_16,"Ford_Escape_2011_32_16"));
        carArrayList.add(new Car(R.drawable.ford_escape_2014,"Ford_Escape_2014"));
        carArrayList.add(new Car(R.drawable.ford_expedition_2017,"Ford_Expedition_2017"));
        carArrayList.add(new Car(R.drawable.ford_fiesta_2012,"Ford_Fiesta_2012"));

        carArrayList.add(new Car(R.drawable.honda_accord_2011_25,"Honda_Accord_2011_25"));
        carArrayList.add(new Car(R.drawable.honda_accord_2011_26,"Honda_Accord_2011_26"));
        carArrayList.add(new Car(R.drawable.honda_accord_2012,"Honda_Accord_2012"));
        carArrayList.add(new Car(R.drawable.honda_accord_2015,"Honda_Accord_2015"));
        carArrayList.add(new Car(R.drawable.honda_accord_2020,"Honda_Accord_2020"));
        carArrayList.add(new Car(R.drawable.honda_civic_2013,"Honda_Civic_2013"));
        carArrayList.add(new Car(R.drawable.honda_civic_2015_21,"Honda_Civic_2015_21"));
        carArrayList.add(new Car(R.drawable.honda_clarity_2017,"Honda_Clarity_2017"));
        carArrayList.add(new Car(R.drawable.honda_cr_v_2011,"Honda_CR-V_2011"));
        carArrayList.add(new Car(R.drawable.honda_cr_v_2011_24,"Honda_CR-V_2011_24"));

        carArrayList.add(new Car(R.drawable.hyundai_sonata_2011,"Hyundai_Sonata_2011"));
        carArrayList.add(new Car(R.drawable.hyundai_sonata_2014,"Hyundai_Sonata_2014"));
        carArrayList.add(new Car(R.drawable.hyundai_sonata_2017,"Hyundai_Sonata_2017"));
        carArrayList.add(new Car(R.drawable.hyundai_sonata_2019,"Hyundai_Sonata_2019"));
        carArrayList.add(new Car(R.drawable.hyundai_sonata_2020,"Hyundai_Sonata_2020"));
        carArrayList.add(new Car(R.drawable.hyundai_tucson_2013,"Hyundai_Tucson_2013"));
        carArrayList.add(new Car(R.drawable.hyundai_tucson_2019_30,"Hyundai_Tucson_2019_30"));
        carArrayList.add(new Car(R.drawable.hyundai_tucson_2019_31,"Hyundai_Tucson_2019_31"));
        carArrayList.add(new Car(R.drawable.hyundai_veloster_2012,"Hyundai_Veloster_2012"));
        carArrayList.add(new Car(R.drawable.hyundai_veloster_2012_18,"Hyundai_Veloster_2012_18"));

        carArrayList.add(new Car(R.drawable.jaguar_e_pace_2020,"Jaguar_E-Pace_2020"));
        carArrayList.add(new Car(R.drawable.jaguar_e_pace_2020_39,"Jaguar_E-Pace_2020_39"));
        carArrayList.add(new Car(R.drawable.jaguar_f_pace_2019,"Jaguar_F-Pace_2019"));
        carArrayList.add(new Car(R.drawable.jaguar_f_type_2015,"Jaguar_F-Type_2015"));
        carArrayList.add(new Car(R.drawable.jaguar_f_type_2016,"Jaguar_F-Type_2016"));
        carArrayList.add(new Car(R.drawable.jaguar_i_pace_2019,"Jaguar_I-Pace_2019"));
        carArrayList.add(new Car(R.drawable.jaguar_i_pace_2020,"Jaguar_I-Pace_2020"));
        carArrayList.add(new Car(R.drawable.jaguar_i_pace_2020_80,"Jaguar_I-Pace_2020_80"));
        carArrayList.add(new Car(R.drawable.jaguar_xe_2017,"Jaguar_XE_2017"));
        carArrayList.add(new Car(R.drawable.jaguar_xe_2017_388,"Jaguar_XE_2017_388"));

        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2013,"Mercedes-Benz_C Class_2013"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2015,"Mercedes-Benz_C Class_2015"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2015_39,"Mercedes-Benz_C Class_2015_39"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2016,"Mercedes-Benz_C Class_2016"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2017,"Mercedes-Benz_C Class_2017"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2017_60,"Mercedes-Benz_C Class_2017_60"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_c_class_2019,"Mercedes-Benz_C Class_2019"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_cla_class_2014,"Mercedes-Benz_CLA Class_2014"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_cla_class_2014_31,"Mercedes-Benz_CLA Class_2014_31"));
        carArrayList.add(new Car(R.drawable.mercedes_benz_cla_class_2020,"Mercedes-Benz_CLA Class_2020"));

        carArrayList.add(new Car(R.drawable.toyota_4runner_2011_40,"Toyota_4Runner_2011_40"));
        carArrayList.add(new Car(R.drawable.toyota_avalon_2011_33,"Toyota_Avalon_2011_33"));
        carArrayList.add(new Car(R.drawable.toyota_avalon_2014,"Toyota_Avalon_2014"));
        carArrayList.add(new Car(R.drawable.toyota_camry_2013,"Toyota_Camry_2013"));
        carArrayList.add(new Car(R.drawable.toyota_camry_2016,"Toyota_Camry_2016"));
        carArrayList.add(new Car(R.drawable.toyota_corolla_2011_16,"Toyota_Corolla_2011_16"));
        carArrayList.add(new Car(R.drawable.toyota_highlander_2011,"Toyota_Highlander_2011"));
        carArrayList.add(new Car(R.drawable.toyota_land_cruiser_2010,"Toyota_Land Cruiser_2010"));
        carArrayList.add(new Car(R.drawable.toyota_prius_c_2012,"Toyota_Prius C_2012"));
        carArrayList.add(new Car(R.drawable.toyota_prius_2020,"Toyota_Prius_2020"));
    }

    public static void addCarNameData(){
        carNameArrayList.clear();
        carNameArrayList.add("Select a brand");
        carNameArrayList.add("Audi_A3_2015");
        carNameArrayList.add("Audi_A3_2016");
        carNameArrayList.add("Audi_A4_2011");
        carNameArrayList.add("Audi_A4_2011_36");
        carNameArrayList.add("Audi_A4_2013");
        carNameArrayList.add("Audi_A6_2011");
        carNameArrayList.add("Audi_A7_2014");
        carNameArrayList.add("Audi_Q5_2014");
        carNameArrayList.add("Audi_TT_2012");

        carNameArrayList.add("Bentley_Bentayga_2017");
        carNameArrayList.add("Bentley_Bentayga_2017_229");
        carNameArrayList.add("Bentley_Bentayga_2017_230");
        carNameArrayList.add("Bentley_Bentayga_2017_231");
        carNameArrayList.add("Bentley_Bentayga_2020");
        carNameArrayList.add("Bentley_Bentayga_2020_203");
        carNameArrayList.add("Bentley_Continental GT_2011");
        carNameArrayList.add("Bentley_Continental GT_2011_205");
        carNameArrayList.add("Bentley_Continental GT_2011_206");
        carNameArrayList.add("Bentley_Continental GT_2012");

        carNameArrayList.add("BMW_2-Series_2014");
        carNameArrayList.add("BMW_2-Series_2015");
        carNameArrayList.add("BMW_3-Series_2011");
        carNameArrayList.add("BMW_3-Series_2013");
        carNameArrayList.add("BMW_3-Series_2019");
        carNameArrayList.add("BMW_4-Series_2014");
        carNameArrayList.add("BMW_5-Series_2011");
        carNameArrayList.add("BMW_6-Series_2014");
        carNameArrayList.add("BMW_8-Series_2020");
        carNameArrayList.add("BMW_i3_2014");
//
        carNameArrayList.add("FIAT_124 Spider_2017");
        carNameArrayList.add("FIAT_124 Spider_2019");
        carNameArrayList.add("FIAT_124 Spider_2019_29");
        carNameArrayList.add("FIAT_500_2011");
        carNameArrayList.add("FIAT_500_2012");
        carNameArrayList.add("FIAT_500L_2014");
        carNameArrayList.add("FIAT_500L_2017");
        carNameArrayList.add("FIAT_500X_2017");
        carNameArrayList.add("FIAT_500X_2017_27");
        carNameArrayList.add("FIAT_500X_2017_27_17");
//
        carNameArrayList.add("Ford_Ecosport_2019_21");
        carNameArrayList.add("Ford_Ecosport_2019_22");
        carNameArrayList.add("Ford_Edge_2011_36");
        carNameArrayList.add("Ford_Edge_2014_37");
        carNameArrayList.add("Ford_Edge_2019_31");
        carNameArrayList.add("Ford_Escape_2011_32");
        carNameArrayList.add("Ford_Escape_2011_32_16");
        carNameArrayList.add("Ford_Escape_2014");
        carNameArrayList.add("Ford_Expedition_2017");
        carNameArrayList.add("Ford_Fiesta_2012");
//
        carNameArrayList.add("Honda_Accord_2011_25");
        carNameArrayList.add("Honda_Accord_2011_26");
        carNameArrayList.add("Honda_Accord_2012");
        carNameArrayList.add("Honda_Accord_2015");
        carNameArrayList.add("Honda_Accord_2020");
        carNameArrayList.add("Honda_Civic_2013");
        carNameArrayList.add("Honda_Civic_2015_21");
        carNameArrayList.add("Honda_Clarity_2017");
        carNameArrayList.add("Honda_CR-V_2011");
        carNameArrayList.add("Honda_CR-V_2011_24");
//
        carNameArrayList.add("Hyundai_Sonata_2011");
        carNameArrayList.add("Hyundai_Sonata_2014");
        carNameArrayList.add("Hyundai_Sonata_2017");
        carNameArrayList.add("Hyundai_Sonata_2019");
        carNameArrayList.add("Hyundai_Sonata_2020");
        carNameArrayList.add("Hyundai_Tucson_2013");
        carNameArrayList.add("Hyundai_Tucson_2019_30");
        carNameArrayList.add("Hyundai_Tucson_2019_31");
        carNameArrayList.add("Hyundai_Veloster_2012");
        carNameArrayList.add("Hyundai_Veloster_2012_18");
//
        carNameArrayList.add("Jaguar_E-Pace_2020");
        carNameArrayList.add("Jaguar_E-Pace_2020_39");
        carNameArrayList.add("Jaguar_F-Pace_2019");
        carNameArrayList.add("Jaguar_F-Type_2015");
        carNameArrayList.add("Jaguar_F-Type_2016");
        carNameArrayList.add("Jaguar_I-Pace_2019");
        carNameArrayList.add("Jaguar_I-Pace_2020");
        carNameArrayList.add("Jaguar_I-Pace_2020_80");
        carNameArrayList.add("Jaguar_XE_2017");
        carNameArrayList.add("Jaguar_XE_2017_388");
//
        carNameArrayList.add("Mercedes-Benz_C Class_2013");
        carNameArrayList.add("Mercedes-Benz_C Class_2015");
        carNameArrayList.add("Mercedes-Benz_C Class_2015_39");
        carNameArrayList.add("Mercedes-Benz_C Class_2016");
        carNameArrayList.add("Mercedes-Benz_C Class_2017");
        carNameArrayList.add("Mercedes-Benz_C Class_2017_60");
        carNameArrayList.add("Mercedes-Benz_C Class_2019");
        carNameArrayList.add("Mercedes-Benz_CLA Class_2014");
        carNameArrayList.add("Mercedes-Benz_CLA Class_2014_31");
        carNameArrayList.add("Mercedes-Benz_CLA Class_2020");
//
        carNameArrayList.add("Toyota_4Runner_2011_40");
        carNameArrayList.add("Toyota_Avalon_2011_33");
        carNameArrayList.add("Toyota_Avalon_2014");
        carNameArrayList.add("Toyota_Camry_2013");
        carNameArrayList.add("Toyota_Camry_2016");
        carNameArrayList.add("Toyota_Corolla_2011_16");
        carNameArrayList.add("Toyota_Highlander_2011");
        carNameArrayList.add("Toyota_Land Cruiser_2010");
        carNameArrayList.add("Toyota_Prius C_2012");
        carNameArrayList.add("Toyota_Prius_2020");
    }

    public static int generateRandomNumber(){
        // what is our range?
        int max = 100;
        int min = 1;
// create instance of Random class
        Random randomNum = new Random();
        return min + randomNum.nextInt(max);
    }
    public static void clearData()
    {
        carArrayList.clear();
    }



}
