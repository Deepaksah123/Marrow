package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C0170format;
import kotlin.PrivateMaxEntriesMapUpdateTask;
import kotlin.TypeDeserializer;
import kotlin.buildTypeSerializer;
import kotlin.checkArgument;
import kotlin.collectAndResolveSubtypesByTypeId;
import kotlin.initExtraTracks;
import kotlin.maximumCapacity;
import kotlin.setName;

/* JADX INFO: loaded from: classes4.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean AudioAttributesCompatParcelizer;
    private final Map<setName, TypeDeserializer> AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final AudioAttributesCompatParcelizer IconCompatParcelizer;
    private RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final LayoutInflater MediaBrowserCompatItemReceiver;
    private final List<collectAndResolveSubtypesByTypeId.write> MediaBrowserCompatMediaItem;
    private PrivateMaxEntriesMapUpdateTask MediaDescriptionCompat;
    private Comparator<IconCompatParcelizer> MediaMetadataCompat;
    private CheckedTextView[][] RatingCompat;
    private final CheckedTextView RemoteActionCompatParcelizer;
    private boolean read;
    private final CheckedTextView write;

    public interface RemoteActionCompatParcelizer {
    }

    private static Map<setName, TypeDeserializer> write(Map<setName, TypeDeserializer> map, List<collectAndResolveSubtypesByTypeId.write> list) {
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            TypeDeserializer typeDeserializer = map.get(list.get(i).read());
            if (typeDeserializer != null && map2.isEmpty()) {
                map2.put(typeDeserializer.read, typeDeserializer);
            }
        }
        return map2;
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.AudioAttributesImplApi26Parcelizer = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.MediaBrowserCompatItemReceiver = layoutInflaterFrom;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this, (byte) 0);
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.MediaDescriptionCompat = new checkArgument(getResources());
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.RemoteActionCompatParcelizer = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(audioAttributesCompatParcelizer);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.write = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(audioAttributesCompatParcelizer);
        addView(checkedTextView2);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.AudioAttributesCompatParcelizer != z) {
            this.AudioAttributesCompatParcelizer = z;
            RemoteActionCompatParcelizer();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.read != z) {
            this.read = z;
            if (!z && this.AudioAttributesImplApi21Parcelizer.size() > 1) {
                Map<setName, TypeDeserializer> mapWrite = write(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatMediaItem);
                this.AudioAttributesImplApi21Parcelizer.clear();
                this.AudioAttributesImplApi21Parcelizer.putAll(mapWrite);
            }
            RemoteActionCompatParcelizer();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.RemoteActionCompatParcelizer.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(PrivateMaxEntriesMapUpdateTask privateMaxEntriesMapUpdateTask) {
        this.MediaDescriptionCompat = (PrivateMaxEntriesMapUpdateTask) buildTypeSerializer.IconCompatParcelizer(privateMaxEntriesMapUpdateTask);
        RemoteActionCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            this.RemoteActionCompatParcelizer.setEnabled(false);
            this.write.setEnabled(false);
            return;
        }
        this.RemoteActionCompatParcelizer.setEnabled(true);
        this.write.setEnabled(true);
        this.RatingCompat = new CheckedTextView[this.MediaBrowserCompatMediaItem.size()][];
        boolean zIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            collectAndResolveSubtypesByTypeId.write writeVar = this.MediaBrowserCompatMediaItem.get(i);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(writeVar);
            this.RatingCompat[i] = new CheckedTextView[writeVar.IconCompatParcelizer];
            int i2 = writeVar.IconCompatParcelizer;
            IconCompatParcelizer[] iconCompatParcelizerArr = new IconCompatParcelizer[i2];
            for (int i3 = 0; i3 < writeVar.IconCompatParcelizer; i3++) {
                iconCompatParcelizerArr[i3] = new IconCompatParcelizer(writeVar, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.MediaBrowserCompatItemReceiver.inflate(maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.MediaBrowserCompatItemReceiver.inflate((zAudioAttributesCompatParcelizer || zIconCompatParcelizer) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.AudioAttributesImplApi26Parcelizer);
                checkedTextView.setText(this.MediaDescriptionCompat.write(iconCompatParcelizerArr[i4].write()));
                checkedTextView.setTag(iconCompatParcelizerArr[i4]);
                if (writeVar.write(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.IconCompatParcelizer);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.RatingCompat[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        write();
    }

    private void write() {
        this.RemoteActionCompatParcelizer.setChecked(this.AudioAttributesImplBaseParcelizer);
        this.write.setChecked(!this.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer.size() == 0);
        for (int i = 0; i < this.RatingCompat.length; i++) {
            TypeDeserializer typeDeserializer = this.AudioAttributesImplApi21Parcelizer.get(this.MediaBrowserCompatMediaItem.get(i).read());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.RatingCompat[i];
                if (i2 < checkedTextViewArr.length) {
                    if (typeDeserializer != null) {
                        this.RatingCompat[i][i2].setChecked(typeDeserializer.RemoteActionCompatParcelizer.contains(Integer.valueOf(((IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(checkedTextViewArr[i2].getTag())).write)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(View view) {
        if (view == this.RemoteActionCompatParcelizer) {
            AudioAttributesCompatParcelizer();
        } else if (view == this.write) {
            read();
        } else {
            read(view);
        }
        write();
    }

    private void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = true;
        this.AudioAttributesImplApi21Parcelizer.clear();
    }

    private void read() {
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer.clear();
    }

    private void read(View view) {
        this.AudioAttributesImplBaseParcelizer = false;
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(view.getTag());
        setName setname = iconCompatParcelizer.read.read();
        int i = iconCompatParcelizer.write;
        TypeDeserializer typeDeserializer = this.AudioAttributesImplApi21Parcelizer.get(setname);
        if (typeDeserializer == null) {
            if (!this.read && this.AudioAttributesImplApi21Parcelizer.size() > 0) {
                this.AudioAttributesImplApi21Parcelizer.clear();
            }
            this.AudioAttributesImplApi21Parcelizer.put(setname, new TypeDeserializer(setname, initExtraTracks.read(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(typeDeserializer.RemoteActionCompatParcelizer);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iconCompatParcelizer.read);
        boolean z = zAudioAttributesCompatParcelizer || IconCompatParcelizer();
        if (zIsChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.AudioAttributesImplApi21Parcelizer.remove(setname);
                return;
            } else {
                this.AudioAttributesImplApi21Parcelizer.put(setname, new TypeDeserializer(setname, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zAudioAttributesCompatParcelizer) {
            arrayList.add(Integer.valueOf(i));
            this.AudioAttributesImplApi21Parcelizer.put(setname, new TypeDeserializer(setname, arrayList));
        } else {
            this.AudioAttributesImplApi21Parcelizer.put(setname, new TypeDeserializer(setname, initExtraTracks.read(Integer.valueOf(i))));
        }
    }

    private boolean AudioAttributesCompatParcelizer(collectAndResolveSubtypesByTypeId.write writeVar) {
        return this.AudioAttributesCompatParcelizer && writeVar.write();
    }

    private boolean IconCompatParcelizer() {
        return this.read && this.MediaBrowserCompatMediaItem.size() > 1;
    }

    class AudioAttributesCompatParcelizer implements View.OnClickListener {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(TrackSelectionView trackSelectionView, byte b) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView.this.write(view);
        }
    }

    static final class IconCompatParcelizer {
        public final collectAndResolveSubtypesByTypeId.write read;
        public final int write;

        public IconCompatParcelizer(collectAndResolveSubtypesByTypeId.write writeVar, int i) {
            this.read = writeVar;
            this.write = i;
        }

        public final C0170format write() {
            return this.read.RemoteActionCompatParcelizer(this.write);
        }
    }
}
