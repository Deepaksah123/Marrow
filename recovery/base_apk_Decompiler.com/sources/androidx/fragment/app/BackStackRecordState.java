package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import kotlin._doAddInjectable;
import kotlin._refinePropertyInclusion;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackRecordState createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackRecordState[] newArray(int i) {
            return read(i);
        }

        private static BackStackRecordState AudioAttributesCompatParcelizer(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        private static BackStackRecordState[] read(int i) {
            return new BackStackRecordState[i];
        }
    };
    final int AudioAttributesCompatParcelizer;
    final int[] AudioAttributesImplApi21Parcelizer;
    final String AudioAttributesImplApi26Parcelizer;
    final ArrayList<String> AudioAttributesImplBaseParcelizer;
    final int[] IconCompatParcelizer;
    final int MediaBrowserCompatCustomActionResultReceiver;
    final int[] MediaBrowserCompatItemReceiver;
    final int MediaBrowserCompatMediaItem;
    final ArrayList<String> MediaBrowserCompatSearchResultReceiver;
    final boolean MediaDescriptionCompat;
    final ArrayList<String> RatingCompat;
    final CharSequence RemoteActionCompatParcelizer;
    final int read;
    final CharSequence write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    BackStackRecordState(_refinePropertyInclusion _refinepropertyinclusion) {
        int size = _refinepropertyinclusion.MediaDescriptionCompat.size();
        this.AudioAttributesImplApi21Parcelizer = new int[size * 6];
        if (!_refinepropertyinclusion.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("Not on back stack");
        }
        this.AudioAttributesImplBaseParcelizer = new ArrayList<>(size);
        this.MediaBrowserCompatItemReceiver = new int[size];
        this.IconCompatParcelizer = new int[size];
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            _doAddInjectable.write writeVar = _refinepropertyinclusion.MediaDescriptionCompat.get(i2);
            this.AudioAttributesImplApi21Parcelizer[i] = writeVar.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.add(writeVar.IconCompatParcelizer != null ? writeVar.IconCompatParcelizer.mWho : null);
            this.AudioAttributesImplApi21Parcelizer[i + 1] = writeVar.AudioAttributesImplApi21Parcelizer ? 1 : 0;
            this.AudioAttributesImplApi21Parcelizer[i + 2] = writeVar.write;
            this.AudioAttributesImplApi21Parcelizer[i + 3] = writeVar.read;
            this.AudioAttributesImplApi21Parcelizer[i + 4] = writeVar.MediaBrowserCompatCustomActionResultReceiver;
            this.AudioAttributesImplApi21Parcelizer[i + 5] = writeVar.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver[i2] = writeVar.MediaBrowserCompatItemReceiver.ordinal();
            this.IconCompatParcelizer[i2] = writeVar.RemoteActionCompatParcelizer.ordinal();
            i2++;
            i += 6;
        }
        this.MediaBrowserCompatMediaItem = _refinepropertyinclusion.onCommand;
        this.AudioAttributesImplApi26Parcelizer = _refinepropertyinclusion.RatingCompat;
        this.MediaBrowserCompatCustomActionResultReceiver = _refinepropertyinclusion.write;
        this.read = _refinepropertyinclusion.MediaBrowserCompatItemReceiver;
        this.RemoteActionCompatParcelizer = _refinepropertyinclusion.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesCompatParcelizer = _refinepropertyinclusion.AudioAttributesCompatParcelizer;
        this.write = _refinepropertyinclusion.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatSearchResultReceiver = _refinepropertyinclusion.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.RatingCompat = _refinepropertyinclusion.onCustomAction;
        this.MediaDescriptionCompat = _refinepropertyinclusion.handleMediaPlayPauseIfPendingOnHandler;
    }

    BackStackRecordState(Parcel parcel) {
        this.AudioAttributesImplApi21Parcelizer = parcel.createIntArray();
        this.AudioAttributesImplBaseParcelizer = parcel.createStringArrayList();
        this.MediaBrowserCompatItemReceiver = parcel.createIntArray();
        this.IconCompatParcelizer = parcel.createIntArray();
        this.MediaBrowserCompatMediaItem = parcel.readInt();
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readInt();
        this.read = parcel.readInt();
        this.RemoteActionCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.AudioAttributesCompatParcelizer = parcel.readInt();
        this.write = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaBrowserCompatSearchResultReceiver = parcel.createStringArrayList();
        this.RatingCompat = parcel.createStringArrayList();
        this.MediaDescriptionCompat = parcel.readInt() != 0;
    }

    public final _refinePropertyInclusion IconCompatParcelizer(FragmentManager fragmentManager) {
        _refinePropertyInclusion _refinepropertyinclusion = new _refinePropertyInclusion(fragmentManager);
        RemoteActionCompatParcelizer(_refinepropertyinclusion);
        _refinepropertyinclusion.write = this.MediaBrowserCompatCustomActionResultReceiver;
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
            String str = this.AudioAttributesImplBaseParcelizer.get(i);
            if (str != null) {
                _refinepropertyinclusion.MediaDescriptionCompat.get(i).IconCompatParcelizer = fragmentManager.RemoteActionCompatParcelizer(str);
            }
        }
        _refinepropertyinclusion.write(1);
        return _refinepropertyinclusion;
    }

    private void RemoteActionCompatParcelizer(_refinePropertyInclusion _refinepropertyinclusion) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.AudioAttributesImplApi21Parcelizer.length) {
                _doAddInjectable.write writeVar = new _doAddInjectable.write();
                int i3 = i + 1;
                writeVar.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i];
                if (FragmentManager.write(2)) {
                    Objects.toString(_refinepropertyinclusion);
                    int i4 = this.AudioAttributesImplApi21Parcelizer[i3];
                }
                writeVar.MediaBrowserCompatItemReceiver = anyIgnorals.write.values()[this.MediaBrowserCompatItemReceiver[i2]];
                writeVar.RemoteActionCompatParcelizer = anyIgnorals.write.values()[this.IconCompatParcelizer[i2]];
                if (this.AudioAttributesImplApi21Parcelizer[i3] == 0) {
                    z = false;
                }
                writeVar.AudioAttributesImplApi21Parcelizer = z;
                writeVar.write = this.AudioAttributesImplApi21Parcelizer[i + 2];
                writeVar.read = this.AudioAttributesImplApi21Parcelizer[i + 3];
                writeVar.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer[i + 4];
                writeVar.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi21Parcelizer[i + 5];
                _refinepropertyinclusion.AudioAttributesImplApi26Parcelizer = writeVar.write;
                _refinepropertyinclusion.MediaBrowserCompatSearchResultReceiver = writeVar.read;
                _refinepropertyinclusion.MediaBrowserCompatMediaItem = writeVar.MediaBrowserCompatCustomActionResultReceiver;
                _refinepropertyinclusion.MediaMetadataCompat = writeVar.AudioAttributesImplApi26Parcelizer;
                _refinepropertyinclusion.RemoteActionCompatParcelizer(writeVar);
                i2++;
                i += 6;
            } else {
                _refinepropertyinclusion.onCommand = this.MediaBrowserCompatMediaItem;
                _refinepropertyinclusion.RatingCompat = this.AudioAttributesImplApi26Parcelizer;
                _refinepropertyinclusion.RemoteActionCompatParcelizer = true;
                _refinepropertyinclusion.MediaBrowserCompatItemReceiver = this.read;
                _refinepropertyinclusion.AudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer;
                _refinepropertyinclusion.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
                _refinepropertyinclusion.MediaBrowserCompatCustomActionResultReceiver = this.write;
                _refinepropertyinclusion.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
                _refinepropertyinclusion.onCustomAction = this.RatingCompat;
                _refinepropertyinclusion.handleMediaPlayPauseIfPendingOnHandler = this.MediaDescriptionCompat;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeStringList(this.AudioAttributesImplBaseParcelizer);
        parcel.writeIntArray(this.MediaBrowserCompatItemReceiver);
        parcel.writeIntArray(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompatMediaItem);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeInt(this.read);
        TextUtils.writeToParcel(this.RemoteActionCompatParcelizer, parcel, 0);
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
        TextUtils.writeToParcel(this.write, parcel, 0);
        parcel.writeStringList(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeStringList(this.RatingCompat);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
    }
}
