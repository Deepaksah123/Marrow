package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] read = {R.attr.state_checked};
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private boolean write;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = true;
        this.write = true;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new deserializeUsingCustom() { // from class: com.google.android.material.internal.CheckableImageButton.5
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(CheckableImageButton.this.RemoteActionCompatParcelizer());
                hassuperclassstartingwith.read(CheckableImageButton.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.RemoteActionCompatParcelizer || this.IconCompatParcelizer == z) {
            return;
        }
        this.IconCompatParcelizer = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.IconCompatParcelizer;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.IconCompatParcelizer);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.write) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.IconCompatParcelizer) {
            int[] iArr = read;
            return mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        setChecked(savedState.RemoteActionCompatParcelizer);
    }

    public void setCheckable(boolean z) {
        if (this.RemoteActionCompatParcelizer != z) {
            this.RemoteActionCompatParcelizer = z;
            sendAccessibilityEvent(0);
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public void setPressable(boolean z) {
        this.write = z;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return write(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState write(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        boolean RemoteActionCompatParcelizer;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            RemoteActionCompatParcelizer(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        }

        private void RemoteActionCompatParcelizer(Parcel parcel) {
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1;
        }
    }
}
