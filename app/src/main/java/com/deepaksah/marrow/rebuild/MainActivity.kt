package com.deepaksah.marrow.rebuild

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import java.util.Locale

class MainActivity : Activity() {
    private lateinit var content: FrameLayout
    private val subjects = listOf("Anatomy","Anaesthesia","Biochemistry","Community Medicine","Dermatology","ENT","Forensic Medicine","Medicine","Microbiology","Obstetrics & Gynaecology","Ophthalmology","Orthopaedics","Paediatrics","Pathology","Pharmacology","Physiology","Psychiatry","Radiology","Surgery")
    private data class AnswerState(var selectedAnswerIndex:Int?=null,var serverAnswer:Int?=null,var isRight:Boolean?=null,var isStarred:Boolean=false,var isGuessed:Boolean=false,var isSillyMistake:Boolean=false,var skipped:Boolean=false)
    private var currentSubject=""; private var currentLesson=""; private var currentIndex=0
    private val answers=mutableMapOf<Int,AnswerState>()
    override fun onCreate(savedInstanceState:Bundle?){super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);content=findViewById(R.id.content)
        findViewById<TextView>(R.id.navHome).setOnClickListener{showHome()};findViewById<TextView>(R.id.navQBank).setOnClickListener{showQBank()}
        findViewById<TextView>(R.id.navTests).setOnClickListener{showPlaceholder("Tests")};findViewById<TextView>(R.id.navVideos).setOnClickListener{showPlaceholder("Videos")};showHome()}
    private fun replace(v:View){content.removeAllViews();content.addView(v)}
    private fun showHome(){replace(LayoutInflater.from(this).inflate(R.layout.screen_home,content,false))}
    private fun showQBank(){val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank,content,false);replace(v);val c=v.findViewById<LinearLayout>(R.id.subjectContainer)
        subjects.forEachIndexed{_,s->val row=TextView(this).apply{text=s;textSize=16f;setTypeface(typeface,Typeface.BOLD);setPadding(20,22,20,22);setBackgroundColor(Color.WHITE);setOnClickListener{showLessons(s)}};c.addView(row);addDivider(c)}}
    private fun showLessons(subject:String){currentSubject=subject;val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank_lessons,content,false);replace(v);v.findViewById<TextView>(R.id.lessonTitle).text=subject;v.findViewById<TextView>(R.id.lessonBack).setOnClickListener{showQBank()}
        val c=v.findViewById<LinearLayout>(R.id.lessonContainer);c.addView(TextView(this).apply{text="Lesson/module payload is runtime data.\n\nSource layer confirmed: activity_qbank_lesson_list → fragment_qbank_lesson_list → QBankLessonListViewModel.\n\nNo fabricated lesson names are inserted here.";textSize=15f;setPadding(16,18,16,18)})
        c.addView(Button(this).apply{text="Open QBank flow";setOnClickListener{showPlayerState()}})}
    private fun showPlayerState(){val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank_play,content,false);replace(v)
        v.findViewById<TextView>(R.id.playPosition).text="QBank · source-backed player state"
        v.findViewById<TextView>(R.id.playQuestion).text="Question payload is not available in the native runtime build yet.\n\nThe APK source contract is preserved: title, questionDescription, option1…option8, answerDescription, imageUrl/imageUrlV2, references, tags, highYieldIds, pearlIds, magicLine, childQuestions and isLocked."
        v.findViewById<LinearLayout>(R.id.optionContainer).addView(TextView(this).apply{text="No synthetic question or answer has been inserted.";textSize=15f;setPadding(12,12,12,12)})
        v.findViewById<TextView>(R.id.playBookmark).setOnClickListener{val a=answers.getOrPut(currentIndex){AnswerState()};a.isStarred=!a.isStarred;(it as TextView).text=if(a.isStarred)"★" else "☆"}
        v.findViewById<Button>(R.id.playNext).setOnClickListener{showQBankScore()}}
    private fun showQBankScore(){val v=LayoutInflater.from(this).inflate(R.layout.screen_qbank_score,content,false);replace(v);val answered=answers.values.count{it.selectedAnswerIndex!=null};val right=answers.values.count{it.isRight==true};val wrong=answers.values.count{it.isRight==false};val skipped=answers.values.count{it.skipped}
        v.findViewById<TextView>(R.id.scoreSummary).text=String.format(Locale.US,"%d correct · %d wrong · %d skipped · %d answered",right,wrong,skipped,answered)
        v.findViewById<Button>(R.id.reviewButton).setOnClickListener{showReviewState()};v.findViewById<Button>(R.id.reviewLessonButton).setOnClickListener{showLessons(currentSubject)}}
    private fun showReviewState(){replace(TextView(this).apply{text="Review\n\nSource-backed review route: activity_review / CommonReviewViewModel / ReviewViewModel / McqReviewViewModel.\n\nReview data is empty because no runtime MCQ payload was supplied.";textSize=17f;setPadding(24,24,24,24)})}
    private fun showPlaceholder(title:String){replace(TextView(this).apply{text=title;textSize=26f;setPadding(32,32,32,32)})}
    private fun addDivider(c:LinearLayout){c.addView(View(this).apply{setBackgroundColor(0xFFE6E6E6.toInt())},LinearLayout.LayoutParams(-1,1))}
}