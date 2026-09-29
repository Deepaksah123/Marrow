package com.marrow.data.models.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0092\u0001\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0016J\u001d\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0016R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0016R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010;R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00108\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010;R\u001a\u0010?\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001cR\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bC\u0010\u0016R\u001c\u0010D\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u001fR\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\bH\u0010\u0016R$\u0010I\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010MR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010\u0019\"\u0004\bP\u0010;"}, d2 = {"Lcom/marrow/data/models/home/RecentUpdatesModel;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "p5", "Lcom/marrow/data/models/home/RecentUpdateSubjectDetails;", "p6", "p7", "Lcom/marrow/data/models/home/RecentUpdatesImage;", "p8", "Lcom/marrow/data/models/home/RecentUpdatesReferences;", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Lcom/marrow/data/models/home/RecentUpdateSubjectDetails;Ljava/lang/String;Lcom/marrow/data/models/home/RecentUpdatesImage;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()J", "component6", "component7", "()Lcom/marrow/data/models/home/RecentUpdateSubjectDetails;", "component8", "component9", "()Lcom/marrow/data/models/home/RecentUpdatesImage;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Lcom/marrow/data/models/home/RecentUpdateSubjectDetails;Ljava/lang/String;Lcom/marrow/data/models/home/RecentUpdatesImage;Ljava/util/List;)Lcom/marrow/data/models/home/RecentUpdatesModel;", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "Ljava/lang/String;", "getId", "description", "getDescription", "mcqList", "Ljava/util/List;", "getMcqList", "setMcqList", "(Ljava/util/List;)V", "pearlList", "getPearlList", "setPearlList", "publishedOnMs", "J", "getPublishedOnMs", "referenceLink", "getReferenceLink", "subjectDetails", "Lcom/marrow/data/models/home/RecentUpdateSubjectDetails;", "getSubjectDetails", "title", "getTitle", "image", "Lcom/marrow/data/models/home/RecentUpdatesImage;", "getImage", "setImage", "(Lcom/marrow/data/models/home/RecentUpdatesImage;)V", "tagsList", "getTagsList", "setTagsList"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesModel implements Parcelable {
    public static final Parcelable.Creator<RecentUpdatesModel> CREATOR = new Creator();
    private final String description;
    private final String id;
    private RecentUpdatesImage image;
    private List<String> mcqList;
    private List<Integer> pearlList;
    private final long publishedOnMs;
    private final String referenceLink;
    private final RecentUpdateSubjectDetails subjectDetails;
    private List<RecentUpdatesReferences> tagsList;
    private final String title;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecentUpdatesModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentUpdatesModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            toMagicModuleMetaRepoModel.write(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            ArrayList arrayList3 = arrayList;
            long j = parcel.readLong();
            String string3 = parcel.readString();
            RecentUpdateSubjectDetails recentUpdateSubjectDetailsCreateFromParcel = parcel.readInt() == 0 ? null : RecentUpdateSubjectDetails.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            RecentUpdatesImage recentUpdatesImageCreateFromParcel = parcel.readInt() == 0 ? null : RecentUpdatesImage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList4.add(RecentUpdatesReferences.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            return new RecentUpdatesModel(string, string2, arrayListCreateStringArrayList, arrayList3, j, string3, recentUpdateSubjectDetailsCreateFromParcel, string4, recentUpdatesImageCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecentUpdatesModel[] newArray(int i) {
            return new RecentUpdatesModel[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RecentUpdatesModel(@JsonProperty("_id") String str, @JsonProperty("desc_html") String str2, @JsonProperty("mcq_display_ids") List<String> list, @JsonProperty("pearl_nos") List<Integer> list2, @JsonProperty("publish_date") long j, @JsonProperty("reference_link") String str3, @JsonProperty("subject_details") RecentUpdateSubjectDetails recentUpdateSubjectDetails, @JsonProperty("title") String str4, @JsonProperty("image") RecentUpdatesImage recentUpdatesImage, @JsonProperty("references") List<RecentUpdatesReferences> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.id = str;
        this.description = str2;
        this.mcqList = list;
        this.pearlList = list2;
        this.publishedOnMs = j;
        this.referenceLink = str3;
        this.subjectDetails = recentUpdateSubjectDetails;
        this.title = str4;
        this.image = recentUpdatesImage;
        this.tagsList = list3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getMcqList() {
        return this.mcqList;
    }

    public final void setMcqList(List<String> list) {
        this.mcqList = list;
    }

    public final List<Integer> getPearlList() {
        return this.pearlList;
    }

    public final void setPearlList(List<Integer> list) {
        this.pearlList = list;
    }

    public final long getPublishedOnMs() {
        return this.publishedOnMs;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final RecentUpdateSubjectDetails getSubjectDetails() {
        return this.subjectDetails;
    }

    public final String getTitle() {
        return this.title;
    }

    public final RecentUpdatesImage getImage() {
        return this.image;
    }

    public final void setImage(RecentUpdatesImage recentUpdatesImage) {
        this.image = recentUpdatesImage;
    }

    public final List<RecentUpdatesReferences> getTagsList() {
        return this.tagsList;
    }

    public final void setTagsList(List<RecentUpdatesReferences> list) {
        this.tagsList = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<RecentUpdatesReferences> component10() {
        return this.tagsList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component3() {
        return this.mcqList;
    }

    public final List<Integer> component4() {
        return this.pearlList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPublishedOnMs() {
        return this.publishedOnMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferenceLink() {
        return this.referenceLink;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RecentUpdateSubjectDetails getSubjectDetails() {
        return this.subjectDetails;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RecentUpdatesImage getImage() {
        return this.image;
    }

    public final RecentUpdatesModel copy(@JsonProperty("_id") String p0, @JsonProperty("desc_html") String p1, @JsonProperty("mcq_display_ids") List<String> p2, @JsonProperty("pearl_nos") List<Integer> p3, @JsonProperty("publish_date") long p4, @JsonProperty("reference_link") String p5, @JsonProperty("subject_details") RecentUpdateSubjectDetails p6, @JsonProperty("title") String p7, @JsonProperty("image") RecentUpdatesImage p8, @JsonProperty("references") List<RecentUpdatesReferences> p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        return new RecentUpdatesModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecentUpdatesModel)) {
            return false;
        }
        RecentUpdatesModel recentUpdatesModel = (RecentUpdatesModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) recentUpdatesModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) recentUpdatesModel.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mcqList, recentUpdatesModel.mcqList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pearlList, recentUpdatesModel.pearlList) && this.publishedOnMs == recentUpdatesModel.publishedOnMs && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.referenceLink, (Object) recentUpdatesModel.referenceLink) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjectDetails, recentUpdatesModel.subjectDetails) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) recentUpdatesModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.image, recentUpdatesModel.image) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.tagsList, recentUpdatesModel.tagsList);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.description.hashCode();
        List<String> list = this.mcqList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.pearlList;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        int iHashCode5 = Long.hashCode(this.publishedOnMs);
        String str = this.referenceLink;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        RecentUpdateSubjectDetails recentUpdateSubjectDetails = this.subjectDetails;
        int iHashCode7 = recentUpdateSubjectDetails == null ? 0 : recentUpdateSubjectDetails.hashCode();
        int iHashCode8 = this.title.hashCode();
        RecentUpdatesImage recentUpdatesImage = this.image;
        int iHashCode9 = recentUpdatesImage == null ? 0 : recentUpdatesImage.hashCode();
        List<RecentUpdatesReferences> list3 = this.tagsList;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.description;
        List<String> list = this.mcqList;
        List<Integer> list2 = this.pearlList;
        long j = this.publishedOnMs;
        String str3 = this.referenceLink;
        RecentUpdateSubjectDetails recentUpdateSubjectDetails = this.subjectDetails;
        String str4 = this.title;
        RecentUpdatesImage recentUpdatesImage = this.image;
        List<RecentUpdatesReferences> list3 = this.tagsList;
        StringBuilder sb = new StringBuilder("RecentUpdatesModel(id=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", mcqList=");
        sb.append(list);
        sb.append(", pearlList=");
        sb.append(list2);
        sb.append(", publishedOnMs=");
        sb.append(j);
        sb.append(", referenceLink=");
        sb.append(str3);
        sb.append(", subjectDetails=");
        sb.append(recentUpdateSubjectDetails);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", image=");
        sb.append(recentUpdatesImage);
        sb.append(", tagsList=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.id);
        p0.writeString(this.description);
        p0.writeStringList(this.mcqList);
        List<Integer> list = this.pearlList;
        if (list == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                p0.writeInt(it.next().intValue());
            }
        }
        p0.writeLong(this.publishedOnMs);
        p0.writeString(this.referenceLink);
        RecentUpdateSubjectDetails recentUpdateSubjectDetails = this.subjectDetails;
        if (recentUpdateSubjectDetails == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            recentUpdateSubjectDetails.writeToParcel(p0, p1);
        }
        p0.writeString(this.title);
        RecentUpdatesImage recentUpdatesImage = this.image;
        if (recentUpdatesImage == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            recentUpdatesImage.writeToParcel(p0, p1);
        }
        List<RecentUpdatesReferences> list2 = this.tagsList;
        if (list2 == null) {
            p0.writeInt(0);
            return;
        }
        p0.writeInt(1);
        p0.writeInt(list2.size());
        Iterator<RecentUpdatesReferences> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(p0, p1);
        }
    }
}
