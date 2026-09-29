package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.onSeekFinished;
import kotlin.peekAvailableContext;
import kotlin.removeOnTrimMemoryListener;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationBarPresenter implements peekAvailableContext {
    private NavigationBarMenuView IconCompatParcelizer;
    private onRequestPermissionsResult RemoteActionCompatParcelizer;
    private int read;
    private boolean write = false;

    @Override // kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
    }

    @Override // kotlin.peekAvailableContext
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
    }

    @Override // kotlin.peekAvailableContext
    public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        return false;
    }

    public final void RemoteActionCompatParcelizer(NavigationBarMenuView navigationBarMenuView) {
        this.IconCompatParcelizer = navigationBarMenuView;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
        this.RemoteActionCompatParcelizer = onrequestpermissionsresult;
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult);
    }

    @Override // kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (this.write) {
            return;
        }
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer();
        } else {
            this.IconCompatParcelizer.RatingCompat();
        }
    }

    public final void write() {
        this.read = 1;
    }

    @Override // kotlin.peekAvailableContext
    public final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        SavedState savedState = new SavedState();
        savedState.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        savedState.write = onSeekFinished.IconCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
        return savedState;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.IconCompatParcelizer.write(savedState.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer.IconCompatParcelizer(onSeekFinished.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.getContext(), savedState.write));
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.write = z;
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return write(i);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] write(int i) {
                return new SavedState[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        ParcelableSparseArray write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.AudioAttributesCompatParcelizer = parcel.readInt();
            this.write = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
            parcel.writeParcelable(this.write, 0);
        }
    }
}
