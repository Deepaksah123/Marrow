package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.InvalidTypeIdException;
import kotlin.VorbisUtilVorbisIdHeader;
import kotlin.amrSignatureNb;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.mapArray;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private final int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final List<write> AudioAttributesImplApi26Parcelizer;
    private final IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final Comparator<MaterialButton> IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final LinkedHashSet<AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private Set<Integer> RemoteActionCompatParcelizer;
    private Integer[] read;

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer(int i, boolean z);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        this.AudioAttributesImplBaseParcelizer = new IconCompatParcelizer(this, (byte) 0);
        this.MediaBrowserCompatItemReceiver = new LinkedHashSet<>();
        this.IconCompatParcelizer = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.RemoteActionCompatParcelizer = new HashSet();
        TypedArray typedArrayWrite = readId3Metadata.write(getContext(), attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButtonToggleGroup_singleSelection, false));
        this.AudioAttributesCompatParcelizer = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButtonToggleGroup_checkedButton, -1);
        this.AudioAttributesImplApi21Parcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayWrite.recycle();
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.AudioAttributesCompatParcelizer;
        if (i != -1) {
            AudioAttributesCompatParcelizer(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AudioAttributesCompatParcelizer();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            AudioAttributesCompatParcelizer(materialButton);
            read(materialButton);
            IconCompatParcelizer(materialButton.getId(), materialButton.isChecked());
            isValidFrameType isvalidframetype = materialButton.read();
            this.AudioAttributesImplApi26Parcelizer.add(new write(isvalidframetype.MediaBrowserCompatSearchResultReceiver(), isvalidframetype.read(), isvalidframetype.MediaMetadataCompat(), isvalidframetype.MediaBrowserCompatItemReceiver()));
            materialButton.setEnabled(isEnabled());
            InvalidTypeIdException.AudioAttributesCompatParcelizer(materialButton, new deserializeUsingCustom() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
                @Override // kotlin.deserializeUsingCustom
                public final void onInitializeAccessibilityNodeInfo(View view2, hasSuperClassStartingWith hassuperclassstartingwith) {
                    super.onInitializeAccessibilityNodeInfo(view2, hassuperclassstartingwith);
                    hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(0, 1, MaterialButtonToggleGroup.this.RemoteActionCompatParcelizer(view2), 1, false, ((MaterialButton) view2).isChecked()));
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).read(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.AudioAttributesImplApi26Parcelizer.remove(iIndexOfChild);
        }
        AudioAttributesImplApi21Parcelizer();
        IconCompatParcelizer();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        AudioAttributesImplApi21Parcelizer();
        IconCompatParcelizer();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hasSuperClassStartingWith.write(accessibilityNodeInfo).RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(1, read(), false, MediaBrowserCompatCustomActionResultReceiver() ? 1 : 2));
    }

    public final void read(int i) {
        IconCompatParcelizer(i, true);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer(new HashSet());
    }

    public final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver.add(audioAttributesCompatParcelizer);
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setSingleSelection(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != z) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            AudioAttributesImplApi26Parcelizer();
        }
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        for (int i = 0; i < getChildCount(); i++) {
            AudioAttributesCompatParcelizer(i).IconCompatParcelizer((this.MediaBrowserCompatCustomActionResultReceiver ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private void AudioAttributesCompatParcelizer(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.MediaBrowserCompatSearchResultReceiver = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.MediaBrowserCompatSearchResultReceiver = false;
        }
    }

    private void IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == -1) {
            return;
        }
        for (int i = iRemoteActionCompatParcelizer + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            int iMin = Math.min(materialButtonAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(), AudioAttributesCompatParcelizer(i - 1).MediaBrowserCompatItemReceiver());
            LinearLayout.LayoutParams layoutParamsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((View) materialButtonAudioAttributesCompatParcelizer);
            if (getOrientation() == 0) {
                mapArray.RemoteActionCompatParcelizer(layoutParamsAudioAttributesCompatParcelizer, 0);
                mapArray.AudioAttributesCompatParcelizer(layoutParamsAudioAttributesCompatParcelizer, -iMin);
                ((ViewGroup.MarginLayoutParams) layoutParamsAudioAttributesCompatParcelizer).topMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParamsAudioAttributesCompatParcelizer).bottomMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParamsAudioAttributesCompatParcelizer).topMargin = -iMin;
                mapArray.AudioAttributesCompatParcelizer(layoutParamsAudioAttributesCompatParcelizer, 0);
            }
            materialButtonAudioAttributesCompatParcelizer.setLayoutParams(layoutParamsAudioAttributesCompatParcelizer);
        }
        write(iRemoteActionCompatParcelizer);
    }

    private MaterialButton AudioAttributesCompatParcelizer(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private void write(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) AudioAttributesCompatParcelizer(i).getLayoutParams();
        if (getOrientation() == 1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        } else {
            mapArray.RemoteActionCompatParcelizer(layoutParams, 0);
            mapArray.AudioAttributesCompatParcelizer(layoutParams, 0);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int childCount = getChildCount();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int iWrite = write();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (materialButtonAudioAttributesCompatParcelizer.getVisibility() != 8) {
                isValidFrameType.write writeVarMediaDescriptionCompat = materialButtonAudioAttributesCompatParcelizer.read().MediaDescriptionCompat();
                write(writeVarMediaDescriptionCompat, write(i, iRemoteActionCompatParcelizer, iWrite));
                materialButtonAudioAttributesCompatParcelizer.setShapeAppearanceModel(writeVarMediaDescriptionCompat.RemoteActionCompatParcelizer());
            }
        }
    }

    private int RemoteActionCompatParcelizer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (IconCompatParcelizer(i)) {
                return i;
            }
        }
        return -1;
    }

    private int write() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (IconCompatParcelizer(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean IconCompatParcelizer(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private int read() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && IconCompatParcelizer(i2)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int RemoteActionCompatParcelizer(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && IconCompatParcelizer(i2)) {
                i++;
            }
        }
        return -1;
    }

    private write write(int i, int i2, int i3) {
        write writeVar = this.AudioAttributesImplApi26Parcelizer.get(i);
        if (i2 == i3) {
            return writeVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? write.RemoteActionCompatParcelizer(writeVar, this) : write.RemoteActionCompatParcelizer(writeVar);
        }
        if (i == i3) {
            return z ? write.write(writeVar, this) : write.read(writeVar);
        }
        return null;
    }

    private static void write(isValidFrameType.write writeVar, write writeVar2) {
        if (writeVar2 == null) {
            writeVar.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        } else {
            writeVar.AudioAttributesCompatParcelizer(writeVar2.write).write(writeVar2.IconCompatParcelizer).read(writeVar2.AudioAttributesCompatParcelizer).IconCompatParcelizer(writeVar2.RemoteActionCompatParcelizer);
        }
    }

    private void IconCompatParcelizer(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.RemoteActionCompatParcelizer);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.MediaBrowserCompatCustomActionResultReceiver && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.AudioAttributesImplApi21Parcelizer || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        AudioAttributesCompatParcelizer(hashSet);
    }

    private void AudioAttributesCompatParcelizer(Set<Integer> set) {
        Set<Integer> set2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = AudioAttributesCompatParcelizer(i).getId();
            AudioAttributesCompatParcelizer(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                read(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void read(int i, boolean z) {
        Iterator<AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(i, z);
        }
    }

    private static void AudioAttributesCompatParcelizer(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(InvalidTypeIdException.read());
        }
    }

    private void read(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.read(this.AudioAttributesImplBaseParcelizer);
        materialButton.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static LinearLayout.LayoutParams AudioAttributesCompatParcelizer(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.read;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    private void AudioAttributesCompatParcelizer() {
        TreeMap treeMap = new TreeMap(this.IconCompatParcelizer);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(AudioAttributesCompatParcelizer(i), Integer.valueOf(i));
        }
        this.read = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    final void read(MaterialButton materialButton, boolean z) {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            return;
        }
        IconCompatParcelizer(materialButton.getId(), z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            AudioAttributesCompatParcelizer(i).setEnabled(z);
        }
    }

    class IconCompatParcelizer implements MaterialButton.RemoteActionCompatParcelizer {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(MaterialButtonToggleGroup materialButtonToggleGroup, byte b) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.RemoteActionCompatParcelizer
        public final void write() {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    static class write {
        private static final VorbisUtilVorbisIdHeader read = new amrSignatureNb(BitmapDescriptorFactory.HUE_RED);
        VorbisUtilVorbisIdHeader AudioAttributesCompatParcelizer;
        VorbisUtilVorbisIdHeader IconCompatParcelizer;
        VorbisUtilVorbisIdHeader RemoteActionCompatParcelizer;
        VorbisUtilVorbisIdHeader write;

        write(VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader, VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader2, VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader3, VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader4) {
            this.write = vorbisUtilVorbisIdHeader;
            this.AudioAttributesCompatParcelizer = vorbisUtilVorbisIdHeader3;
            this.RemoteActionCompatParcelizer = vorbisUtilVorbisIdHeader4;
            this.IconCompatParcelizer = vorbisUtilVorbisIdHeader2;
        }

        public static write RemoteActionCompatParcelizer(write writeVar, View view) {
            return checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view) ? IconCompatParcelizer(writeVar) : AudioAttributesCompatParcelizer(writeVar);
        }

        public static write write(write writeVar, View view) {
            return checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view) ? AudioAttributesCompatParcelizer(writeVar) : IconCompatParcelizer(writeVar);
        }

        private static write AudioAttributesCompatParcelizer(write writeVar) {
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader = writeVar.write;
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader2 = writeVar.IconCompatParcelizer;
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader3 = read;
            return new write(vorbisUtilVorbisIdHeader, vorbisUtilVorbisIdHeader2, vorbisUtilVorbisIdHeader3, vorbisUtilVorbisIdHeader3);
        }

        private static write IconCompatParcelizer(write writeVar) {
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader = read;
            return new write(vorbisUtilVorbisIdHeader, vorbisUtilVorbisIdHeader, writeVar.AudioAttributesCompatParcelizer, writeVar.RemoteActionCompatParcelizer);
        }

        public static write RemoteActionCompatParcelizer(write writeVar) {
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader = writeVar.write;
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader2 = read;
            return new write(vorbisUtilVorbisIdHeader, vorbisUtilVorbisIdHeader2, writeVar.AudioAttributesCompatParcelizer, vorbisUtilVorbisIdHeader2);
        }

        public static write read(write writeVar) {
            VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader = read;
            return new write(vorbisUtilVorbisIdHeader, writeVar.IconCompatParcelizer, vorbisUtilVorbisIdHeader, writeVar.RemoteActionCompatParcelizer);
        }
    }
}
