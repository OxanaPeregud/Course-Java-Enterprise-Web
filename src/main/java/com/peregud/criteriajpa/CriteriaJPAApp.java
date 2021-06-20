package com.peregud.criteriajpa;

import com.peregud.criteriajpa.util.CriteriaUtil;
import com.peregud.criteriajpa.util.DataGeneratorUtil;
import com.peregud.criteriajpa.util.HibernateUtil;

import java.util.Arrays;

public class CriteriaJPAApp {
    public static void main(String[] args) {
        DataGeneratorUtil.saveData(10);
        System.out.println(Arrays.toString(CriteriaUtil.greaterThanCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.lessThanCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.likeCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.likeCaseCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.betweenCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.inCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.nullCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.notNullCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.twoCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.andLogicalCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.orLogicalCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.sortingCriteria()));
        System.out.println(Arrays.toString(CriteriaUtil.projectionRowCount()));
        System.out.println(Arrays.toString(CriteriaUtil.projectionAverage()));
        System.out.println(Arrays.toString(CriteriaUtil.projectionSum()));
        System.out.println(CriteriaUtil.checkIfCriteriaTimeLower());
        HibernateUtil.close();
    }
}
