package com.marrow2.ui.video.lesson_list.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/adapter/ClickedLessonDetails;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClickedLessonDetails implements Parcelable {
    public static final Parcelable.Creator<ClickedLessonDetails> CREATOR = new write();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    public static final class write implements Parcelable.Creator<ClickedLessonDetails> {
        private static ClickedLessonDetails read(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new ClickedLessonDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClickedLessonDetails createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        private static ClickedLessonDetails[] RemoteActionCompatParcelizer(int i) {
            return new ClickedLessonDetails[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClickedLessonDetails[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ClickedLessonDetails(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClickedLessonDetails)) {
            return false;
        }
        ClickedLessonDetails clickedLessonDetails = (ClickedLessonDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) clickedLessonDetails.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) clickedLessonDetails.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ClickedLessonDetails(write=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.write);
        p0.writeString(this.RemoteActionCompatParcelizer);
    }
}
