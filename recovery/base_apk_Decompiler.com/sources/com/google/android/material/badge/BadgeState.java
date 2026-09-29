package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Locale;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.SeekMap;
import kotlin.TrackOutput;
import kotlin.calculateNextSearchBytePosition;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class BadgeState {
    public final float AudioAttributesCompatParcelizer;
    private final State AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public final float IconCompatParcelizer;
    public final float MediaBrowserCompatCustomActionResultReceiver;
    public int MediaBrowserCompatItemReceiver;
    private final State MediaBrowserCompatSearchResultReceiver;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float write;

    public BadgeState(Context context, int i, int i2, int i3, State state) {
        CharSequence string;
        int i4;
        int i5;
        int i6;
        int i7;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        int iIntValue10;
        int iIntValue11;
        int iIntValue12;
        int iIntValue13;
        int iIntValue14;
        boolean zBooleanValue;
        State state2 = new State();
        this.AudioAttributesImplApi21Parcelizer = state2;
        state = state == null ? new State() : state;
        TypedArray typedArray = read(context, state.AudioAttributesImplApi21Parcelizer, i2, i3);
        Resources resources = context.getResources();
        this.IconCompatParcelizer = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeRadius, -1);
        this.AudioAttributesImplBaseParcelizer = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_badge_horizontal_edge_offset);
        this.AudioAttributesImplApi26Parcelizer = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_badge_text_horizontal_edge_offset);
        this.AudioAttributesCompatParcelizer = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWithTextRadius, -1);
        this.RemoteActionCompatParcelizer = typedArray.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWidth, resources.getDimension(calculateNextSearchBytePosition.write.m3_badge_size));
        this.MediaBrowserCompatCustomActionResultReceiver = typedArray.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWithTextWidth, resources.getDimension(calculateNextSearchBytePosition.write.m3_badge_with_text_size));
        this.read = typedArray.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeHeight, resources.getDimension(calculateNextSearchBytePosition.write.m3_badge_size));
        this.write = typedArray.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWithTextHeight, resources.getDimension(calculateNextSearchBytePosition.write.m3_badge_with_text_size));
        boolean z = true;
        this.MediaBrowserCompatItemReceiver = typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_offsetAlignmentMode, 1);
        state2.RemoteActionCompatParcelizer = state.RemoteActionCompatParcelizer == -2 ? 255 : state.RemoteActionCompatParcelizer;
        if (state.onPrepareFromSearch == -2) {
            if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_number)) {
                state2.onPrepareFromSearch = typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_number, 0);
            } else {
                state2.onPrepareFromSearch = -1;
            }
        } else {
            state2.onPrepareFromSearch = state.onPrepareFromSearch;
        }
        if (state.onPrepare == null) {
            if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeText)) {
                state2.onPrepare = typedArray.getString(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeText);
            }
        } else {
            state2.onPrepare = state.onPrepare;
        }
        state2.onCustomAction = state.onCustomAction;
        if (state.onCommand == null) {
            string = context.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_badge_numberless_content_description);
        } else {
            string = state.onCommand;
        }
        state2.onCommand = string;
        if (state.onAddQueueItem == 0) {
            i4 = calculateNextSearchBytePosition.AudioAttributesImplBaseParcelizer.mtrl_badge_content_description;
        } else {
            i4 = state.onAddQueueItem;
        }
        state2.onAddQueueItem = i4;
        if (state.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            i5 = calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_exceed_max_badge_number_content_description;
        } else {
            i5 = state.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        state2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
        if (state.onFastForward != null && !state.onFastForward.booleanValue()) {
            z = false;
        }
        state2.onFastForward = Boolean.valueOf(z);
        if (state.onPlayFromMediaId == -2) {
            i6 = typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_maxCharacterCount, -2);
        } else {
            i6 = state.onPlayFromMediaId;
        }
        state2.onPlayFromMediaId = i6;
        if (state.onPause == -2) {
            i7 = typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_maxNumber, -2);
        } else {
            i7 = state.onPause;
        }
        state2.onPause = i7;
        if (state.MediaBrowserCompatCustomActionResultReceiver == null) {
            iIntValue = typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeShapeAppearance, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            iIntValue = state.MediaBrowserCompatCustomActionResultReceiver.intValue();
        }
        state2.MediaBrowserCompatCustomActionResultReceiver = Integer.valueOf(iIntValue);
        if (state.AudioAttributesImplBaseParcelizer == null) {
            iIntValue2 = typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            iIntValue2 = state.AudioAttributesImplBaseParcelizer.intValue();
        }
        state2.AudioAttributesImplBaseParcelizer = Integer.valueOf(iIntValue2);
        if (state.MediaDescriptionCompat == null) {
            iIntValue3 = typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWithTextShapeAppearance, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            iIntValue3 = state.MediaDescriptionCompat.intValue();
        }
        state2.MediaDescriptionCompat = Integer.valueOf(iIntValue3);
        if (state.RatingCompat == null) {
            iIntValue4 = typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            iIntValue4 = state.RatingCompat.intValue();
        }
        state2.RatingCompat = Integer.valueOf(iIntValue4);
        if (state.IconCompatParcelizer == null) {
            iIntValue5 = write(context, typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.Badge_backgroundColor);
        } else {
            iIntValue5 = state.IconCompatParcelizer.intValue();
        }
        state2.IconCompatParcelizer = Integer.valueOf(iIntValue5);
        if (state.MediaBrowserCompatMediaItem == null) {
            iIntValue6 = typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeTextAppearance, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.TextAppearance_MaterialComponents_Badge);
        } else {
            iIntValue6 = state.MediaBrowserCompatMediaItem.intValue();
        }
        state2.MediaBrowserCompatMediaItem = Integer.valueOf(iIntValue6);
        if (state.MediaMetadataCompat == null) {
            if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeTextColor)) {
                state2.MediaMetadataCompat = Integer.valueOf(write(context, typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeTextColor));
            } else {
                state2.MediaMetadataCompat = Integer.valueOf(new TrackOutput(context, state2.MediaBrowserCompatMediaItem.intValue()).RemoteActionCompatParcelizer().getDefaultColor());
            }
        } else {
            state2.MediaMetadataCompat = state.MediaMetadataCompat;
        }
        if (state.AudioAttributesImplApi26Parcelizer == null) {
            iIntValue7 = typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeGravity, 8388661);
        } else {
            iIntValue7 = state.AudioAttributesImplApi26Parcelizer.intValue();
        }
        state2.AudioAttributesImplApi26Parcelizer = Integer.valueOf(iIntValue7);
        if (state.MediaBrowserCompatItemReceiver == null) {
            iIntValue8 = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeWidePadding, resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_badge_long_text_horizontal_padding));
        } else {
            iIntValue8 = state.MediaBrowserCompatItemReceiver.intValue();
        }
        state2.MediaBrowserCompatItemReceiver = Integer.valueOf(iIntValue8);
        if (state.MediaBrowserCompatSearchResultReceiver == null) {
            iIntValue9 = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.m3_badge_with_text_vertical_padding));
        } else {
            iIntValue9 = state.MediaBrowserCompatSearchResultReceiver.intValue();
        }
        state2.MediaBrowserCompatSearchResultReceiver = Integer.valueOf(iIntValue9);
        if (state.onPlay == null) {
            iIntValue10 = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_horizontalOffset, 0);
        } else {
            iIntValue10 = state.onPlay.intValue();
        }
        state2.onPlay = Integer.valueOf(iIntValue10);
        if (state.onPrepareFromMediaId == null) {
            iIntValue11 = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_verticalOffset, 0);
        } else {
            iIntValue11 = state.onPrepareFromMediaId.intValue();
        }
        state2.onPrepareFromMediaId = Integer.valueOf(iIntValue11);
        if (state.handleMediaPlayPauseIfPendingOnHandler == null) {
            iIntValue12 = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_horizontalOffsetWithText, state2.onPlay.intValue());
        } else {
            iIntValue12 = state.handleMediaPlayPauseIfPendingOnHandler.intValue();
        }
        state2.handleMediaPlayPauseIfPendingOnHandler = Integer.valueOf(iIntValue12);
        if (state.onPlayFromSearch == null) {
            iIntValue13 = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_verticalOffsetWithText, state2.onPrepareFromMediaId.intValue());
        } else {
            iIntValue13 = state.onPlayFromSearch.intValue();
        }
        state2.onPlayFromSearch = Integer.valueOf(iIntValue13);
        if (state.onMediaButtonEvent == null) {
            iIntValue14 = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_largeFontVerticalOffsetAdjustment, 0);
        } else {
            iIntValue14 = state.onMediaButtonEvent.intValue();
        }
        state2.onMediaButtonEvent = Integer.valueOf(iIntValue14);
        state2.write = Integer.valueOf(state.write == null ? 0 : state.write.intValue());
        state2.read = Integer.valueOf(state.read == null ? 0 : state.read.intValue());
        if (state.AudioAttributesCompatParcelizer == null) {
            zBooleanValue = typedArray.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            zBooleanValue = state.AudioAttributesCompatParcelizer.booleanValue();
        }
        state2.AudioAttributesCompatParcelizer = Boolean.valueOf(zBooleanValue);
        typedArray.recycle();
        if (state.onPlayFromUri == null) {
            state2.onPlayFromUri = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.onPlayFromUri = state.onPlayFromUri;
        }
        this.MediaBrowserCompatSearchResultReceiver = state;
    }

    private static TypedArray read(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i != 0) {
            AttributeSet attributeSetWrite = DefaultExtractorsFactoryExtensionLoader.write(context, i, "badge");
            styleAttribute = attributeSetWrite.getStyleAttribute();
            attributeSet = attributeSetWrite;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Badge, i2, styleAttribute != 0 ? styleAttribute : i3, new int[0]);
    }

    public final State onFastForward() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean onSeekTo() {
        return this.AudioAttributesImplApi21Parcelizer.onFastForward.booleanValue();
    }

    public final boolean onPrepareFromSearch() {
        return this.AudioAttributesImplApi21Parcelizer.onPrepareFromSearch != -1;
    }

    public final int onMediaButtonEvent() {
        return this.AudioAttributesImplApi21Parcelizer.onPrepareFromSearch;
    }

    public final boolean onPlayFromUri() {
        return this.AudioAttributesImplApi21Parcelizer.onPrepare != null;
    }

    public final String onPause() {
        return this.AudioAttributesImplApi21Parcelizer.onPrepare;
    }

    public final int write() {
        return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer = i;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.onPlayFromMediaId;
    }

    public final int onPlay() {
        return this.AudioAttributesImplApi21Parcelizer.onPause;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer.intValue();
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.MediaMetadataCompat.intValue();
    }

    public final int onPlayFromSearch() {
        return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem.intValue();
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver.intValue();
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplBaseParcelizer.intValue();
    }

    public final int MediaMetadataCompat() {
        return this.AudioAttributesImplApi21Parcelizer.MediaDescriptionCompat.intValue();
    }

    public final int RatingCompat() {
        return this.AudioAttributesImplApi21Parcelizer.RatingCompat.intValue();
    }

    public final int read() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer.intValue();
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver.intValue();
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver.intValue();
    }

    public final int onCommand() {
        return this.AudioAttributesImplApi21Parcelizer.onPlay.intValue();
    }

    public final int onPrepare() {
        return this.AudioAttributesImplApi21Parcelizer.onPrepareFromMediaId.intValue();
    }

    public final int onAddQueueItem() {
        return this.AudioAttributesImplApi21Parcelizer.handleMediaPlayPauseIfPendingOnHandler.intValue();
    }

    public final int onPrepareFromMediaId() {
        return this.AudioAttributesImplApi21Parcelizer.onPlayFromSearch.intValue();
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplApi21Parcelizer.onMediaButtonEvent.intValue();
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.write.intValue();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.read.intValue();
    }

    public final CharSequence MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi21Parcelizer.onCustomAction;
    }

    public final CharSequence MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.onCommand;
    }

    public final int onCustomAction() {
        return this.AudioAttributesImplApi21Parcelizer.onAddQueueItem;
    }

    public final int MediaDescriptionCompat() {
        return this.AudioAttributesImplApi21Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final Locale onPlayFromMediaId() {
        return this.AudioAttributesImplApi21Parcelizer.onPlayFromUri;
    }

    public final boolean onRemoveQueueItemAt() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.booleanValue();
    }

    private static int write(Context context, TypedArray typedArray, int i) {
        return SeekMap.IconCompatParcelizer(context, typedArray, i).getDefaultColor();
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ State createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ State[] newArray(int i) {
                return write(i);
            }

            private static State RemoteActionCompatParcelizer(Parcel parcel) {
                return new State(parcel);
            }

            private static State[] write(int i) {
                return new State[i];
            }
        };
        private Boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Integer AudioAttributesImplApi26Parcelizer;
        private Integer AudioAttributesImplBaseParcelizer;
        private Integer IconCompatParcelizer;
        private Integer MediaBrowserCompatCustomActionResultReceiver;
        private Integer MediaBrowserCompatItemReceiver;
        private Integer MediaBrowserCompatMediaItem;
        private Integer MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private Integer MediaDescriptionCompat;
        private Integer MediaMetadataCompat;
        private Integer RatingCompat;
        private int RemoteActionCompatParcelizer;
        private Integer handleMediaPlayPauseIfPendingOnHandler;
        private int onAddQueueItem;
        private CharSequence onCommand;
        private CharSequence onCustomAction;
        private Boolean onFastForward;
        private Integer onMediaButtonEvent;
        private int onPause;
        private Integer onPlay;
        private int onPlayFromMediaId;
        private Integer onPlayFromSearch;
        private Locale onPlayFromUri;
        private String onPrepare;
        private Integer onPrepareFromMediaId;
        private int onPrepareFromSearch;
        private Integer read;
        private Integer write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public State() {
            this.RemoteActionCompatParcelizer = 255;
            this.onPrepareFromSearch = -2;
            this.onPlayFromMediaId = -2;
            this.onPause = -2;
            this.onFastForward = Boolean.TRUE;
        }

        State(Parcel parcel) {
            this.RemoteActionCompatParcelizer = 255;
            this.onPrepareFromSearch = -2;
            this.onPlayFromMediaId = -2;
            this.onPause = -2;
            this.onFastForward = Boolean.TRUE;
            this.AudioAttributesImplApi21Parcelizer = parcel.readInt();
            this.IconCompatParcelizer = (Integer) parcel.readSerializable();
            this.MediaMetadataCompat = (Integer) parcel.readSerializable();
            this.MediaBrowserCompatMediaItem = (Integer) parcel.readSerializable();
            this.MediaBrowserCompatCustomActionResultReceiver = (Integer) parcel.readSerializable();
            this.AudioAttributesImplBaseParcelizer = (Integer) parcel.readSerializable();
            this.MediaDescriptionCompat = (Integer) parcel.readSerializable();
            this.RatingCompat = (Integer) parcel.readSerializable();
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.onPrepare = parcel.readString();
            this.onPrepareFromSearch = parcel.readInt();
            this.onPlayFromMediaId = parcel.readInt();
            this.onPause = parcel.readInt();
            this.onCustomAction = parcel.readString();
            this.onCommand = parcel.readString();
            this.onAddQueueItem = parcel.readInt();
            this.AudioAttributesImplApi26Parcelizer = (Integer) parcel.readSerializable();
            this.MediaBrowserCompatItemReceiver = (Integer) parcel.readSerializable();
            this.MediaBrowserCompatSearchResultReceiver = (Integer) parcel.readSerializable();
            this.onPlay = (Integer) parcel.readSerializable();
            this.onPrepareFromMediaId = (Integer) parcel.readSerializable();
            this.handleMediaPlayPauseIfPendingOnHandler = (Integer) parcel.readSerializable();
            this.onPlayFromSearch = (Integer) parcel.readSerializable();
            this.onMediaButtonEvent = (Integer) parcel.readSerializable();
            this.write = (Integer) parcel.readSerializable();
            this.read = (Integer) parcel.readSerializable();
            this.onFastForward = (Boolean) parcel.readSerializable();
            this.onPlayFromUri = (Locale) parcel.readSerializable();
            this.AudioAttributesCompatParcelizer = (Boolean) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.AudioAttributesImplApi21Parcelizer);
            parcel.writeSerializable(this.IconCompatParcelizer);
            parcel.writeSerializable(this.MediaMetadataCompat);
            parcel.writeSerializable(this.MediaBrowserCompatMediaItem);
            parcel.writeSerializable(this.MediaBrowserCompatCustomActionResultReceiver);
            parcel.writeSerializable(this.AudioAttributesImplBaseParcelizer);
            parcel.writeSerializable(this.MediaDescriptionCompat);
            parcel.writeSerializable(this.RatingCompat);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.onPrepare);
            parcel.writeInt(this.onPrepareFromSearch);
            parcel.writeInt(this.onPlayFromMediaId);
            parcel.writeInt(this.onPause);
            CharSequence charSequence = this.onCustomAction;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.onCommand;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.onAddQueueItem);
            parcel.writeSerializable(this.AudioAttributesImplApi26Parcelizer);
            parcel.writeSerializable(this.MediaBrowserCompatItemReceiver);
            parcel.writeSerializable(this.MediaBrowserCompatSearchResultReceiver);
            parcel.writeSerializable(this.onPlay);
            parcel.writeSerializable(this.onPrepareFromMediaId);
            parcel.writeSerializable(this.handleMediaPlayPauseIfPendingOnHandler);
            parcel.writeSerializable(this.onPlayFromSearch);
            parcel.writeSerializable(this.onMediaButtonEvent);
            parcel.writeSerializable(this.write);
            parcel.writeSerializable(this.read);
            parcel.writeSerializable(this.onFastForward);
            parcel.writeSerializable(this.onPlayFromUri);
            parcel.writeSerializable(this.AudioAttributesCompatParcelizer);
        }
    }
}
