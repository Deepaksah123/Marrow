package com.deepaksah.marrow.rebuild

data class TestMetrics(val total:Int,val attempted:Int,val correct:Int,val wrong:Int,val skipped:Int){
    val accuracy:Double get()=if(attempted==0)0.0 else correct.toDouble()/attempted*100.0
}
object TestEngine{
    fun metrics(ids:List<String>,answers:Map<String,McqAnswerState>):TestMetrics{
        val rows=ids.mapNotNull{answers[it]}
        val attempted=rows.count{it.selectedAnswer!=null&&!it.skipped}
        val correct=rows.count{it.isRight==true}
        val wrong=rows.count{it.isRight==false&&!it.skipped}
        val skipped=rows.count{it.skipped}
        return TestMetrics(ids.size,attempted,correct,wrong,skipped)
    }
}