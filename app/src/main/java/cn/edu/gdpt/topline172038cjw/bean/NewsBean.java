package cn.edu.gdpt.topline172038cjw.bean;

import com.google.gson.annotations.SerializedName;

public class NewsBean {

    /**
     * success : 1
     * result : {"1":{"inxid":"1","typeid":"asia","inxno":"000001","inxnm":"上证指数","yesy_price":"2890.16","open_price":"2944.11","last_price":"2917.80","change_price":"27.64","change_price_per":"0.96%","high_price":"2953.33","low_price":"2916.21","amplitude_price_per":"1.26%","uptime":"2019-06-19 15:40:06"},"2":{"inxid":"2","typeid":"asia","inxno":"399001","inxnm":"深证成指","yesy_price":"8804.32","open_price":"9051.84","last_price":"8925.73","change_price":"121.41","change_price_per":"1.38%","high_price":"9084.18","low_price":"8923.44","amplitude_price_per":"1.78%","uptime":"2019-06-19 15:40:06"},"3":{"inxid":"3","typeid":"asia","inxno":"000300","inxnm":"沪深300","yesy_price":"3667.62","open_price":"3761.34","last_price":"3715.94","change_price":"48.32","change_price_per":"1.32%","high_price":"3771.35","low_price":"3715.13","amplitude_price_per":"1.49%","uptime":"2019-06-19 15:40:06"},"4":{"inxid":"4","typeid":"asia","inxno":"399006","inxnm":"创业板指","yesy_price":"1455.75","open_price":"1501.25","last_price":"1469.99","change_price":"14.24","change_price_per":"0.98%","high_price":"1504.41","low_price":"1469.59","amplitude_price_per":"2.32%","uptime":"2019-06-19 15:40:06"},"5":{"inxid":"5","typeid":"asia","inxno":"HSI","inxnm":"恒生指数","yesy_price":"27498.77","open_price":"28224.87","last_price":"28202.14","change_price":"703.37","change_price_per":"2.56%","high_price":"28224.87","low_price":"28022.49","amplitude_price_per":"0.72%","uptime":"2019-06-19 16:09:24"},"6":{"inxid":"6","typeid":"asia","inxno":"HSCEI","inxnm":"国企指数","yesy_price":"10507.65","open_price":"10787.74","last_price":"10764.70","change_price":"257.05","change_price_per":"2.45%","high_price":"10797.37","low_price":"10717.29","amplitude_price_per":"0.74%","uptime":"2019-06-19 16:09:24"},"7":{"inxid":"7","typeid":"asia","inxno":"HSCCI","inxnm":"红筹指数","yesy_price":"4284.16","open_price":"4365.67","last_price":"4366.82","change_price":"82.66","change_price_per":"1.93%","high_price":"4379.31","low_price":"4342.16","amplitude_price_per":"0.85%","uptime":"2019-06-19 16:09:24"},"13":{"inxid":"13","typeid":"asia","inxno":"SENSEX","inxnm":"印度孟买SENSEX","yesy_price":"39046.34","open_price":"39172.46","last_price":"39112.74","change_price":"66.40","change_price_per":"0.17%","high_price":"39435.80","low_price":"38881.05","amplitude_price_per":"1.42%","uptime":"2019-06-19 18:29:02"},"14":{"inxid":"14","typeid":"asia","inxno":"JKSE","inxnm":"印尼雅加达综合","yesy_price":"6257.33","open_price":"6294.08","last_price":"6339.26","change_price":"81.93","change_price_per":"1.31%","high_price":"6339.26","low_price":"6289.45","amplitude_price_per":"0.79%","uptime":"2019-06-19 16:50:00"},"9":{"inxid":"9","typeid":"asia","inxno":"N225","inxnm":"日经225","yesy_price":"21333.87","open_price":"21414.50","last_price":"21397.00","change_price":"63.13","change_price_per":"0.30%","high_price":"21469.50","low_price":"21387.00","amplitude_price_per":"0.39%","uptime":"2019-06-20 08:36:52"},"10":{"inxid":"10","typeid":"asia","inxno":"KS11","inxnm":"韩国KOSPI","yesy_price":"2124.78","open_price":"2121.78","last_price":"2122.86","change_price":"-1.92","change_price_per":"-0.09%","high_price":"2126.77","low_price":"2120.42","amplitude_price_per":"0.30%","uptime":"2019-06-20 08:37:00"},"16":{"inxid":"16","typeid":"asia","inxno":"KLSE","inxnm":"富时马来西亚KLCI","yesy_price":"1652.76","open_price":"1654.57","last_price":"1666.54","change_price":"13.78","change_price_per":"0.83%","high_price":"1666.90","low_price":"1652.58","amplitude_price_per":"0.87%","uptime":"2019-06-19 16:59:00"},"18":{"inxid":"18","typeid":"asia","inxno":"KSE100","inxnm":"巴基斯坦卡拉奇","yesy_price":"34681.72","open_price":"34673.53","last_price":"34656.12","change_price":"-25.60","change_price_per":"-0.07%","high_price":"34809.56","low_price":"34522.41","amplitude_price_per":"0.83%","uptime":"2019-06-19 18:38:00"},"11":{"inxid":"11","typeid":"asia","inxno":"STI","inxnm":"富时新加坡海峡时报","yesy_price":"3238.73","open_price":"3206.62","last_price":"3288.17","change_price":"49.44","change_price_per":"1.53%","high_price":"3289.04","low_price":"3238.73","amplitude_price_per":"1.57%","uptime":"2019-06-19 16:59:59"},"20":{"inxid":"20","typeid":"asia","inxno":"CSEALL","inxnm":"斯里兰卡科伦坡","yesy_price":"5375.60","open_price":"5375.60","last_price":"5392.30","change_price":"16.70","change_price_per":"0.31%","high_price":"5401.03","low_price":"5374.27","amplitude_price_per":"0.50%","uptime":"2019-06-19 16:59:00"},"17":{"inxid":"17","typeid":"asia","inxno":"SET","inxnm":"泰国SET","yesy_price":"1683.60","open_price":"1695.84","last_price":"1705.98","change_price":"22.38","change_price_per":"1.33%","high_price":"1711.89","low_price":"1691.95","amplitude_price_per":"1.18%","uptime":"2019-06-19 17:30:00"},"12":{"inxid":"12","typeid":"asia","inxno":"TWII","inxnm":"台湾加权","yesy_price":"10566.74","open_price":"10689.15","last_price":"10775.34","change_price":"208.60","change_price_per":"1.97%","high_price":"10778.64","low_price":"10650.48","amplitude_price_per":"1.20%","uptime":"2019-06-19 13:33:00"},"25":{"inxid":"25","typeid":"america","inxno":"DJIA","inxnm":"道琼斯","yesy_price":"26465.54","open_price":"26507.73","last_price":"26504.00","change_price":"38.46","change_price_per":"0.15%","high_price":"26569.75","low_price":"26415.05","amplitude_price_per":"0.58%","uptime":"2019-06-20 03:59:57"},"26":{"inxid":"26","typeid":"america","inxno":"SPX","inxnm":"标普500","yesy_price":"2917.75","open_price":"2921.74","last_price":"2926.46","change_price":"8.71","change_price_per":"0.30%","high_price":"2931.74","low_price":"2911.43","amplitude_price_per":"0.70%","uptime":"2019-06-20 03:59:55"},"30":{"inxid":"30","typeid":"america","inxno":"BVSP","inxnm":"巴西BOVESPA","yesy_price":"99404.39","open_price":"99403.24","last_price":"100303.41","change_price":"899.02","change_price_per":"0.90%","high_price":"100327.15","low_price":"98977.84","amplitude_price_per":"1.36%","uptime":"2019-06-20 03:55:00"},"27":{"inxid":"27","typeid":"america","inxno":"NDX","inxnm":"纳斯达克","yesy_price":"7953.88","open_price":"7970.26","last_price":"7987.32","change_price":"33.44","change_price_per":"0.42%","high_price":"7998.59","low_price":"7930.38","amplitude_price_per":"0.86%","uptime":"2019-06-20 04:00:00"},"29":{"inxid":"29","typeid":"america","inxno":"MXX","inxnm":"墨西哥BOLSA","yesy_price":"43161.05","open_price":"43215.54","last_price":"43375.67","change_price":"214.62","change_price_per":"0.50%","high_price":"43479.26","low_price":"43208.17","amplitude_price_per":"0.63%","uptime":"2019-06-20 04:00:00"},"28":{"inxid":"28","typeid":"america","inxno":"TSX","inxnm":"加拿大S&P/TSX","yesy_price":"16503.35","open_price":"16515.39","last_price":"16511.79","change_price":"8.44","change_price_per":"0.05%","high_price":"16529.73","low_price":"16492.20","amplitude_price_per":"0.23%","uptime":"2019-06-20 03:59:46"},"35":{"inxid":"35","typeid":"europe","inxno":"MIB","inxnm":"富时意大利MIB","yesy_price":"21133.78","open_price":"21139.67","last_price":"21221.38","change_price":"87.60","change_price_per":"0.41%","high_price":"21244.37","low_price":"21070.39","amplitude_price_per":"0.82%","uptime":"2019-06-19 23:29:59"},"49":{"inxid":"49","typeid":"europe","inxno":"WIG","inxnm":"波兰WIG","yesy_price":"59936.46","open_price":"59909.76","last_price":"59738.56","change_price":"-197.90","change_price_per":"-0.33%","high_price":"59950.65","low_price":"59693.03","amplitude_price_per":"0.43%","uptime":"2019-06-19 22:50:00"},"40":{"inxid":"40","typeid":"europe","inxno":"ISEQ","inxnm":"爱尔兰综合","yesy_price":"6162.41","open_price":"6166.72","last_price":"6164.59","change_price":"2.18","change_price_per":"0.04%","high_price":"6184.43","low_price":"6134.27","amplitude_price_per":"0.81%","uptime":"2019-06-19 23:28:15"},"39":{"inxid":"39","typeid":"europe","inxno":"ICEXI","inxnm":"冰岛ICEX","yesy_price":"1437.11","open_price":"1439.29","last_price":"1444.57","change_price":"7.46","change_price_per":"0.52%","high_price":"1448.18","low_price":"1437.11","amplitude_price_per":"0.77%","uptime":"2019-06-19 23:21:00"},"47":{"inxid":"47","typeid":"europe","inxno":"OSEAX","inxnm":"挪威OSEAX","yesy_price":"849.04","open_price":"849.02","last_price":"837.14","change_price":"-11.90","change_price_per":"-1.40%","high_price":"849.03","low_price":"832.87","amplitude_price_per":"1.90%","uptime":"2018-11-23 23:27:00"},"37":{"inxid":"37","typeid":"europe","inxno":"SSMI","inxnm":"瑞士SMI","yesy_price":"9954.80","open_price":"9977.50","last_price":"9955.50","change_price":"0.70","change_price_per":"0.01%","high_price":"9982.50","low_price":"9934.50","amplitude_price_per":"0.48%","uptime":"2019-06-19 23:29:58"},"31":{"inxid":"31","typeid":"europe","inxno":"FTSE","inxnm":"英国富时100","yesy_price":"7443.04","open_price":"7443.04","last_price":"7403.54","change_price":"-39.50","change_price_per":"-0.53%","high_price":"7454.93","low_price":"7399.17","amplitude_price_per":"0.75%","uptime":"2019-06-19 23:29:00"},"34":{"inxid":"34","typeid":"europe","inxno":"IBEX","inxnm":"西班牙IBEX35","yesy_price":"9240.70","open_price":"9259.00","last_price":"9231.20","change_price":"-9.50","change_price_per":"-0.10%","high_price":"9263.30","low_price":"9192.08","amplitude_price_per":"0.77%","uptime":"2019-06-19 23:29:58"},"41":{"inxid":"41","typeid":"europe","inxno":"RTS","inxnm":"俄罗斯RTS","yesy_price":"1359.23","open_price":"1364.56","last_price":"1361.14","change_price":"1.91","change_price_per":"0.14%","high_price":"1366.49","low_price":"1353.87","amplitude_price_per":"0.92%","uptime":"2019-06-19 23:39:53"},"38":{"inxid":"38","typeid":"europe","inxno":"OMXSPI","inxnm":"瑞典OMXSPI","yesy_price":"1609.43","open_price":"1609.72","last_price":"1612.40","change_price":"2.97","change_price_per":"0.18%","high_price":"1615.81","low_price":"1607.11","amplitude_price_per":"0.54%","uptime":"2019-06-19 23:30:00"},"42":{"inxid":"42","typeid":"europe","inxno":"ASE","inxnm":"希腊雅典ASE","yesy_price":"853.32","open_price":"854.37","last_price":"844.00","change_price":"-9.32","change_price_per":"-1.09%","high_price":"856.19","low_price":"841.18","amplitude_price_per":"1.76%","uptime":"2019-06-19 21:59:44"},"50":{"inxid":"50","typeid":"europe","inxno":"PX","inxnm":"布拉格指数","yesy_price":"1055.18","open_price":"1055.91","last_price":"1057.56","change_price":"2.38","change_price_per":"0.23%","high_price":"1060.10","low_price":"1055.18","amplitude_price_per":"0.47%","uptime":"2019-06-19 22:25:30"},"43":{"inxid":"43","typeid":"europe","inxno":"BFX","inxnm":"比利时BFX","yesy_price":"3513.07","open_price":"3514.70","last_price":"3525.56","change_price":"12.49","change_price_per":"0.36%","high_price":"3529.83","low_price":"3490.76","amplitude_price_per":"1.11%","uptime":"2019-06-19 23:29:45"},"48":{"inxid":"48","typeid":"europe","inxno":"ATX","inxnm":"奥地利ATX","yesy_price":"2964.04","open_price":"2963.76","last_price":"2956.65","change_price":"-7.39","change_price_per":"-0.25%","high_price":"2969.79","low_price":"2936.36","amplitude_price_per":"1.13%","uptime":"2019-06-19 23:29:58"},"32":{"inxid":"32","typeid":"europe","inxno":"GDAXI","inxnm":"德国DAX30","yesy_price":"12331.75","open_price":"12321.43","last_price":"12308.53","change_price":"-23.22","change_price_per":"-0.19%","high_price":"12346.70","low_price":"12291.19","amplitude_price_per":"0.45%","uptime":"2019-06-19 23:29:58"},"36":{"inxid":"36","typeid":"europe","inxno":"AEX","inxnm":"荷兰AEX","yesy_price":"560.21","open_price":"560.18","last_price":"561.45","change_price":"1.24","change_price_per":"0.22%","high_price":"561.82","low_price":"559.56","amplitude_price_per":"0.40%","uptime":"2019-06-19 23:30:00"},"46":{"inxid":"46","typeid":"europe","inxno":"HEX","inxnm":"芬兰赫尔辛基","yesy_price":"9314.92","open_price":"9314.96","last_price":"9311.39","change_price":"-3.53","change_price_per":"-0.04%","high_price":"9351.07","low_price":"9301.25","amplitude_price_per":"0.53%","uptime":"2019-06-19 23:30:00"},"33":{"inxid":"33","typeid":"europe","inxno":"FCHI","inxnm":"法国CAC40","yesy_price":"5509.72","open_price":"5512.51","last_price":"5518.45","change_price":"8.73","change_price_per":"0.16%","high_price":"5521.81","low_price":"5496.54","amplitude_price_per":"0.46%","uptime":"2019-06-19 23:30:00"},"22":{"inxid":"22","typeid":"australia","inxno":"NZ50","inxnm":"新西兰50","yesy_price":"10304.83","open_price":"10311.69","last_price":"10297.60","change_price":"-7.23","change_price_per":"-0.07%","high_price":"10353.37","low_price":"10289.74","amplitude_price_per":"0.62%","uptime":"2019-06-20 08:22:02"},"21":{"inxid":"21","typeid":"australia","inxno":"AS51","inxnm":"澳大利亚标普200","yesy_price":"6648.10","open_price":"6648.10","last_price":"6642.40","change_price":"-5.70","change_price_per":"-0.09%","high_price":"6655.10","low_price":"6642.30","amplitude_price_per":"0.19%","uptime":"2019-06-20 08:37:05"},"23":{"inxid":"23","typeid":"africa","inxno":"TOP40","inxnm":"富时/JSE南非40","yesy_price":"44534.57","open_price":"44537.63","last_price":"46141.22","change_price":"1606.65","change_price_per":"3.61%","high_price":"46279.99","low_price":"44537.63","amplitude_price_per":"3.91%","uptime":"2018-10-31 23:00:29"}}
     */

