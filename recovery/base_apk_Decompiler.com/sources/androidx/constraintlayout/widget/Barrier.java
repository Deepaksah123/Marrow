package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.JdkDeserializers;
import kotlin.JsonNodeDeserializerArrayDeserializer;
import kotlin.ReferenceTypeDeserializer;
import kotlin._deSerializeBCP47Locale;
import kotlin._isBlank;
import kotlin._long;

/* JADX INFO: loaded from: classes2.dex */
public class Barrier extends ConstraintHelper {
    private _deSerializeBCP47Locale AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setType(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
    }

    private void AudioAttributesCompatParcelizer(JdkDeserializers jdkDeserializers, int i, boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        if (z) {
            int i2 = this.AudioAttributesImplBaseParcelizer;
            if (i2 == 5) {
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
            } else if (i2 == 6) {
                this.MediaBrowserCompatCustomActionResultReceiver = 0;
            }
        } else {
            int i3 = this.AudioAttributesImplBaseParcelizer;
            if (i3 == 5) {
                this.MediaBrowserCompatCustomActionResultReceiver = 0;
            } else if (i3 == 6) {
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
            }
        }
        if (jdkDeserializers instanceof _deSerializeBCP47Locale) {
            ((_deSerializeBCP47Locale) jdkDeserializers).AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void read(JdkDeserializers jdkDeserializers, boolean z) {
        AudioAttributesCompatParcelizer(jdkDeserializers, this.AudioAttributesImplBaseParcelizer, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        this.AudioAttributesImplApi21Parcelizer = new _deSerializeBCP47Locale();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.AudioAttributesImplApi21Parcelizer.write(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == _isBlank.read.ConstraintLayout_Layout_barrierMargin) {
                    this.AudioAttributesImplApi21Parcelizer.read(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.AudioAttributesImplApi21Parcelizer.write(z);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
    }

    public void setDpMargin(int i) {
        this.AudioAttributesImplApi21Parcelizer.read((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public final int read() {
        return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
    }

    public void setMargin(int i) {
        this.AudioAttributesImplApi21Parcelizer.read(i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void read(ReferenceTypeDeserializer.write writeVar, JsonNodeDeserializerArrayDeserializer jsonNodeDeserializerArrayDeserializer, ConstraintLayout.LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray) {
        super.read(writeVar, jsonNodeDeserializerArrayDeserializer, layoutParams, sparseArray);
        if (jsonNodeDeserializerArrayDeserializer instanceof _deSerializeBCP47Locale) {
            _deSerializeBCP47Locale _deserializebcp47locale = (_deSerializeBCP47Locale) jsonNodeDeserializerArrayDeserializer;
            AudioAttributesCompatParcelizer(_deserializebcp47locale, writeVar.write.onStop, ((_long) jsonNodeDeserializerArrayDeserializer.onPrepareFromMediaId())._init_lambda5());
            _deserializebcp47locale.write(writeVar.write.onSkipToNext);
            _deserializebcp47locale.read(writeVar.write.onSkipToPrevious);
        }
    }
}
