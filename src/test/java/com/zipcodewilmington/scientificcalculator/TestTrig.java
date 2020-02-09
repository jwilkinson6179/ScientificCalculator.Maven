package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestTrig {

        @Test
        public void sinPositiveDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=1.0;
            actual= Trig.Sin((double)450, "DEG");
            assertEquals(expected,actual, .0001);
        }

        @Test
        public void sinNegativeDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-1.0;
            actual= Trig.Sin((double)-450, "DEG");
            assertEquals(expected,actual, .0001);
        }

        @Test
        public void sinPositiveRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-0.6832837250355236;
            actual= Trig.Sin((double)450, "RAD");
            assertEquals(expected,actual,.0001);
        }

        @Test
        public void sinNegativeRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.6832837250355236;
            actual= Trig.Sin((double)-450, "RAD");
            assertEquals(expected,actual, .0001);
        }


        @Test
        public void cosPositiveDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.8746197071393957;
            actual= Trig.Cos((double)389, "DEG");
            assertEquals(expected,actual, .0001);
        }

        @Test
        public void cosNegativeDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.8485862232545117;
            actual= Trig.Cos((double)-389, "RAD");
            assertEquals(expected,actual,.0001);
        }

        @Test
        public void cosPositiveRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.8485862232545117;
            actual= Trig.Cos((double)389, "RAD");
            assertEquals(expected,actual, .0001);
        }

        @Test
        public void cosNegativeRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.8485862232545117;
            actual= Trig.Cos((double)-389, "RAD");
            assertEquals(expected,actual, .0001);
    }

        @Test
        public void tanPositiveDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=1.633123935319537E16;
            actual= Trig.Tan((double)450, "DEG");
            assertEquals(expected,actual, .0001);
        }

        @Test
        public void tanNegativeDegree(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-3.266247870639074E15;
            actual= Trig.Tan((double)-450, "DEG");
            assertEquals(expected,actual, 1.0001);
        }

        @Test
        public void tanPositiveRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=0.9358090133927123;
            actual=(Trig.Tan((double)450, "RAD"));
            assertEquals(expected,actual, 1.0001);
        }

        @Test
        public void tanNegativeRadian(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-0.9358090133927123;
            actual=(Trig.Tan((double)-450, "RAD"));
            assertEquals(expected,actual, 1.0001);
    }

        @Test
        public void invSinNegative(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-60.0;
            actual= Trig.InvSin(-0.8660254);
            assertEquals(expected,actual, 1.0001);
        }

        @Test
        public void invSinPositive(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=45.0;
            actual= Trig.InvSin(0.7071068);
            assertEquals(expected,actual, 1.0001);
         }

        @Test
        public void invCosPositive(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=45.0;
            actual= Trig.InvCos(0.7071068);
            assertEquals(expected,actual, 1.0001);

        }

        @Test
        public void invCosNegative(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=150.0;
            actual= Trig.InvCos(-0.8660254);
            assertEquals(expected,actual, 1.0001);

        }

        @Test
        public void invTanPositive(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=60.0;
            actual= Trig.InvTan(1.732050808);
            assertEquals(expected,actual, 1.0001);
        }

        @Test
        public void invTanNegative(){

            Trig TestTrig=new Trig();
            Double actual;
            Double expected=-30.0;
            actual= Trig.InvTan(-0.577350269);
            assertEquals(expected,actual, 1.0001);
        }
    }