    private String success;
    private ResultBean result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * 1 : {"inxid":"1","typeid":"asia","inxno":"000001","inxnm":"上证指数","yesy_price":"2890.16","open_price":"2944.11","last_price":"2917.80","change_price":"27.64","change_price_per":"0.96%","high_price":"2953.33","low_price":"2916.21","amplitude_price_per":"1.26%","uptime":"2019-06-19 15:40:06"}
         * 2 : {"inxid":"2","typeid":"asia","inxno":"399001","inxnm":"深证成指","yesy_price":"8804.32","open_price":"9051.84","last_price":"8925.73","change_price":"121.41","change_price_per":"1.38%","high_price":"9084.18","low_price":"8923.44","amplitude_price_per":"1.78%","uptime":"2019-06-19 15:40:06"}
         * 3 : {"inxid":"3","typeid":"asia","inxno":"000300","inxnm":"沪深300","yesy_price":"3667.62","open_price":"3761.34","last_price":"3715.94","change_price":"48.32","change_price_per":"1.32%","high_price":"3771.35","low_price":"3715.13","amplitude_price_per":"1.49%","uptime":"2019-06-19 15:40:06"}
         * 4 : {"inxid":"4","typeid":"asia","inxno":"399006","inxnm":"创业板指","yesy_price":"1455.75","open_price":"1501.25","last_price":"1469.99","change_price":"14.24","change_price_per":"0.98%","high_price":"1504.41","low_price":"1469.59","amplitude_price_per":"2.32%","uptime":"2019-06-19 15:40:06"}
         * 5 : {"inxid":"5","typeid":"asia","inxno":"HSI","inxnm":"恒生指数","yesy_price":"27498.77","open_price":"28224.87","last_price":"28202.14","change_price":"703.37","change_price_per":"2.56%","high_price":"28224.87","low_price":"28022.49","amplitude_price_per":"0.72%","uptime":"2019-06-19 16:09:24"}
         * 6 : {"inxid":"6","typeid":"asia","inxno":"HSCEI","inxnm":"国企指数","yesy_price":"10507.65","open_price":"10787.74","last_price":"10764.70","change_price":"257.05","change_price_per":"2.45%","high_price":"10797.37","low_price":"10717.29","amplitude_price_per":"0.74%","uptime":"2019-06-19 16:09:24"}
         * 7 : {"inxid":"7","typeid":"asia","inxno":"HSCCI","inxnm":"红筹指数","yesy_price":"4284.16","open_price":"4365.67","last_price":"4366.82","change_price":"82.66","change_price_per":"1.93%","high_price":"4379.31","low_price":"4342.16","amplitude_price_per":"0.85%","uptime":"2019-06-19 16:09:24"}
         * 13 : {"inxid":"13","typeid":"asia","inxno":"SENSEX","inxnm":"印度孟买SENSEX","yesy_price":"39046.34","open_price":"39172.46","last_price":"39112.74","change_price":"66.40","change_price_per":"0.17%","high_price":"39435.80","low_price":"38881.05","amplitude_price_per":"1.42%","uptime":"2019-06-19 18:29:02"}
         * 14 : {"inxid":"14","typeid":"asia","inxno":"JKSE","inxnm":"印尼雅加达综合","yesy_price":"6257.33","open_price":"6294.08","last_price":"6339.26","change_price":"81.93","change_price_per":"1.31%","high_price":"6339.26","low_price":"6289.45","amplitude_price_per":"0.79%","uptime":"2019-06-19 16:50:00"}
         * 9 : {"inxid":"9","typeid":"asia","inxno":"N225","inxnm":"日经225","yesy_price":"21333.87","open_price":"21414.50","last_price":"21397.00","change_price":"63.13","change_price_per":"0.30%","high_price":"21469.50","low_price":"21387.00","amplitude_price_per":"0.39%","uptime":"2019-06-20 08:36:52"}
         * 10 : {"inxid":"10","typeid":"asia","inxno":"KS11","inxnm":"韩国KOSPI","yesy_price":"2124.78","open_price":"2121.78","last_price":"2122.86","change_price":"-1.92","change_price_per":"-0.09%","high_price":"2126.77","low_price":"2120.42","amplitude_price_per":"0.30%","uptime":"2019-06-20 08:37:00"}
         * 16 : {"inxid":"16","typeid":"asia","inxno":"KLSE","inxnm":"富时马来西亚KLCI","yesy_price":"1652.76","open_price":"1654.57","last_price":"1666.54","change_price":"13.78","change_price_per":"0.83%","high_price":"1666.90","low_price":"1652.58","amplitude_price_per":"0.87%","uptime":"2019-06-19 16:59:00"}
         * 18 : {"inxid":"18","typeid":"asia","inxno":"KSE100","inxnm":"巴基斯坦卡拉奇","yesy_price":"34681.72","open_price":"34673.53","last_price":"34656.12","change_price":"-25.60","change_price_per":"-0.07%","high_price":"34809.56","low_price":"34522.41","amplitude_price_per":"0.83%","uptime":"2019-06-19 18:38:00"}
         * 11 : {"inxid":"11","typeid":"asia","inxno":"STI","inxnm":"富时新加坡海峡时报","yesy_price":"3238.73","open_price":"3206.62","last_price":"3288.17","change_price":"49.44","change_price_per":"1.53%","high_price":"3289.04","low_price":"3238.73","amplitude_price_per":"1.57%","uptime":"2019-06-19 16:59:59"}
         * 20 : {"inxid":"20","typeid":"asia","inxno":"CSEALL","inxnm":"斯里兰卡科伦坡","yesy_price":"5375.60","open_price":"5375.60","last_price":"5392.30","change_price":"16.70","change_price_per":"0.31%","high_price":"5401.03","low_price":"5374.27","amplitude_price_per":"0.50%","uptime":"2019-06-19 16:59:00"}
         * 17 : {"inxid":"17","typeid":"asia","inxno":"SET","inxnm":"泰国SET","yesy_price":"1683.60","open_price":"1695.84","last_price":"1705.98","change_price":"22.38","change_price_per":"1.33%","high_price":"1711.89","low_price":"1691.95","amplitude_price_per":"1.18%","uptime":"2019-06-19 17:30:00"}
         * 12 : {"inxid":"12","typeid":"asia","inxno":"TWII","inxnm":"台湾加权","yesy_price":"10566.74","open_price":"10689.15","last_price":"10775.34","change_price":"208.60","change_price_per":"1.97%","high_price":"10778.64","low_price":"10650.48","amplitude_price_per":"1.20%","uptime":"2019-06-19 13:33:00"}
         * 25 : {"inxid":"25","typeid":"america","inxno":"DJIA","inxnm":"道琼斯","yesy_price":"26465.54","open_price":"26507.73","last_price":"26504.00","change_price":"38.46","change_price_per":"0.15%","high_price":"26569.75","low_price":"26415.05","amplitude_price_per":"0.58%","uptime":"2019-06-20 03:59:57"}
         * 26 : {"inxid":"26","typeid":"america","inxno":"SPX","inxnm":"标普500","yesy_price":"2917.75","open_price":"2921.74","last_price":"2926.46","change_price":"8.71","change_price_per":"0.30%","high_price":"2931.74","low_price":"2911.43","amplitude_price_per":"0.70%","uptime":"2019-06-20 03:59:55"}
         * 30 : {"inxid":"30","typeid":"america","inxno":"BVSP","inxnm":"巴西BOVESPA","yesy_price":"99404.39","open_price":"99403.24","last_price":"100303.41","change_price":"899.02","change_price_per":"0.90%","high_price":"100327.15","low_price":"98977.84","amplitude_price_per":"1.36%","uptime":"2019-06-20 03:55:00"}
         * 27 : {"inxid":"27","typeid":"america","inxno":"NDX","inxnm":"纳斯达克","yesy_price":"7953.88","open_price":"7970.26","last_price":"7987.32","change_price":"33.44","change_price_per":"0.42%","high_price":"7998.59","low_price":"7930.38","amplitude_price_per":"0.86%","uptime":"2019-06-20 04:00:00"}
         * 29 : {"inxid":"29","typeid":"america","inxno":"MXX","inxnm":"墨西哥BOLSA","yesy_price":"43161.05","open_price":"43215.54","last_price":"43375.67","change_price":"214.62","change_price_per":"0.50%","high_price":"43479.26","low_price":"43208.17","amplitude_price_per":"0.63%","uptime":"2019-06-20 04:00:00"}
         * 28 : {"inxid":"28","typeid":"america","inxno":"TSX","inxnm":"加拿大S&P/TSX","yesy_price":"16503.35","open_price":"16515.39","last_price":"16511.79","change_price":"8.44","change_price_per":"0.05%","high_price":"16529.73","low_price":"16492.20","amplitude_price_per":"0.23%","uptime":"2019-06-20 03:59:46"}
         * 35 : {"inxid":"35","typeid":"europe","inxno":"MIB","inxnm":"富时意大利MIB","yesy_price":"21133.78","open_price":"21139.67","last_price":"21221.38","change_price":"87.60","change_price_per":"0.41%","high_price":"21244.37","low_price":"21070.39","amplitude_price_per":"0.82%","uptime":"2019-06-19 23:29:59"}
         * 49 : {"inxid":"49","typeid":"europe","inxno":"WIG","inxnm":"波兰WIG","yesy_price":"59936.46","open_price":"59909.76","last_price":"59738.56","change_price":"-197.90","change_price_per":"-0.33%","high_price":"59950.65","low_price":"59693.03","amplitude_price_per":"0.43%","uptime":"2019-06-19 22:50:00"}
         * 40 : {"inxid":"40","typeid":"europe","inxno":"ISEQ","inxnm":"爱尔兰综合","yesy_price":"6162.41","open_price":"6166.72","last_price":"6164.59","change_price":"2.18","change_price_per":"0.04%","high_price":"6184.43","low_price":"6134.27","amplitude_price_per":"0.81%","uptime":"2019-06-19 23:28:15"}
         * 39 : {"inxid":"39","typeid":"europe","inxno":"ICEXI","inxnm":"冰岛ICEX","yesy_price":"1437.11","open_price":"1439.29","last_price":"1444.57","change_price":"7.46","change_price_per":"0.52%","high_price":"1448.18","low_price":"1437.11","amplitude_price_per":"0.77%","uptime":"2019-06-19 23:21:00"}
         * 47 : {"inxid":"47","typeid":"europe","inxno":"OSEAX","inxnm":"挪威OSEAX","yesy_price":"849.04","open_price":"849.02","last_price":"837.14","change_price":"-11.90","change_price_per":"-1.40%","high_price":"849.03","low_price":"832.87","amplitude_price_per":"1.90%","uptime":"2018-11-23 23:27:00"}
         * 37 : {"inxid":"37","typeid":"europe","inxno":"SSMI","inxnm":"瑞士SMI","yesy_price":"9954.80","open_price":"9977.50","last_price":"9955.50","change_price":"0.70","change_price_per":"0.01%","high_price":"9982.50","low_price":"9934.50","amplitude_price_per":"0.48%","uptime":"2019-06-19 23:29:58"}
         * 31 : {"inxid":"31","typeid":"europe","inxno":"FTSE","inxnm":"英国富时100","yesy_price":"7443.04","open_price":"7443.04","last_price":"7403.54","change_price":"-39.50","change_price_per":"-0.53%","high_price":"7454.93","low_price":"7399.17","amplitude_price_per":"0.75%","uptime":"2019-06-19 23:29:00"}
         * 34 : {"inxid":"34","typeid":"europe","inxno":"IBEX","inxnm":"西班牙IBEX35","yesy_price":"9240.70","open_price":"9259.00","last_price":"9231.20","change_price":"-9.50","change_price_per":"-0.10%","high_price":"9263.30","low_price":"9192.08","amplitude_price_per":"0.77%","uptime":"2019-06-19 23:29:58"}
         * 41 : {"inxid":"41","typeid":"europe","inxno":"RTS","inxnm":"俄罗斯RTS","yesy_price":"1359.23","open_price":"1364.56","last_price":"1361.14","change_price":"1.91","change_price_per":"0.14%","high_price":"1366.49","low_price":"1353.87","amplitude_price_per":"0.92%","uptime":"2019-06-19 23:39:53"}
         * 38 : {"inxid":"38","typeid":"europe","inxno":"OMXSPI","inxnm":"瑞典OMXSPI","yesy_price":"1609.43","open_price":"1609.72","last_price":"1612.40","change_price":"2.97","change_price_per":"0.18%","high_price":"1615.81","low_price":"1607.11","amplitude_price_per":"0.54%","uptime":"2019-06-19 23:30:00"}
         * 42 : {"inxid":"42","typeid":"europe","inxno":"ASE","inxnm":"希腊雅典ASE","yesy_price":"853.32","open_price":"854.37","last_price":"844.00","change_price":"-9.32","change_price_per":"-1.09%","high_price":"856.19","low_price":"841.18","amplitude_price_per":"1.76%","uptime":"2019-06-19 21:59:44"}
         * 50 : {"inxid":"50","typeid":"europe","inxno":"PX","inxnm":"布拉格指数","yesy_price":"1055.18","open_price":"1055.91","last_price":"1057.56","change_price":"2.38","change_price_per":"0.23%","high_price":"1060.10","low_price":"1055.18","amplitude_price_per":"0.47%","uptime":"2019-06-19 22:25:30"}
         * 43 : {"inxid":"43","typeid":"europe","inxno":"BFX","inxnm":"比利时BFX","yesy_price":"3513.07","open_price":"3514.70","last_price":"3525.56","change_price":"12.49","change_price_per":"0.36%","high_price":"3529.83","low_price":"3490.76","amplitude_price_per":"1.11%","uptime":"2019-06-19 23:29:45"}
         * 48 : {"inxid":"48","typeid":"europe","inxno":"ATX","inxnm":"奥地利ATX","yesy_price":"2964.04","open_price":"2963.76","last_price":"2956.65","change_price":"-7.39","change_price_per":"-0.25%","high_price":"2969.79","low_price":"2936.36","amplitude_price_per":"1.13%","uptime":"2019-06-19 23:29:58"}
         * 32 : {"inxid":"32","typeid":"europe","inxno":"GDAXI","inxnm":"德国DAX30","yesy_price":"12331.75","open_price":"12321.43","last_price":"12308.53","change_price":"-23.22","change_price_per":"-0.19%","high_price":"12346.70","low_price":"12291.19","amplitude_price_per":"0.45%","uptime":"2019-06-19 23:29:58"}
         * 36 : {"inxid":"36","typeid":"europe","inxno":"AEX","inxnm":"荷兰AEX","yesy_price":"560.21","open_price":"560.18","last_price":"561.45","change_price":"1.24","change_price_per":"0.22%","high_price":"561.82","low_price":"559.56","amplitude_price_per":"0.40%","uptime":"2019-06-19 23:30:00"}
         * 46 : {"inxid":"46","typeid":"europe","inxno":"HEX","inxnm":"芬兰赫尔辛基","yesy_price":"9314.92","open_price":"9314.96","last_price":"9311.39","change_price":"-3.53","change_price_per":"-0.04%","high_price":"9351.07","low_price":"9301.25","amplitude_price_per":"0.53%","uptime":"2019-06-19 23:30:00"}
         * 33 : {"inxid":"33","typeid":"europe","inxno":"FCHI","inxnm":"法国CAC40","yesy_price":"5509.72","open_price":"5512.51","last_price":"5518.45","change_price":"8.73","change_price_per":"0.16%","high_price":"5521.81","low_price":"5496.54","amplitude_price_per":"0.46%","uptime":"2019-06-19 23:30:00"}
         * 22 : {"inxid":"22","typeid":"australia","inxno":"NZ50","inxnm":"新西兰50","yesy_price":"10304.83","open_price":"10311.69","last_price":"10297.60","change_price":"-7.23","change_price_per":"-0.07%","high_price":"10353.37","low_price":"10289.74","amplitude_price_per":"0.62%","uptime":"2019-06-20 08:22:02"}
         * 21 : {"inxid":"21","typeid":"australia","inxno":"AS51","inxnm":"澳大利亚标普200","yesy_price":"6648.10","open_price":"6648.10","last_price":"6642.40","change_price":"-5.70","change_price_per":"-0.09%","high_price":"6655.10","low_price":"6642.30","amplitude_price_per":"0.19%","uptime":"2019-06-20 08:37:05"}
         * 23 : {"inxid":"23","typeid":"africa","inxno":"TOP40","inxnm":"富时/JSE南非40","yesy_price":"44534.57","open_price":"44537.63","last_price":"46141.22","change_price":"1606.65","change_price_per":"3.61%","high_price":"46279.99","low_price":"44537.63","amplitude_price_per":"3.91%","uptime":"2018-10-31 23:00:29"}
         */

        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("7")
        private _$7Bean _$7;
        @SerializedName("13")
        private _$13Bean _$13;
        @SerializedName("14")
        private _$14Bean _$14;
        @SerializedName("9")
        private _$9Bean _$9;
        @SerializedName("10")
        private _$10Bean _$10;
        @SerializedName("16")
        private _$16Bean _$16;
        @SerializedName("18")
        private _$18Bean _$18;
        @SerializedName("11")
        private _$11Bean _$11;
        @SerializedName("20")
        private _$20Bean _$20;
        @SerializedName("17")
        private _$17Bean _$17;
        @SerializedName("12")
        private _$12Bean _$12;
        @SerializedName("25")
        private _$25Bean _$25;
        @SerializedName("26")
        private _$26Bean _$26;
        @SerializedName("30")
        private _$30Bean _$30;
        @SerializedName("27")
        private _$27Bean _$27;
        @SerializedName("29")
        private _$29Bean _$29;
        @SerializedName("28")
        private _$28Bean _$28;
        @SerializedName("35")
        private _$35Bean _$35;
        @SerializedName("49")
        private _$49Bean _$49;
        @SerializedName("40")
        private _$40Bean _$40;
        @SerializedName("39")
        private _$39Bean _$39;
        @SerializedName("47")
        private _$47Bean _$47;
        @SerializedName("37")
        private _$37Bean _$37;
        @SerializedName("31")
        private _$31Bean _$31;
        @SerializedName("34")
        private _$34Bean _$34;
        @SerializedName("41")
        private _$41Bean _$41;
        @SerializedName("38")
        private _$38Bean _$38;
        @SerializedName("42")
        private _$42Bean _$42;
        @SerializedName("50")
        private _$50Bean _$50;
        @SerializedName("43")
        private _$43Bean _$43;
        @SerializedName("48")
        private _$48Bean _$48;
        @SerializedName("32")
        private _$32Bean _$32;
        @SerializedName("36")
        private _$36Bean _$36;
        @SerializedName("46")
        private _$46Bean _$46;
        @SerializedName("33")
        private _$33Bean _$33;
        @SerializedName("22")
        private _$22Bean _$22;
        @SerializedName("21")
        private _$21Bean _$21;
        @SerializedName("23")
        private _$23Bean _$23;

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public _$2Bean get_$2() {
            return _$2;
        }

