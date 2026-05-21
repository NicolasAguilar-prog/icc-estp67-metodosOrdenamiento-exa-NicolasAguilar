package controllers;

import models.Brand;

public class BrandController {


    public Brand[] sortBubbleDesc(Brand[] brands) {
        for (int i = 0; i < brands.length - 1; i++) {
            for (int j = 0; j < brands.length - i - 1; j++) {
                if (brands[j].getTotalValidYears() < brands[j + 1].getTotalValidYears()) {
                    Brand temp = brands[j];
                    brands[j] = brands[j + 1];
                    brands[j + 1] = temp;
                }
            }
        }

        return brands;
    }

    public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int currentValidYears = brands[middle].getTotalValidYears();

            if (currentValidYears == validYears) {
                return brands[middle];
            }

            if (isAscending) {
                if (validYears < currentValidYears) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (validYears > currentValidYears) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }

        return null;
    }
}
