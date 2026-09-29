package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.JdkDeserializers;
import kotlin.JsonNodeDeserializer;
import kotlin.JsonNodeDeserializerArrayDeserializer;
import kotlin.ReferenceTypeDeserializer;
import kotlin._isBlank;
import kotlin._long;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {
    public boolean AudioAttributesCompatParcelizer;
    private View[] AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    public int[] IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    public Context MediaBrowserCompatItemReceiver;
    public JsonNodeDeserializer RemoteActionCompatParcelizer;
    public HashMap<Integer, String> read;
    public int write;

    public void IconCompatParcelizer(ConstraintLayout constraintLayout) {
    }

    public void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void read(JdkDeserializers jdkDeserializers, boolean z) {
    }

    public void write() {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.IconCompatParcelizer = new int[32];
        this.AudioAttributesCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.read = new HashMap<>();
        this.MediaBrowserCompatItemReceiver = context;
        AudioAttributesCompatParcelizer((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = new int[32];
        this.AudioAttributesCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.read = new HashMap<>();
        this.MediaBrowserCompatItemReceiver = context;
        AudioAttributesCompatParcelizer(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = new int[32];
        this.AudioAttributesCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.read = new HashMap<>();
        this.MediaBrowserCompatItemReceiver = context;
        AudioAttributesCompatParcelizer(attributeSet);
    }

    public void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaBrowserCompatCustomActionResultReceiver = string;
                    IconCompatParcelizer(string);
                } else if (index == _isBlank.read.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.AudioAttributesImplBaseParcelizer = string2;
                    AudioAttributesCompatParcelizer(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        if (str != null) {
            IconCompatParcelizer(str);
        }
        String str2 = this.AudioAttributesImplBaseParcelizer;
        if (str2 != null) {
            AudioAttributesCompatParcelizer(str2);
        }
    }

    public final int[] AudioAttributesImplApi26Parcelizer() {
        return Arrays.copyOf(this.IconCompatParcelizer, this.write);
    }

    public void setReferencedIds(int[] iArr) {
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.write = 0;
        for (int i : iArr) {
            read(i);
        }
    }

    private void read(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.write;
        int[] iArr = this.IconCompatParcelizer;
        if (i2 + 1 > iArr.length) {
            this.IconCompatParcelizer = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.IconCompatParcelizer;
        int i3 = this.write;
        iArr2[i3] = i;
        this.write = i3 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.RemoteActionCompatParcelizer != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).getOnBackPressedDispatcherannotations = (JdkDeserializers) this.RemoteActionCompatParcelizer;
            }
        }
    }

    private void RemoteActionCompatParcelizer(String str) {
        if (str == null || str.length() == 0 || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iWrite = write(strTrim);
        if (iWrite != 0) {
            this.read.put(Integer.valueOf(iWrite), strTrim);
            read(iWrite);
        }
    }

    private void read(String str) {
        if (str == null || str.length() == 0 || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).MediaDescriptionCompat)) {
                if (childAt.getId() == -1) {
                    childAt.getClass().getSimpleName();
                } else {
                    read(childAt.getId());
                }
            }
        }
    }

    private int write(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iRemoteActionCompatParcelizer = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objWrite = constraintLayout.write(str);
            if (objWrite instanceof Integer) {
                iRemoteActionCompatParcelizer = ((Integer) objWrite).intValue();
            }
        }
        if (iRemoteActionCompatParcelizer == 0 && constraintLayout != null) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(constraintLayout, str);
        }
        if (iRemoteActionCompatParcelizer == 0) {
            try {
                iRemoteActionCompatParcelizer = _isBlank.write.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iRemoteActionCompatParcelizer == 0 ? this.MediaBrowserCompatItemReceiver.getResources().getIdentifier(str, "id", this.MediaBrowserCompatItemReceiver.getPackageName()) : iRemoteActionCompatParcelizer;
    }

    private int RemoteActionCompatParcelizer(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.MediaBrowserCompatItemReceiver.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void IconCompatParcelizer(String str) {
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.write = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                RemoteActionCompatParcelizer(str.substring(i));
                return;
            } else {
                RemoteActionCompatParcelizer(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    private void AudioAttributesCompatParcelizer(String str) {
        this.AudioAttributesImplBaseParcelizer = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.write = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                read(str.substring(i));
                return;
            } else {
                read(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected final void read(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.write; i++) {
            View viewMediaBrowserCompatItemReceiver = constraintLayout.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
            if (viewMediaBrowserCompatItemReceiver != null) {
                viewMediaBrowserCompatItemReceiver.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED) {
                    viewMediaBrowserCompatItemReceiver.setTranslationZ(viewMediaBrowserCompatItemReceiver.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        read((ConstraintLayout) parent);
    }

    public final void AudioAttributesCompatParcelizer(ConstraintLayout constraintLayout) {
        String str;
        int iRemoteActionCompatParcelizer;
        if (isInEditMode()) {
            IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        JsonNodeDeserializer jsonNodeDeserializer = this.RemoteActionCompatParcelizer;
        if (jsonNodeDeserializer == null) {
            return;
        }
        jsonNodeDeserializer.MediaBrowserCompatItemReceiver();
        for (int i = 0; i < this.write; i++) {
            int i2 = this.IconCompatParcelizer[i];
            View viewMediaBrowserCompatItemReceiver = constraintLayout.MediaBrowserCompatItemReceiver(i2);
            if (viewMediaBrowserCompatItemReceiver == null && (iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(constraintLayout, (str = this.read.get(Integer.valueOf(i2))))) != 0) {
                this.IconCompatParcelizer[i] = iRemoteActionCompatParcelizer;
                this.read.put(Integer.valueOf(iRemoteActionCompatParcelizer), str);
                viewMediaBrowserCompatItemReceiver = constraintLayout.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
            }
            if (viewMediaBrowserCompatItemReceiver != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(constraintLayout.AudioAttributesCompatParcelizer(viewMediaBrowserCompatItemReceiver));
            }
        }
        JsonNodeDeserializer jsonNodeDeserializer2 = this.RemoteActionCompatParcelizer;
        _long _longVar = constraintLayout.onAddQueueItem;
        jsonNodeDeserializer2.MediaBrowserCompatMediaItem();
    }

    public void IconCompatParcelizer(JsonNodeDeserializer jsonNodeDeserializer, SparseArray<JdkDeserializers> sparseArray) {
        jsonNodeDeserializer.MediaBrowserCompatItemReceiver();
        for (int i = 0; i < this.write; i++) {
            jsonNodeDeserializer.IconCompatParcelizer(sparseArray.get(this.IconCompatParcelizer[i]));
        }
    }

    protected final View[] write(ConstraintLayout constraintLayout) {
        View[] viewArr = this.AudioAttributesImplApi21Parcelizer;
        if (viewArr == null || viewArr.length != this.write) {
            this.AudioAttributesImplApi21Parcelizer = new View[this.write];
        }
        for (int i = 0; i < this.write; i++) {
            this.AudioAttributesImplApi21Parcelizer[i] = constraintLayout.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void read(ReferenceTypeDeserializer.write writeVar, JsonNodeDeserializerArrayDeserializer jsonNodeDeserializerArrayDeserializer, ConstraintLayout.LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray) {
        if (writeVar.write.PlaybackStateCompat != null) {
            setReferencedIds(writeVar.write.PlaybackStateCompat);
        } else if (writeVar.write.MediaSessionCompatToken != null) {
            if (writeVar.write.MediaSessionCompatToken.length() > 0) {
                writeVar.write.PlaybackStateCompat = write(this, writeVar.write.MediaSessionCompatToken);
            } else {
                writeVar.write.PlaybackStateCompat = null;
            }
        }
        if (jsonNodeDeserializerArrayDeserializer != null) {
            jsonNodeDeserializerArrayDeserializer.MediaBrowserCompatItemReceiver();
            if (writeVar.write.PlaybackStateCompat != null) {
                for (int i = 0; i < writeVar.write.PlaybackStateCompat.length; i++) {
                    JdkDeserializers jdkDeserializers = sparseArray.get(writeVar.write.PlaybackStateCompat[i]);
                    if (jdkDeserializers != null) {
                        jsonNodeDeserializerArrayDeserializer.IconCompatParcelizer(jdkDeserializers);
                    }
                }
            }
        }
    }

    private int[] write(View view, String str) {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iWrite = write(str2.trim());
            if (iWrite != 0) {
                iArr[i] = iWrite;
                i++;
            }
        }
        return i != strArrSplit.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.MediaBrowserCompatCustomActionResultReceiver == null) {
            read(i);
        }
    }
}
