package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.BinarySearchSeekerSeekTimestampConverter;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMapSeekPoints;
import kotlin.TrackOutput;
import kotlin.WalletConstantsBillingAddressFormat;
import kotlin.addExtractorsForFileType;
import kotlin.calculateNextSearchBytePosition;
import kotlin.call1;
import kotlin.checkAndPeekStreamMarker;
import kotlin.deserializeUsingCustom;
import kotlin.getConstantBitrateSeekMap;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.outputPendingSampleMetadata;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readSample;
import kotlin.skipFullyQuietly;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements addExtractorsForFileType.write, readSample, skipFullyQuietly<Chip> {
    private addExtractorsForFileType AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final SeekMapSeekPoints MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private skipFullyQuietly.RemoteActionCompatParcelizer<Chip> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private InsetDrawable RatingCompat;
    private View.OnClickListener handleMediaPlayPauseIfPendingOnHandler;
    private final Rect onAddQueueItem;
    private CompoundButton.OnCheckedChangeListener onCommand;
    private final RectF onCustomAction;
    private final RemoteActionCompatParcelizer onMediaButtonEvent;
    private RippleDrawable onPlay;
    private boolean onPlayFromMediaId;
    private CharSequence write;
    private static final int IconCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Chip_Action;
    private static final Rect RemoteActionCompatParcelizer = new Rect();
    private static final int[] read = {R.attr.state_selected};
    private static final int[] AudioAttributesCompatParcelizer = {R.attr.state_checkable};

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setHideMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
    }

    public void setShowMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = IconCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onAddQueueItem = new Rect();
        this.onCustomAction = new RectF();
        this.MediaBrowserCompatMediaItem = new SeekMapSeekPoints() { // from class: com.google.android.material.chip.Chip.3
            @Override // kotlin.SeekMapSeekPoints
            public final void AudioAttributesCompatParcelizer(int i3) {
            }

            @Override // kotlin.SeekMapSeekPoints
            public final void RemoteActionCompatParcelizer(Typeface typeface, boolean z) {
                Chip chip = Chip.this;
                chip.setText(chip.AudioAttributesImplApi21Parcelizer.handleMediaPlayPauseIfPendingOnHandler() ? Chip.this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver() : Chip.this.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        Context context2 = getContext();
        read(attributeSet);
        addExtractorsForFileType addextractorsforfiletypeIconCompatParcelizer = addExtractorsForFileType.IconCompatParcelizer(context2, attributeSet, i, i2);
        RemoteActionCompatParcelizer(context2, attributeSet, i);
        setChipDrawable(addextractorsforfiletypeIconCompatParcelizer);
        addextractorsforfiletypeIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this));
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Chip, i, i2, new int[0]);
        boolean zHasValue = typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_shapeAppearance);
        typedArrayWrite.recycle();
        this.onMediaButtonEvent = new RemoteActionCompatParcelizer(this);
        onCommand();
        if (!zHasValue) {
            MediaDescriptionCompat();
        }
        setChecked(this.AudioAttributesImplBaseParcelizer);
        setText(addextractorsforfiletypeIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
        setEllipsize(addextractorsforfiletypeIconCompatParcelizer.AudioAttributesImplBaseParcelizer());
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (!this.AudioAttributesImplApi21Parcelizer.handleMediaPlayPauseIfPendingOnHandler()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        handleMediaPlayPauseIfPendingOnHandler();
        if (onPlayFromMediaId()) {
            setMinHeight(this.MediaDescriptionCompat);
        }
        this.MediaMetadataCompat = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.r8lambdabPOo7on_BjPRALTJrvU8_xJyBXE
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.RemoteActionCompatParcelizer.write(compoundButton, z);
            }
        });
    }

    public final /* synthetic */ void write(CompoundButton compoundButton, boolean z) {
        skipFullyQuietly.RemoteActionCompatParcelizer<Chip> remoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.onCommand;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this, this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.handleMediaPlayPauseIfPendingOnHandler(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(write());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            hasSuperClassStartingWith.write(accessibilityNodeInfo).AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(ChipGroup.RemoteActionCompatParcelizer(this), 1, chipGroup.write() ? chipGroup.AudioAttributesCompatParcelizer(this) : -1, 1, false, isChecked()));
        }
    }

    private void onCommand() {
        if (RatingCompat() && AudioAttributesCompatParcelizer() && this.handleMediaPlayPauseIfPendingOnHandler != null) {
            InvalidTypeIdException.AudioAttributesCompatParcelizer(this, this.onMediaButtonEvent);
            this.onPlayFromMediaId = true;
        } else {
            InvalidTypeIdException.AudioAttributesCompatParcelizer(this, (deserializeUsingCustom) null);
            this.onPlayFromMediaId = false;
        }
    }

    private void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Chip, i, IconCompatParcelizer, new int[0]);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_ensureMinTouchTargetSize, false);
        this.MediaDescriptionCompat = (int) Math.ceil(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipMinTouchTargetSize, (float) Math.ceil(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(getContext(), 48))));
        typedArrayWrite.recycle();
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        addExtractorsForFileType addextractorsforfiletype;
        if (TextUtils.isEmpty(getText()) || (addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer) == null) {
            return;
        }
        int iWrite = (int) (addextractorsforfiletype.write() + this.AudioAttributesImplApi21Parcelizer.MediaMetadataCompat() + this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer());
        int iMediaBrowserCompatItemReceiver = (int) (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver() + this.AudioAttributesImplApi21Parcelizer.RatingCompat() + this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
        if (this.RatingCompat != null) {
            Rect rect = new Rect();
            this.RatingCompat.getPadding(rect);
            iMediaBrowserCompatItemReceiver += rect.left;
            iWrite += rect.right;
        }
        InvalidTypeIdException.read(this, iMediaBrowserCompatItemReceiver, getPaddingTop(), iWrite, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            handleMediaPlayPauseIfPendingOnHandler();
        }
    }

    private static void read(AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
    }

    private void MediaDescriptionCompat() {
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.1
            private static final byte[] $$a = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128, -19, -10, -3, 20, -6, 5};
            private static final int $$b = 207;
            private static int AudioAttributesCompatParcelizer = 0;
            private static int read = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = com.google.android.material.chip.Chip.AnonymousClass1.$$a
                    int r9 = r9 * 3
                    int r9 = r9 + 4
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r8 = r8 * 39
                    int r8 = 114 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2c:
                    int r8 = r8 + r9
                    int r8 = r8 + 6
                    int r9 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.AnonymousClass1.a(byte, byte, int, java.lang.Object[]):void");
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (Chip.this.AudioAttributesImplApi21Parcelizer != null) {
                    Chip.this.AudioAttributesImplApi21Parcelizer.getOutline(outline);
                } else {
                    outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
            }

            public static Object[] write(int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                long j;
                int i10;
                CharSequence charSequence;
                int i11 = 2 % 2;
                int i12 = AudioAttributesCompatParcelizer;
                int i13 = (i12 ^ 113) + ((i12 & 113) << 1);
                read = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2136229562);
                    if (objRemoteActionCompatParcelizer == null) {
                        int modifierMetaStateMask = 1503 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 22;
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr = new Object[1];
                        a(b, b2, b2, objArr);
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), modifierMetaStateMask, packedPositionChild, 18711087, false, (String) objArr[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
                    long j2 = 1475492645;
                    long j3 = (((long) (-589)) * j2) + (((long) 591) * jLongValue);
                    long j4 = 590;
                    long j5 = -1;
                    long j6 = jLongValue ^ j5;
                    long j7 = i;
                    long j8 = j7 ^ j5;
                    long j9 = ((j6 | j8) ^ j5) | ((j6 | j2) ^ j5) | ((j8 | j2) ^ j5);
                    long j10 = j2 ^ j5;
                    long j11 = j3 + ((j9 | (((j10 | jLongValue) | j7) ^ j5)) * j4) + (((long) (-1180)) * j9) + (j4 * (((j10 | j8) ^ j5) | ((j8 | jLongValue) ^ j5))) + ((long) (-1941489847));
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i15 = ~iMaxMemory;
                    int i16 = ((int) (j11 >> 32)) & ((-1275077368) + (((~(i15 | 696485086)) | 740741324) * (-1042)) + ((696485086 | iMaxMemory) * 521) + (((~(iMaxMemory | (-740741325))) | 671252684 | (~(i15 | 765973726))) * 521));
                    int iNextInt = new Random().nextInt();
                    int i17 = (i16 | (((int) j11) & (((-1520785380) + (((~((~iNextInt) | 1584754898)) | (-1609923028)) * 529)) + (((~(iNextInt | 1584754898)) | (-1272985988)) * 529)))) != 0 ? 1 : 0;
                    int i18 = ~i;
                    int i19 = -i17;
                    int i20 = ((i17 & i19) | (i17 ^ i19)) >> 31;
                    int i21 = (i20 & ((i & (-265)) | (i18 & 264))) | ((~i20) & i);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1907585030);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iMyTid = 4118 - (Process.myTid() >> 22);
                        int iLastIndexOf = 40 - TextUtils.lastIndexOf("", '0', 0);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr2 = new Object[1];
                        a(b3, b4, b4, objArr2);
                        objRemoteActionCompatParcelizer2 = startForeground.read(absoluteGravity, iMyTid, iLastIndexOf, 268088467, false, (String) objArr2[0], new Class[0]);
                    }
                    long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, null)).longValue();
                    long j12 = 1938453838;
                    CharSequence charSequence2 = "";
                    long j13 = -68;
                    long j14 = (((long) 70) * j12) + (j13 * jLongValue2);
                    long j15 = 69;
                    long j16 = j12 ^ j5;
                    long j17 = jLongValue2 ^ j5;
                    long jMyUid = Process.myUid();
                    long j18 = j14 + (((((j16 | j17) | jMyUid) ^ j5) | (((j12 | jLongValue2) | jMyUid) ^ j5)) * j15) + (((long) (-69)) * (((j16 | jLongValue2) ^ j5) | ((j16 | jMyUid) ^ j5) | ((jMyUid | jLongValue2) ^ j5))) + (((j17 | j12) ^ j5) * j15) + ((long) 41552044);
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i22 = ((int) (j18 >> 32)) & (1028043006 + (((~((~iUptimeMillis) | 1778046452)) | 1079694432) * (-591)) + ((iUptimeMillis | 1778046452) * 591));
                    int iMyPid = Process.myPid();
                    if ((i22 | (((int) j18) & ((-384374209) + (((~((~iMyPid) | (-1998876297))) | 857746056) * 446) + (((~(iMyPid | (-1141130241))) | 1118533) * 446) + 302651632))) != 0) {
                        int i23 = read;
                        int i24 = ((i23 | 101) << 1) - (i23 ^ 101);
                        AudioAttributesCompatParcelizer = i24 % 128;
                        int i25 = i24 % 2;
                        i4 = i ^ 281;
                    } else {
                        i4 = i;
                    }
                    int i26 = (~(i & i21)) & (i | i21);
                    int i27 = -i26;
                    int i28 = (i26 & i27) | (i26 ^ i27);
                    int i29 = read + 85;
                    int i30 = i29 % 128;
                    AudioAttributesCompatParcelizer = i30;
                    if (i29 % 2 != 0) {
                        int i31 = i28 * 31;
                        int i32 = i4 & (~i31);
                        int i33 = i31 & i21;
                        i5 = (i32 & i33) | (i32 ^ i33);
                    } else {
                        int i34 = i28 >> 31;
                        i5 = (i4 & (~i34)) | (i34 & i21);
                    }
                    if ((i2 & 16384) == 0) {
                        int i35 = (i30 & 23) + (i30 | 23);
                        read = i35 % 128;
                        if (i35 % 2 == 0) {
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1491817860);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                charSequence = charSequence2;
                                int offsetBefore = 4019 - TextUtils.getOffsetBefore(charSequence, 0);
                                int iMyTid2 = 19 - (Process.myTid() >> 22);
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                Object[] objArr3 = new Object[1];
                                a(b5, b6, b6, objArr3);
                                objRemoteActionCompatParcelizer3 = startForeground.read(cArgb, offsetBefore, iMyTid2, -648188183, false, (String) objArr3[0], new Class[0]);
                            } else {
                                charSequence = charSequence2;
                            }
                            long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, null)).longValue();
                            long j19 = -377701458;
                            long j20 = j19 ^ j5;
                            long j21 = jLongValue3 ^ j5;
                            charSequence2 = charSequence;
                            long jNextInt = new Random().nextInt(2059281609);
                            long j22 = jNextInt ^ j5;
                            j = (j15 * j19) + (((long) (-67)) * jLongValue3) + ((((jNextInt | jLongValue3) ^ j5) | (((j20 | j21) | j22) ^ j5) | ((j19 | jLongValue3) ^ j5)) * j13) + (((jLongValue3 | (j20 | j22)) ^ j5) * j13) + (((long) 68) * (((j21 | j22) ^ j5) | j20)) + ((long) (-634142529));
                            int iNextInt2 = new Random().nextInt();
                            i10 = ((int) (j >> 3)) & (((~(2079047599 | iNextInt2)) * 521) + 1601133768 + (((~((~iNextInt2) | 2079047599)) | 553648642) * 521));
                            i9 = i5;
                        } else {
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1491817860);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int iArgb = 4019 - Color.argb(0, 0, 0, 0);
                                int iMakeMeasureSpec = 19 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 1);
                                Object[] objArr4 = new Object[1];
                                a(b7, b8, b8, objArr4);
                                objRemoteActionCompatParcelizer4 = startForeground.read(cResolveSize, iArgb, iMakeMeasureSpec, -648188183, false, (String) objArr4[0], new Class[0]);
                            }
                            long jLongValue4 = ((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, null)).longValue();
                            long j23 = 530650149;
                            long j24 = j23 ^ j5;
                            i9 = i5;
                            long j25 = ((((long) ((int) Runtime.getRuntime().totalMemory())) ^ j5) | j23) ^ j5;
                            long j26 = (((long) 375) * j23) + (((long) (-747)) * jLongValue4) + (((long) (-374)) * (((j24 | jLongValue4) ^ j5) | j25));
                            long j27 = jLongValue4 ^ j5;
                            j = j26 + (((long) 748) * ((j23 | j27) ^ j5)) + (((long) 374) * (j25 | ((j27 | j24) ^ j5))) + ((long) (-1542494136));
                            int iMyUid = Process.myUid();
                            i10 = ((int) (j >> 32)) & (1199303023 + (((~((~iMyUid) | 1638819514)) | (-1218921371)) * (-235)) + (((~(1638819514 | iMyUid)) | (-1218921371)) * (-470)) + (((~(iMyUid | (-134283521))) | 554181664) * 235));
                        }
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i36 = (-1583099123) + ((~(1856041093 | elapsedCpuTime)) * 216);
                        int i37 = ~elapsedCpuTime;
                        int i38 = ((int) j) & (i36 + (((-286525777) | i37) * (-216)) + (((~(i37 | 1856041093)) | 1001699792) * 216));
                        int i39 = (i38 & i10) | (i10 ^ i38);
                        i6 = i18;
                        int i40 = (i & (-269)) | (i6 & 268);
                        int i41 = -i39;
                        int i42 = ((i39 & i41) | (i39 ^ i41)) >> 31;
                        int i43 = (~i42) & i;
                        int i44 = AudioAttributesCompatParcelizer + 49;
                        int i45 = i44 % 128;
                        read = i45;
                        if (i44 % 2 == 0) {
                            throw null;
                        }
                        int i46 = i42 & i40;
                        int i47 = (i46 & i43) | (i43 ^ i46);
                        int i48 = (~(i & i9)) & (i | i9);
                        int i49 = -i48;
                        int i50 = ((i48 & i49) | (i48 ^ i49)) >> 31;
                        int i51 = i47 & (~i50);
                        int i52 = (i45 & 45) + (i45 | 45);
                        AudioAttributesCompatParcelizer = i52 % 128;
                        int i53 = i52 % 2;
                        int i54 = i9 & i50;
                        i5 = (i51 & i54) | (i51 ^ i54);
                        int i55 = ((i45 | 99) << 1) - (i45 ^ 99);
                        AudioAttributesCompatParcelizer = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        i6 = i18;
                    }
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-375411667);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        CharSequence charSequence3 = charSequence2;
                        int iIndexOf = 4019 - TextUtils.indexOf(charSequence3, charSequence3);
                        int iIndexOf2 = 18 - TextUtils.indexOf(charSequence3, '0');
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        Object[] objArr5 = new Object[1];
                        a(b9, b10, b10, objArr5);
                        objRemoteActionCompatParcelizer5 = startForeground.read(threadPriority, iIndexOf, iIndexOf2, -1747556168, false, (String) objArr5[0], new Class[0]);
                    }
                    long jLongValue5 = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, null)).longValue();
                    long j28 = -743637000;
                    long j29 = 52;
                    long j30 = j8 | j28;
                    long j31 = jLongValue5 ^ j5;
                    long j32 = (((long) (-51)) * j28) + (((long) 53) * jLongValue5) + (((j30 | jLongValue5) ^ j5) * j29) + (((long) (-52)) * (((j31 | j8) ^ j5) | ((j31 | j28) ^ j5) | (j30 ^ j5)));
                    long j33 = j28 ^ j5;
                    long j34 = j32 + (j29 * (((jLongValue5 | j33) ^ j5) | ((j33 | j8) ^ j5))) + ((long) 1691197968);
                    int i57 = ~new Random().nextInt();
                    int i58 = ((int) (j34 >> 32)) & ((-1576716998) + ((~((-713052769) | i57)) * 52) + (((~((-780423781) | i57)) | (~(2077317104 | i57)) | 67371012) * (-52)) + (((~(i57 | 780423780)) | 1364264336) * 52));
                    int i59 = ~(Process.myPid() | (-668918408));
                    int i60 = ((int) j34) & (905694447 + ((768308002 | i59) * (-220)) + ((i59 | 634020354) * 220) + 1430557926);
                    int i61 = (i58 & i60) | (i58 ^ i60);
                    int i62 = -i61;
                    int i63 = ((i61 & i62) | (i61 ^ i62)) >> 31;
                    int i64 = (~i63) & i;
                    int i65 = i63 & ((i & (-267)) | (i6 & 266));
                    int i66 = (i65 & i64) | (i64 ^ i65);
                    int i67 = ((~i5) & i) | (i5 & i6);
                    int i68 = -i67;
                    int i69 = ((i67 & i68) | (i67 ^ i68)) >> 31;
                    int i70 = i66 & (~i69);
                    int i71 = i5 & i69;
                    int i72 = (i71 & i70) | (i70 ^ i71);
                    if ((i2 & 524288) == 0) {
                        int i73 = read;
                        int i74 = (i73 ^ 29) + ((i73 & 29) << 1);
                        AudioAttributesCompatParcelizer = i74 % 128;
                        int i75 = i74 % 2;
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1878396060);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31604);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3694;
                            int i76 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26;
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr6 = new Object[1];
                            a(b11, b12, b12, objArr6);
                            objRemoteActionCompatParcelizer6 = startForeground.read(modifierMetaStateMask2, minimumFlingVelocity, i76, 297781257, false, (String) objArr6[0], new Class[0]);
                        }
                        long jLongValue6 = ((Long) ((Method) objRemoteActionCompatParcelizer6).invoke(null, null)).longValue();
                        long j35 = -156899892;
                        long j36 = -344;
                        long j37 = (j36 * j35) + (j36 * jLongValue6);
                        long j38 = 345;
                        long j39 = j35 ^ j5;
                        long j40 = jLongValue6 ^ j5;
                        long j41 = j39 | j40;
                        long j42 = j37 + (((j41 ^ j5) | ((j39 | j7) ^ j5)) * j38) + ((((j40 | j35) ^ j5) | ((j39 | j8) ^ j5)) * j38) + (j38 * ((j41 | j7) ^ j5)) + ((long) (-1004387712));
                        int i77 = (int) (j42 >> 32);
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i78 = ~startElapsedRealtime;
                        int i79 = ((((~(i78 | (-114443960))) | ((~((-1551670371) | i78)) | 72352802)) * (-397)) - 1494606782) + ((startElapsedRealtime | (-1521408726)) * 397);
                        int i80 = read - (-51);
                        AudioAttributesCompatParcelizer = i80 % 128;
                        if (i80 % 2 != 0) {
                            Object obj = null;
                            new Random().nextInt(744848988);
                            obj.hashCode();
                            throw null;
                        }
                        int i81 = i77 & i79;
                        int i82 = ~((int) SystemClock.uptimeMillis());
                        int i83 = ((int) j42) & ((-705739679) + ((~((-405438509) | i82)) * 52) + (((~((-1014731069) | i82)) | (~(422495341 | i82)) | 609292560) * (-52)) + (((~(i82 | 1014731068)) | 17056833) * 52));
                        int i84 = (i81 & i83) | (i81 ^ i83);
                        if (i84 > 0 && (i84 != 3 || (i2 & 268435456) == 0)) {
                            int i85 = i ^ i72;
                            int i86 = -i85;
                            int i87 = ((i85 & i86) | (i85 ^ i86)) >> 31;
                            int i88 = ((i & (-281)) | (i6 & 280)) & (~i87);
                            int i89 = i72 & i87;
                            i72 = (i89 & i88) | (i88 ^ i89);
                        }
                        int i90 = (~(i & 287)) & (i | 287);
                        int i91 = read;
                        int i92 = (i91 ^ 21) + ((i91 & 21) << 1);
                        int i93 = i92 % 128;
                        AudioAttributesCompatParcelizer = i93;
                        int i94 = i92 % 2;
                        int i95 = ~i84;
                        int i96 = -i95;
                        int i97 = ((i95 & i96) | (i95 ^ i96)) >> 31;
                        int i98 = (i93 ^ 125) + ((i93 & 125) << 1);
                        int i99 = i98 % 128;
                        read = i99;
                        if (i98 % 2 == 0) {
                            throw null;
                        }
                        int i100 = i90 & (~i97);
                        int i101 = i97 & i;
                        int i102 = (i101 & i100) | (i100 ^ i101);
                        int i103 = (i99 ^ 43) + ((i99 & 43) << 1);
                        int i104 = i103 % 128;
                        AudioAttributesCompatParcelizer = i104;
                        if (i103 % 2 != 0) {
                            int i105 = i ^ i72;
                            int i106 = -i105;
                            i8 = ((i105 & i106) | (i105 ^ i106)) % 24;
                        } else {
                            int i107 = ((~i72) & i) | (i72 & i6);
                            int i108 = -i107;
                            i8 = ((i107 & i108) | (i107 ^ i108)) >> 31;
                        }
                        int i109 = i104 + 67;
                        read = i109 % 128;
                        int i110 = i109 % 2;
                        int i111 = i102 & (~i8);
                        int i112 = i104 + 85;
                        read = i112 % 128;
                        int i113 = i112 % 2;
                        int i114 = i72 & i8;
                        i72 = (i114 & i111) | (i111 ^ i114);
                        i7 = 16;
                    } else {
                        i7 = 16;
                    }
                    byte[] bArr = new byte[i7];
                    Object[] objArr7 = {bArr};
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1196681127);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> i7);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1904;
                        int maxKeyCode = 43 - (KeyEvent.getMaxKeyCode() >> i7);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr8 = new Object[1];
                        a(b13, b14, b14, objArr8);
                        objRemoteActionCompatParcelizer7 = startForeground.read(jumpTapTimeout, scrollBarSize, maxKeyCode, -958014260, false, (String) objArr8[0], new Class[]{byte[].class});
                    }
                    long jLongValue7 = ((Long) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr7)).longValue();
                    long j43 = -460989760;
                    long j44 = -344;
                    long j45 = (j44 * j43) + (j44 * jLongValue7);
                    long j46 = 345;
                    long j47 = j43 ^ j5;
                    long j48 = jLongValue7 ^ j5;
                    long j49 = j47 | j48;
                    int i115 = i72;
                    long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j50 = j45 + (((j49 ^ j5) | ((j47 | jElapsedRealtime) ^ j5)) * j46) + ((((j47 | (jElapsedRealtime ^ j5)) ^ j5) | ((j48 | j43) ^ j5)) * j46) + (j46 * ((j49 | jElapsedRealtime) ^ j5)) + ((long) 1331046331);
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i116 = ((int) (j50 >> 32)) & (((~((~iElapsedRealtime) | (-536936785))) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS) + 283418882 + (((~(iElapsedRealtime | (-536936785))) | (-2113895420)) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                    int i117 = ((int) j50) & ((((((~((-245945193) | i6)) | 67109120) | (~((-1683171603) | i6))) * (-397)) - 954554348) + (((-1794898555) | i) * 397));
                    int i118 = (i116 & i117) | (i116 ^ i117);
                    int i119 = (~(i & 313)) & (i | 313);
                    int i120 = -i118;
                    int i121 = ((i118 & i120) | (i118 ^ i120)) >> 31;
                    int i122 = (~i121) & i;
                    int i123 = AudioAttributesCompatParcelizer;
                    int i124 = (i123 & 91) + (i123 | 91);
                    read = i124 % 128;
                    int i125 = i124 % 2;
                    int i126 = (i121 & i119) | i122;
                    String[] strArr = {Base64.encodeToString(bArr, 0)};
                    Object[] objArr9 = new Object[2];
                    int i127 = ((~i115) & i) | (i115 & i6);
                    int i128 = -i127;
                    int i129 = ((i127 & i128) | (i127 ^ i128)) >> 31;
                    int i130 = read;
                    int i131 = (i130 ^ 105) + ((i130 & 105) << 1);
                    int i132 = i131 % 128;
                    AudioAttributesCompatParcelizer = i132;
                    int i133 = i131 % 2;
                    int i134 = i129 & 1;
                    int i135 = -i134;
                    int i136 = (~(((i135 & i134) | (i134 ^ i135)) >> 31)) & 1;
                    objArr9[i134] = strArr;
                    objArr9[i136] = null;
                    String[] strArr2 = (String[]) objArr9[0];
                    int i137 = i ^ i115;
                    int i138 = (i137 | (-i137)) >> 31;
                    int i139 = i126 & (~i138);
                    int i140 = i138 & i115;
                    int i141 = (i139 & i140) | (i139 ^ i140);
                    Object[] objArr10 = {strArr2, new int[1], new int[]{i}, new int[]{i141}};
                    int i142 = (i132 ^ 81) + ((i132 & 81) << 1);
                    read = i142 % 128;
                    int i143 = i142 % 2;
                    int i144 = ((~i141) & i) | (i6 & i141);
                    int i145 = -i144;
                    int i146 = ~((int) SystemClock.elapsedRealtime());
                    int i147 = ((((-897858169) + (((-807665989) | i146) * 494)) + (((~(i146 | 1137420857)) | (-1915618134)) * 494)) - (~(-(-((((i144 & i145) | (i144 ^ i145)) >> 31) & 16))))) - 1;
                    int iAudioAttributesCompatParcelizer = WalletConstantsBillingAddressFormat.AnonymousClass1.AudioAttributesCompatParcelizer();
                    int i148 = i147 * (-51);
                    int i149 = i3 * 53;
                    int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
                    int i151 = ~iAudioAttributesCompatParcelizer;
                    int i152 = (i151 ^ i147) | (i151 & i147);
                    int i153 = (~((i152 ^ i3) | (i152 & i3))) * 52;
                    int i154 = (i150 & i153) + (i153 | i150);
                    int i155 = ~i3;
                    int i156 = ~iAudioAttributesCompatParcelizer;
                    int i157 = ~((i156 & i155) | (i155 ^ i156));
                    int i158 = ~((i155 & i147) | (i155 ^ i147));
                    int i159 = (i157 & i158) | (i157 ^ i158);
                    int i160 = read;
                    int i161 = (i160 & 1) + (i160 | 1);
                    AudioAttributesCompatParcelizer = i161 % 128;
                    int i162 = i161 % 2;
                    int i163 = i152 ^ (-1);
                    int i164 = -(-((-52) * ((i159 & i163) | (i159 ^ i163))));
                    int i165 = ((i154 | i164) << 1) - (i164 ^ i154);
                    int i166 = ~i147;
                    int i167 = ~((i151 & i166) | (i166 ^ i151));
                    int i168 = ~i147;
                    int i169 = (i167 | (~((i168 & i3) | (i168 ^ i3)))) * 52;
                    int i170 = (i165 ^ i169) + ((i169 & i165) << 1);
                    int i171 = i170 << 13;
                    int i172 = (i171 | i170) & (~(i170 & i171));
                    int i173 = i172 ^ (i172 >>> 17);
                    int i174 = i173 << 5;
                    ((int[]) objArr10[1])[0] = ((~i173) & i174) | ((~i174) & i173);
                    return objArr10;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        });
    }

    public void setChipDrawable(addExtractorsForFileType addextractorsforfiletype) {
        addExtractorsForFileType addextractorsforfiletype2 = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype2 != addextractorsforfiletype) {
            read(addextractorsforfiletype2);
            this.AudioAttributesImplApi21Parcelizer = addextractorsforfiletype;
            addextractorsforfiletype.onCommand();
            IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            IconCompatParcelizer(this.MediaDescriptionCompat);
        }
    }

    private void onCustomAction() {
        if (outputPendingSampleMetadata.write) {
            onAddQueueItem();
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(true);
        InvalidTypeIdException.read(this, onFastForward());
        handleMediaPlayPauseIfPendingOnHandler();
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (onFastForward() == this.RatingCompat && this.AudioAttributesImplApi21Parcelizer.getCallback() == null) {
            this.AudioAttributesImplApi21Parcelizer.setCallback(this.RatingCompat);
        }
    }

    private Drawable onFastForward() {
        InsetDrawable insetDrawable = this.RatingCompat;
        return insetDrawable == null ? this.AudioAttributesImplApi21Parcelizer : insetDrawable;
    }

    private void onAddQueueItem() {
        this.onPlay = new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver()), onFastForward(), null);
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(false);
        InvalidTypeIdException.read(this, this.onPlay);
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private static void read(addExtractorsForFileType addextractorsforfiletype) {
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer((addExtractorsForFileType.write) null);
        }
    }

    private void IconCompatParcelizer(addExtractorsForFileType addextractorsforfiletype) {
        addextractorsforfiletype.AudioAttributesCompatParcelizer(this);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, read);
        }
        if (write()) {
            mergeDrawableStates(iArrOnCreateDrawableState, AudioAttributesCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == onFastForward() || drawable == this.onPlay) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == onFastForward() || drawable == this.onPlay) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            return addextractorsforfiletype.AudioAttributesImplBaseParcelizer();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
                throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
            }
            super.setEllipsize(truncateAt);
            addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
            if (addextractorsforfiletype != null) {
                addextractorsforfiletype.write(truncateAt);
            }
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPlayFromMediaId(i);
        }
    }

    @Override // o.addExtractorsForFileType.write
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer(this.MediaDescriptionCompat);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype == null) {
            this.AudioAttributesImplBaseParcelizer = z;
        } else if (addextractorsforfiletype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            super.setChecked(z);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCommand = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.handleMediaPlayPauseIfPendingOnHandler = onClickListener;
        onCommand();
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.handleMediaPlayPauseIfPendingOnHandler;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.onPlayFromMediaId) {
            this.onMediaButtonEvent.write(1, 1);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.MediaBrowserCompatItemReceiver()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L41
            if (r1 != 0) goto L48
            r5.IconCompatParcelizer(r2)
            goto L48
        L2b:
            boolean r0 = r5.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L34
            r5.AudioAttributesImplBaseParcelizer()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.IconCompatParcelizer(r2)
            if (r0 != 0) goto L48
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.IconCompatParcelizer(r3)
            goto L48
        L41:
            boolean r5 = super.onTouchEvent(r6)
            if (r5 != 0) goto L48
            return r2
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            RemoteActionCompatParcelizer(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.onPlayFromMediaId) {
            return this.onMediaButtonEvent.RemoteActionCompatParcelizer(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.onPlayFromMediaId) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.onMediaButtonEvent.AudioAttributesCompatParcelizer(keyEvent) || this.onMediaButtonEvent.write() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.onPlayFromMediaId) {
            this.onMediaButtonEvent.read(z, i, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.onPlayFromMediaId && (this.onMediaButtonEvent.write() == 1 || this.onMediaButtonEvent.IconCompatParcelizer() == 1)) {
            rect.set(MediaBrowserCompatSearchResultReceiver());
        } else {
            super.getFocusedRect(rect);
        }
    }

    private void IconCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != z) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            refreshDrawableState();
        }
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer != z) {
            this.AudioAttributesImplApi26Parcelizer = z;
            refreshDrawableState();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null && addextractorsforfiletype.onAddQueueItem() && this.AudioAttributesImplApi21Parcelizer.read(AudioAttributesImplApi21Parcelizer())) {
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] AudioAttributesImplApi21Parcelizer() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.MediaBrowserCompatItemReceiver) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.AudioAttributesImplApi26Parcelizer) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.MediaBrowserCompatItemReceiver) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RatingCompat() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        return (addextractorsforfiletype == null || addextractorsforfiletype.AudioAttributesImplApi26Parcelizer() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF MediaBrowserCompatItemReceiver() {
        this.onCustomAction.setEmpty();
        if (RatingCompat() && this.handleMediaPlayPauseIfPendingOnHandler != null) {
            this.AudioAttributesImplApi21Parcelizer.write(this.onCustomAction);
        }
        return this.onCustomAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect MediaBrowserCompatSearchResultReceiver() {
        RectF rectFMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        this.onAddQueueItem.set((int) rectFMediaBrowserCompatItemReceiver.left, (int) rectFMediaBrowserCompatItemReceiver.top, (int) rectFMediaBrowserCompatItemReceiver.right, (int) rectFMediaBrowserCompatItemReceiver.bottom);
        return this.onAddQueueItem;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (MediaBrowserCompatItemReceiver().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // kotlin.skipFullyQuietly
    public void setInternalOnCheckedChangeListener(skipFullyQuietly.RemoteActionCompatParcelizer<Chip> remoteActionCompatParcelizer) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer;
    }

    class RemoteActionCompatParcelizer extends call1 {
        RemoteActionCompatParcelizer(Chip chip) {
            super(chip);
        }

        @Override // kotlin.call1
        public final int IconCompatParcelizer(float f, float f2) {
            return (Chip.this.RatingCompat() && Chip.this.MediaBrowserCompatItemReceiver().contains(f, f2)) ? 1 : 0;
        }

        @Override // kotlin.call1
        public final void read(List<Integer> list) {
            list.add(0);
            if (Chip.this.RatingCompat() && Chip.this.AudioAttributesCompatParcelizer() && Chip.this.handleMediaPlayPauseIfPendingOnHandler != null) {
                list.add(1);
            }
        }

        @Override // kotlin.call1
        public final void read(int i, boolean z) {
            if (i == 1) {
                Chip.this.MediaBrowserCompatItemReceiver = z;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // kotlin.call1
        public final void read(int i, hasSuperClassStartingWith hassuperclassstartingwith) {
            if (i == 1) {
                CharSequence charSequenceRemoteActionCompatParcelizer = Chip.this.RemoteActionCompatParcelizer();
                if (charSequenceRemoteActionCompatParcelizer != null) {
                    hassuperclassstartingwith.IconCompatParcelizer(charSequenceRemoteActionCompatParcelizer);
                } else {
                    CharSequence text = Chip.this.getText();
                    hassuperclassstartingwith.IconCompatParcelizer(Chip.this.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
                }
                hassuperclassstartingwith.RemoteActionCompatParcelizer(Chip.this.MediaBrowserCompatSearchResultReceiver());
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.write);
                hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(Chip.this.isEnabled());
                return;
            }
            hassuperclassstartingwith.IconCompatParcelizer("");
            hassuperclassstartingwith.RemoteActionCompatParcelizer(Chip.RemoteActionCompatParcelizer);
        }

        @Override // kotlin.call1
        public final void RemoteActionCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(Chip.this.write());
            hassuperclassstartingwith.AudioAttributesImplApi26Parcelizer(Chip.this.isClickable());
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(Chip.this.getAccessibilityClassName());
            hassuperclassstartingwith.MediaBrowserCompatItemReceiver(Chip.this.getText());
        }

        @Override // kotlin.call1
        public final boolean IconCompatParcelizer(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.AudioAttributesImplBaseParcelizer();
            }
            return false;
        }
    }

    public void setChipBackgroundColorResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.IconCompatParcelizer(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.IconCompatParcelizer(colorStateList);
        }
    }

    private float onPlay() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        return addextractorsforfiletype != null ? addextractorsforfiletype.read() : BitmapDescriptorFactory.HUE_RED;
    }

    public void setChipMinHeightResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RatingCompat(i);
        }
    }

    public void setChipMinHeight(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.write(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatItemReceiver(i);
        }
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        this.AudioAttributesImplApi21Parcelizer.setShapeAppearanceModel(isvalidframetype);
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.read(f);
        }
    }

    public void setChipStrokeColorResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaDescriptionCompat(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatMediaItem(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplBaseParcelizer(f);
        }
    }

    public void setRippleColorResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onFastForward(i);
            if (this.AudioAttributesImplApi21Parcelizer.MediaDescriptionCompat()) {
                return;
            }
            onAddQueueItem();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplApi26Parcelizer(colorStateList);
        }
        if (this.AudioAttributesImplApi21Parcelizer.MediaDescriptionCompat()) {
            return;
        }
        onAddQueueItem();
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(addextractorsforfiletype.handleMediaPlayPauseIfPendingOnHandler() ? null : charSequence, bufferType);
            addExtractorsForFileType addextractorsforfiletype2 = this.AudioAttributesImplApi21Parcelizer;
            if (addextractorsforfiletype2 != null) {
                addextractorsforfiletype2.write(charSequence);
            }
        }
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextAppearance(TrackOutput trackOutput) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.IconCompatParcelizer(trackOutput);
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPlayFromUri(i);
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPlayFromUri(i);
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaDescriptionCompat(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        TextPaint paint = getPaint();
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            paint.drawableState = addextractorsforfiletype.getState();
        }
        TrackOutput trackOutputMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (trackOutputMediaBrowserCompatMediaItem != null) {
            trackOutputMediaBrowserCompatMediaItem.write(getContext(), paint, this.MediaBrowserCompatMediaItem);
        }
    }

    private TrackOutput MediaBrowserCompatMediaItem() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            return addextractorsforfiletype.MediaBrowserCompatMediaItem();
        }
        return null;
    }

    public void setChipIconVisible(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaMetadataCompat(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer(z);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatCustomActionResultReceiver(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.read(drawable);
        }
    }

    public void setChipIconTintResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplApi21Parcelizer(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.read(colorStateList);
        }
    }

    public void setChipIconSizeResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplApi26Parcelizer(i);
        }
    }

    public void setChipIconSize(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RemoteActionCompatParcelizer(f);
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        return addextractorsforfiletype != null && addextractorsforfiletype.onCustomAction();
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.read(z);
        }
        onCommand();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onCommand(i);
        }
        onCommand();
    }

    public void setCloseIcon(Drawable drawable) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.IconCompatParcelizer(drawable);
        }
        onCommand();
    }

    public void setCloseIconTintResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RemoteActionCompatParcelizer(colorStateList);
        }
    }

    public void setCloseIconSizeResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onCustomAction(i);
        }
    }

    public void setCloseIconSize(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatItemReceiver(f);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer(charSequence);
        }
    }

    public final CharSequence RemoteActionCompatParcelizer() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            return addextractorsforfiletype.AudioAttributesImplApi21Parcelizer();
        }
        return null;
    }

    public final boolean write() {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        return addextractorsforfiletype != null && addextractorsforfiletype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public void setCheckableResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.read(i);
        }
    }

    public void setCheckable(boolean z) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.write(z);
        }
    }

    public void setCheckedIconVisible(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RemoteActionCompatParcelizer(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RemoteActionCompatParcelizer(z);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.write(i);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RemoteActionCompatParcelizer(drawable);
        }
    }

    public void setCheckedIconTintResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.write(colorStateList);
        }
    }

    public void setShowMotionSpecResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPrepareFromSearch(i);
        }
    }

    public void setHideMotionSpecResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPause(i);
        }
    }

    public void setChipStartPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatSearchResultReceiver(i);
        }
    }

    public void setChipStartPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.IconCompatParcelizer(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onMediaButtonEvent(i);
        }
    }

    public void setIconStartPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatMediaItem(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPlay(i);
        }
    }

    public void setIconEndPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplApi21Parcelizer(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPrepare(i);
        }
    }

    public void setTextStartPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatSearchResultReceiver(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onPrepareFromMediaId(i);
        }
    }

    public void setTextEndPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.RatingCompat(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.onAddQueueItem(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplApi26Parcelizer(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.handleMediaPlayPauseIfPendingOnHandler(i);
        }
    }

    public void setCloseIconEndPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.MediaBrowserCompatCustomActionResultReceiver(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesImplBaseParcelizer(i);
        }
    }

    public void setChipEndPadding(float f) {
        addExtractorsForFileType addextractorsforfiletype = this.AudioAttributesImplApi21Parcelizer;
        if (addextractorsforfiletype != null) {
            addextractorsforfiletype.AudioAttributesCompatParcelizer(f);
        }
    }

    private boolean onPlayFromMediaId() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
        IconCompatParcelizer(this.MediaDescriptionCompat);
    }

    private boolean IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
        if (!onPlayFromMediaId()) {
            if (this.RatingCompat != null) {
                MediaMetadataCompat();
            } else {
                onCustomAction();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.AudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.AudioAttributesImplApi21Parcelizer.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.RatingCompat != null) {
                MediaMetadataCompat();
            } else {
                onCustomAction();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.RatingCompat != null) {
            Rect rect = new Rect();
            this.RatingCompat.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                onCustomAction();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        IconCompatParcelizer(i2, i3, i2, i3);
        onCustomAction();
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.write = charSequence;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.write)) {
            return this.write;
        }
        if (!write()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).AudioAttributesCompatParcelizer()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    private void MediaMetadataCompat() {
        if (this.RatingCompat != null) {
            this.RatingCompat = null;
            setMinWidth(0);
            setMinHeight((int) onPlay());
            onCustomAction();
        }
    }

    private void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        this.RatingCompat = new InsetDrawable((Drawable) this.AudioAttributesImplApi21Parcelizer, i, i2, i3, i4);
    }
}
