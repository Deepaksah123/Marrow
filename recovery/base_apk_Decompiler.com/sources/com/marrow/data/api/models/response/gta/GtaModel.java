package com.marrow.data.api.models.response.gta;

import android.os.Parcel;
import android.os.Parcelable;
import com.marrow.data.models.test.TopUser;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017Jp\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010!\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011J\u001d\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u0010\u0015\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00108\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010;R\"\u0010?\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00108\u001a\u0004\b@\u0010\u0017\"\u0004\bA\u0010;R$\u0010B\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010\u0011\"\u0004\bD\u0010-R$\u0010E\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010*\u001a\u0004\bF\u0010\u0011\"\u0004\bG\u0010-R\u001a\u0010H\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u0017"}, d2 = {"Lcom/marrow/data/api/models/response/gta/GtaModel;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZIIILjava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "component4", "()I", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ZIIILjava/lang/String;Ljava/lang/String;I)Lcom/marrow/data/api/models/response/gta/GtaModel;", "describeContents", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "score", "Ljava/lang/Integer;", "getScore", "setScore", "(Ljava/lang/Integer;)V", "isHighlighted", "Z", "setHighlighted", "(Z)V", "percentile", "I", "getPercentile", "setPercentile", "(I)V", "previousPercentile", "getPreviousPercentile", "setPreviousPercentile", "nextPercentile", "getNextPercentile", "setNextPercentile", "testName", "getTestName", "setTestName", "testDate", "getTestDate", "setTestDate", TopUser.KEY_RANK, "getRank"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GtaModel implements Parcelable {
    public static final Parcelable.Creator<GtaModel> CREATOR = new Creator();
    private String id;
    private boolean isHighlighted;
    private int nextPercentile;
    private int percentile;
    private int previousPercentile;
    private final int rank;
    private Integer score;
    private String testDate;
    private String testName;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GtaModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GtaModel createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new GtaModel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GtaModel[] newArray(int i) {
            return new GtaModel[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GtaModel(String str, Integer num, boolean z, int i, int i2, int i3, String str2, String str3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
        this.score = num;
        this.isHighlighted = z;
        this.percentile = i;
        this.previousPercentile = i2;
        this.nextPercentile = i3;
        this.testName = str2;
        this.testDate = str3;
        this.rank = i4;
    }

    public /* synthetic */ GtaModel(String str, Integer num, boolean z, int i, int i2, int i3, String str2, String str3, int i4, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, num, z, i, i2, i3, str2, str3, (i5 & 256) != 0 ? -1 : i4);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final void setScore(Integer num) {
        this.score = num;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public final void setHighlighted(boolean z) {
        this.isHighlighted = z;
    }

    public final int getPercentile() {
        return this.percentile;
    }

    public final void setPercentile(int i) {
        this.percentile = i;
    }

    public final int getPreviousPercentile() {
        return this.previousPercentile;
    }

    public final void setPreviousPercentile(int i) {
        this.previousPercentile = i;
    }

    public final int getNextPercentile() {
        return this.nextPercentile;
    }

    public final void setNextPercentile(int i) {
        this.nextPercentile = i;
    }

    public final String getTestName() {
        return this.testName;
    }

    public final void setTestName(String str) {
        this.testName = str;
    }

    public final String getTestDate() {
        return this.testDate;
    }

    public final void setTestDate(String str) {
        this.testDate = str;
    }

    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPercentile() {
        return this.percentile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPreviousPercentile() {
        return this.previousPercentile;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNextPercentile() {
        return this.nextPercentile;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTestName() {
        return this.testName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTestDate() {
        return this.testDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    public final GtaModel copy(String p0, Integer p1, boolean p2, int p3, int p4, int p5, String p6, String p7, int p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new GtaModel(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GtaModel)) {
            return false;
        }
        GtaModel gtaModel = (GtaModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) gtaModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.score, gtaModel.score) && this.isHighlighted == gtaModel.isHighlighted && this.percentile == gtaModel.percentile && this.previousPercentile == gtaModel.previousPercentile && this.nextPercentile == gtaModel.nextPercentile && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testName, (Object) gtaModel.testName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testDate, (Object) gtaModel.testDate) && this.rank == gtaModel.rank;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        Integer num = this.score;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isHighlighted);
        int iHashCode4 = Integer.hashCode(this.percentile);
        int iHashCode5 = Integer.hashCode(this.previousPercentile);
        int iHashCode6 = Integer.hashCode(this.nextPercentile);
        String str = this.testName;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.testDate;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.rank);
    }

    public final String toString() {
        String str = this.id;
        Integer num = this.score;
        boolean z = this.isHighlighted;
        int i = this.percentile;
        int i2 = this.previousPercentile;
        int i3 = this.nextPercentile;
        String str2 = this.testName;
        String str3 = this.testDate;
        int i4 = this.rank;
        StringBuilder sb = new StringBuilder("GtaModel(id=");
        sb.append(str);
        sb.append(", score=");
        sb.append(num);
        sb.append(", isHighlighted=");
        sb.append(z);
        sb.append(", percentile=");
        sb.append(i);
        sb.append(", previousPercentile=");
        sb.append(i2);
        sb.append(", nextPercentile=");
        sb.append(i3);
        sb.append(", testName=");
        sb.append(str2);
        sb.append(", testDate=");
        sb.append(str3);
        sb.append(", rank=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int iIntValue;
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.id);
        Integer num = this.score;
        if (num == null) {
            iIntValue = 0;
        } else {
            p0.writeInt(1);
            iIntValue = num.intValue();
        }
        p0.writeInt(iIntValue);
        p0.writeInt(this.isHighlighted ? 1 : 0);
        p0.writeInt(this.percentile);
        p0.writeInt(this.previousPercentile);
        p0.writeInt(this.nextPercentile);
        p0.writeString(this.testName);
        p0.writeString(this.testDate);
        p0.writeInt(this.rank);
    }
}
