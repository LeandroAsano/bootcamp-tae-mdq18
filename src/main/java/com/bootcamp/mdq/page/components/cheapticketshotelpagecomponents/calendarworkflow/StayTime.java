package com.bootcamp.mdq.page.components.cheapticketshotelpagecomponents.calendarworkflow;

import java.time.LocalDate;


public class StayTime {

    private LocalDate checkInDate;

    private LocalDate checkOutDate;


    public StayTime(LocalDate checkInDate, int stayTimeByDays) {

        this.checkInDate = checkInDate;
        this.checkOutDate = LocalDate.of(
                this.getCheckInDate().getYear() ,
                this.getCheckInDate().getMonth(),
                this.getCheckInDate().getDayOfMonth()
                ).plusDays(stayTimeByDays);
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

}
