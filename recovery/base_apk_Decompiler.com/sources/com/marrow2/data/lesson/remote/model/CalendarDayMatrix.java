package com.marrow2.data.lesson.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/CalendarDayMatrix;", "", "", "p0", "p1", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/marrow2/data/lesson/remote/model/CalendarDayMatrix;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "count", "I", "getCount", "date", "getDate"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CalendarDayMatrix {
    public static final int $stable = 0;
    private final int count;
    private final int date;

    public CalendarDayMatrix(@JsonProperty("count") int i, @JsonProperty("date") int i2) {
        this.count = i;
        this.date = i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDate() {
        return this.date;
    }

    public static /* synthetic */ CalendarDayMatrix copy$default(CalendarDayMatrix calendarDayMatrix, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = calendarDayMatrix.count;
        }
        if ((i3 & 2) != 0) {
            i2 = calendarDayMatrix.date;
        }
        return calendarDayMatrix.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    public final CalendarDayMatrix copy(@JsonProperty("count") int p0, @JsonProperty("date") int p1) {
        return new CalendarDayMatrix(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CalendarDayMatrix)) {
            return false;
        }
        CalendarDayMatrix calendarDayMatrix = (CalendarDayMatrix) p0;
        return this.count == calendarDayMatrix.count && this.date == calendarDayMatrix.date;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.count) * 31) + Integer.hashCode(this.date);
    }

    public final String toString() {
        int i = this.count;
        int i2 = this.date;
        StringBuilder sb = new StringBuilder("CalendarDayMatrix(count=");
        sb.append(i);
        sb.append(", date=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
