package com.deepaksah.marrow.rebuild
data class SearchNavigationModel(val questionId:String,val moduleId:String,val index:Int) {
    companion object { fun resolve(registry:ContentRegistry,id:String):SearchNavigationModel? {
        val m=registry.findModuleForQuestion(id) ?: return null
        val ids=registry.questionIds(m); val i=ids.indexOf(id)
        return if(i>=0) SearchNavigationModel(id,m,i) else null
    }}
}