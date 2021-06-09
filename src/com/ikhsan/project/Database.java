package com.ikhsan.project;

public class Database<a> {

    //--------> VARIABEL <--------------//
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String data6;
    private String data7;
    private String data8;

    public Database() {
    }


    public Database(String data1, String data2, String data3, String data4, String data5, String data6, String data7, String data8) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;

    }


    // -------------> GETTER DAN SETTER <------------------
    public String getData1() {
        return data1;
    }
    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }
    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }
    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return data4;
    }
    public void setData4(String data4) {
        this.data4 = data4;
    }

    public String getData5() {
        return data5;
    }
    public void setData5(String data5) {
        this.data5 = data5;
    }

    public String getData6() {
        return data6;
    }
    public void setData6(String data6) {
        this.data6 = data6;
    }

    public String getData7() {
        return data7;
    }
    public void setData7(String data7) {
        this.data7 = data7;
    }

    public String getData8() {
        return data8;
    }
    public void setData8(String data8) {
        this.data8 = data8;
    }


// -------------> METHOD BUBBLE SHORT <-------------//

        public String getSorting1(){
        int[] a = new int[8];

        a[0] = Integer.parseInt(data1);
        a[1] = Integer.parseInt(data2);
        a[2] = Integer.parseInt(data3);
        a[3] = Integer.parseInt(data4);
        a[4] = Integer.parseInt(data5);
        a[5] = Integer.parseInt(data6);
        a[6] = Integer.parseInt(data7);
        a[7] = Integer.parseInt(data8);

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
        }return Integer.toString(a[0]);
    }
        public String getSorting2(){
        int[] a = new int[8];

        a[0] = Integer.parseInt(data1);
        a[1] = Integer.parseInt(data2);
        a[2] = Integer.parseInt(data3);
        a[3] = Integer.parseInt(data4);
        a[4] = Integer.parseInt(data5);
        a[5] = Integer.parseInt(data6);
        a[6] = Integer.parseInt(data7);
        a[7] = Integer.parseInt(data8);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }return Integer.toString(a[1]);
        }
        public String getSorting3(){
            int[] a = new int[8];

            a[0] = Integer.parseInt(data1);
            a[1] = Integer.parseInt(data2);
            a[2] = Integer.parseInt(data3);
            a[3] = Integer.parseInt(data4);
            a[4] = Integer.parseInt(data5);
            a[5] = Integer.parseInt(data6);
            a[6] = Integer.parseInt(data7);
            a[7] = Integer.parseInt(data8);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }return Integer.toString(a[2]);
        }
        public String getSorting4(){
            int[] a = new int[8];

            a[0] = Integer.parseInt(data1);
            a[1] = Integer.parseInt(data2);
            a[2] = Integer.parseInt(data3);
            a[3] = Integer.parseInt(data4);
            a[4] = Integer.parseInt(data5);
            a[5] = Integer.parseInt(data6);
            a[6] = Integer.parseInt(data7);
            a[7] = Integer.parseInt(data8);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }return Integer.toString(a[3]);
        }
        public String getSorting5(){
    int[] a = new int[8];

    a[0] = Integer.parseInt(data1);
    a[1] = Integer.parseInt(data2);
    a[2] = Integer.parseInt(data3);
    a[3] = Integer.parseInt(data4);
    a[4] = Integer.parseInt(data5);
    a[5] = Integer.parseInt(data6);
    a[6] = Integer.parseInt(data7);
    a[7] = Integer.parseInt(data8);
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }return Integer.toString(a[4]);
}
        public String getSorting6(){
       int[] a = new int[8];

       a[0] = Integer.parseInt(data1);
       a[1] = Integer.parseInt(data2);
       a[2] = Integer.parseInt(data3);
       a[3] = Integer.parseInt(data4);
       a[4] = Integer.parseInt(data5);
       a[5] = Integer.parseInt(data6);
       a[6] = Integer.parseInt(data7);
       a[7] = Integer.parseInt(data8);

        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }return Integer.toString(a[5]);
}
        public String getSorting7(){
    int[] a = new int[8];

    a[0] = Integer.parseInt(data1);
    a[1] = Integer.parseInt(data2);
    a[2] = Integer.parseInt(data3);
    a[3] = Integer.parseInt(data4);
    a[4] = Integer.parseInt(data5);
    a[5] = Integer.parseInt(data6);
    a[6] = Integer.parseInt(data7);
    a[7] = Integer.parseInt(data8);

        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }return Integer.toString(a[6]);

}
        public String getSorting8(){
        int[] a = new int[8];

        a[0] = Integer.parseInt(data1);
        a[1] = Integer.parseInt(data2);
        a[2] = Integer.parseInt(data3);
        a[3] = Integer.parseInt(data4);
        a[4] = Integer.parseInt(data5);
        a[5] = Integer.parseInt(data6);
        a[6] = Integer.parseInt(data7);
        a[7] = Integer.parseInt(data8);
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }return Integer.toString(a[7]);
}


        //PEMANGGIL
        public String Sort1(){
            return getSorting1();
        }
        public String Sort2(){
            return getSorting2();
        }
        public String Sort3(){
        return getSorting3();
    }
        public String Sort4(){ return getSorting4();}
        public String Sort5(){ return  getSorting5();}
        public String Sort6(){ return  getSorting6();}
        public String Sort7(){ return  getSorting7();}
        public String Sort8(){ return  getSorting8();}}







