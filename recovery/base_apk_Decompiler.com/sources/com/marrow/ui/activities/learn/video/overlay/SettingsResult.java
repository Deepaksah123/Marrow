package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult;", "Landroid/os/Parcelable;", "ToggleChanged", "NavClicked", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult$NavClicked;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult$ToggleChanged;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SettingsResult extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult$ToggleChanged;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult;", "Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "p0", "", "p1", "<init>", "(Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "read", "Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "write", "()Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToggleChanged implements SettingsResult {
        public static final Parcelable.Creator<ToggleChanged> CREATOR = new AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;
        private final ToggleKey read;

        public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<ToggleChanged> {
            private static ToggleChanged read(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new ToggleChanged(ToggleKey.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ToggleChanged createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            private static ToggleChanged[] write(int i) {
                return new ToggleChanged[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ToggleChanged[] newArray(int i) {
                return write(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ToggleChanged(ToggleKey toggleKey, boolean z) {
            toMagicModuleMetaRepoModel.write(toggleKey, "");
            this.read = toggleKey;
            this.write = z;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final ToggleKey getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ToggleChanged)) {
                return false;
            }
            ToggleChanged toggleChanged = (ToggleChanged) p0;
            return this.read == toggleChanged.read && this.write == toggleChanged.write;
        }

        public final int hashCode() {
            return (this.read.hashCode() * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            ToggleKey toggleKey = this.read;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("ToggleChanged(read=");
            sb.append(toggleKey);
            sb.append(", write=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.read.writeToParcel(p0, p1);
            p0.writeInt(this.write ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult$NavClicked;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsResult;", "Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "p0", "<init>", "(Lcom/marrow/ui/activities/learn/video/overlay/NavKey;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "RemoteActionCompatParcelizer", "Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "AudioAttributesCompatParcelizer", "()Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavClicked implements SettingsResult {
        public static final Parcelable.Creator<NavClicked> CREATOR = new IconCompatParcelizer();

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final NavKey IconCompatParcelizer;

        public static final class IconCompatParcelizer implements Parcelable.Creator<NavClicked> {
            private static NavClicked RemoteActionCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new NavClicked(NavKey.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ NavClicked createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            private static NavClicked[] AudioAttributesCompatParcelizer(int i) {
                return new NavClicked[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ NavClicked[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NavClicked(NavKey navKey) {
            toMagicModuleMetaRepoModel.write(navKey, "");
            this.IconCompatParcelizer = navKey;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final NavKey getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof NavClicked) && this.IconCompatParcelizer == ((NavClicked) p0).IconCompatParcelizer;
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            NavKey navKey = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("NavClicked(IconCompatParcelizer=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.IconCompatParcelizer.writeToParcel(p0, p1);
        }
    }
}
