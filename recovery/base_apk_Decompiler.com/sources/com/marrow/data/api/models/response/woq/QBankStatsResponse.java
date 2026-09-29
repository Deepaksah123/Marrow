package com.marrow.data.api.models.response.woq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0094\u0001\u0010#\u001a\u00020\u00002\u0014\b\u0003\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\t2\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010 R#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u00100\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0017R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0017R\u001a\u00104\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001bR\u001a\u00109\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001bR\u001a\u0010;\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001bR\u001a\u0010=\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010 R\u001a\u0010@\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\bA\u0010 R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010\u0015"}, d2 = {"Lcom/marrow/data/api/models/response/woq/QBankStatsResponse;", "", "", "Lcom/marrow/data/api/models/response/woq/CalendarDayMatrix;", "p0", "Lcom/marrow/data/api/models/response/woq/CurrentQuery;", "p1", "p2", "p3", "", "p4", "p5", "p6", "p7", "", "p8", "p9", "p10", "<init>", "(Ljava/util/List;Lcom/marrow/data/api/models/response/woq/CurrentQuery;Lcom/marrow/data/api/models/response/woq/CurrentQuery;Lcom/marrow/data/api/models/response/woq/CurrentQuery;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/marrow/data/api/models/response/woq/CurrentQuery;", "component3", "component4", "component5", "()I", "component6", "component7", "component8", "component9", "()Ljava/lang/String;", "component10", "component11", "copy", "(Ljava/util/List;Lcom/marrow/data/api/models/response/woq/CurrentQuery;Lcom/marrow/data/api/models/response/woq/CurrentQuery;Lcom/marrow/data/api/models/response/woq/CurrentQuery;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/marrow/data/api/models/response/woq/QBankStatsResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "calendarDayMatrix", "Ljava/util/List;", "getCalendarDayMatrix", "currQuery", "Lcom/marrow/data/api/models/response/woq/CurrentQuery;", "getCurrQuery", "nextQuery", "getNextQuery", "prevQuery", "getPrevQuery", "totalMcq", "I", "getTotalMcq", "totalModule", "getTotalModule", "totalSolvedMcq", "getTotalSolvedMcq", "totalSolvedModule", "getTotalSolvedModule", "userId", "Ljava/lang/String;", "getUserId", "userTimezone", "getUserTimezone", "weekDays", "getWeekDays"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QBankStatsResponse {
    private final List<List<CalendarDayMatrix>> calendarDayMatrix;
    private final CurrentQuery currQuery;
    private final CurrentQuery nextQuery;
    private final CurrentQuery prevQuery;
    private final int totalMcq;
    private final int totalModule;
    private final int totalSolvedMcq;
    private final int totalSolvedModule;
    private final String userId;
    private final String userTimezone;
    private final List<String> weekDays;

    /* JADX WARN: Multi-variable type inference failed */
    public QBankStatsResponse(@JsonProperty("calendar_day_matrix") List<? extends List<CalendarDayMatrix>> list, @JsonProperty("curr_query") CurrentQuery currentQuery, @JsonProperty("next_query") CurrentQuery currentQuery2, @JsonProperty("prev_query") CurrentQuery currentQuery3, @JsonProperty("total_mcq") int i, @JsonProperty("total_module") int i2, @JsonProperty("total_solved_mcq") int i3, @JsonProperty("total_solved_module") int i4, @JsonProperty("user_id") String str, @JsonProperty("user_timezone") String str2, @JsonProperty("week_days") List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.calendarDayMatrix = list;
        this.currQuery = currentQuery;
        this.nextQuery = currentQuery2;
        this.prevQuery = currentQuery3;
        this.totalMcq = i;
        this.totalModule = i2;
        this.totalSolvedMcq = i3;
        this.totalSolvedModule = i4;
        this.userId = str;
        this.userTimezone = str2;
        this.weekDays = list2;
    }

    public final List<List<CalendarDayMatrix>> getCalendarDayMatrix() {
        return this.calendarDayMatrix;
    }

    public final CurrentQuery getCurrQuery() {
        return this.currQuery;
    }

    public final CurrentQuery getNextQuery() {
        return this.nextQuery;
    }

    public final CurrentQuery getPrevQuery() {
        return this.prevQuery;
    }

    public final int getTotalMcq() {
        return this.totalMcq;
    }

    public final int getTotalModule() {
        return this.totalModule;
    }

    public final int getTotalSolvedMcq() {
        return this.totalSolvedMcq;
    }

    public final int getTotalSolvedModule() {
        return this.totalSolvedModule;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserTimezone() {
        return this.userTimezone;
    }

    public final List<String> getWeekDays() {
        return this.weekDays;
    }

    public final List<List<CalendarDayMatrix>> component1() {
        return this.calendarDayMatrix;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserTimezone() {
        return this.userTimezone;
    }

    public final List<String> component11() {
        return this.weekDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrentQuery getCurrQuery() {
        return this.currQuery;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CurrentQuery getNextQuery() {
        return this.nextQuery;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CurrentQuery getPrevQuery() {
        return this.prevQuery;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalMcq() {
        return this.totalMcq;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalModule() {
        return this.totalModule;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalSolvedMcq() {
        return this.totalSolvedMcq;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTotalSolvedModule() {
        return this.totalSolvedModule;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final QBankStatsResponse copy(@JsonProperty("calendar_day_matrix") List<? extends List<CalendarDayMatrix>> p0, @JsonProperty("curr_query") CurrentQuery p1, @JsonProperty("next_query") CurrentQuery p2, @JsonProperty("prev_query") CurrentQuery p3, @JsonProperty("total_mcq") int p4, @JsonProperty("total_module") int p5, @JsonProperty("total_solved_mcq") int p6, @JsonProperty("total_solved_module") int p7, @JsonProperty("user_id") String p8, @JsonProperty("user_timezone") String p9, @JsonProperty("week_days") List<String> p10) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        toMagicModuleMetaRepoModel.write(p10, "");
        return new QBankStatsResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof QBankStatsResponse)) {
            return false;
        }
        QBankStatsResponse qBankStatsResponse = (QBankStatsResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.calendarDayMatrix, qBankStatsResponse.calendarDayMatrix) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.currQuery, qBankStatsResponse.currQuery) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.nextQuery, qBankStatsResponse.nextQuery) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.prevQuery, qBankStatsResponse.prevQuery) && this.totalMcq == qBankStatsResponse.totalMcq && this.totalModule == qBankStatsResponse.totalModule && this.totalSolvedMcq == qBankStatsResponse.totalSolvedMcq && this.totalSolvedModule == qBankStatsResponse.totalSolvedModule && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) qBankStatsResponse.userId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userTimezone, (Object) qBankStatsResponse.userTimezone) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.weekDays, qBankStatsResponse.weekDays);
    }

    public final int hashCode() {
        int iHashCode = this.calendarDayMatrix.hashCode();
        int iHashCode2 = this.currQuery.hashCode();
        CurrentQuery currentQuery = this.nextQuery;
        int iHashCode3 = currentQuery == null ? 0 : currentQuery.hashCode();
        CurrentQuery currentQuery2 = this.prevQuery;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (currentQuery2 != null ? currentQuery2.hashCode() : 0)) * 31) + Integer.hashCode(this.totalMcq)) * 31) + Integer.hashCode(this.totalModule)) * 31) + Integer.hashCode(this.totalSolvedMcq)) * 31) + Integer.hashCode(this.totalSolvedModule)) * 31) + this.userId.hashCode()) * 31) + this.userTimezone.hashCode()) * 31) + this.weekDays.hashCode();
    }

    public final String toString() {
        List<List<CalendarDayMatrix>> list = this.calendarDayMatrix;
        CurrentQuery currentQuery = this.currQuery;
        CurrentQuery currentQuery2 = this.nextQuery;
        CurrentQuery currentQuery3 = this.prevQuery;
        int i = this.totalMcq;
        int i2 = this.totalModule;
        int i3 = this.totalSolvedMcq;
        int i4 = this.totalSolvedModule;
        String str = this.userId;
        String str2 = this.userTimezone;
        List<String> list2 = this.weekDays;
        StringBuilder sb = new StringBuilder("QBankStatsResponse(calendarDayMatrix=");
        sb.append(list);
        sb.append(", currQuery=");
        sb.append(currentQuery);
        sb.append(", nextQuery=");
        sb.append(currentQuery2);
        sb.append(", prevQuery=");
        sb.append(currentQuery3);
        sb.append(", totalMcq=");
        sb.append(i);
        sb.append(", totalModule=");
        sb.append(i2);
        sb.append(", totalSolvedMcq=");
        sb.append(i3);
        sb.append(", totalSolvedModule=");
        sb.append(i4);
        sb.append(", userId=");
        sb.append(str);
        sb.append(", userTimezone=");
        sb.append(str2);
        sb.append(", weekDays=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
