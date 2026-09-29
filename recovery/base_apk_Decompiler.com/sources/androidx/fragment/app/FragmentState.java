package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NopAnnotationIntrospector1;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() { // from class: androidx.fragment.app.FragmentState.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentState createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentState[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static FragmentState read(Parcel parcel) {
            return new FragmentState(parcel);
        }

        private static FragmentState[] RemoteActionCompatParcelizer(int i) {
            return new FragmentState[i];
        }
    };
    final boolean AudioAttributesCompatParcelizer;
    final boolean AudioAttributesImplApi21Parcelizer;
    final boolean AudioAttributesImplApi26Parcelizer;
    final boolean AudioAttributesImplBaseParcelizer;
    final String IconCompatParcelizer;
    final boolean MediaBrowserCompatCustomActionResultReceiver;
    final int MediaBrowserCompatItemReceiver;
    public final boolean MediaBrowserCompatMediaItem;
    final String MediaBrowserCompatSearchResultReceiver;
    final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final int RatingCompat;
    final boolean RemoteActionCompatParcelizer;
    final int read;
    final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentState(Fragment fragment) {
        this.IconCompatParcelizer = fragment.getClass().getName();
        this.MediaDescriptionCompat = fragment.mWho;
        this.AudioAttributesCompatParcelizer = fragment.mFromLayout;
        this.AudioAttributesImplApi21Parcelizer = fragment.mInDynamicContainer;
        this.write = fragment.mFragmentId;
        this.read = fragment.mContainerId;
        this.MediaBrowserCompatSearchResultReceiver = fragment.mTag;
        this.MediaBrowserCompatCustomActionResultReceiver = fragment.mRetainInstance;
        this.AudioAttributesImplApi26Parcelizer = fragment.mRemoving;
        this.RemoteActionCompatParcelizer = fragment.mDetached;
        this.AudioAttributesImplBaseParcelizer = fragment.mHidden;
        this.MediaBrowserCompatItemReceiver = fragment.mMaxState.ordinal();
        this.MediaMetadataCompat = fragment.mTargetWho;
        this.RatingCompat = fragment.mTargetRequestCode;
        this.MediaBrowserCompatMediaItem = fragment.mUserVisibleHint;
    }

    FragmentState(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.AudioAttributesCompatParcelizer = parcel.readInt() != 0;
        this.AudioAttributesImplApi21Parcelizer = parcel.readInt() != 0;
        this.write = parcel.readInt();
        this.read = parcel.readInt();
        this.MediaBrowserCompatSearchResultReceiver = parcel.readString();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readInt() != 0;
        this.AudioAttributesImplApi26Parcelizer = parcel.readInt() != 0;
        this.RemoteActionCompatParcelizer = parcel.readInt() != 0;
        this.AudioAttributesImplBaseParcelizer = parcel.readInt() != 0;
        this.MediaBrowserCompatItemReceiver = parcel.readInt();
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readInt();
        this.MediaBrowserCompatMediaItem = parcel.readInt() != 0;
    }

    public final Fragment write(NopAnnotationIntrospector1 nopAnnotationIntrospector1, ClassLoader classLoader) {
        Fragment fragment = nopAnnotationIntrospector1.read(classLoader, this.IconCompatParcelizer);
        fragment.mWho = this.MediaDescriptionCompat;
        fragment.mFromLayout = this.AudioAttributesCompatParcelizer;
        fragment.mInDynamicContainer = this.AudioAttributesImplApi21Parcelizer;
        fragment.mRestored = true;
        fragment.mFragmentId = this.write;
        fragment.mContainerId = this.read;
        fragment.mTag = this.MediaBrowserCompatSearchResultReceiver;
        fragment.mRetainInstance = this.MediaBrowserCompatCustomActionResultReceiver;
        fragment.mRemoving = this.AudioAttributesImplApi26Parcelizer;
        fragment.mDetached = this.RemoteActionCompatParcelizer;
        fragment.mHidden = this.AudioAttributesImplBaseParcelizer;
        fragment.mMaxState = anyIgnorals.write.values()[this.MediaBrowserCompatItemReceiver];
        fragment.mTargetWho = this.MediaMetadataCompat;
        fragment.mTargetRequestCode = this.RatingCompat;
        fragment.mUserVisibleHint = this.MediaBrowserCompatMediaItem;
        return fragment;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.IconCompatParcelizer);
        sb.append(" (");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")}:");
        if (this.AudioAttributesCompatParcelizer) {
            sb.append(" fromLayout");
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            sb.append(" dynamicContainer");
        }
        if (this.read != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.read));
        }
        String str = this.MediaBrowserCompatSearchResultReceiver;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            sb.append(" retainInstance");
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            sb.append(" removing");
        }
        if (this.RemoteActionCompatParcelizer) {
            sb.append(" detached");
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            sb.append(" hidden");
        }
        if (this.MediaMetadataCompat != null) {
            sb.append(" targetWho=");
            sb.append(this.MediaMetadataCompat);
            sb.append(" targetRequestCode=");
            sb.append(this.RatingCompat);
        }
        if (this.MediaBrowserCompatMediaItem) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.AudioAttributesCompatParcelizer ? 1 : 0);
        parcel.writeInt(this.AudioAttributesImplApi21Parcelizer ? 1 : 0);
        parcel.writeInt(this.write);
        parcel.writeInt(this.read);
        parcel.writeString(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeInt(this.MediaBrowserCompatCustomActionResultReceiver ? 1 : 0);
        parcel.writeInt(this.AudioAttributesImplApi26Parcelizer ? 1 : 0);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        parcel.writeInt(this.AudioAttributesImplBaseParcelizer ? 1 : 0);
        parcel.writeInt(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeInt(this.RatingCompat);
        parcel.writeInt(this.MediaBrowserCompatMediaItem ? 1 : 0);
    }
}
