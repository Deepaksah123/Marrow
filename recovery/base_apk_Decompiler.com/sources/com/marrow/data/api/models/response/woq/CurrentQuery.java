package com.marrow.data.api.models.response.woq;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/marrow/data/api/models/response/woq/CurrentQuery;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/marrow/data/api/models/response/woq/CurrentQuery;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "month", "Ljava/lang/Integer;", "getMonth", "monthName", "Ljava/lang/String;", "getMonthName", "year", "getYear"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentQuery {
    private final Integer month;
    private final String monthName;
    private final Integer year;

    public CurrentQuery(@JsonProperty("month") Integer num, @JsonProperty("month_name") String str, @JsonProperty("year") Integer num2) {
        this.month = num;
        this.monthName = str;
        this.year = num2;
    }

    public final Integer getMonth() {
        return this.month;
    }

    public final String getMonthName() {
        return this.monthName;
    }

    public final Integer getYear() {
        return this.year;
    }

    public static /* synthetic */ CurrentQuery copy$default(CurrentQuery currentQuery, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = currentQuery.month;
        }
        if ((i & 2) != 0) {
            str = currentQuery.monthName;
        }
        if ((i & 4) != 0) {
            num2 = currentQuery.year;
        }
        return currentQuery.copy(num, str, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMonthName() {
        return this.monthName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getYear() {
        return this.year;
    }

    public final CurrentQuery copy(@JsonProperty("month") Integer p0, @JsonProperty("month_name") String p1, @JsonProperty("year") Integer p2) {
        return new CurrentQuery(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CurrentQuery)) {
            return false;
        }
        CurrentQuery currentQuery = (CurrentQuery) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.month, currentQuery.month) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.monthName, (Object) currentQuery.monthName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.year, currentQuery.year);
    }

    public final int hashCode() {
        Integer num = this.month;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.monthName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.year;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.month;
        String str = this.monthName;
        Integer num2 = this.year;
        StringBuilder sb = new StringBuilder("CurrentQuery(month=");
        sb.append(num);
        sb.append(", monthName=");
        sb.append(str);
        sb.append(", year=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
