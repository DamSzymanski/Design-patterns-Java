package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CompanyLisc lisc1 = new CompanyLisc(1, "Liściasty", "Brzoza");
        CompanyLisc lisc2 = new CompanyLisc(2, "Iglasty", "Sosna");

        CompanyLisc engDirectory = new CompanyLisc();

        engDirectory.addLisc(lisc1);
        engDirectory.addLisc(lisc2);

        System.out.println("1:" + engDirectory);

        engDirectory.removeLisc(lisc2);

        CompanyLisc directory = new CompanyLisc();
        directory.addLisc(engDirectory);
        directory.showLisc();

        System.out.println("2:" + engDirectory);

    }
}


class CompanyLisc implements Lisc
{
    private List<Lisc> liscList = new ArrayList<Lisc>();

    public CompanyLisc() {

    }

    @Override
    public void showLisc()
    {
        for(Lisc lst:liscList)
        {
            lst.showLisc();
        }
    }

    public void addLisc(Lisc emp)
    {
        liscList.add(emp);
    }

    public void removeLisc(Lisc emp)
    {
        liscList.remove(emp);
    }

    private String name;
    private long empId;
    private String position;

    public CompanyLisc(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
}

interface Lisc
{
    public void showLisc();
}

