package com.marrow2.data.lesson.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JN\u0010\u0015\u001a\u00020\u00002\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0013"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/QBankStatsResponse;", "", "", "Lcom/marrow2/data/lesson/remote/model/CalendarDayMatrix;", "p0", "Lcom/marrow2/data/lesson/remote/model/CurrentQuery;", "p1", "p2", "", "p3", "p4", "<init>", "(Ljava/util/List;Lcom/marrow2/data/lesson/remote/model/CurrentQuery;Lcom/marrow2/data/lesson/remote/model/CurrentQuery;II)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/marrow2/data/lesson/remote/model/CurrentQuery;", "component3", "component4", "()I", "component5", "copy", "(Ljava/util/List;Lcom/marrow2/data/lesson/remote/model/CurrentQuery;Lcom/marrow2/data/lesson/remote/model/CurrentQuery;II)Lcom/marrow2/data/lesson/remote/model/QBankStatsResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "calendarDayMatrix", "Ljava/util/List;", "getCalendarDayMatrix", "nextQuery", "Lcom/marrow2/data/lesson/remote/model/CurrentQuery;", "getNextQuery", "prevQuery", "getPrevQuery", "totalModule", "I", "getTotalModule", "totalSolvedModule", "getTotalSolvedModule"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QBankStatsResponse {
    public static final int $stable = 8;
    private final List<List<CalendarDayMatrix>> calendarDayMatrix;
    private final CurrentQuery nextQuery;
    private final CurrentQuery prevQuery;
    private final int totalModule;
    private final int totalSolvedModule;

    /* JADX WARN: Multi-variable type inference failed */
    public QBankStatsResponse(@JsonProperty("calendar_day_matrix") List<? extends List<CalendarDayMatrix>> list, @JsonProperty("next_query") CurrentQuery currentQuery, @JsonProperty("prev_query") CurrentQuery currentQuery2, @JsonProperty("total_module") int i, @JsonProperty("total_solved_module") int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(currentQuery2, "");
        this.calendarDayMatrix = list;
        this.nextQuery = currentQuery;
        this.prevQuery = currentQuery2;
        this.totalModule = i;
        this.totalSolvedModule = i2;
    }

    public final List<List<CalendarDayMatrix>> getCalendarDayMatrix() {
        return this.calendarDayMatrix;
    }

    public final CurrentQuery getNextQuery() {
        return this.nextQuery;
    }

    public final CurrentQuery getPrevQuery() {
        return this.prevQuery;
    }

    public final int getTotalModule() {
        return this.totalModule;
    }

    public final int getTotalSolvedModule() {
        return this.totalSolvedModule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QBankStatsResponse copy$default(QBankStatsResponse qBankStatsResponse, List list, CurrentQuery currentQuery, CurrentQuery currentQuery2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = qBankStatsResponse.calendarDayMatrix;
        }
        if ((i3 & 2) != 0) {
            currentQuery = qBankStatsResponse.nextQuery;
        }
        CurrentQuery currentQuery3 = currentQuery;
        if ((i3 & 4) != 0) {
            currentQuery2 = qBankStatsResponse.prevQuery;
        }
        CurrentQuery currentQuery4 = currentQuery2;
        if ((i3 & 8) != 0) {
            i = qBankStatsResponse.totalModule;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = qBankStatsResponse.totalSolvedModule;
        }
        return qBankStatsResponse.copy(list, currentQuery3, currentQuery4, i4, i2);
    }

    public final List<List<CalendarDayMatrix>> component1() {
        return this.calendarDayMatrix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrentQuery getNextQuery() {
        return this.nextQuery;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CurrentQuery getPrevQuery() {
        return this.prevQuery;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalModule() {
        return this.totalModule;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalSolvedModule() {
        return this.totalSolvedModule;
    }

    public final QBankStatsResponse copy(@JsonProperty("calendar_day_matrix") List<? extends List<CalendarDayMatrix>> p0, @JsonProperty("next_query") CurrentQuery p1, @JsonProperty("prev_query") CurrentQuery p2, @JsonProperty("total_module") int p3, @JsonProperty("total_solved_module") int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new QBankStatsResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof QBankStatsResponse)) {
            return false;
        }
        QBankStatsResponse qBankStatsResponse = (QBankStatsResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.calendarDayMatrix, qBankStatsResponse.calendarDayMatrix) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.nextQuery, qBankStatsResponse.nextQuery) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.prevQuery, qBankStatsResponse.prevQuery) && this.totalModule == qBankStatsResponse.totalModule && this.totalSolvedModule == qBankStatsResponse.totalSolvedModule;
    }

    public final int hashCode() {
        return (((((((this.calendarDayMatrix.hashCode() * 31) + this.nextQuery.hashCode()) * 31) + this.prevQuery.hashCode()) * 31) + Integer.hashCode(this.totalModule)) * 31) + Integer.hashCode(this.totalSolvedModule);
    }

    public final String toString() {
        List<List<CalendarDayMatrix>> list = this.calendarDayMatrix;
        CurrentQuery currentQuery = this.nextQuery;
        CurrentQuery currentQuery2 = this.prevQuery;
        int i = this.totalModule;
        int i2 = this.totalSolvedModule;
        StringBuilder sb = new StringBuilder("QBankStatsResponse(calendarDayMatrix=");
        sb.append(list);
        sb.append(", nextQuery=");
        sb.append(currentQuery);
        sb.append(", prevQuery=");
        sb.append(currentQuery2);
        sb.append(", totalModule=");
        sb.append(i);
        sb.append(", totalSolvedModule=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
