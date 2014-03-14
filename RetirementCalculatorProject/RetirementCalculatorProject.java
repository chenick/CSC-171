import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class RetirementCalculatorProject extends javax.swing.JFrame {
    private Graphics Graphics;
    
    public RetirementCalculatorProject() {
        initComponents();
    }
                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SavingsGroup = new javax.swing.ButtonGroup();
        CompoundingGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        DailySavingsRadio = new javax.swing.JRadioButton();
        MonthlySavingsRadio = new javax.swing.JRadioButton();
        AnnualSavingsRadio = new javax.swing.JRadioButton();
        SavingsField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DailyCompoundingRadio = new javax.swing.JRadioButton();
        MonthlyCompoundingRadio = new javax.swing.JRadioButton();
        AnnualCompoundingRadio = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        CurrentAgeField = new javax.swing.JTextField();
        RetirementAgeField = new javax.swing.JTextField();
        LifeExpectancyField = new javax.swing.JTextField();
        CurrentAgeLabel = new javax.swing.JLabel();
        RetirementAgeLabel = new javax.swing.JLabel();
        LifeExpectancyLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        StartingBalanceLabel = new javax.swing.JLabel();
        StartBalField = new javax.swing.JTextField();
        RetirementIncomeLabel = new javax.swing.JLabel();
        RetirementIncomeField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        InterestRateLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InterestRateField = new javax.swing.JTextField();
        InflationRateLabel = new javax.swing.JLabel();
        InflationField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        RetirementCalculatorLabel = new javax.swing.JLabel();
        CalculateSavingsButton = new javax.swing.JButton();
        javax.swing.JLabel TotalSavingsLabel = new javax.swing.JLabel();
        TotalSavingsField = new javax.swing.JTextField();
        BGP = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Savings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lantinghei SC", 0, 18))); // NOI18N

        SavingsGroup.add(DailySavingsRadio);
        DailySavingsRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        DailySavingsRadio.setText("Daily");

        SavingsGroup.add(MonthlySavingsRadio);
        MonthlySavingsRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        MonthlySavingsRadio.setText("Monthly");
        MonthlySavingsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlySavingsRadioActionPerformed(evt);
            }
        });

        SavingsGroup.add(AnnualSavingsRadio);
        AnnualSavingsRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        AnnualSavingsRadio.setText("Annually");

        SavingsField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        SavingsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        jLabel9.setText("($)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DailySavingsRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MonthlySavingsRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnnualSavingsRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SavingsField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(DailySavingsRadio)
                .addComponent(MonthlySavingsRadio)
                .addComponent(AnnualSavingsRadio)
                .addComponent(SavingsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compounding", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lantinghei SC", 0, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        CompoundingGroup.add(DailyCompoundingRadio);
        DailyCompoundingRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        DailyCompoundingRadio.setText("Daily");

        CompoundingGroup.add(MonthlyCompoundingRadio);
        MonthlyCompoundingRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        MonthlyCompoundingRadio.setText("Monthly");

        CompoundingGroup.add(AnnualCompoundingRadio);
        AnnualCompoundingRadio.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        AnnualCompoundingRadio.setText("Annually");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(DailyCompoundingRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MonthlyCompoundingRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnnualCompoundingRadio))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DailyCompoundingRadio)
                    .addComponent(MonthlyCompoundingRadio)
                    .addComponent(AnnualCompoundingRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Age", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lantinghei SC", 0, 18))); // NOI18N

        CurrentAgeField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        RetirementAgeField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        LifeExpectancyField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        CurrentAgeLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        CurrentAgeLabel.setText("Current Age:");

        RetirementAgeLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        RetirementAgeLabel.setText("Retirement Age:");

        LifeExpectancyLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        LifeExpectancyLabel.setText("Life Expectancy:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RetirementAgeLabel)
                            .addComponent(CurrentAgeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RetirementAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CurrentAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(LifeExpectancyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LifeExpectancyField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentAgeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetirementAgeLabel)
                    .addComponent(RetirementAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LifeExpectancyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LifeExpectancyLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Income", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lantinghei SC", 0, 18))); // NOI18N

        StartingBalanceLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13));
        StartingBalanceLabel.setText("Starting Balance:");

        StartBalField.setFont(new java.awt.Font("Lantinghei SC", 0, 13));

        RetirementIncomeLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13));
        RetirementIncomeLabel.setText("Retirement Income:");

        RetirementIncomeField.setFont(new java.awt.Font("Lantinghei SC", 0, 13));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RetirementIncomeLabel)
                    .addComponent(StartingBalanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartBalField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(RetirementIncomeField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartingBalanceLabel)
                    .addComponent(StartBalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetirementIncomeLabel)
                    .addComponent(RetirementIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Economics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lantinghei SC", 0, 18))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        InterestRateLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        InterestRateLabel.setText("Interest Rate:");

        jLabel5.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        jLabel5.setText("%");

        InterestRateField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        InflationRateLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        InflationRateLabel.setText("Inflation Rate:");

        InflationField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N
        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InflationRateLabel)
                    .addComponent(InterestRateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(InterestRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(InflationField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InterestRateLabel)
                    .addComponent(jLabel5)
                    .addComponent(InterestRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InflationRateLabel)
                    .addComponent(InflationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ClearButton.setFont(new java.awt.Font("Lantinghei SC", 0, 14)); // NOI18N
        ClearButton.setText("Clear Inputs");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        RetirementCalculatorLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 36)); // NOI18N
        RetirementCalculatorLabel.setText("RETIREMENT CALCULATOR");

        CalculateSavingsButton.setFont(new java.awt.Font("Lantinghei SC", 0, 14)); // NOI18N
        CalculateSavingsButton.setText("Calculate Savings");
        CalculateSavingsButton.setToolTipText("");
        CalculateSavingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateSavingsButtonActionPerformed(evt);
            }
        });

        TotalSavingsLabel.setFont(new java.awt.Font("Lantinghei SC", 0, 18)); // NOI18N
        TotalSavingsLabel.setText("TOTAL SAVINGS:");

        TotalSavingsField.setFont(new java.awt.Font("Lantinghei SC", 0, 13)); // NOI18N

        javax.swing.GroupLayout BGPLayout = new javax.swing.GroupLayout(BGP);
        BGP.setLayout(BGPLayout);
        BGPLayout.setHorizontalGroup(
            BGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        BGPLayout.setVerticalGroup(
            BGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CalculateSavingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalSavingsField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalSavingsLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(RetirementCalculatorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(RetirementCalculatorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TotalSavingsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalSavingsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalculateSavingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void MonthlySavingsRadioActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        SavingsField.setText("");
        CurrentAgeField.setText("");
        RetirementAgeField.setText("");
        LifeExpectancyField.setText("");
        InterestRateField.setText("");
        InflationField.setText("");
        StartBalField.setText("");
        RetirementIncomeField.setText("");
        TotalSavingsField.setText("");
    }                                           

    private void SavingsFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void CalculateSavingsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        //Set Variables Equal to Amount in TextFields
        double savings = Double.parseDouble(SavingsField.getText());
        int currentAge = Integer.parseInt(CurrentAgeField.getText());
        int retirementAge = Integer.parseInt(RetirementAgeField.getText());
        int lifeExpectancy = Integer.parseInt(LifeExpectancyField.getText());
        double startingBalance = Double.parseDouble(StartBalField.getText());
        double retirementIncome = Double.parseDouble(RetirementIncomeField.getText());
        double interestRate = Double.parseDouble(InterestRateField.getText());
        double inflationRate = Double.parseDouble(InflationField.getText());
        double SavingPeriod = 0;
        if(DailySavingsRadio.isSelected())
            SavingPeriod = 360;
        else if(MonthlySavingsRadio.isSelected())
            SavingPeriod = 12;
        else if(AnnualSavingsRadio.isSelected())
            SavingPeriod = 1;
        double CompoundingPeriod = 0;
        if(DailyCompoundingRadio.isSelected())
            CompoundingPeriod = 360;
        else if(MonthlyCompoundingRadio.isSelected())
            CompoundingPeriod = 12;
        else if(AnnualCompoundingRadio.isSelected())
            CompoundingPeriod = 1;
        
        //Call CalculateSavings()
        Double[] TempTotal = CalculateSavings(savings, currentAge, retirementAge, lifeExpectancy, startingBalance, retirementIncome, interestRate, inflationRate, SavingPeriod, CompoundingPeriod);
        String TS = Double.toString(TempTotal[lifeExpectancy-currentAge]);
        String[] parts = TS.split("\\.");
        String wholeNum = parts[0];
        String fracNum = parts[1];
        int decimals = fracNum.length();
        if(decimals == 1)
            fracNum = fracNum + "0";
        else if(decimals > 1)
            fracNum = fracNum.substring(0, 2);
            
        //Formats Savings Amount Displayed in Text Field
        TotalSavingsField.setText("$" + wholeNum + "." + fracNum);
        
        //Initialize Bar Graph
        InternalBarGraphPanel ibgp = new InternalBarGraphPanel(TempTotal, currentAge, retirementAge, lifeExpectancy, wholeNum, fracNum);
        ibgp.setVisible(true);
        ibgp.setSize(854, 300);
        BGP.add(ibgp);
        BGP.validate();
        ibgp.repaint();
    }                                                      
    

    
    public static Double[] CalculateSavings(double sav, int ca, int ra, int le, double sb, double ri, double interest, double inflation, double sp, double cp)
    {
        double total = 0.0;
        double monthlyInterest = interest/12;
        double dailyInterest = interest/360;
        double inflationFactor = 1 - (inflation/100); 
        
        Double[] careerSavingsList = new Double[(ra-ca)+1];
        Double[] retirementSavingsList = new Double[(le-ra)+1];
        Double[] MonthlyTemp = new Double[((ra-ca)*12)+1];
        Double[] DailyTemp = new Double[((ra-ca)*360)+1];
        
        careerSavingsList[0] = sb;
        MonthlyTemp[0] = sb;
        retirementSavingsList[0] = 0.0;
        
        //Annual Savings & Annual Compounding
        if((sp == 1) && (cp == 1))
        {
            for(int a = 0; a < ra-ca; a++)
                careerSavingsList[a+1] = ((careerSavingsList[a] * (1.0 + (interest/100.0))) + sav) * inflationFactor;
        }
        //annual savings & monthly compounding
        else if((sp == 1) && (cp == 12))
        {
            for(int a = 0; a < ((ra-ca)*12); a++)
            {
                MonthlyTemp[a+1] = MonthlyTemp[a] * (1.0 + (monthlyInterest/100.0));
                if(((a+1)%12) == 0)
                	careerSavingsList[(a+1)/12] = (MonthlyTemp[a+1] + sav) * inflationFactor;
            }
        }
        //annual savings & daily compounding
        else if((sp == 1) && (cp == 360))
        {
            for(int a = 0; a < ((ra-ca)*360); a++)
            {
                DailyTemp[a+1] = DailyTemp[a] * (1.0 + (dailyInterest/100.0));
                if(((a+1)%360) == 0)
                	careerSavingsList[(a+1)/360] = (DailyTemp[a+1] + sav) * inflationFactor;
            }
        }
        //monthly savings & annual compounding
        else if((sp == 12) && (cp == 1))
        {
            for(int a = 1; a < ra-ca; a++)
                careerSavingsList[a] = ((careerSavingsList[a-1] * (1 + (interest/100))) + (12*sav)) * inflationFactor;
        }
        //monthly savings & monthly compounding
        else if((sp == 12) && (cp == 12))
        {
            for(int a = 1; a < (ra-ca)*12; a++)
            {
                careerSavingsList[a] = (careerSavingsList[a-1] * (1 + (monthlyInterest/100))) + sav;
                if(a%12 == 0)
                    careerSavingsList[a] = careerSavingsList[a] * inflationFactor;
            }
        }
        //monthly savings & daily compounding
        else if((sp == 12) && (cp == 360))
        {
            for(int a = 1; a < (ra-ca)*360; a++)
            {
                careerSavingsList[a] = (careerSavingsList[a-1] * (1 + (dailyInterest/100)));
                if((a%30) == 0)
                    careerSavingsList[a] = careerSavingsList[a] + sav;
                if((a%360) == 0)
                    careerSavingsList[a] = careerSavingsList[a] * inflationFactor;
            }
        }
        //daily savings & annual compounding
        else if((sp == 360) && (cp == 1))
        {
            for(int a = 1; a < ra-ca; a++)
                careerSavingsList[a] = ((careerSavingsList[a-1] * (1 + (interest/100))) + (360*sav)) * inflationFactor;
        }
        //daily savings & monthly compounding
        else if((sp == 360) && (cp == 12))
        {
            for(int a = 1; a < (ra-ca)*12; a++)
            {
                careerSavingsList[a] = (careerSavingsList[a-1] * (1 + (monthlyInterest/100))) + ((360*sav)/12);
                if((a%12) == 0)
                    careerSavingsList[a] = careerSavingsList[a] * inflationFactor;
            }
        }
        //daily savings & daily compounding
        else if((sp == 360) && (cp == 360))
        {
            for(int a = 1; a < (ra-ca)*360; a++)
            {
               careerSavingsList[a] = (careerSavingsList[a-1] * (1 + (dailyInterest/100))) + sav;
                if((a%360) == 0)
                    careerSavingsList[a] = careerSavingsList[a] * inflationFactor;
            }
        }
        //Calculate Retirement Income
        if(careerSavingsList[ra-ca] != 0.0)
        {
            retirementSavingsList[0] = careerSavingsList[ra-ca];
            for(int a = 1; a <= le-ra; a++)
                retirementSavingsList[a] = ((retirementSavingsList[a-1] * (1.0 + (interest/100.0))) + ri) * inflationFactor;
        }
        
        //New Array Concatenating Career Savings and Post-Retirement Savings
        Double[] LifeSavingsList = new Double[careerSavingsList.length + retirementSavingsList.length - 1];
        for (int a = 0; a <= ra-ca; a++){
        	LifeSavingsList[a] = careerSavingsList[a];
        }
        for (int b = 1; b <= le-ra; b++){
        	LifeSavingsList[(ra-ca)+b] = retirementSavingsList[b];
        }
        
        return LifeSavingsList;
    }
   
    public class InternalBarGraphPanel extends JPanel
    {
    	Double[] data;
    	int ca, ra, le;
    	String wn, fn;
    	
    	public InternalBarGraphPanel (Double[] data, int ca, int ra, int le, String wn, String fn)
    	{
    		this.data = data;
    		this.ca = ca;
    		this.ra = ra;
    		this.le = le;
    		this.wn = wn;
    		this.fn = fn;
    	}
    	
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
    		
    		g.setColor(Color.BLACK);
    		
    		int width = getWidth();
    		int height = getHeight();
    		
    		Double[] LIFESAVINGS = data;
    		
    		int BARWIDTH = ((width*4)/5)/(((LIFESAVINGS.length)*2)+1);
    		
    		int TALLESTBAR = (height*4)/5;
    		
    		int[] HEIGHTS = new int[LIFESAVINGS.length];
    		
    		//Creates new array of heights of bars, in pixels
    		for(int i = (LIFESAVINGS.length)-1; i >= 0; i--)
    		{
    			HEIGHTS[i] = intValue((LIFESAVINGS[i])/(LIFESAVINGS[(LIFESAVINGS.length)-1]) * (TALLESTBAR));	
    		}
    		
    		for(int i = 0; i <= (LIFESAVINGS.length)-1; i++)
    		{
    			g.setFont(new Font("Lantinghei SC", 0, 13));
    			g.setColor(Color.BLACK);
    			//Draw Bar
    			g.drawRect(((BARWIDTH*i*2)+BARWIDTH)+(width/10), (height/10)+(TALLESTBAR-HEIGHTS[i]), BARWIDTH, HEIGHTS[i]);
    			//Label Horizontal Axis
    			g.drawString(Integer.toString(ca+i), ((BARWIDTH*i*2)+BARWIDTH)+(width/10)+(BARWIDTH/2)-7, 290);
    			g.setColor(Color.GREEN);
    			g.fillRect(((BARWIDTH*i*2)+BARWIDTH)+(width/10), (height/10)+(TALLESTBAR-HEIGHTS[i]), BARWIDTH, HEIGHTS[i]);
    		}
    		
    		//Draw Axes
    		g.setColor(Color.BLACK);
    		g.drawLine(width/10, height/10, width/10, (height*9)/10);
    		g.drawLine(width/10, (height*9)/10, (width*9)/10, (height*9)/10);
    		//Label Horizontal Axis
    		
    		g.setFont(new Font("Lantinghei SC", 0, 20));
    		g.drawString("AGE", 750, 290);
    		g.drawString("SAVINGS", 35, 18);
    		//for()
    		g.setFont(new Font("Times New Roman", 0, 12));
    		g.drawString("$"+wn, 45, (height/10)+(TALLESTBAR-HEIGHTS[(LIFESAVINGS.length)-1])+13);
    		int tempwn = Integer.parseInt(wn);
    		int half = tempwn/2;
    		String halfLabel = Integer.toString(half);
    		g.drawString("$"+halfLabel, 45, 155);
    		
    		//g.drawString(Integer.toString(-10), (width/20)+(width)-5, (height/20)+(height/2)+12);
    		//g.drawString(Integer.toString(TALLESTBAR), (width/10)-5, TALLESTBAR);
        }
        
        private int intValue(double d) 
        {
    		String TS = Double.toString(d);
    		String[] parts = TS.split("\\.");
            String wholeNum = parts[0];
            int Number = Integer.parseInt(wholeNum);
    		return Number;
    	}
    }
    
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RetirementCalculatorProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetirementCalculatorProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetirementCalculatorProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetirementCalculatorProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirementCalculatorProject().setVisible(true);
            }
        });
    }
                   
    private javax.swing.JRadioButton AnnualCompoundingRadio;
    private javax.swing.JRadioButton AnnualSavingsRadio;
    private javax.swing.JPanel BGP;
    private javax.swing.JButton CalculateSavingsButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.ButtonGroup CompoundingGroup;
    private javax.swing.JTextField CurrentAgeField;
    private javax.swing.JLabel CurrentAgeLabel;
    private javax.swing.JRadioButton DailyCompoundingRadio;
    private javax.swing.JRadioButton DailySavingsRadio;
    private javax.swing.JTextField InflationField;
    private javax.swing.JLabel InflationRateLabel;
    private javax.swing.JTextField InterestRateField;
    private javax.swing.JLabel InterestRateLabel;
    private javax.swing.JTextField LifeExpectancyField;
    private javax.swing.JLabel LifeExpectancyLabel;
    private javax.swing.JRadioButton MonthlyCompoundingRadio;
    private javax.swing.JRadioButton MonthlySavingsRadio;
    private javax.swing.JTextField RetirementAgeField;
    private javax.swing.JLabel RetirementAgeLabel;
    private javax.swing.JLabel RetirementCalculatorLabel;
    private javax.swing.JTextField RetirementIncomeField;
    private javax.swing.JLabel RetirementIncomeLabel;
    private javax.swing.JTextField SavingsField;
    private javax.swing.ButtonGroup SavingsGroup;
    private javax.swing.JTextField StartBalField;
    private javax.swing.JLabel StartingBalanceLabel;
    private javax.swing.JTextField TotalSavingsField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;              
}
