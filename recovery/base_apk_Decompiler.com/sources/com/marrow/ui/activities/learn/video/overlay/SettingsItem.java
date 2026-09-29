package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Landroid/os/Parcelable;", "Toggle", "Nav", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem$Nav;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem$Toggle;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SettingsItem extends Parcelable {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 "}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem$Toggle;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "p0", "", "p1", "", "p2", "<init>", "(Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;Ljava/lang/String;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "read", "()Lcom/marrow/ui/activities/learn/video/overlay/ToggleKey;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Toggle implements SettingsItem {
        public static final Parcelable.Creator<Toggle> CREATOR = new write();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean read;
        private final ToggleKey write;

        public static final class write implements Parcelable.Creator<Toggle> {
            private static Toggle write(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new Toggle(ToggleKey.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Toggle createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            private static Toggle[] AudioAttributesCompatParcelizer(int i) {
                return new Toggle[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Toggle[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Toggle(ToggleKey toggleKey, String str, boolean z) {
            toMagicModuleMetaRepoModel.write(toggleKey, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = toggleKey;
            this.IconCompatParcelizer = str;
            this.read = z;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final ToggleKey getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) p0;
            return this.write == toggle.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) toggle.IconCompatParcelizer) && this.read == toggle.read;
        }

        public final int hashCode() {
            return (((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read);
        }

        public final String toString() {
            ToggleKey toggleKey = this.write;
            String str = this.IconCompatParcelizer;
            boolean z = this.read;
            StringBuilder sb = new StringBuilder("Toggle(write=");
            sb.append(toggleKey);
            sb.append(", IconCompatParcelizer=");
            sb.append(str);
            sb.append(", read=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.write.writeToParcel(p0, p1);
            p0.writeString(this.IconCompatParcelizer);
            p0.writeInt(this.read ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem$Nav;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "p0", "", "p1", "p2", "<init>", "(Lcom/marrow/ui/activities/learn/video/overlay/NavKey;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "read", "Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "RemoteActionCompatParcelizer", "()Lcom/marrow/ui/activities/learn/video/overlay/NavKey;", "IconCompatParcelizer", "Ljava/lang/String;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Nav implements SettingsItem {
        public static final Parcelable.Creator<Nav> CREATOR = new RemoteActionCompatParcelizer();
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final NavKey RemoteActionCompatParcelizer;

        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<Nav> {
            private static Nav RemoteActionCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new Nav(NavKey.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Nav createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            private static Nav[] IconCompatParcelizer(int i) {
                return new Nav[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Nav[] newArray(int i) {
                return IconCompatParcelizer(i);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Nav(NavKey navKey, String str, String str2) {
            toMagicModuleMetaRepoModel.write(navKey, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = navKey;
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final NavKey getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getWrite() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Nav)) {
                return false;
            }
            Nav nav = (Nav) p0;
            return this.RemoteActionCompatParcelizer == nav.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) nav.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) nav.write);
        }

        public final int hashCode() {
            return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
        }

        public final String toString() {
            NavKey navKey = this.RemoteActionCompatParcelizer;
            String str = this.IconCompatParcelizer;
            String str2 = this.write;
            StringBuilder sb = new StringBuilder("Nav(RemoteActionCompatParcelizer=");
            sb.append(navKey);
            sb.append(", IconCompatParcelizer=");
            sb.append(str);
            sb.append(", write=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.RemoteActionCompatParcelizer.writeToParcel(p0, p1);
            p0.writeString(this.IconCompatParcelizer);
            p0.writeString(this.write);
        }
    }
}
