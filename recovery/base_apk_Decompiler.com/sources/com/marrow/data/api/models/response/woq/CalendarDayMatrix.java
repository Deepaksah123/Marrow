package com.marrow.data.api.models.response.woq;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/response/woq/CalendarDayMatrix;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow/data/api/models/response/woq/CalendarDayMatrix;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "count", "Ljava/lang/Integer;", "getCount", "date", "getDate", "dateTense", "getDateTense"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CalendarDayMatrix {
    private final Integer count;
    private final Integer date;
    private final Integer dateTense;

    public CalendarDayMatrix(@JsonProperty("count") Integer num, @JsonProperty("date") Integer num2, @JsonProperty("date_tense") Integer num3) {
        this.count = num;
        this.date = num2;
        this.dateTense = num3;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Integer getDate() {
        return this.date;
    }

    public final Integer getDateTense() {
        return this.dateTense;
    }

    public static /* synthetic */ CalendarDayMatrix copy$default(CalendarDayMatrix calendarDayMatrix, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = calendarDayMatrix.count;
        }
        if ((i & 2) != 0) {
            num2 = calendarDayMatrix.date;
        }
        if ((i & 4) != 0) {
            num3 = calendarDayMatrix.dateTense;
        }
        return calendarDayMatrix.copy(num, num2, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDateTense() {
        return this.dateTense;
    }

    public final CalendarDayMatrix copy(@JsonProperty("count") Integer p0, @JsonProperty("date") Integer p1, @JsonProperty("date_tense") Integer p2) {
        return new CalendarDayMatrix(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CalendarDayMatrix)) {
            return false;
        }
        CalendarDayMatrix calendarDayMatrix = (CalendarDayMatrix) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.count, calendarDayMatrix.count) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.date, calendarDayMatrix.date) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.dateTense, calendarDayMatrix.dateTense);
    }

    public final int hashCode() {
        Integer num = this.count;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.date;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.dateTense;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.count;
        Integer num2 = this.date;
        Integer num3 = this.dateTense;
        StringBuilder sb = new StringBuilder("CalendarDayMatrix(count=");
        sb.append(num);
        sb.append(", date=");
        sb.append(num2);
        sb.append(", dateTense=");
        sb.append(num3);
        sb.append(")");
        return sb.toString();
    }
}
