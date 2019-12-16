package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kimik
 */
public class MyToys {

    // day la bo thu vien xai chung cho cac ham static
    public static int devide(int a, int b) throws Exception {
        // có tình huống cà chớn:
        // số chia là 0 
        if (b == 0) {
            throw new Exception("so chia must > 0");
        } else {
            return a / b;
        }
    }

    //ham tinh giai thua
    public static int computeFactory(int n) throws IllegalAccessException {
        if(n < 0){
            throw new IllegalAccessException("invalid number! It must gretter than 0");
        } else if(n == 0 || n == 1) {
            return 1;
        } 
//        return n * computeFactory(n-1);

// code ổn, màu xanh nhưng bố thích sửa code :))
// tuy nhiên để đảm bảo những gì bạn tối ưu là tốt, t muốn thấy màu xanh như tr khi dc sửa code
        int re = 1;
        for (int i = 1; i <= n; i++) {
            re *= i;
        }
        return re;
    }
    // còn nhiều hàm # thì còn nhiều class khác
    //đôi khi ta muốn 1 nhóm các class # dc chạy nhưng k phải tất cả
    // >> >>>>>>>>test suites
}
