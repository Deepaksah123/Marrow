package com.deepaksah.marrow.rebuild

data class TimerState(
    val startedAtMs: Long? = null,
    val durationMs: Long? = null,
    val paused: Boolean = false
) {
    fun remaining(nowMs: Long): Long? =
        if (startedAtMs == null || durationMs == null) null
        else (durationMs - (nowMs - startedAtMs)).coerceAtLeast(0L)
}