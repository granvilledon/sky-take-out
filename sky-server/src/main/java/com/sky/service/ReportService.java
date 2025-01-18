package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 统计营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistic(LocalDate begin, LocalDate end);

    /**
     * 统计用户数据
     * @param begin
     * @param end
     * @return
     */
    UserReportVO getUserStatistic(LocalDate begin, LocalDate end);

    /**
     * 统计订单数据
     * @param begin
     * @param end
     * @return
     */
    OrderReportVO getOrderStatistic(LocalDate begin, LocalDate end);
}
