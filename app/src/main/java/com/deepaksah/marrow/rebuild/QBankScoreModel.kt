package com.deepaksah.marrow.rebuild
data class QBankScoreModel(val metrics: QBankMetrics, val completionPercent: Double) {
    companion object { fun from(ids: List<String>, answers: Map<String, McqAnswerState>): QBankScoreModel {
        val m=QBankMetrics.from(ids,answers)
        return QBankScoreModel(m, if(m.total==0) 0.0 else (m.attempted+m.skipped).toDouble()/m.total*100.0)
    }}
}