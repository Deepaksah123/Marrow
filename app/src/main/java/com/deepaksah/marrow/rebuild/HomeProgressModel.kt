package com.deepaksah.marrow.rebuild
data class HomeProgressModel(val qbank: QBankMetrics, val test: TestMetrics) {
    companion object { fun from(state: MarrowStateStore)=HomeProgressModel(
        QBankMetrics.from(state.session.mcqIds,state.session.answers), TestEngine.metrics(state.test)
    )}
}