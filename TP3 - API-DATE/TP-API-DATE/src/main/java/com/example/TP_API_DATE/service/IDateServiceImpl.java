package com.example.TP_API_DATE.service;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

@Service
public class IDateServiceImpl implements IDateService {
    @Override
    public int getWeekOfYear() {
        return LocalDate.now().get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
    }

    @Override
    public int getMonth() {
        return LocalDate.now().getMonthValue();
    }

    @Override
    public int getDay() {
        return LocalDate.now().getDayOfMonth();
    }

    @Override
    public int getYear() {
        return LocalDate.now().getYear();
    }

    @Override
    public boolean isLeap() {
        return LocalDate.now().isLeapYear();
    }
}