        public void set_$2(_$2Bean _$2) {
            this._$2 = _$2;
        }

        public _$3Bean get_$3() {
            return _$3;
        }

        public void set_$3(_$3Bean _$3) {
            this._$3 = _$3;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public _$6Bean get_$6() {
            return _$6;
        }

        public void set_$6(_$6Bean _$6) {
            this._$6 = _$6;
        }

        public _$7Bean get_$7() {
            return _$7;
        }

        public void set_$7(_$7Bean _$7) {
            this._$7 = _$7;
        }

        public _$13Bean get_$13() {
            return _$13;
        }

        public void set_$13(_$13Bean _$13) {
            this._$13 = _$13;
        }

        public _$14Bean get_$14() {
            return _$14;
        }

        public void set_$14(_$14Bean _$14) {
            this._$14 = _$14;
        }

        public _$9Bean get_$9() {
            return _$9;
        }

        public void set_$9(_$9Bean _$9) {
            this._$9 = _$9;
        }

        public _$10Bean get_$10() {
            return _$10;
        }

        public void set_$10(_$10Bean _$10) {
            this._$10 = _$10;
        }

        public _$16Bean get_$16() {
            return _$16;
        }

        public void set_$16(_$16Bean _$16) {
            this._$16 = _$16;
        }

        public _$18Bean get_$18() {
            return _$18;
        }

        public void set_$18(_$18Bean _$18) {
            this._$18 = _$18;
        }

        public _$11Bean get_$11() {
            return _$11;
        }

        public void set_$11(_$11Bean _$11) {
            this._$11 = _$11;
        }

        public _$20Bean get_$20() {
            return _$20;
        }

        public void set_$20(_$20Bean _$20) {
            this._$20 = _$20;
        }

        public _$17Bean get_$17() {
            return _$17;
        }

        public void set_$17(_$17Bean _$17) {
            this._$17 = _$17;
        }

        public _$12Bean get_$12() {
            return _$12;
        }

        public void set_$12(_$12Bean _$12) {
            this._$12 = _$12;
        }

        public _$25Bean get_$25() {
            return _$25;
        }

        public void set_$25(_$25Bean _$25) {
            this._$25 = _$25;
        }

        public _$26Bean get_$26() {
            return _$26;
        }

        public void set_$26(_$26Bean _$26) {
            this._$26 = _$26;
        }

        public _$30Bean get_$30() {
            return _$30;
        }

        public void set_$30(_$30Bean _$30) {
            this._$30 = _$30;
        }

        public _$27Bean get_$27() {
            return _$27;
        }

        public void set_$27(_$27Bean _$27) {
            this._$27 = _$27;
        }

        public _$29Bean get_$29() {
            return _$29;
        }

        public void set_$29(_$29Bean _$29) {
            this._$29 = _$29;
        }

        public _$28Bean get_$28() {
            return _$28;
        }

        public void set_$28(_$28Bean _$28) {
            this._$28 = _$28;
        }

        public _$35Bean get_$35() {
            return _$35;
        }

        public void set_$35(_$35Bean _$35) {
            this._$35 = _$35;
        }

        public _$49Bean get_$49() {
            return _$49;
        }

        public void set_$49(_$49Bean _$49) {
            this._$49 = _$49;
        }

        public _$40Bean get_$40() {
            return _$40;
        }

        public void set_$40(_$40Bean _$40) {
            this._$40 = _$40;
        }

        public _$39Bean get_$39() {
            return _$39;
        }

        public void set_$39(_$39Bean _$39) {
            this._$39 = _$39;
        }

        public _$47Bean get_$47() {
            return _$47;
        }

        public void set_$47(_$47Bean _$47) {
            this._$47 = _$47;
        }

        public _$37Bean get_$37() {
            return _$37;
        }

        public void set_$37(_$37Bean _$37) {
            this._$37 = _$37;
        }

        public _$31Bean get_$31() {
            return _$31;
        }

        public void set_$31(_$31Bean _$31) {
            this._$31 = _$31;
        }

        public _$34Bean get_$34() {
            return _$34;
        }

        public void set_$34(_$34Bean _$34) {
            this._$34 = _$34;
        }

        public _$41Bean get_$41() {
            return _$41;
        }

        public void set_$41(_$41Bean _$41) {
            this._$41 = _$41;
        }

        public _$38Bean get_$38() {
            return _$38;
        }

        public void set_$38(_$38Bean _$38) {
            this._$38 = _$38;
        }

        public _$42Bean get_$42() {
            return _$42;
        }

        public void set_$42(_$42Bean _$42) {
            this._$42 = _$42;
        }

        public _$50Bean get_$50() {
            return _$50;
        }

        public void set_$50(_$50Bean _$50) {
            this._$50 = _$50;
        }

        public _$43Bean get_$43() {
            return _$43;
        }

        public void set_$43(_$43Bean _$43) {
            this._$43 = _$43;
        }

        public _$48Bean get_$48() {
            return _$48;
        }

        public void set_$48(_$48Bean _$48) {
            this._$48 = _$48;
        }

        public _$32Bean get_$32() {
            return _$32;
        }

        public void set_$32(_$32Bean _$32) {
            this._$32 = _$32;
        }

        public _$36Bean get_$36() {
            return _$36;
        }

        public void set_$36(_$36Bean _$36) {
            this._$36 = _$36;
        }

        public _$46Bean get_$46() {
            return _$46;
        }

        public void set_$46(_$46Bean _$46) {
            this._$46 = _$46;
        }

        public _$33Bean get_$33() {
            return _$33;
        }

        public void set_$33(_$33Bean _$33) {
            this._$33 = _$33;
        }

        public _$22Bean get_$22() {
            return _$22;
        }

        public void set_$22(_$22Bean _$22) {
            this._$22 = _$22;
        }

        public _$21Bean get_$21() {
            return _$21;
        }

        public void set_$21(_$21Bean _$21) {
            this._$21 = _$21;
        }

        public _$23Bean get_$23() {
            return _$23;
        }

        public void set_$23(_$23Bean _$23) {
            this._$23 = _$23;
        }

        public static class _$1Bean {
            /**
             * inxid : 1
             * typeid : asia
             * inxno : 000001
             * inxnm : 上证指数
             * yesy_price : 2890.16
             * open_price : 2944.11
             * last_price : 2917.80
             * change_price : 27.64
             * change_price_per : 0.96%
             * high_price : 2953.33
             * low_price : 2916.21
             * amplitude_price_per : 1.26%
             * uptime : 2019-06-19 15:40:06
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$2Bean {
            /**
             * inxid : 2
             * typeid : asia
             * inxno : 399001
             * inxnm : 深证成指
             * yesy_price : 8804.32
             * open_price : 9051.84
             * last_price : 8925.73
             * change_price : 121.41
             * change_price_per : 1.38%
             * high_price : 9084.18
             * low_price : 8923.44
             * amplitude_price_per : 1.78%
             * uptime : 2019-06-19 15:40:06
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$3Bean {
            /**
             * inxid : 3
             * typeid : asia
             * inxno : 000300
             * inxnm : 沪深300
             * yesy_price : 3667.62
             * open_price : 3761.34
             * last_price : 3715.94
             * change_price : 48.32
             * change_price_per : 1.32%
             * high_price : 3771.35
             * low_price : 3715.13
             * amplitude_price_per : 1.49%
             * uptime : 2019-06-19 15:40:06
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$4Bean {
            /**
             * inxid : 4
             * typeid : asia
             * inxno : 399006
             * inxnm : 创业板指
             * yesy_price : 1455.75
             * open_price : 1501.25
             * last_price : 1469.99
             * change_price : 14.24
             * change_price_per : 0.98%
             * high_price : 1504.41
             * low_price : 1469.59
             * amplitude_price_per : 2.32%
             * uptime : 2019-06-19 15:40:06
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$5Bean {
            /**
             * inxid : 5
             * typeid : asia
             * inxno : HSI
             * inxnm : 恒生指数
             * yesy_price : 27498.77
             * open_price : 28224.87
             * last_price : 28202.14
             * change_price : 703.37
             * change_price_per : 2.56%
             * high_price : 28224.87
             * low_price : 28022.49
             * amplitude_price_per : 0.72%
             * uptime : 2019-06-19 16:09:24
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$6Bean {
            /**
             * inxid : 6
             * typeid : asia
             * inxno : HSCEI
             * inxnm : 国企指数
             * yesy_price : 10507.65
             * open_price : 10787.74
             * last_price : 10764.70
             * change_price : 257.05
             * change_price_per : 2.45%
             * high_price : 10797.37
             * low_price : 10717.29
             * amplitude_price_per : 0.74%
             * uptime : 2019-06-19 16:09:24
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$7Bean {
            /**
             * inxid : 7
             * typeid : asia
             * inxno : HSCCI
             * inxnm : 红筹指数
             * yesy_price : 4284.16
             * open_price : 4365.67
             * last_price : 4366.82
             * change_price : 82.66
             * change_price_per : 1.93%
             * high_price : 4379.31
             * low_price : 4342.16
             * amplitude_price_per : 0.85%
             * uptime : 2019-06-19 16:09:24
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$13Bean {
            /**
             * inxid : 13
             * typeid : asia
             * inxno : SENSEX
             * inxnm : 印度孟买SENSEX
             * yesy_price : 39046.34
             * open_price : 39172.46
             * last_price : 39112.74
             * change_price : 66.40
             * change_price_per : 0.17%
             * high_price : 39435.80
             * low_price : 38881.05
             * amplitude_price_per : 1.42%
             * uptime : 2019-06-19 18:29:02
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$14Bean {
            /**
             * inxid : 14
             * typeid : asia
             * inxno : JKSE
             * inxnm : 印尼雅加达综合
             * yesy_price : 6257.33
             * open_price : 6294.08
             * last_price : 6339.26
             * change_price : 81.93
             * change_price_per : 1.31%
             * high_price : 6339.26
             * low_price : 6289.45
             * amplitude_price_per : 0.79%
             * uptime : 2019-06-19 16:50:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$9Bean {
            /**
             * inxid : 9
             * typeid : asia
             * inxno : N225
             * inxnm : 日经225
             * yesy_price : 21333.87
             * open_price : 21414.50
             * last_price : 21397.00
             * change_price : 63.13
             * change_price_per : 0.30%
             * high_price : 21469.50
             * low_price : 21387.00
             * amplitude_price_per : 0.39%
             * uptime : 2019-06-20 08:36:52
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$10Bean {
            /**
             * inxid : 10
             * typeid : asia
             * inxno : KS11
             * inxnm : 韩国KOSPI
             * yesy_price : 2124.78
             * open_price : 2121.78
             * last_price : 2122.86
             * change_price : -1.92
             * change_price_per : -0.09%
             * high_price : 2126.77
             * low_price : 2120.42
             * amplitude_price_per : 0.30%
             * uptime : 2019-06-20 08:37:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$16Bean {
            /**
             * inxid : 16
             * typeid : asia
             * inxno : KLSE
             * inxnm : 富时马来西亚KLCI
             * yesy_price : 1652.76
             * open_price : 1654.57
             * last_price : 1666.54
             * change_price : 13.78
             * change_price_per : 0.83%
             * high_price : 1666.90
             * low_price : 1652.58
             * amplitude_price_per : 0.87%
             * uptime : 2019-06-19 16:59:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$18Bean {
            /**
             * inxid : 18
             * typeid : asia
             * inxno : KSE100
             * inxnm : 巴基斯坦卡拉奇
             * yesy_price : 34681.72
             * open_price : 34673.53
             * last_price : 34656.12
             * change_price : -25.60
             * change_price_per : -0.07%
             * high_price : 34809.56
             * low_price : 34522.41
             * amplitude_price_per : 0.83%
             * uptime : 2019-06-19 18:38:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$11Bean {
            /**
             * inxid : 11
             * typeid : asia
             * inxno : STI
             * inxnm : 富时新加坡海峡时报
             * yesy_price : 3238.73
             * open_price : 3206.62
             * last_price : 3288.17
             * change_price : 49.44
             * change_price_per : 1.53%
             * high_price : 3289.04
             * low_price : 3238.73
             * amplitude_price_per : 1.57%
             * uptime : 2019-06-19 16:59:59
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$20Bean {
            /**
             * inxid : 20
             * typeid : asia
             * inxno : CSEALL
             * inxnm : 斯里兰卡科伦坡
             * yesy_price : 5375.60
             * open_price : 5375.60
             * last_price : 5392.30
             * change_price : 16.70
             * change_price_per : 0.31%
             * high_price : 5401.03
             * low_price : 5374.27
             * amplitude_price_per : 0.50%
             * uptime : 2019-06-19 16:59:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$17Bean {
            /**
             * inxid : 17
             * typeid : asia
             * inxno : SET
             * inxnm : 泰国SET
             * yesy_price : 1683.60
             * open_price : 1695.84
             * last_price : 1705.98
             * change_price : 22.38
             * change_price_per : 1.33%
             * high_price : 1711.89
             * low_price : 1691.95
             * amplitude_price_per : 1.18%
             * uptime : 2019-06-19 17:30:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$12Bean {
            /**
             * inxid : 12
             * typeid : asia
             * inxno : TWII
             * inxnm : 台湾加权
             * yesy_price : 10566.74
             * open_price : 10689.15
             * last_price : 10775.34
             * change_price : 208.60
             * change_price_per : 1.97%
             * high_price : 10778.64
             * low_price : 10650.48
             * amplitude_price_per : 1.20%
             * uptime : 2019-06-19 13:33:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$25Bean {
            /**
             * inxid : 25
             * typeid : america
             * inxno : DJIA
             * inxnm : 道琼斯
             * yesy_price : 26465.54
             * open_price : 26507.73
             * last_price : 26504.00
             * change_price : 38.46
             * change_price_per : 0.15%
             * high_price : 26569.75
             * low_price : 26415.05
             * amplitude_price_per : 0.58%
             * uptime : 2019-06-20 03:59:57
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$26Bean {
            /**
             * inxid : 26
             * typeid : america
             * inxno : SPX
             * inxnm : 标普500
             * yesy_price : 2917.75
             * open_price : 2921.74
             * last_price : 2926.46
             * change_price : 8.71
             * change_price_per : 0.30%
             * high_price : 2931.74
             * low_price : 2911.43
             * amplitude_price_per : 0.70%
             * uptime : 2019-06-20 03:59:55
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$30Bean {
            /**
             * inxid : 30
             * typeid : america
             * inxno : BVSP
             * inxnm : 巴西BOVESPA
             * yesy_price : 99404.39
             * open_price : 99403.24
             * last_price : 100303.41
             * change_price : 899.02
             * change_price_per : 0.90%
             * high_price : 100327.15
             * low_price : 98977.84
             * amplitude_price_per : 1.36%
             * uptime : 2019-06-20 03:55:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$27Bean {
            /**
             * inxid : 27
             * typeid : america
             * inxno : NDX
             * inxnm : 纳斯达克
             * yesy_price : 7953.88
             * open_price : 7970.26
             * last_price : 7987.32
             * change_price : 33.44
             * change_price_per : 0.42%
             * high_price : 7998.59
             * low_price : 7930.38
             * amplitude_price_per : 0.86%
             * uptime : 2019-06-20 04:00:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$29Bean {
            /**
             * inxid : 29
             * typeid : america
             * inxno : MXX
             * inxnm : 墨西哥BOLSA
             * yesy_price : 43161.05
             * open_price : 43215.54
             * last_price : 43375.67
             * change_price : 214.62
             * change_price_per : 0.50%
             * high_price : 43479.26
             * low_price : 43208.17
             * amplitude_price_per : 0.63%
             * uptime : 2019-06-20 04:00:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$28Bean {
            /**
             * inxid : 28
             * typeid : america
             * inxno : TSX
             * inxnm : 加拿大S&P/TSX
             * yesy_price : 16503.35
             * open_price : 16515.39
             * last_price : 16511.79
             * change_price : 8.44
             * change_price_per : 0.05%
             * high_price : 16529.73
             * low_price : 16492.20
             * amplitude_price_per : 0.23%
             * uptime : 2019-06-20 03:59:46
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$35Bean {
            /**
             * inxid : 35
             * typeid : europe
             * inxno : MIB
             * inxnm : 富时意大利MIB
             * yesy_price : 21133.78
             * open_price : 21139.67
             * last_price : 21221.38
             * change_price : 87.60
             * change_price_per : 0.41%
             * high_price : 21244.37
             * low_price : 21070.39
             * amplitude_price_per : 0.82%
             * uptime : 2019-06-19 23:29:59
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$49Bean {
            /**
             * inxid : 49
             * typeid : europe
             * inxno : WIG
             * inxnm : 波兰WIG
             * yesy_price : 59936.46
             * open_price : 59909.76
             * last_price : 59738.56
             * change_price : -197.90
             * change_price_per : -0.33%
             * high_price : 59950.65
             * low_price : 59693.03
             * amplitude_price_per : 0.43%
             * uptime : 2019-06-19 22:50:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$40Bean {
            /**
             * inxid : 40
             * typeid : europe
             * inxno : ISEQ
             * inxnm : 爱尔兰综合
             * yesy_price : 6162.41
             * open_price : 6166.72
             * last_price : 6164.59
             * change_price : 2.18
             * change_price_per : 0.04%
             * high_price : 6184.43
             * low_price : 6134.27
             * amplitude_price_per : 0.81%
             * uptime : 2019-06-19 23:28:15
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$39Bean {
            /**
             * inxid : 39
             * typeid : europe
             * inxno : ICEXI
             * inxnm : 冰岛ICEX
             * yesy_price : 1437.11
             * open_price : 1439.29
             * last_price : 1444.57
             * change_price : 7.46
             * change_price_per : 0.52%
             * high_price : 1448.18
             * low_price : 1437.11
             * amplitude_price_per : 0.77%
             * uptime : 2019-06-19 23:21:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$47Bean {
            /**
             * inxid : 47
             * typeid : europe
             * inxno : OSEAX
             * inxnm : 挪威OSEAX
             * yesy_price : 849.04
             * open_price : 849.02
             * last_price : 837.14
             * change_price : -11.90
             * change_price_per : -1.40%
             * high_price : 849.03
             * low_price : 832.87
             * amplitude_price_per : 1.90%
             * uptime : 2018-11-23 23:27:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$37Bean {
            /**
             * inxid : 37
             * typeid : europe
             * inxno : SSMI
             * inxnm : 瑞士SMI
             * yesy_price : 9954.80
             * open_price : 9977.50
             * last_price : 9955.50
             * change_price : 0.70
             * change_price_per : 0.01%
             * high_price : 9982.50
             * low_price : 9934.50
             * amplitude_price_per : 0.48%
             * uptime : 2019-06-19 23:29:58
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$31Bean {
            /**
             * inxid : 31
             * typeid : europe
             * inxno : FTSE
             * inxnm : 英国富时100
             * yesy_price : 7443.04
             * open_price : 7443.04
             * last_price : 7403.54
             * change_price : -39.50
             * change_price_per : -0.53%
             * high_price : 7454.93
             * low_price : 7399.17
             * amplitude_price_per : 0.75%
             * uptime : 2019-06-19 23:29:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$34Bean {
            /**
             * inxid : 34
             * typeid : europe
             * inxno : IBEX
             * inxnm : 西班牙IBEX35
             * yesy_price : 9240.70
             * open_price : 9259.00
             * last_price : 9231.20
             * change_price : -9.50
             * change_price_per : -0.10%
             * high_price : 9263.30
             * low_price : 9192.08
             * amplitude_price_per : 0.77%
             * uptime : 2019-06-19 23:29:58
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$41Bean {
            /**
             * inxid : 41
             * typeid : europe
             * inxno : RTS
             * inxnm : 俄罗斯RTS
             * yesy_price : 1359.23
             * open_price : 1364.56
             * last_price : 1361.14
             * change_price : 1.91
             * change_price_per : 0.14%
             * high_price : 1366.49
             * low_price : 1353.87
             * amplitude_price_per : 0.92%
             * uptime : 2019-06-19 23:39:53
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$38Bean {
            /**
             * inxid : 38
             * typeid : europe
             * inxno : OMXSPI
             * inxnm : 瑞典OMXSPI
             * yesy_price : 1609.43
             * open_price : 1609.72
             * last_price : 1612.40
             * change_price : 2.97
             * change_price_per : 0.18%
             * high_price : 1615.81
             * low_price : 1607.11
             * amplitude_price_per : 0.54%
             * uptime : 2019-06-19 23:30:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$42Bean {
            /**
             * inxid : 42
             * typeid : europe
             * inxno : ASE
             * inxnm : 希腊雅典ASE
             * yesy_price : 853.32
             * open_price : 854.37
             * last_price : 844.00
             * change_price : -9.32
             * change_price_per : -1.09%
             * high_price : 856.19
             * low_price : 841.18
             * amplitude_price_per : 1.76%
             * uptime : 2019-06-19 21:59:44
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$50Bean {
            /**
             * inxid : 50
             * typeid : europe
             * inxno : PX
             * inxnm : 布拉格指数
             * yesy_price : 1055.18
             * open_price : 1055.91
             * last_price : 1057.56
             * change_price : 2.38
             * change_price_per : 0.23%
             * high_price : 1060.10
             * low_price : 1055.18
             * amplitude_price_per : 0.47%
             * uptime : 2019-06-19 22:25:30
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$43Bean {
            /**
             * inxid : 43
             * typeid : europe
             * inxno : BFX
             * inxnm : 比利时BFX
             * yesy_price : 3513.07
             * open_price : 3514.70
             * last_price : 3525.56
             * change_price : 12.49
             * change_price_per : 0.36%
             * high_price : 3529.83
             * low_price : 3490.76
             * amplitude_price_per : 1.11%
             * uptime : 2019-06-19 23:29:45
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$48Bean {
            /**
             * inxid : 48
             * typeid : europe
             * inxno : ATX
             * inxnm : 奥地利ATX
             * yesy_price : 2964.04
             * open_price : 2963.76
             * last_price : 2956.65
             * change_price : -7.39
             * change_price_per : -0.25%
             * high_price : 2969.79
             * low_price : 2936.36
             * amplitude_price_per : 1.13%
             * uptime : 2019-06-19 23:29:58
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$32Bean {
            /**
             * inxid : 32
             * typeid : europe
             * inxno : GDAXI
             * inxnm : 德国DAX30
             * yesy_price : 12331.75
             * open_price : 12321.43
             * last_price : 12308.53
             * change_price : -23.22
             * change_price_per : -0.19%
             * high_price : 12346.70
             * low_price : 12291.19
             * amplitude_price_per : 0.45%
             * uptime : 2019-06-19 23:29:58
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$36Bean {
            /**
             * inxid : 36
             * typeid : europe
             * inxno : AEX
             * inxnm : 荷兰AEX
             * yesy_price : 560.21
             * open_price : 560.18
             * last_price : 561.45
             * change_price : 1.24
             * change_price_per : 0.22%
             * high_price : 561.82
             * low_price : 559.56
             * amplitude_price_per : 0.40%
             * uptime : 2019-06-19 23:30:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$46Bean {
            /**
             * inxid : 46
             * typeid : europe
             * inxno : HEX
             * inxnm : 芬兰赫尔辛基
             * yesy_price : 9314.92
             * open_price : 9314.96
             * last_price : 9311.39
             * change_price : -3.53
             * change_price_per : -0.04%
             * high_price : 9351.07
             * low_price : 9301.25
             * amplitude_price_per : 0.53%
             * uptime : 2019-06-19 23:30:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$33Bean {
            /**
             * inxid : 33
             * typeid : europe
             * inxno : FCHI
             * inxnm : 法国CAC40
             * yesy_price : 5509.72
             * open_price : 5512.51
             * last_price : 5518.45
             * change_price : 8.73
             * change_price_per : 0.16%
             * high_price : 5521.81
             * low_price : 5496.54
             * amplitude_price_per : 0.46%
             * uptime : 2019-06-19 23:30:00
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$22Bean {
            /**
             * inxid : 22
             * typeid : australia
             * inxno : NZ50
             * inxnm : 新西兰50
             * yesy_price : 10304.83
             * open_price : 10311.69
             * last_price : 10297.60
             * change_price : -7.23
             * change_price_per : -0.07%
             * high_price : 10353.37
             * low_price : 10289.74
             * amplitude_price_per : 0.62%
             * uptime : 2019-06-20 08:22:02
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$21Bean {
            /**
             * inxid : 21
             * typeid : australia
             * inxno : AS51
             * inxnm : 澳大利亚标普200
             * yesy_price : 6648.10
             * open_price : 6648.10
             * last_price : 6642.40
             * change_price : -5.70
             * change_price_per : -0.09%
             * high_price : 6655.10
             * low_price : 6642.30
             * amplitude_price_per : 0.19%
             * uptime : 2019-06-20 08:37:05
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }

        public static class _$23Bean {
            /**
             * inxid : 23
             * typeid : africa
             * inxno : TOP40
             * inxnm : 富时/JSE南非40
             * yesy_price : 44534.57
             * open_price : 44537.63
             * last_price : 46141.22
             * change_price : 1606.65
             * change_price_per : 3.61%
             * high_price : 46279.99
             * low_price : 44537.63
             * amplitude_price_per : 3.91%
             * uptime : 2018-10-31 23:00:29
             */

            private String inxid;
            private String typeid;
            private String inxno;
            private String inxnm;
            private String yesy_price;
            private String open_price;
            private String last_price;
            private String change_price;
            private String change_price_per;
            private String high_price;
            private String low_price;
            private String amplitude_price_per;
            private String uptime;

            public String getInxid() {
                return inxid;
            }

            public void setInxid(String inxid) {
                this.inxid = inxid;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public String getInxno() {
                return inxno;
            }

            public void setInxno(String inxno) {
                this.inxno = inxno;
            }

            public String getInxnm() {
                return inxnm;
            }

            public void setInxnm(String inxnm) {
                this.inxnm = inxnm;
            }

            public String getYesy_price() {
                return yesy_price;
            }

            public void setYesy_price(String yesy_price) {
                this.yesy_price = yesy_price;
            }

            public String getOpen_price() {
                return open_price;
            }

            public void setOpen_price(String open_price) {
                this.open_price = open_price;
            }

            public String getLast_price() {
                return last_price;
            }

            public void setLast_price(String last_price) {
                this.last_price = last_price;
            }

            public String getChange_price() {
                return change_price;
            }

            public void setChange_price(String change_price) {
                this.change_price = change_price;
            }

            public String getChange_price_per() {
                return change_price_per;
            }

            public void setChange_price_per(String change_price_per) {
                this.change_price_per = change_price_per;
            }

            public String getHigh_price() {
                return high_price;
            }

            public void setHigh_price(String high_price) {
                this.high_price = high_price;
            }

            public String getLow_price() {
                return low_price;
            }

            public void setLow_price(String low_price) {
                this.low_price = low_price;
            }

            public String getAmplitude_price_per() {
                return amplitude_price_per;
            }

            public void setAmplitude_price_per(String amplitude_price_per) {
                this.amplitude_price_per = amplitude_price_per;
            }

            public String getUptime() {
                return uptime;
            }

            public void setUptime(String uptime) {
                this.uptime = uptime;
            }
        }
    }
}