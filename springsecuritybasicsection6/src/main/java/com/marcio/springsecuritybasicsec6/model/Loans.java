package com.marcio.springsecuritybasicsec6.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native")
    @Column(name = "loan_number")
    private int loanNumber;
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "start_dt")
    private Date startDt;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "total_loan")
    private int totalLoan;
    @Column(name = "amount_paid")
    private int amountPaid;
    @Column(name = "outstanding_amount")
    private int outstandingAmount;
    @Column(name = "create_at")
    @CreationTimestamp
    private String createAt;

    public Integer getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(Integer loanNumber) {
        this.loanNumber = loanNumber;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}

