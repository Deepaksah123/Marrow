package com.deepaksah.marrow.rebuild

class TestSession(private val state:MarrowStateStore){
    fun select(index:Int){
        val safe=index.coerceIn(0,(state.test.mcqIds.size-1).coerceAtLeast(0))
        state.test=state.test.copy(currentIndex=safe)
    }
    fun submit(){
        state.test=state.test.copy(submissionInProcess=false,reviewState=true)
        state.navigate(MarrowRoute.TEST_SCORE)
    }
}