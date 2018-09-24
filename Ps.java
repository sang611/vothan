/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
public class Ps {
     private int tu, mau;

    public Ps(int t, int m) {
        this.tu = t;
        this.mau = m;
    }
    public int getTu()
    {
        return this.tu;
    }
    public int getMau()
    {
        return this.mau;
    }
    public void setTu(int tu)
    {
        this.tu = tu;
    }
    public void setMau(int mau)
    {
        this.mau = mau;
    }
    public int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0) {
            return b;
        } else if (a != 0 && b == 0) {
            return a;
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }
        return a;
    }

    void ToiGian() {
        int u = ucln(this.mau, this.tu);
        this.tu /= u;
        this.mau /= u;
       
    }

    void Cong(Ps p) {
        int ts = this.tu * p.mau + p.tu * this.mau;
        int ms = this.mau * p.mau;
        Ps kq = new Ps(ts, ms);
        kq.ToiGian();
        if(kq.tu % kq.mau == 0)
            System.out.println("Tong = " + kq.tu/kq.mau);
        else
        System.out.println("Tong = " + kq.tu + "/" + kq.mau);
    }

    void Tru(Ps p) {
        int ts = this.tu * p.mau - p.tu * this.mau;
        int ms = this.mau * p.mau;
        Ps kq = new Ps(ts, ms);
        kq.ToiGian();
        if(kq.tu % kq.mau == 0)
            System.out.println("Hieu = " + kq.tu/kq.mau);
        else
        System.out.println("Hieu = " + kq.tu + "/" + kq.mau);
    }

    void Nhan(Ps p) {
        int ts = this.tu * p.tu;
        int ms = this.mau * p.mau;
        Ps kq = new Ps(ts, ms);
        kq.ToiGian();
        if(kq.tu % kq.mau == 0)
            System.out.println("Tich = " + kq.tu/kq.mau);
        else
        System.out.println("Tich = " + kq.tu + "/" + kq.mau);

    }

    void Chia(Ps p) {
        int ts = this.tu * p.mau;
        int ms = this.mau * p.tu;
        if (ms != 0) {
            Ps kq = new Ps(ts, ms);
            kq.ToiGian();
            if(kq.tu % kq.mau == 0)
            System.out.println("Thuong = " + kq.tu/kq.mau);
        else
            System.out.println("Thuong = " + kq.tu + "/" + kq.mau);
        }
        else
            System.out.println("NaN");
    }

    public boolean equals(Ps obj) {
        obj.ToiGian();
        this.ToiGian();
        if (obj.tu == this.tu && obj.mau == this.mau) {
            return true;
        }
        return false;
    }
}
